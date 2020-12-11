package com.edu.interview;

import java.util.Arrays;

public class SepClass {

    public static void main(String args[]) {
//        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
//                'i', 'n', 'a', 't', 'e', 'd' };
//        //declaring a destination array
//        char[] copyTo = new char[7];
//        //copying array using System.arraycopy() method
//        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
//        System.out.println(Arrays.toString(copyTo));

        char[] one = {97,98,99,100,101};//4
        char[] two = Arrays.copyOf(one, 20);//10
        //two[8] = 'R';
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));
    }
//declaring and initializing 2D array
//        int[][] arr;
//        arr = new int[3][3];
//        int[][] arr = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};
//        System.out.println(arr[1][1]);//4
////printing 2D array
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();//next line
//        }
//    }

//    public int min(int[] arr) { //array = {33, 3, 4, 5};
//        int min = arr[0];// min = 33
//        for (int i = 1; i < arr.length; i++) {
//            if (min > arr[i]) {//33 > 3 // 3 > 4 // 3 > 5
//                min = arr[i];//min = 3
//            }
//        }
//        //System.out.println(min);//3
//        return min;
//    }
//
//    //Program to find Min element from int array
//    public static void main(String[] args) {
//        SepClass sep = new SepClass();
//        int[] array = {33, 3, 4, 5};//declaring and initializing an array
//        sep.min(array);//passing array to method
//        //int[] arr1 = {100,500,50,40,5,10,1,0};
//        System.out.println(sep.min(new int[] {100,500,50,40,5,10,1,0})); //0
//    }

}


//    public static void main(String[] args) {
//        SepClass sep = new SepClass();
//        System.out.println(sep.addition(10, 20));
//        System.out.println(sep.addition(50, 90));
//        int output = sep.addition(100, 500);
//        System.out.println(output);
//    }
//
//    public int addition(int a, int b) {
//        int result = a + b;
//        return result;
//    }
