package com.company;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array");
        n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter all the elements");

        for(int i=0 ;i<n;i++){
         a[i] = sc.nextInt();
        }
        System.out.println("Reversed Array is : ");
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i] + " ");
        }
    }
}
