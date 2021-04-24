package com.lintrip.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = {3, 4, 1, 8, 7, 9, 10};
        int[] array2 = {3, 4, 5, 6, 7, 8, 9, 10};
        solution(array);
        solution(array2);
    }

    private static void solution(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = array[i];
            int minIndex = i;
            int j = i + 1;
            for (; j < n; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int value = array[i];
                array[i] = min;
                array[minIndex] = value;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
