import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int[] lis = new int[n];
        lis[0] = 1;
        
        for(int i=1; i<n; i++){
            lis[i] = 1;
            for(int j=0; j<i; j++){
                if(arr[i]>arr[j] && lis[i]<lis[j]+1){
                    lis[i] = lis[j] + 1;
                }
            }
        }
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            if(max<lis[i]){
                max = lis[i];
            }
        }
        
        System.out.println(max);
    }
}
