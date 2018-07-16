package com.nhkey.geekforgeeks.array.n1_kadane;

public class Kadane {
    public static int getMaxSubarray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxSubArray = nums[0];
        int maxSubArrayEndingHere = nums[0];

        for (int num: nums) {
            maxSubArrayEndingHere = Math.max(maxSubArrayEndingHere + num, num);
            maxSubArray = Math.max(maxSubArray, maxSubArrayEndingHere);
        }
        return maxSubArray;
    }
}
