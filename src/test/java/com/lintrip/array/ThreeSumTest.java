package com.lintrip.array;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ThreeSumTest {

    ThreeSum threeSum;

    @Before
    public void setUp() {
        threeSum = new ThreeSum();
    }

    @Test
    public void solutionCase1() {
        int[] array = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum.solution(array);
        for (List<Integer> integerList : result) {
            System.out.println(integerList);
        }
    }

    @Test
    public void solutionCase2() {
        int[] array = new int[]{0, 0, 0};
        List<List<Integer>> result = threeSum.solution(array);
        for (List<Integer> integerList : result) {
            System.out.println(integerList);
        }
    }

    @Test
    public void solutionCase3() {
        int[] array = new int[]{0, 0, 0, 0};
        List<List<Integer>> result = threeSum.solution(array);
        for (List<Integer> integerList : result) {
            System.out.println(integerList);
        }
    }

    @Test
    public void solutionCase4() {
        int[] array = new int[]{-2,0,0,2,2};
        List<List<Integer>> result = threeSum.solution(array);
        for (List<Integer> integerList : result) {
            System.out.println(integerList);
        }
    }
}