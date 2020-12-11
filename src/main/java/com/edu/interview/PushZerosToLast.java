package com.edu.interview;

import java.util.Arrays;

public class PushZerosToLast {
    public static void main(String[] args) {
        PushZerosToLast pz = new PushZerosToLast();
        int[] in = {1, 3, 5, 6, 0, 7, 0, 2, 3, 4, 0};
        int in2 = in.length;
        pz.pushZerosToEnd(in, in2);
        System.out.println(Arrays.toString(in));
    }

    public int[] pushZerosToEnd(int[] ip1, int ip2) {
        if (ip1.length < 2) {
            throw new UnsupportedOperationException("not valid input");
        }
        int count = 0;
        for (int i = 0; i < ip2; i++) {
            if (ip1[i] > 0) {
                ip1[count++] = ip1[i];
            }
        }
        while (count < ip2) {
            ip1[count++] = 0;
        }
        return ip1;
    }
}
