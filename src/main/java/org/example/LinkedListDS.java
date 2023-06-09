package org.example;

import org.junit.jupiter.api.Test;

public class LinkedListDS {
    //141環狀鏈表
    @Test
    public void hasCycleTest() {
        ListNodeForHasCycle head = new ListNodeForHasCycle(3);
        ListNodeForHasCycle node2 = new ListNodeForHasCycle(2);
        ListNodeForHasCycle node3 = new ListNodeForHasCycle(0);
        ListNodeForHasCycle node4 = new ListNodeForHasCycle(-4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        System.out.println(hasCycle(head));

    }

    public boolean hasCycle(ListNodeForHasCycle head) {
        //使用快慢指針，被倒追（相等）時即返回true
        //遍歷鏈表
        ListNodeForHasCycle fast = head;
        ListNodeForHasCycle slow = head;
        while (fast != null && fast.next != null) { 
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true;
            }
        }

        return false;
    }

    @Test
    public void printTheLinkedList() {
        //頭插法練習
        ListNodeForHasCycle head = new ListNodeForHasCycle(1);
        ListNodeForHasCycle node2 = new ListNodeForHasCycle(2);
        ListNodeForHasCycle node3 = new ListNodeForHasCycle(5);
        ListNodeForHasCycle node4 = new ListNodeForHasCycle(3);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = head; //環形鏈表，尾巴將接續頭部

        //打印練習
        ListNodeForHasCycle current = head;
        while (true) {
            System.out.println(current.val);
            if (current.next == head) {
                break;
            }
            current = current.next;
        }
    }

    class ListNodeForHasCycle {
        int val;
        ListNodeForHasCycle next;

        ListNodeForHasCycle(int x) {
            val = x;
            next = null;
        }
    }

}
