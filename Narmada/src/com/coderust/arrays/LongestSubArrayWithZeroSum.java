package com.coderust.arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubArrayWithZeroSum {

    public static int findMaxLengthZeroSum(int[] arr) {
        HashMap<Integer, Integer> holdSums = new HashMap<>();
        int sum = 0;
        int max = 0;
        int start_index = 0;
        int end_index = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (holdSums.containsKey(sum)) {
                int currentLength = i - holdSums.get(sum);
                if (currentLength > max) {
                    max = currentLength;
                    start_index = holdSums.get(sum);
                    end_index = i;
                    continue;
                }

            }
            holdSums.put(sum, i);


        }
        return max;
    }


    public static void main(String[] args) {
        int[] input = new int[]{2, 3, 4, 87, -87, -4, 6, 7};
        System.out.println(findMaxLengthZeroSum(input));
        ArrayList<Integer> in = new ArrayList<>();



    }

}
