import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        //lis
        int lis[] = new int[n];
        
        for(int i=0; i<n; i++){
            lis[i] = 1;
        }
        
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(arr[i] > arr[j] && lis[i] < lis[j] + 1){
                    lis[i] = lis[j] + 1;
                }
            }
        }
        
        //lds
        int lds[] = new int[n];
        
        for(int i=0; i<n; i++){
            lds[i] = 1;
        }
        
        for(int i=n-2; i>=0; i--){
            for(int j=n-1; j>i; j--){
                if(arr[i] > arr[j] && lds[i] < lds[j] + 1){
                    lds[i] = lds[j] + 1;
                }
            }
        }
        
        //output
        int max = lis[0] + lds[0] - 1;
        for(int i=1; i<n; i++){
            if(max < lis[i] + lds[i] - 1){
                max = lis[i] + lds[i] - 1;
            }
        }
        
        System.out.println(max);
    }
}
