package com.leetcode.arrays;

import com.leetcode.ListNode;

import java.math.BigInteger;

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
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var bigIntL1 = new BigInteger(stringify(l1));
        var bigIntL2 = new BigInteger(stringify(l2));
        System.out.println(bigIntL1 + "  "+ bigIntL2);
        var retVal = bigIntL1.add(bigIntL2).toString();
        var retNode = new ListNode(Integer.parseInt(""+ retVal.charAt(0)));
        var currNode = retNode;
        for(int i=1;i<retVal.length(); i++) {
            currNode.next = new ListNode(Integer.parseInt(""+ retVal.charAt(i)));
            currNode = currNode.next;
        }

        return retNode;

    }

    public static String stringify(ListNode node){
        var str = new StringBuffer();
        while(node != null) {
            str.append(node.val);
            node = node.next;
        }
        System.out.println(str);
        return str.toString();
    }

}


