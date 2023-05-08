package org.example;

import org.junit.jupiter.api.Test;

public class Array {
    @Test
    public void onceNumOutput() { //JUnit之測試方法似乎不能有回傳值
        int[] arr = {3, 1, 2, 1, 2, 3, 5, 7, 7};
        System.out.println(onceNum(arr));
    }

    public int onceNum(int[] arr) { //出自力扣熱題100；感覺這題是關魚哈希表
        return 0;
    }
}
