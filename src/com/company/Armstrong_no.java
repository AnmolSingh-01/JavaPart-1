package com.company;

import java.util.Scanner;
import java.util.*;
public class Armstrong_no {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = sc.nextInt();

        int temp , remainder , result = 0 , n = 0 ;
        temp = number;
// No of digits in the number ~
        while(temp != 0){
            temp = temp /10 ;
            n++;
        }
        temp = number;
// Armstrong check

    while(temp != 0){
        remainder = temp % 10;
        result += Math.pow(remainder,n);
        temp = temp / 10;
    }

    if(result == number){
        System.out.println(number + " is an armstrong no ");
    }else{
        System.out.println(number + " is not an armstrong number ");
    }

    }
}
