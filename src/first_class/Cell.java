package first_class;

public class Cell {
    // private for CPEN 221
    private int strength;
    private int x;
    private int y;
    private int id;

    // default constructor
    public Cell() {
        this.strength = 0;
        this.x = 0;
        this.y = 0;
        this.id = 0;
    }

    // constructor w/ parameters
    public Cell(int strength, int x, int y, int id) {
        set_strength(strength);
        set_x(x);
        set_y(y);
        set_id(id);
    }

    // getter functions
    public int get_strength() {
        return strength;
    }

    public int get_x() {
        return x;
    }

    public int get_y() {
        return y;
    }

    public int get_id() {
        return id;
    }

    // setter functions
    public void set_strength(int strength) {
        if (strength <= 0) {
            throw new IllegalArgumentException("Strength must be a positive number.");
        }
        this.strength = strength;
    }

    public void set_x(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("x must be greater than zero.");
        }
        this.x = x;
    }

    public void set_y(int y) {
        if (y < 0) {
            throw new IllegalArgumentException("y must be greater than zero.");
        }
        this.y = y;
    }

    public void set_id(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("id must be greater than zero.");
        }
        this.id = id;
    }

    // returns nothing
    public void interactNeighbours (Cell[] neighbours) {
        // empty for now
    }

}

