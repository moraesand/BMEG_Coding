package first_class;

class main {
    public static void main(String[] args) {
        int[] arr_one = {0, 1, 2, 3, 4}; // refactored variable "foo" to "arr_one"

        int[] arr_two = new int[100]; // refactored variable "bar" to "arr_two"
        for(int i = 0; i < 100; i++) {
            arr_two[i] = i;
        }

        System.out.println("The number of even numbers in arr_one is:");
        System.out.println(countEvenNum(arr_one, 5));

        System.out.println("The number of even numbers in arr_two is:");
        System.out.println(countEvenNum(arr_two, 100));

    }

    private static int countEvenNum(int[] arr, int size){
        int count = 0;

        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
            else{

            }
        }

        return count;
    }
}