package com.coderust.arrays;

public class CountingSort {


    public static void main(String[] args) {
        int[] input = {10, 1, 6, 3, 5, 9, 7, 8,2};
        int[] holdArray = new int[10 + 1];
        for (int index = 0; index < input.length; index++) {
            holdArray[input[index]] = holdArray[input[index]] + 1;

        }
        int sortedArrayIndex=0;
        int[] sortedArray = new int[input.length];
        for (int index = 0; index < holdArray.length; index++) {

            for (int count = 0; count < holdArray[index]; count++) {
                sortedArray[sortedArrayIndex] = index;
                sortedArrayIndex++;

            }
        }

        for (int i=0; i<sortedArray.length;i++){
            System.out.print(sortedArray[i]+" ");
        }


    }


}
