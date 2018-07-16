package com.nhkey.geekforgeeks.array.n1_kadane;

public class Main {

    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4,5,6},
                {-5,1,-4,4,1,2},
                {-2,1,-3,4,-1,2,1,-5,4},
        };

        for (int[] opt : a) {
            System.out.println(Kadane.getMaxSubarray(opt));
        }

    }
}
