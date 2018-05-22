package com.coderust.arrays;

public class MergeSortedArrays {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[arr1.length + arr2.length];
        while (i <= arr1.length - 1 && j <= arr2.length - 1) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                k++;
                i++;
            } else if (arr1[i] > arr2[j]) {
                result[k] = arr2[j];
                k++;
                j++;
            } else {
                result[k] = arr1[i];
                k++;
                result[k] = arr2[j];
                i++;
                j++;
            }
        }
        if (i < arr1.length) {
            while (i < arr1.length) {
                result[k] = arr1[i];
                i++;
                k++;
            }
        }
        if (j < arr2.length) {
            while (j < arr2.length) {
                result[k] = arr2[j];
                j++;
                k++;
            }
        }

       return result;
    }


    public static void main(String[] args) {
        int[] arr1 = new int[]{2};
        int[] arr2 = new int[]{3, 5, 7, 11, 19, 24};
        int [] result= mergeSortedArrays(arr1, arr2);
        for (int index=0; index<result.length; index++){
            System.out.println(result[index]);
        }
    }


}
