package com.nhkey.geekforgeeks.array.n4_sort_an_array;

public class SortAnArray {
    public static int[] SortAnArray(int[] nums) {
       int[] res = new int[nums.length];
       int count0 = 0;
       int count1 = 0;
       int count2 = 0;

       for (int num: nums) {
           switch (num) {
               case 0:
                   count0++;
                   break;
               case 1:
                   count1++;
                   break;
               case 2:
                   count2++;
                   break;
           }
       }
        int i = 0;
        while (count0 + count1 + count2 > 0) {
            if (count0 > 0) {
                res[i] = 0;
                count0--;
            } else if (count1 > 0) {
                res[i] = 1;
                count1--;
            } else if (count2 > 0) {
                res[i] = 2;
                count2--;
            }

            i++;
        }

       return res;
    }
}
