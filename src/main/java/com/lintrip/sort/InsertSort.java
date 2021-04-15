package com.lintrip.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {3, 4, 1, 8, 7, 9, 10};
        int[] array2 = {3, 4, 5, 6, 7, 8, 9, 10};
        solution(array);
        solution(array2);
    }

    private static void solution(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (array[j] > value) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}
