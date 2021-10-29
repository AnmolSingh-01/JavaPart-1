package com.company;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        int n ;
        System.out.println("Enter the year to check : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if( (n % 4 == 0) && (n % 100 != 0)){
            System.out.println(n +" is leap year ");
        }
        else if( n % 400 == 0){
            System.out.println(n + "is leap year");
        }
        else{
            System.out.println(n + " is not a leap year");
        }
    }
}
