package com.coderust;

public class RotateArray {

    public static int[] rotateArray(int[] input, int rotateFacor) {
        input = reverseArray(input);
        int rotateIndex = rotateFacor - 1;
//        for (int i=0;i<rotateFacor;i++){
//
//        }
        int temp = 0, index = 0;
        while (rotateIndex > 0) {
            temp = input[index];
            input[index] = input[rotateIndex];
            input[rotateIndex] = temp;
            rotateIndex--;
            index++;
        }

        index = rotateFacor;
        rotateIndex = input.length - 1;
        while (rotateIndex > rotateFacor) {
            temp = input[index];
            input[index] = input[rotateIndex];
            input[rotateIndex] = temp;
            rotateIndex--;
            index++;
        }
        return input;

    }

    public static int[] reverseArray(int[] input) {
        int temp = 0;
        int low = 0, high = input.length - 1;
        while (low < high) {
            temp = input[low];
            input[low] = input[high];
            input[high] = temp;
            low++;
            high--;

        }
        for (int index = 0; index < input.length; index++) {
           // System.out.println(input[index]);
        }
        return input;
    }


    public static void main(String[] args) {
        int[] input = new int[]{10, 30, 54, 64, 72};
//        reverseArray(input);

        int [] in=rotateArray(input,2);
        for (int index = 0; index < in.length; index++) {
            System.out.println(in[index]);
        }

        //test t =new Test();
    }
}

class Test{





}
