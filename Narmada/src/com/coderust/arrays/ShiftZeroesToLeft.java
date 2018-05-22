package com.coderust.arrays;

public class ShiftZeroesToLeft {

    public static int[] shiftLeftZeroes(int[] input) {
        int reader = input.length - 1;
        int writer = input.length - 1;
        while (reader >= 0) {
            if (input[reader] == 0) {
                reader--;
            } else {
                input[writer] = input[reader];
                writer--;
                reader--;
            }
        }
        while (writer >= 0) {
            input[writer] = 0;
            writer--;
        }
        return input;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 10, 20, 0, 59, 63, 0, 88, 0};
        int[] result = shiftLeftZeroes(arr1);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
