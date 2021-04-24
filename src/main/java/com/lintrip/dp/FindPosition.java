package com.lintrip.dp;

/**
 * 递归问题示例
 */
public class FindPosition {
    public static void main(String[] args) {
        int n = 10000;
        System.out.println(rFindPosition(n));
        System.out.println(findPosition(n));
    }

    public static int rFindPosition(int n){
        if (n == 1) {
            return 1;
        }
        return rFindPosition(n-1) +1;
    }

    public static int findPosition(int n){
        int result = 1;
        for (int i = 1;i< n;i++) {
            result = result + 1;
        }
        return result;
    }
}
