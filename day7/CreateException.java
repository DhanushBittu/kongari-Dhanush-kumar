package day7;
import java.util.*;

public class CreateException {
    public static void main(String[] args) {
        int n = 200;

        try {
            if (n > 35) {
                System.out.println(" > 35");
            } else {
                System.out.println("< 35");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}