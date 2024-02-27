package com.leetcode.arrays;

import com.leetcode.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        var l1 = new ListNode(5, new ListNode(4, new ListNode(2)));
        var l2 = new ListNode(6, new ListNode(5, new ListNode(4)));
        assertEquals(2, l1.next.next.val);
        assertEquals("542",AddTwoNumbers.stringify(l1));
        assertEquals("654",AddTwoNumbers.stringify(l2));
        System.out.println(AddTwoNumbers.stringify(AddTwoNumbers.addTwoNumbers(l1,l2)));
        assertEquals("1196", AddTwoNumbers.stringify(AddTwoNumbers.addTwoNumbers(l1,l2)));

    }
}