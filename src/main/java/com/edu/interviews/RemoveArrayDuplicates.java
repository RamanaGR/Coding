package com.edu.interviews;

import java.util.Arrays;

/**
 * @author medany
 */

/*
 * Write a program to remove duplicates from an array in Java without using the
 * Java Collection API. The array can be an array of String, Integer or
 * Character, your solution should be independent of the type of array. If you
 * want to practice more array based questions then see this list of top 30
 * array interview questions from Java interviews.
 */
public class RemoveArrayDuplicates {

    public static void main(String[] args) {
        Object[] arr = {'a', 'a', 'd', 'c', 'b', 'c', 'e', 'd'};
        int[] arr1 = {2, 1, 5, 3, 6, 5, 8, 9, 5, 6, 3};
        System.out.println("Array with duplicates: " + Arrays.toString(arr1));
        System.out.println("Array without duplicates: " + removeDuplicates(arr1)); //Arrays.toString(removeDuplicates(arr1)));
    }

    public static Object[] removeDuplicates(Object[] arr) {

        Arrays.sort(arr);

        Object[] result = new Object[arr.length];
        Object previous = arr[0];
        result[0] = previous;

        for (int i = 1; i < arr.length; i++) {
            Object ch = arr[i];
            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        //Arrays.sort(nums);
        sortArray(nums);
        if (n == 0 || n == 1)
            return n;
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1])
                nums[j++] = nums[i];
        }
        nums[j++] = nums[n - 1];
        return j;
    }

    private static void sortArray(int array[]) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            int a = array[i];
            while ((j > 0) && (array[j - 1] > a))   //returns true when both conditions are true
            {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = a;
        }
    }
}