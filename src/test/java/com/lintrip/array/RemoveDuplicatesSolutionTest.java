package com.lintrip.array;


import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesSolutionTest {

    @Test
    public void testSolution01(){
        RemoveDuplicatesSolution solution = new RemoveDuplicatesSolution();
        int[] array = {0, 1, 1, 2, 2, 3, 3};
        int length = solution.solution01(array);
        Assert.assertEquals(4,length);
        Assert.assertEquals(0,array[0]);
        Assert.assertEquals(3,array[3]);
    }

    @Test
    public void testSolution02(){
        RemoveDuplicatesSolution solution = new RemoveDuplicatesSolution();
        int[] array = {0, 1, 1, 2, 2, 3, 3};
        int length = solution.solution02(array);
        Assert.assertEquals(4,length);
        Assert.assertEquals(0,array[0]);
        Assert.assertEquals(3,array[3]);
    }

}
