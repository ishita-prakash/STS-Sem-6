// Boundary Traversal - BST

import java.util.*;

public class Main {
    
    // Treenode 
    
    static class Node {
        
        int data;
        Node left;
        Node right;
        
        // constructor
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    
    // Left Boundary Traversal function
    
    public static void left(Node root, ArrayList<Integer> res){
        
        Node cur = root.left;
        
        while(cur != null){
            
            if(isLeaf(cur) == false){
                res.add(cur.data);
            }
            
            if(cur.left != null){
                cur = cur.left;
            }
            else{
                cur = cur.right;
            }
            
        }
        
    }
    
    
    // Right Boundary Traversal function
    
    public static void right(Node root, ArrayList<Integer> res){
        
        Node cur = root.right;
        
        ArrayList<Integer> tmp = new ArrayList<>();
        
        while(cur != null){
            
            if(isLeaf(cur) == false){
                tmp.add(cur.data);
            }
            
            if(cur.right != null){
                cur = cur.right;
            }
            else{
                cur = cur.left;
            }
            
        }
        
        for(int i=tmp.size()-1; i>=0; i--){
            res.add(tmp.get(i));
        }
    }
    
    
    // Leaves traversal function
    
    public static void leaf(Node root, ArrayList<Integer> res){
        if(isLeaf(root) == true){
            res.add(root.data);
            return;
        }
        
        if(root.left != null){
            leaf(root.left, res);
        }
        
        if(root.right != null){
            leaf(root.right, res);
        }
    }
    

    // Print boundary function
    
    public static ArrayList<Integer> print_boundary(Node root){
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        if(isLeaf(root) == false){
            res.add(root.data);
        }
        
        left(root, res);
        leaf(root, res);
        right(root, res);
        
        return res;
    }
    
    // isLeaf function
    
    public static boolean isLeaf(Node root){
        return root.left == null && root.right == null;
    }
    
    // Insertion function
    
    static Node insert(Node root, int data) {
        if (root == null)
            root = new Node(data);
        else if (root.data < data)
            root.right = insert(root.right, data);
        else
            root.left = insert(root.left, data);
        return root;
    }
    
    // Main function
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node root = null; // Initializing root node
        
        System.out.println("Enter elements for the binary tree (enter -1 to stop):");
        int input = sc.nextInt();
        
        while(input != -1) {
            root = insert(root, input);
            input = sc.nextInt();
        }
        
        ArrayList<Integer> boundaryElements = print_boundary(root);
        System.out.println("Boundary elements of the binary tree:");
        for (int element : boundaryElements) {
            System.out.print(element + " ");
        }
    }
}
