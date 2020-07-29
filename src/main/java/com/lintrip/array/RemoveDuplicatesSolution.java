package com.lintrip.array;


/**
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class RemoveDuplicatesSolution {

    /**
     * 比较直观但是性能比较差的一种解题方法
     * <p>
     * 从后向前遍历数组，每次移动指针减一
     * 如果前一个值等于后一个值，则将后面的数向前移动一位
     *
     * @param nums
     * @return
     */
    public int solution01(int[] nums) {
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

    /**
     * 性能较好的算法，使用双指针解决位移问题
     * 最终慢指针指向的就是最大值的索引值，结果数组长度等于最大值的索引 + 1
     *
     * @param nums
     * @return
     */
    public int solution02(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}
