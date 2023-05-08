package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class Array {
    @Test
    public void onceNumOutput() { //JUnit之測試方法似乎不能有回傳值
        int[] arr = {5, 5, 2, 1, 2, 3, 1, 7, 7};
//        int[] arr = {3, 1, 2, 1, 2, 3, 5, 7, 7};
        System.out.println(onceNum(arr));
    }

    public int onceNum(int[] arr) {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        int target = arr[0];
        //登記表
        for (int i = 0; i < arr.length; i++) {
            if (table.containsKey(arr[i])) { //如果table已經存過關於這個數字的資訊
                table.replace(arr[i], table.get(arr[i]) + 1); //讓次數上升
            } else {
                table.put(arr[i], 1); //第一次出現就安心放
            }
        }
        //檢查
        for (int key : table.keySet()) {
            if (table.get(key) == 1) {
                target = key;
            }
        }
        return target;
    }
}
