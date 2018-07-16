package com.nhkey.geekforgeeks.array.n2_missing_number_array;

public class MissingNumber {
    public static int getMissingNumber(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (num != ++i) {
                return i;
            }
        }
        return i + 1;
    }
}
