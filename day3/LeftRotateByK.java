package day3;
public class LeftRotateByK {

    // Method to rotate array left by k positions
    public static void leftRotate(int[] arr, int k) {

        int n = arr.length;

        // Handle cases where k > n
        k = k % n;

        // Temporary array to store first k elements
        int[] temp = new int[k];

        // Store first k elements
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Shift remaining elements to left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Copy temp elements to end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    // Print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int k = 5;

        leftRotate(arr, k);

        System.out.println("Array after left rotation:");

        printArray(arr);
    }
}