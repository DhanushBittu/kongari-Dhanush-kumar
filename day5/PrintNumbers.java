package day5;
public class PrintNumbers {
    public static void func(int n){
        if(n == 0) return;
       // System.out.print(n + " ");
        func(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        func(5);
    }


}
