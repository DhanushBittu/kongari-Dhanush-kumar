package day12;
import java.util.*;
public class DynamicProgram {
    public static void main(String[] args){
        int n = 5;
        int dp[] = new int[n+1];
        dp[0] = 0;
        for(int i=1; i<=n; i++){
            dp[i] = dp[i-1] + i;
        }
        System.out.println(Arrays.toString(dp));
        for(int i=0;i<n+1;i++){
            if(dp[i] == sum)
            {
                System.out.println(i+1);
                break;
            }
        }
    }
}
