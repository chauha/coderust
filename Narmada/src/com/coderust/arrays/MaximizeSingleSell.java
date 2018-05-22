package com.coderust.arrays;

import java.util.Arrays;

public class MaximizeSingleSell {

    public static int findMaxSingleSell(int[] input) {
//        int min_buy=Integer.MIN_VALUE;
        int max_profit = Integer.MIN_VALUE;
        int min_buy = input[0], current_profit = 0;
        for (int index = 1; index < input.length; index++) {
            current_profit = input[index] - min_buy;
            if (current_profit > max_profit) {
                max_profit = current_profit;
            }
            if (min_buy > input[index]) {
                min_buy = input[index];
            }

        }
        return max_profit;
    }

    public static int findMaxContiguousSubarraySum(int[] input) {
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for (int index = 0; index < input.length; index++) {
            current_sum = current_sum + input[index];
            if (current_sum > max_sum) {
                max_sum = current_sum;
            }
            if (current_sum < 0) {
                current_sum = 0;
            }
        }
        if (max_sum < 0) {
            int temp = Integer.MIN_VALUE;

            for (int i = 0; i < input.length; i++) {
                if (input[i] > temp) {
                    temp = input[i];
                }
            }
          return temp;
        }
      return max_sum;
    }


    public static void main(String[] args) {

        int[] input = new int[]{-2, -3, -4, -1, -2, -1,-5,-3};
        //System.out.println(findMaxSingleSell(input));
        System.out.println(findMaxContiguousSubarraySum(input));
    }

}
