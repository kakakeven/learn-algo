package com.lintrip.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 判断数组中是否存在重复的值
 *
 * @author kakakeven
 */
public class ContainsDuplicate {

    /**
     * 使用 Set 来实现去重，如果有重复的元素则数组长度不等于 Set 大小
     *
     * @param nums
     * @return
     */
    public boolean solution01(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        return numSet.size() != nums.length;
    }

    /**
     * 先给数组排序，然后按次序比较相邻两个元素
     *
     * @param nums
     * @return
     */
    public boolean solution02(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean solution03(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (numSet.contains(num)) {
                return true;
            }
            numSet.add(num);
        }
        return false;
    }
}
