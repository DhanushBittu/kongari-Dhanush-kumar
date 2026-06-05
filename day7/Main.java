package day7;
import java.util.Scanner;

public class Main {

    static boolean isPowerOfFour(int n) {
        return n > 0 &&
               (n & (n - 1)) == 0 &&
               (n & 0x55555555) != 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (isPowerOfFour(n))
                System.out.println("Yes");
            else
                System.out.println("No");
        }

        sc.close();
    }
}
