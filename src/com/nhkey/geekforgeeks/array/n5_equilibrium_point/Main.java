package com.nhkey.geekforgeeks.array.n5_equilibrium_point;

public class Main {

    public static void main(String[] args) {
        int[][] a = {
                {1,3,4,2,2},
                {4},
                {0,2,3,1,1},
                {8,0,1,1,1,2,2,1},
                {0,0,0,0,0,0,0,3},
                {2,0,0,0},
        };

        for (int[] opt : a) {
            int res = EquilibriumPoint.EquilibriumPoint(opt);
            System.out.println(res);
        }

    }
}
