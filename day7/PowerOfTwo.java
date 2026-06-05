package day7;
import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            if ((n & (n - 1)) == 0 && n > 0) {
                System.out.println("Power of 2");
            } else {
                System.out.println("Not a power of 2");
            }
            t--;
        }
        sc.close();
    }
}
