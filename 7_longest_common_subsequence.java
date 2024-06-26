//LCS
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        int dp[][] = new int[a.length()+1][b.length()+1];
        
        for(int i=0; i<=a.length(); i++){
            for(int j=0; j<=b.length(); j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
                
                else if(a.charAt(i-1) == b.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        System.out.print(dp[a.length()][b.length()]);
    }
}
