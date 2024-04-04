// right and left view - BST

import java.util.*;

public class Main {
    
    static class Node {
        
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            left = right = null;
        }
        
    }
    
    
    //Right view
    public static ArrayList<Integer> right_view(Node root, ArrayList<Integer> res, int lvl){
        if(root == null){
            return res;
        }
        
        if(lvl == res.size()){
            res.add(root.data);
        }
        
        right_view(root.right, res, lvl + 1);
        right_view(root.left, res, lvl + 1);
        
        return res;
    }
    
    
    
    //Left view
    public static ArrayList<Integer> left_view(Node root, ArrayList<Integer> res, int lvl){
        if(root == null){
            return res;
        }
        
        if(lvl == res.size()){
            res.add(root.data);
        }
        
        left_view(root.left, res, lvl + 1);
        left_view(root.right, res, lvl + 1);
        
        return res;
    }
    
    
    //Insert function 
    public static Node insert(Node root, int val){
        if (root == null){
            root = new Node(val);
            return root;
        }
            
            
        else if (root.data < val)
            root.right = insert(root.right, val);
            
        else
            root.left = insert(root.left, val);
            
        return root;
    }
    
    public static void main(String[] args){
        Node root = null;
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int val;
        
        for(int i=0; i<n; i++){
            val = sc.nextInt();
            root = insert(root, val);
        }
        
        int lvl = 0;
        
        ArrayList<Integer> res = new ArrayList<>();
        
        res = right_view(root, res, lvl);
        
        for(Integer it : res){
            System.out.print(it + " ");
        }
        
        System.out.println();
        
        lvl = 0;
        
        ArrayList<Integer> res2 = new ArrayList<>();
        
        res2 = left_view(root, res2, lvl);
        
        for(Integer it : res2){
            System.out.print(it + " ");
        }
        
    }
    
}
