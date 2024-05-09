import java.util.*;

public class Main{
    public static void main(String[] args){
        //user input
        Scanner sc = new Scanner(System.in);
        
        //user input
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        
        if(ss(n, arr, target)){
            System.out.println("Subset exists");
        }
        else{
            System.out.println("Subset does not exist");
        }
    }
    
    public static boolean ss(int n, int[] arr, int target){
        
        if(target == 0){
            return  true;
        }
        if(n == 0){
            return false;
        }
        if(arr[n-1] > target){
            return ss(n-1, arr, target);
        }
        
        return ss(n-1, arr, target - arr[n-1]) || ss(n-1, arr, target);
    }
}
