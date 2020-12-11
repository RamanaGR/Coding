package com.edu.interview;

import java.util.Arrays;

public class SortAnArray {
    private int[] sortUsingSortMethod(int[] arr) {
        Arrays.sort(arr);
        return (arr);
    }



    private int[] sortUsingImpl(int[] arr) {//{2, 5, 6, 3, 8, 9, 0}
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {//5>0
                    temp = arr[i]; //temp =2
                    arr[i] = arr[j]; //arr[i]=0
                    arr[j] = temp; //arr[j] = 2
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        SortAnArray sort = new SortAnArray();
        //System.out.println(Arrays.toString(sort.sortUsingSortMethod(new int[]{2, 5, 6, 3, 8, 9, 0})));
        System.out.println(Arrays.toString(sort.sortUsingImpl(new int[]{2, 5, 6, 3, 8, 9, 0})));

//        int[] one = {1, 3, 45, 6};
//        int[] two = Arrays.copyOf(one, 10);


    }
}
