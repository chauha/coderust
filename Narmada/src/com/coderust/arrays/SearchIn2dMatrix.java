package com.coderust.arrays;

import javafx.util.Pair;

public class SearchIn2dMatrix {

    public static Pair<Integer, Integer> findElement(int[][] input, int num) {
        int i = 0;
        int j = input[0].length - 1;
        int k = input.length;
        while (i < k && j >= 0) {
            if (input[i][j] == num) {
                return new Pair<>(i, j);
            }
            if (input[i][j] > num) {
                j--;
            } else {
                i++;
            }
        }
        return new Pair<>(-1, -1);
    }


    public static void main(String[] args) {
        int[][] input = new int[4][4];
        int count = 1;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                input[i][j] = count++;
            }
        }
        System.out.println(findElement(input,8));
    }
}
