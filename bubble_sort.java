// bubble sort

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n - size of array
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        boolean flag = false;
        int temp = 0;
        
        for(int i=0; i<n-1; i++){
            flag = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            
            if(flag == false){
                break;
            }
        }
        
        System.out.println("\nSorted array - ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
