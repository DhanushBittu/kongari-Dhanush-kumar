package day4;

public class Constructor3 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("123456789123456789");

        System.out.println(sb.capacity() + " " + sb.length());
    }
}