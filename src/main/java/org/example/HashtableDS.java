package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class HashtableDS {
    @Test
    public void twoSumTest() {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }

    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> outputList = new ArrayList<>();
        //宣告一張哈希表
        Hashtable<Integer, Integer> hashtable = new Hashtable<>(); //K表原傳入值，V表目標值減去傳入值後的數
        //存值進哈希表
        Arrays.stream(nums).forEach(n -> {
            hashtable.put(n, target - n);
        });
        //迴圈
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (hashtable.get(nums[i]) == hashtable.get(target - nums[j])) {
                    outputList.add(i);
                }
            }
        }
        return outputList.stream().mapToInt(i -> i).toArray();
    }
}
