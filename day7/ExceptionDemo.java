package day7;

import java.util.*;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            System.out.println(9 / 0);
        } 
        catch (ArithmeticException e) {
            System.out.println("There is Arithmetic Exception");
        }

    }
}