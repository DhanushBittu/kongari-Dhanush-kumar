package day7;
import java.util.Scanner;

public class TestCases {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
        if((t&1)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
        sc.close();
    }
}
