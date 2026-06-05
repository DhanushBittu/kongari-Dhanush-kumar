package day8;

import java.util.*;

public class Sorting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();

            ArrayList<Integer> arr = new ArrayList<>();

            for (int j = 0; j < n; j++) {

                int val = sc.nextInt();
                arr.add(val);
            }

            System.out.println(Collections.min(arr));

            Collections.sort(arr);

            System.out.println(arr);
        }

        sc.close();
    }
}
