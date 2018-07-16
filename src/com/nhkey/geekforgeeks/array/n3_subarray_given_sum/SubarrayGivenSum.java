package com.nhkey.geekforgeeks.array.n3_subarray_given_sum;

public class SubarrayGivenSum {
    public static int[] getSubarrayGivenSum(int[] nums, int sum) {
        int a = 0, b = 0;
        int sumLocal = 0;
        while (a < nums.length && b <= nums.length) {

            if (sumLocal > sum) {
                sumLocal -= nums[a];
                a++;
            } else if(sumLocal < sum) {
                if (b == nums.length) {
                    return new int[]{-1, -1};
                }
                sumLocal += nums[b];
                b++;
            }

            if (sumLocal == sum) {
                return new int[]{a, b - 1};
            }
        }


        return new int[]{-1, -1};
    }
}
