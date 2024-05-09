import java.util.*;

public class Main{
    public static void main(String[] args){
        //user input
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        
        int n = str.length();
        
        int[][] dp = new int[n][n];
        
        for(int i=0; i<n; i++){
            dp[i][i] = 1;
        }
        
        for(int length = 2; length <= n; length++){
            for(int start = 0; start <= n - length; start++){
                int end = start + length - 1;
                
                if(str.charAt(start) == str.charAt(end)){
                    dp[start][end] = 2 + dp[start+1][end-1];
                }
                
                else{
                    dp[start][end] = Math.max(dp[start+1][end], dp[start][end-1]);
                }
            }
        }
        
        System.out.println(dp[0][n-1]);
    }
}
