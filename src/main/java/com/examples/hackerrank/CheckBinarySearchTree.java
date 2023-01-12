package com.examples.hackerrank;

import java.util.HashMap;
import java.util.Map;

class Node {
    int data;
    Node left;
    Node right;
 }

public class CheckBinarySearchTree {
    
    public static void main(String[] args) {
        
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
