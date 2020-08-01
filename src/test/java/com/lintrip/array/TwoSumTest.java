package com.lintrip.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {

    TwoSum solution;

    @Before
    public void setUp(){
        solution = new TwoSum();
    }

    @Test
    public void testSolution1Case1() {
        int[] nums =  new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result1 = solution.solution1(nums,target);
        Assert.assertArrayEquals(new int[]{0,1},result1);
    }

    @Test
    public void testSolution1Case2() {
        int[] nums =  new int[]{2, 3, 4};
        int target = 6;
        int[] result1 = solution.solution1(nums,target);
        Assert.assertArrayEquals(new int[]{0,2},result1);
    }

    @Test
    public void testSolution2Case1() {
        int[] nums =  new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result1 = solution.solution2(nums,target);
        Assert.assertArrayEquals(new int[]{0,1},result1);
    }

    @Test
    public void testSolution2Case2() {
        int[] nums =  new int[]{2, 3, 4};
        int target = 6;
        int[] result1 = solution.solution2(nums,target);
        Assert.assertArrayEquals(new int[]{0,2},result1);
    }
}