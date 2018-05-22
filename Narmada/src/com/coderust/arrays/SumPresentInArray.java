package com.coderust.arrays;

import java.util.HashMap;

public class SumPresentInArray {

    public static boolean isSumPresent(int[] arr, int num) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum < num) {
                left++;
                continue;
            } else if (sum > num) {
                right--;
                continue;
            }

            return true;

        }
        return false;
    }

    public static boolean isSumThere(int[] arr, int num) {
        HashMap<Integer, Boolean> nums = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int desiredNum = num - arr[i];
            if (nums.get(desiredNum) != null ) {
                return true;
            }
            nums.put(arr[i], true);
        }
        return false;
    }


    public static void main(String[] args) {
        int[] input = new int[]{2, 4, 7, 8, 9, 10};
        System.out.println(isSumThere(input, 6));

    }

}
