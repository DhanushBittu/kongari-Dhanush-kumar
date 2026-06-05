package day10;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tar=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
            Arrays.sort(arr);
        int idx=0;
    int l=0;
int r=n-1;
System.out.println(Arrays.toString(arr)); 
while(l<=r)
{
    int mid = (l+r)/2;
    if(arr[mid]==tar)
    {
        System.out.println("Element found : "+mid);
        break;
    }else if(arr[mid]<tar){
        l++;
    }else{
        r--;
    }
}
    }
}
