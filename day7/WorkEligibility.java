package day7;
import java.util.*;

public class WorkEligibility {
    public static void main(String[] args) {
        int n = 19;

        try {
            if (n > 18) {
                System.out.println("Eligible for work");
            } else {
                System.out.println("Not Eligible for work");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}