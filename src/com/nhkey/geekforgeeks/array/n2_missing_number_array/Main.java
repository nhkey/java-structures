package com.nhkey.geekforgeeks.array.n2_missing_number_array;

public class Main {

    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4,5,7},
                {1,2,3,5},
                {1,2,3,4,5,6,7,8,10},
                {1},
        };

        for (int[] opt : a) {
            System.out.println(MissingNumber.getMissingNumber(opt));
        }

    }
}
