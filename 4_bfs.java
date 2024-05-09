// BFS

import java.util.*;

public class Main{
    
    // BFS function
    
    public static ArrayList<Integer> bfs(int v, ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> res = new ArrayList<>();
        
        int[] vis = new int[v];
        
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        vis[0] = 1;
        
        while( !q.isEmpty() ){
            Integer node = q.poll(); // front element of Queue
            res.add(node);
            
            for(Integer it : adj.get(node)) {
                if(vis[it] == 0){
                    q.add(it);
                    vis[it] = 1;
                }
            }
        }
        
        return res;
        
    }
    
    // Main function 
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int v = sc.nextInt(); // no. of nodes
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<Integer>());
        }
        
        while(true){
            int node1 = sc.nextInt();
            
            if(node1 == -1){
                break;
            }
            
            int node2 = sc.nextInt();
            
            adj.get(node1).add(node2);
            adj.get(node2).add(node1);
        }
        
        ArrayList<Integer> res = bfs(v, adj);
        
        for(int it : res){
            System.out.print(it + " ");
        }
    }
}
