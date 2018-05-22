package com.coderust.arrays;

import java.util.HashSet;
import java.util.Iterator;

public class MakeRowsAndColumnsZero {

    public static int[][] makeZeroes(int[][] input) {
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();
        for (int index = 0; index < input.length; index++) {
            for (int j = 0; j < input[0].length; j++) {
                if (input[index][j] == 0) {
                    if (!rowSet.contains(index)) {
                        rowSet.add(index);
                    }
                    if (!colSet.contains(j)) {
                        colSet.add(j);
                    }
                }
            }
        }

        Iterator<Integer> rItr = rowSet.iterator();
        while (rItr.hasNext()) {
            int i = rItr.next();
            for (int j = 0; j < input[0].length; j++) {
                input[i][j] = 0;
            }
        }
        Iterator<Integer> cItr = colSet.iterator();
        while (cItr.hasNext()) {
            int j = cItr.next();
            for (int i = 0; i < input.length; i++) {
                input[i][j] = 0;
            }
        }

        return input;
    }


    public static void main(String[] args) {
        int[][] inputArray = new int[3][3];
        int count = 1;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[0].length; j++) {
                inputArray[i][j] = count++;
            }
        }
        inputArray[1][1] = 0;
        int[][] result = makeZeroes(inputArray);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

}
