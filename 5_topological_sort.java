// Topological Sort

import java.util.*;

public class Main{
    
    // DFS function
    public static void dfs(int node, int vis[], Stack<Integer> st, ArrayList<ArrayList<Integer>> adj){
        
        vis[node] = 1;
        
        for(int it : adj.get(node)) {
            if(vis[it] == 0){
                dfs(it, vis, st, adj);
            }
        }
        
        st.push(node);
    }
    
    
    // Topological Sort function
    
    public static int[] TopSort(int v, ArrayList<ArrayList<Integer>> adj){
        
        int vis[] = new int[v];
        
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i=0; i<v; i++){
            if(vis[i] == 0){
                dfs(i, vis, st, adj);
            }
        }
        
        int res[] = new int[v];
        
        int i = 0;
        
        while(!st.empty()){
            res[i++] = st.peek();
            st.pop();
        }
        
        return res;
    }
    
    // Main function
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int v = sc.nextInt(); // no. of nodes
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        // Initialize each ArrayList in the adjacency list 
        
        for(int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
        
        
        while(true) {
            int node1 = sc.nextInt();
            
            if(node1 == -1)
                break;
                
            int node2 = sc.nextInt();
            
            adj.get(node1).add(node2); // Add edge from node1 to node2
        }
        
        
        // Perform Topological Sort
        
        int[] result = TopSort(v, adj);
        
        // Print the result
        
        System.out.println("Topological Sort:");
        for(int i = 0; i < v; i++) {
            System.out.print(result[i] + " ");
        }
        
        
    }
}
