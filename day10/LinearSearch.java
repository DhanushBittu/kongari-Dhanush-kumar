package day10;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tar=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        int idx=0;
        for (int i = 0; i < n; i++) 
        {
           if(arr[i]==tar)
           {
            idx=i;
            break;
           }
        }
        if(idx==0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+idx);
        }
        System.out.println(Arrays.toString(arr));
    }
}