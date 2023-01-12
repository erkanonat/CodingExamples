package com.examples.hackerrank;

import java.util.HashMap;
import java.util.Map;



public class CheckBinarySearchTree {
    
    public static void main(String[] args) {
        // Yes 1 2 3 4 5 6 7
        // No 1 2 4 3 5 6 7
        // Yes 3 5 7 9 11 13 15
        Node root = new Node(1);
        

    }

    // insert 


    // delete 
    public void delete(Node node , int value){
        if(value==node.data){
            Node temp = node;
            
        }
    }

    // get minValue
    public int getMinValue(Node node ){
        // iterate over while 
        int min = node.data;
        while(node.left!=null) {         
            min = node.left.data;    
            node = node.left;
        }
        return min;
        // other alternative recursive 
        
    }

 
    public boolean search(Node root,  int src) {
        if(root==null)
            return false;
        else if(src==root.data)
            return true;
        else if (src < root.data){
            return search(root.left, src);
        }else {
            return search(root.right, src);
        }
    }

    // recursively traverse the BST  
    public void printBST(Node root) { 
        if (root != null) { 
            printBST(root.left); 
            System.out.print(root.data + " "); 
            printBST(root.right); 
        } 
    }

    public boolean checkBST(Node root) {
        int val = root.data;
        Map<Integer,Boolean> distinctMap = new HashMap<>();        
        return checkBST_help(root, distinctMap);
        
    }
    public boolean checkBST_help(Node root, Map<Integer,Boolean> map) {
        if(root==null)
            return true;
        else {
            if(map.containsKey(root.data))
                return false;
            else {
                map.put(root.data, true);    
            }
            if(root.left!=null && root.left.data>=root.data)
                    return false;
            if(root.right!=null && root.right.data<=root.data)
                    return false;
            else {                    
                boolean leftCheck = checkBST_help(root.left, map);
                boolean rightCheck = checkBST_help(root.right, map);
                return (leftCheck && rightCheck);
            }
        }
    }
}
