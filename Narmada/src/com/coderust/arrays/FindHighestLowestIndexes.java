package com.coderust.arrays;

public class FindHighestLowestIndexes {

    public static int findLowestIndex(int[] input, int number) {
        int start = 0;
        int end = input.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (input[mid] >= number) {
                end = mid - 1;
            } else if (input[mid] <= number) {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int findHighestIndex(int[] input, int number){
        int start = 0;
        int end = input.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (input[mid] > number) {
                end = mid - 1;
            } else if (input[mid] <= number) {
                start = mid + 1;
            }
        }
        return end;
    }


    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 5, 5, 5, 5, 5, 5, 5, 23, 24};
        System.out.println(findLowestIndex(input,5));
        System.out.println(findHighestIndex(input,5));

    }

}
