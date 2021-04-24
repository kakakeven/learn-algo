package com.lintrip.dp;

public class StepsCombination {

    public static void main(String[] args) {
        int n = 5;
        int rcount = rCountSteps(n);
        System.out.println(rcount);
        int count = countSteps(n);
        System.out.println(count);
    }

    /**
     * 递归形式
     * @param n
     * @return
     */
    private static int rCountSteps(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return rCountSteps(n-1) + rCountSteps(n-2);
    }

    /**
     * 非递归形式
     * @param n
     * @return
     */
    private static int countSteps(int n){
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int ppre = 1;
        int pre = 2;
        int count = 0;
        int i = 2;
        while (i < n) {
            count = pre + ppre;
            ppre = pre;
            pre = count;
            i++;
        }
        return count;
    }
}
