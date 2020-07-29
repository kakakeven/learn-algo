package com.lintrip.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * 两个数组的交集单元测试
 *
 * @author kakakeven
 */
public class IntersectionOfTwoArraysTest {

    @Test
    public void testIntersect() {
        IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();
        int[] case1_array1 = new int[]{1, 2, 2, 1};
        int[] case1_array2 = new int[]{2, 2};
        int[] case1_result = solution.intersect(case1_array1, case1_array2);
        Assert.assertArrayEquals(new int[]{2, 2}, case1_result);

        int[] case2_array1 = new int[]{4, 9, 5};
        int[] case2_array2 = new int[]{9, 4, 9, 8, 4};
        int[] case2_result = solution.intersect(case2_array1, case2_array2);
        Assert.assertArrayEquals(new int[]{9, 4}, case2_result);
    }

    @Test
    public void testIntersectSortedArray() {
        IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();
        int[] case1_array1 = new int[]{1, 2, 3, 4, 4, 13};
        int[] case1_array2 = new int[]{1, 2, 3, 9, 10};
        int[] case1_result = solution.intersectSortedArray(case1_array1, case1_array2);
        Assert.assertArrayEquals(new int[]{1, 2, 3}, case1_result);

        int[] case2_array1 = new int[]{1, 3, 4, 6, 10, 13};
        int[] case2_array2 = new int[]{1, 2, 3, 7, 8};
        int[] case2_result = solution.intersectSortedArray(case2_array1, case2_array2);
        Assert.assertArrayEquals(new int[]{1, 3}, case2_result);
    }
}