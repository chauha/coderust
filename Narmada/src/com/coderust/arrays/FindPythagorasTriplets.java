package com.coderust.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPythagorasTriplets {

    public static ArrayList<int[]> findTriplets(int[] input) {
        ArrayList<int[]> results = new ArrayList<int[]>();
        Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                int sum = input[i] * input[i] + input[j] * input[j];
                int result = BinarySearchValue(input, sum);
                if (result != -1) {
                    results.add(new int[]{input[i], input[j], result});
                }
            }

        }
        return results;
    }

    public static int BinarySearchValue(int[] input, int sum) {
        int start = 0, end = input.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if ((input[mid] * input[mid]) < sum) {
                start = mid + 1;
                continue;
            } else if ((input[mid] * input[mid]) > sum) {
                end = mid - 1;
                continue;
            }
            return input[mid];
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] input = new int[]{10, 11, 4, 5, 3};
        for (int[] arr : findTriplets(input)) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
