package com.coderust;

public class BinarySearch {


    public static int findIndexUsingBinary(int[] input, int number) {
         int left=0,mid=0;
         int right=input.length -1;
         while (left <= right ){

             mid= (left + right)/2;
             if ( number == input[mid])
                 return mid;
             if (number > mid)
                left=mid+1;
             else
                right=mid-1;

         }
         return -1;

    }


    public static void main(String[] args) {
        int [] input= new int[]{10,30,40,60,80};
        int result=findIndexUsingBinary(input,80);
        System.out.println(result);
    }

}
