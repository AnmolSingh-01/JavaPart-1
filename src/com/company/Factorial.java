package com.company;

public class Factorial {

    static int factorial(int n){
        if( n != 0){
            return n * factorial(n-1);
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args){
        Factorial obj = new Factorial();
        double result;
        result = factorial(10);
        System.out.println(result);
    }
}
