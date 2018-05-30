package com.coderust.arrays;

public class MaximumSquareOfOneInMatrix {

    public static int max = 0;

    public static int findMaxSquare(int[][] matrix) {
        int[][] clone = matrix.clone();
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 || j == 0) {
                    continue;
                } else if (matrix[i][j] > 0) {
                    matrix[i][j] = 1 + Math.min(Math.min(matrix[i - 1][j], matrix[i - 1][j - 1]), matrix[i][j - 1]);
                    if (max < matrix[i][j]) {
                        max = matrix[i][j];
                    }
                }

            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 1;

            }
        }

        matrix[0][1] = 0;
        matrix[0][3] = 0;
        System.out.println(findMaxSquare(matrix));

    }
}
