package com.lintrip.zju.class01;

public class PrintN {

    public static void main(String[] args) {
        PrintN printN = new PrintN();
//        printN.method1(1000);
//        printN.method2(1000);
//        printN.method1(100000);
        printN.method2(100000);
    }

    public void method1(Integer n) {
        for (int i = 0; i < n; i++) {
            System.out.println("n = " + i);
        }
    }

    public void method2(Integer n) {
        if (n > 0) {
            method2(n-1);
            System.out.println("n = " + n);
        }
    }
}
