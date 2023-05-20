package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapDS {
    @Test
    public void pickGiftsTest() {
        System.out.println(pickGifts(new int[]{25, 64, 9, 4, 100}, 4));
    }

    public long pickGifts(int[] gifts, int k) {
        //宣告最小堆，覆寫排序方法改造成最大堆，這個heap可以幫助保持排序
        PriorityQueue<Integer> giftHeap = new PriorityQueue<>(11, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        //把禮物壓入罪大堆
        for (int items : gifts) {
            giftHeap.add(items);
        }

        //每秒從最大堆拿走禮物
        for (int i = 0; i < k; i++) {
            int items = giftHeap.poll();
            //留下平方根數目的禮物=_=...
            giftHeap.add((int) Math.sqrt(items));
        }

        //把堆轉換回陣列
        int[] ansArr = giftHeap.stream().mapToInt(i -> i).toArray();

        //加總剩餘禮物
        long ans = Arrays.stream(ansArr).sum();

        return ans;
    }
}
