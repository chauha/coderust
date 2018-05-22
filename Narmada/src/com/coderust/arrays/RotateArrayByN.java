package com.coderust.arrays;

public class RotateArrayByN {

    public static int[] rotateArrayRange(int[] input, int start, int end) {
        while (start < end) {
            int temp = input[end];
            input[end] = input[start];
            input[start] = temp;
            start++;
            end--;

        }
        return input;
    }


    public static int[] rotataByN(int[] input, int n) {
        int[] result1 = rotateArrayRange(input, 0, input.length - 1);
        result1 = rotateArrayRange(result1, 0, n-1);
        result1=rotateArrayRange(result1, n, input.length - 1);
        return result1;

    }


    public static void main(String[] args) {
        int[] input = new int[]{10, 32, 22, 43, 65, 76};
        int[] result = rotataByN(input, 2);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
    }

}
