// DFS Adjacency List

import java.util.*;

public class Main {
    
    // DFS function
    
    public static void dfs(int node, int vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        vis[node] = 1;
        ls.add(node);
        
        for(int it : adj.get(node)){
            
            if(vis[it] == 0){
                dfs(it, vis, adj, ls);
            }
            
        }
    }
    
    // Resultant Array function
    
    public static ArrayList<Integer> result(int v, ArrayList<ArrayList<Integer>> adj){
        
        int vis[] = new int[v]; // visited array, by default->each element 0
        
        ArrayList<Integer> ls = new ArrayList<>(); //resultant ArrayList
        
        vis[0] = 1;
        
        dfs(0, vis, adj, ls);
        
        return ls;
        
    }
    
    //Main function 
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int v = sc.nextInt(); // no. of nodes
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<Integer>());
        }
        
        //user inputs nodes and edges
        int node1, node2;
        
        while(true){
            node1 = sc.nextInt();
            
            if(node1 == -1){
                break;
            }
            
            node2 = sc.nextInt();
            
            adj.get(node1).add(node2);
            adj.get(node2).add(node1);
        }
        
        ArrayList<Integer> ls = result(v, adj);
        
        for(int i : ls){
            System.out.print(i + " ");
        }
        
    }
}
