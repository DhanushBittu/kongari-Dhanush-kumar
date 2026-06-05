package day5;

import java.util.Scanner;

public class CountVCDS {

    public static void solution(String s) {

        s = s.toLowerCase();

        String vowels = "aeiou";
        String decimals = "0123456789";
        String specialChars = "!@#$%^&*()";

        int vowelsCount = 0;
        int decimalCount = 0;
        int consonantsCount = 0;
        int specialCharsCount = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (vowels.contains(Character.toString(ch))) {
                vowelsCount++;
            } 
            else if (decimals.contains(Character.toString(ch))) {
                decimalCount++;
            } 
            else if (specialChars.contains(Character.toString(ch))) {
                specialCharsCount++;
            } 
            else if (Character.isLetter(ch)) {
                consonantsCount++;
            }
        }

        System.out.println("Vowels Count: " + vowelsCount);
        System.out.println("Consonants Count: " + consonantsCount);
        System.out.println("Decimals Count: " + decimalCount);
        System.out.println("Special Characters Count: " + specialCharsCount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        solution(s);

        sc.close();
    }
}