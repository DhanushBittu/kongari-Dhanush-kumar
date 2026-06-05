package day3;

import java.util.Scanner;

public class BinarySearchEx {
    public static boolean solution(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return true;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            }

            // Search left half
            else {
                right = mid - 1;
            }
        }

        // Key not found
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {-1, 0, 2, 4, 8, 10};

        System.out.print("Enter element to search: ");

        int key = sc.nextInt();

        boolean result = solution(arr, key);

        if (result) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}