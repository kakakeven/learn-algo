package com.lintrip.array;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
public class RotateArray {

    /**
     * k 次那么就循环 k 次，每次都从前往后移
     *
     * @param nums
     * @param k
     */
    public void solution1(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int lastValue = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = lastValue;
        }
    }

}
