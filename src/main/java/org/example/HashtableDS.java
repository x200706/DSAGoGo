package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class HashtableDS {
    @Test
    public void twoSumTest() {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        //宣告一張哈希表
        Hashtable<Integer, Integer> hashtable = new Hashtable<>(); //K表傳入值，V表索引號

        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i])) {
                ans[0] = hashtable.get(target - nums[i]);
                ans[1] = i;
            }
            hashtable.put(nums[i], i);
        }
        return ans;
    }
}
