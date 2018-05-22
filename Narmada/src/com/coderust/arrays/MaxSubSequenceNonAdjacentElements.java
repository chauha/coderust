package com.coderust.arrays;

public class MaxSubSequenceNonAdjacentElements {

    public static int findMaxSubsequence(int [] input){
        int [] result = new int[input.length];
        result[0]=input[0];
        for (int i=1;i<input.length;i++){
            if (i <2  ){
                result[i]=Math.max(result[i-1],input[i]);
            }
            else{
                result[i]=Math.max(result[i-1],result[i-2]+input[i]);
            }
        }
        return result[input.length -1];
    }

    public static void main(String[] args){
        int [] input = new int []{1,16,10,14,-5,-1,2,-1,3};
        System.out.println(findMaxSubsequence(input));
    }
}
