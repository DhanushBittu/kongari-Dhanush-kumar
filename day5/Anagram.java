package day5;

public class Anagram {

    public static boolean solution(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i) - 'a']--;
        }
        for (int count : arr) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        if (solution(s1, s2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}