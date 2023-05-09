package org.example;

import org.junit.jupiter.api.Test;

public class LinkedList {
    @Test
    public void hasCycleTest(){

    }
    
    public boolean hasCycle(ListNodeForHasCycle head) {
        boolean flag = false;
        //使用快慢指針，被倒追（相等）時flag變為true

        //頭插法練習
        head = new ListNodeForHasCycle(1);
        ListNodeForHasCycle node2 = new ListNodeForHasCycle(2);
        ListNodeForHasCycle node3 = new ListNodeForHasCycle(5);
        ListNodeForHasCycle node4 = new ListNodeForHasCycle(3);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = head; //環形鏈表，尾巴將接續頭部

        return flag;
    }

    @Test
    public void printTheLinkedList(){
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
        while (true){
            System.out.println(current.val);
            if(current.next == head){
                break;
            }
            current=current.next;
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
