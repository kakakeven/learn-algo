package com.lintrip.array;

import org.junit.Assert;
import org.junit.Test;

public class RotateArraySolutionTest {

    @Test
    public void testSolution1() {
        RotateArray rotateArraySolution = new RotateArray();
        int[] array = {1, 3, 5, 7, 10};
        int k = 1;
        rotateArraySolution.solution1(array, k);
        int[] expected = {10, 1, 3, 5, 7};
        Assert.assertArrayEquals(expected, array);
    }
}
