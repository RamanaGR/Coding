package com.edu.interview;

public class SecondHighestNumber {
    private static int getSecondHighestElement(int[] arr) {
        int second = Integer.MIN_VALUE;
        int first = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > first) {
                second = first;
                first = value;
            } else if (value > second) {
                second = value;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] array = {45, 67, 89, 77, 55, 33, 67, 1};//77
        System.out.println(getSecondHighestElement(array));
    }
}
