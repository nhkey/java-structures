package com.nhkey.geekforgeeks.array.n4_sort_an_array;

public class Main {

    public static void main(String[] args) {
        int[][][] a = {
                {{0,1,2,2,1,0}, {0,0,1,1,2,2}},
                {{1,2,0,0,0}, {0,0,0,1,2}},
                {{2}, {2}},
                {{2,1,1,1,1,1,1,1}, {1,1,1,1,1,1,1,2}},
        };

        for (int[][] opt : a) {
            int[] res = SortAnArray.SortAnArray(opt[0]);
            for (int num: res) {

                System.out.print(num + ",");
            }
            System.out.println();
        }

    }
}
