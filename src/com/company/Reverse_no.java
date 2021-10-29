package com.company;

import java.util.Scanner;

public class Reverse_no {
    public static void main(String[] args) {
        int n;
        int rem, rev = 0;
        System.out.println("Enter the no : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

    }
}
