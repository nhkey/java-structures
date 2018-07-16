package com.nhkey.geekforgeeks.array.n3_subarray_given_sum;

public class Main {

    public static void main(String[] args) {
        int[][][] a = {
                {{1,2,3,4,5,7}, {10}},
                {{1,2,3,5}, {8}},
                {{1,2,3,4,5,6,7,8,10}, {13}},
                {{1, 8, 4, 2}, {100}},
        };

        for (int[][] opt : a) {
            int[] res = SubarrayGivenSum.getSubarrayGivenSum(opt[0], opt[1][0]);
            System.out.println(res[0] + " " + res[1]);
        }

    }
}
