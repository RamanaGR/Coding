package com.edu.Interviewtest;
public class GFG {
//    GFG(int x) {
//        System.out.println("one argument constructor");
//
//    }
//
//    GFG() {
//        System.out.println("No argument Constructor");
//    }
//
//    static {
//        System.out.println("Ist Static init");
//    }
//
//    {
//        System.out.println("Ist instance init");
//    }
//
//    {
//        System.out.println("2ndst instance init");
//    }
//
//    static {
//        System.out.println("2ndst Static init");
//    }


    public static void main(String[] args) {
//        new GFG();
//        new GFG(8);
        GFG gfg = new GFG();
        System.out.println(gfg.maxProduct(new int[]{3,-2,1,3,9}));
    }

    public int findMaxProduct(int[] nums) {
        int max = 0;
        int current = nums[0];
        if (nums.length <= 1) {
            return nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            current *= nums[i];
            //current = num;
            if (max < current)
                max = current;
        }

        return max;
    }


    public int maxProduct(int[] nums) {
        int currentMax = 0;
        int maxprod = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == 0) {
                currentMax = 0;
            } else if (currentMax > 0) {
                currentMax *= nums[i];
            } else {
                currentMax = nums[i];
            }
            if (currentMax > maxprod) {
                maxprod = currentMax;
            }
            currentMax = nums[i];

        }
        return maxprod;
    }
}

