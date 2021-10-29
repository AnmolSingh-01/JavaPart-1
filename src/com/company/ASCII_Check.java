package com.company;

import java.util.Scanner;

public class ASCII_Check {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press the no to check : ");
        ch = sc.next().charAt(0);
        if( (ch >=48 && ch <= 57)){
            System.out.println(ch + " is a number");
        }else if (ch >=65 && ch <= 90){
            System.out.println(ch + " is upper case character");
        }else if ( ch>=97 && ch <= 122){
            System.out.println(ch + " is a lower case character");
        }
    }
}
