package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Hashtable;

public class Array {
    @Test
    public void onceNumOutput() { //JUnit之測試方法似乎不能有回傳值
        int[] arr = {3, 1, 2, 1, 2, 3, 5, 7, 7};
        System.out.println(onceNum(arr));
        System.out.println(onceNumTwoListVer(arr));
    }

    public int onceNum(int[] arr) {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        int target = arr[0];
        //登記表
        for (int i = 0; i < arr.length; i++) {
            if (table.containsKey(arr[i])) { //如果table已經存過關於這個數字
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

    public int onceNumTwoListVer(int[] arr) { //感謝faizc提供兩個列表Python版參考
        //傳入值轉Collection
        ArrayList<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            inputList.add(arr[i]);
        }

        //最後會留下孤單的那個的表
        ArrayList<Integer> targetList = new ArrayList<>();

        //讀取傳入陣列
        for (int i = 0; i < inputList.size(); i++) {
            if (!targetList.contains(inputList.get(i))) {
                targetList.add(inputList.get(i));
            } else {
                targetList.remove(inputList.get(i));
            }
        }

        return targetList.get(0);
    }
}
