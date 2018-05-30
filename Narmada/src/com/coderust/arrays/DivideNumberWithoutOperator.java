package com.coderust.arrays;

public class DivideNumberWithoutOperator {

    public static int divideNumbers(int number, int divisor){

        if (number < divisor ){
            return 0;
        }
        if (divisor == 1){
            return number;
        }
        if (divisor == 0){
            return -1;
        }

        int temp=divisor;
        int quotient =1;
        while (temp < number){
            temp = temp << 1;
            quotient = quotient << 1;
        }

        if (temp>number) {
            temp = temp >> 2;
            quotient = quotient >> 2;
        }
        return ( quotient + divideNumbers(temp - number,divisor));


    }




    public static void main (String [] args){

        System.out.println(divideNumbers(12,3));



    }



}
