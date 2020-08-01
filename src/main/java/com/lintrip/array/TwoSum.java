package com.lintrip.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍
 */
public class TwoSum {

    /**
     * 最直观的方法双层循环
     * 时间复杂度：O(n²)
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] solution1(int[] nums, int target) {
        // 前提：要查找的元素只有一个答案
        for (int i = 0; i < nums.length; i++) {
            // 当前值为 a 那么目标值就是 target - a
            int a = nums[i];
            // 从当前值的下一个元素向后找，找到则返回否则继续循环
            for (int j = i + 1; j < nums.length; j++) {
                if (a == target - nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 引入 hash 表减少遍历次数
     * 时间复杂度：O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] solution2(int[] nums, int target) {
        Map<Integer, Integer> valueToIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            // 如果 hash 表中已经有差值，则直接返回
            if (valueToIndexMap.containsKey(target - value)) {
                return new int[]{valueToIndexMap.get(target - value), i};
            }
            if (valueToIndexMap.containsKey(value)) {
                continue;
            }
            valueToIndexMap.put(value, i);
        }
        return null;
    }
}
