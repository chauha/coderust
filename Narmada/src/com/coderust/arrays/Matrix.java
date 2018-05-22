package com.coderust.arrays;

public class Matrix {



    public static void main(String [] args){
        int [][] matrix= new int[3][3];
        int count=1;
        for (int i=0; i <matrix.length ; i++){
            for (int j=0; j< matrix[0].length ; j++){
                matrix[i][j]=count++;
            }
        }

        for (int i=0; i <matrix.length ; i++){
            for (int j=0; j< matrix[0].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }




    }
}
