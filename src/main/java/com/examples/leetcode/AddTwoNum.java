package com.examples.leetcode;

import java.util.List;

public class AddTwoNum {


    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0 ;
        ListNode currentNode = new ListNode(0);
        ListNode head = currentNode;
        while(l1!=null || l2!=null) {
            int first = l1!=null ? l1.val : 0 ;
            int second = l2!=null ? l2.val : 0 ;
            int sum = first+second+carry;

            currentNode.next= new ListNode (sum % 10);
            carry = sum/10;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
            currentNode=currentNode.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        int[] first_p = new int[]{3,5,2,4};
        ListNode n1 = prepare(first_p);

        int[] second_p = new int[]{1,5,4,2};
        ListNode n2 = prepare(second_p);

        printListNode(n1);
        printListNode(n2);

        ListNode result = addTwoNumbers(n1,n2);

        System.out.print("result is "  );
        printListNode(result);
    }

    public static ListNode prepare(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode head = new ListNode(0);
        dummy.next=head;
        if(arr.length!=0) {
            for (int i = 0; i < arr.length; i++) {
                head.next =  new ListNode(arr[i]);
                head=head.next;
            }
        }
        return dummy.next.next;
    }

    public static void printListNode(ListNode n) {
        StringBuilder sb = new StringBuilder();
        while(n!=null){
            sb.insert(0, n.val);
            n=n.next;
        }
        System.out.println(sb.toString());
    }

    /*public ListNode addTwoDigit(ListNode l1, ListNode l2, ListNode p1, ListNode p2) {
        int sum = l1.val+l2.val;
        boolean increase_next_digit = sum>10 ? true:false;
        if(increase_next_digit && p1 == null && p2 == null) {
            ListNode newDigit = new ListNode();
            newDigit.val= 1;

        }
    }*/


}


