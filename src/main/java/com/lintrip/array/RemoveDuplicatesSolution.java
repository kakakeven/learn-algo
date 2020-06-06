package com.lintrip.array;


/**
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class RemoveDuplicatesSolution implements Solution {

    public static void main(String[] args) {
        int[] array = {0, 1, 1, 2, 2, 3, 3};
        int length = removeDuplicates(array);
        System.out.println(length);
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 比较直观但是性能比较差的一种解题方法
     * <p>
     * 从后向前遍历数组，每次移动指针减一
     * 如果前一个值等于后一个值，则将后面的数向前移动一位
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int index = length - 1;
        while (index > 0) {
            int value = nums[index];
            int before = nums[index - 1];
            if (before == value) {
                for (int i = index - 1; i < length - 1; i++) {
                    nums[i] = nums[i + 1];
                }
                length = length - 1;
            }
            index = index - 1;
        }
        return length;
    }

}
