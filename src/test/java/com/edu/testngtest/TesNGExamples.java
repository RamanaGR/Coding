package com.edu.testngtest;

public class TesNGExamples {
    static int lastKDigits(int a[], int n) {
        int k = 2;
        int num = (int) (Math.pow(10, k));
        int mul = a[0] % num;
        for (int i = 1; i < n; i++) {
            a[i] = a[i] % num;
            mul = (a[i] * mul) % num;
        }
        return mul;

    }

    public static void main(String[] args) {
        int[] a = {25,10};
        System.out.println(TesNGExamples.lastKDigits(a,a.length));
    }
}
