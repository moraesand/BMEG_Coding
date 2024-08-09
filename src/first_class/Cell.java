package first_class;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class Cell {
    // private for CPEN 221
    private int strength;
    private int x;
    private int y;
    private int id;

    private HashMap<String, Double> chemical_concentrations;
    private HashSet<String> signal_molecules;

    // default constructor
    public Cell() {
        this.strength = 0;
        this.x = 0;
        this.y = 0;
        this.id = 0;
        this.signal_molecules = new HashSet<>();
        this.chemical_concentrations = new HashMap<>();
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

    public void add_chemical_concentrations(String chemical_name, double concentration) {
        chemical_concentrations.put(chemical_name, concentration);
    }

    public void get_chemical_concentrations(String chemical_name) {
        chemical_concentrations.getOrDefault(chemical_name, 0.0);
    }

    public void add_signal_molecule(String molecule) {
        signal_molecules.add(molecule);
    }

    public boolean check_signal_molecules(String molecule) {
        // returns the signal molecule it contains so code know what it is and how to deal with it
        return signal_molecules.contains(molecule);
    }

    public void check_adj_cells(ArrayList<Cell> adj_cells, int numOf_adj_cells) {
        if (adj_cells.size() > numOf_adj_cells) {
            System.out.println("Too crowded, potential to die!");
        } else {
            System.out.println("System is healthy");
        }
    }
    }

    public void interactNeighbours (ArrayList<Cell> neighbours) {
        check_adj_cells(neighbours);
    }

