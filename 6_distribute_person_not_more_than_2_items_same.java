import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //user input
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        int cnt;
        int flag = 0;
        
        for(int i=0; i<n; i++){
            cnt = 0;
            
            for(int j=0; j<n; j++){
                
                if(arr[i] == arr[j]){
                    cnt++;
                }
                if(cnt > 2 * k){
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 1){
                System.out.println(false);
                break;
            }
            
        }
        
        if(flag == 0)
            System.out.println(true);
    }
}
