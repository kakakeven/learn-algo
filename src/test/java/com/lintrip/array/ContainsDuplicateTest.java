package com.lintrip.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContainsDuplicateTest {

    private ContainsDuplicate containsDuplicate;

    @Before
    public void setUp() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    public void solution01() {
        int[] case1 = new int[]{1, 3, 6, 7, 9};
        int[] case2 = new int[]{2, 3, 2, 8};
        Assert.assertFalse(containsDuplicate.solution01(case1));
        Assert.assertTrue(containsDuplicate.solution01(case2));
    }

    @Test
    public void solution02() {
        int[] case1 = new int[]{1, 3, 6, 7, 9};
        int[] case2 = new int[]{2, 3, 2, 8};
        Assert.assertFalse(containsDuplicate.solution02(case1));
        Assert.assertTrue(containsDuplicate.solution02(case2));
    }

    @Test
    public void solution03() {
        int[] case1 = new int[]{1, 3, 6, 7, 9};
        int[] case2 = new int[]{2, 3, 2, 8};
        Assert.assertFalse(containsDuplicate.solution03(case1));
        Assert.assertTrue(containsDuplicate.solution03(case2));
    }
}