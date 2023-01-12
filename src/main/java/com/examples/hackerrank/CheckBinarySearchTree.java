package com.examples.hackerrank;

import java.util.HashMap;
import java.util.Map;



public class CheckBinarySearchTree {
    
    public static void main(String[] args) {
        // Yes 1 2 3 4 5 6 7
        // No 1 2 4 3 5 6 7
        // Yes 3 5 7 9 11 13 15
        Node n = new Node();
        n.data=5;

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
