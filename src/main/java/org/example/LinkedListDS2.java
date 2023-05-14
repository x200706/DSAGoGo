package org.example;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class LinkedListDS2 {
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
        while (current.next != null) { //注意這裡，直到後一個沒有了才停止遍歷
            stack.push(current);
            current = current.next;
        }
        stack.push(current);
        //比較鏈表跟堆疊的依序出現的值是否不吻合
        //把鏈表指針指回頭 重新遍歷
        current = head;
        while (current.next != null) {
            if (stack.pop().val != current.val) {
                return false;
            }
            current = current.next;
        }
        return true;
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
