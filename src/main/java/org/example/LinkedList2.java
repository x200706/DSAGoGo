package org.example;

import org.junit.jupiter.api.Test;

import java.util.Stack;

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
        //是不是對稱的？
        //Stack不是先進後出？可以運用
        Stack<ListNode> stack = new Stack<>();

        //遍歷鏈表，把它推入堆疊
        ListNode current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        //產生一個反過來的鏈表
        head = current;
        while (!stack.isEmpty()) {
            current.next = stack.peek();
            current = current.next;
            stack.pop();
        }
        current.next = null;

//        //看看兩個鏈表內容有無對稱
//        while (current != null){
//            head.next;
//            current.next;
//        }

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
