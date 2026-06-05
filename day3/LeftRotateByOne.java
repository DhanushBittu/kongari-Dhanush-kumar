package day3;
public class LeftRotateByOne {

    // Method to rotate array left by one
    public static void leftRotateByOne(int[] arr) {

        int first = arr[0];

        // Shift elements to left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Place first element at end
        arr[arr.length - 1] = first;
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        leftRotateByOne(arr);

        System.out.println("Array after left rotation by one:");

        printArray(arr);
    }
}