package com.nhkey.geekforgeeks.array.n5_equilibrium_point;

public class EquilibriumPoint {
    public static int EquilibriumPoint(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        if (nums.length == 1) {
            return 0;
        }

        int i = 0;
        int j = nums.length-1;
        int sumBefore = 0;
        int sumAfter = 0;
        while (i != j) {
            if (sumBefore <= sumAfter) {
                sumBefore += nums[i];
                i++;
            } else {
                sumAfter += nums[j];
                j--;
            }
        }
        if (sumAfter == 0 && i == 1) {
            return 0;
        }
        return sumBefore == sumAfter ? i : -1;
    }
}
