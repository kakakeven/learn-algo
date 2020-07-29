package com.lintrip.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 350.两个数组的交集 II
 * <p>
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * @author kakakeven
 */
public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> resultList = new ArrayList<>();
        // 引入 HashMap 来存储每一个值出现的次数
        // 轮询数组 1 统计 1 中每个元素出现次数
        Map<Integer, Integer> nums1CountMap = new HashMap<>();
        for (Integer num : nums1) {
            if (!nums1CountMap.containsKey(num)) {
                nums1CountMap.put(num, 0);
            }
            Integer count = nums1CountMap.get(num);
            count++;
            nums1CountMap.put(num, count);
        }
        // 轮询数组2 找出交集，并存放在 list 中
        for (Integer num : nums2) {
            if (nums1CountMap.containsKey(num)) {
                Integer count = nums1CountMap.get(num);
                if (count > 0) {
                    resultList.add(num);
                    count--;
                    nums1CountMap.put(num, count);
                }
            }
        }
        // List 转 Array
        int[] result = new int[resultList.size()];
        int i = 0;
        for (Integer num : resultList) {
            result[i] = num;
            i++;
        }
        return result;
    }

    /**
     * 如果是有序的数据则可以通过双指针来实现交集的处理
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersectSortedArray(int[] nums1, int[] nums2) {
        List<Integer> resultList = new ArrayList<>();
        // 定义变量
        int num1Length = nums1.length;
        int num2Length = nums2.length;
        int num1Index = 0;
        int num2Index = 0;
        // 循环的终止条件是轮询到任何一个数据的结尾
        while (num1Index < num1Length - 1 && num2Index < num2Length - 1) {
            int num1 = nums1[num1Index];
            int num2 = nums2[num2Index];
            // 如果当前值的两个值相等，则添加到最终结果中
            if (num1 == num2) {
                num1Index++;
                num2Index++;
                resultList.add(num1);
                // 如果值不相等，则移动指针
            } else if (num1 > num2) {
                num2Index++;
            } else {
                num1Index++;
            }
        }
        // List 转 Array
        int[] result = new int[resultList.size()];
        int i = 0;
        for (Integer num : resultList) {
            result[i] = num;
            i++;
        }
        return result;
    }
}
