package com.lintrip.array;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {

    @Test
    public void plusOne() {
        PlusOne solution = new PlusOne();
        int[] array1 = new int[]{2, 4};
        int[] result1 = solution.plusOne(array1);
        Assert.assertArrayEquals(new int[]{2, 5}, result1);

        int[] array2 = new int[]{2, 9, 9};
        int[] result2 = solution.plusOne(array2);
        Assert.assertArrayEquals(new int[]{3, 0, 0}, result2);


        int[] array3 = new int[]{9, 9};
        int[] result3 = solution.plusOne(array3);
        Assert.assertArrayEquals(new int[]{1, 0, 0}, result3);
    }
}