package com.lintrip.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 4, 1, 8, 7,9,10};
        int[] array2 = {3,4,5,6,7,8,9,10};
        solution(array);
        solution(array2);
    }

    private static void solution(int[] array) {
        int n = array.length;
        if (array.length <= 1) {
            return;
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(count);
    }
}
