package com.lintrip.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？
 * 请你找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 链接：https://leetcode-cn.com/problems/3sum
 */
public class ThreeSum {
    public List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // 使用排序解决重复值的问题
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            // 如果首个值已经大于0，一定没有满足问题的组合
            if (value > 0) {
                break;
            }
            int target = 0 - value;
            if (i == 0 || nums[i] != nums[i - 1]) {
                while (right > left) {
                    if (nums[left] + nums[right] == target) {
                        List<Integer> integerList = Arrays.asList(value, nums[left], nums[right]);
                        result.add(integerList);
                        while (right > left && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (right > left && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] > target) {
                        right = right - 1;
                    } else {
                        left = left + 1;
                    }
                }
            }
        }
        return result;
    }
}
