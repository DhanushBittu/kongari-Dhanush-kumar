package day8;
import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                int submarks = sc.nextInt();
                arr.add(submarks);
            }
            int s = 0;
            for (int c : arr) {
                s += c;
            }
            double avg = (double)s/5;
            System.out.println(i+1 + ".student average is"+ avg);
        }
        sc.close();
    }
}
