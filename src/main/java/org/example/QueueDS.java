package org.example;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueDS {
    @Test
    public void countStudentsTest() {
        System.out.println(countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1}));
    }

    public int countStudents(int[] students, int[] sandwiches) {
        //把學生放入列隊吧
        Queue<Integer> studentQueue = new LinkedList<>();
        for (int student : students) {
            studentQueue.add(student);
        }
        //跟句題幹，畫設邊際，先排除沒有學生=沒有三明治
        if (studentQueue.isEmpty()) {
            return 0;
        }
        //遍歷列隊
        int flag = 0;
        while (true) {
            int size = studentQueue.size();
            for(int i = 0;i<size;i++){
                int student = studentQueue.poll();
                if (student == sandwiches[flag]) { //學生喜歡當前三明治
                    flag++;
                } else { //學生討厭當前三明治
                    //學生離開隊伍
                    //排到最後面
                    studentQueue.add(student);
                }
            }
            if (size == studentQueue.size()) {
                return size;
            }
        }
    }
}
