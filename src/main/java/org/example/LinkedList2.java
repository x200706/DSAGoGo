package org.example;

import org.junit.jupiter.api.Test;

public class LinkedList2 {
    //234回文鏈表
    @Test
    public void isPalindromeTest() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println(isPalindrome(head));
    }

    public boolean isPalindrome(ListNode head) {
        return false;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
