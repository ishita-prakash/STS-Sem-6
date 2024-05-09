// Bellman Ford

import java.util.*;

public class Main {
    
    // Bellman Ford function
    
    // edges -> (u, v, wt)
    public static int[] bellman_ford(int n, ArrayList<ArrayList<Integer>> edges, int src){
        
        int[] dist = new int[n];
        
        for(int i=0; i<n; i++){
            
            dist[i] = (int)(1e8);
            
        }
        
        dist[src] = 0;
        
        // relax (n - 1) times
        int u, v, wt;
        
        for(int i=0; i<n-1; i++){
            
            for(ArrayList<Integer> it : edges){
                
                u = it.get(0);
                v = it.get(1);
                wt = it.get(2);
                
                if(dist[u] != (int)(1e8) && dist[u] + wt < dist[v]){
                    dist[v] = dist[u] + wt;
                }
            }
        }
        
        
        // nth relaxation to check negative cycle
        
        for(ArrayList<Integer> it : edges){
            
            u = it.get(0);
            v = it.get(1);
            wt = it.get(2);
                
            if(dist[u] != (int)(1e8) && dist[u] + wt < dist[v]){
                
                int temp[] = new int[1];
                temp[0] = -1;
                
                return temp;
            }
            
        }
        
        return dist;
        
    }
    
    // Main function 
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        
        while(true) {
            int node1 = sc.nextInt(); //u
            
            if (node1 == -1){
                break;
            }
            
            int node2 = sc.nextInt(); //v
            
            int node3 = sc.nextInt(); //wt
            
            ArrayList<Integer> e = new ArrayList<>();
            
            e.add(node1);
            e.add(node2);
            e.add(node3);
            
            edges.add(e);
        }
        
        int[] res = bellman_ford(n, edges, 0);
        
        if(res.length != 1){
            
            for(int i=0; i<n; i++){
                System.out.print(res[i] + " ");
            }
            
        }
        
        else{
            System.out.print(res[0]);
        }
        
    }
}
