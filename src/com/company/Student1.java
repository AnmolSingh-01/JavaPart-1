package com.company;

public class Student1{

    public static void main(String[] args) {


        int[] arr = new int[4];

        arr[0] = 1;
        arr[1] = 7;
        arr[2] = 6;
        arr[3] = 10;
// Inhanced for loop i have used
        for (int i : arr) {
            System.out.println("Elements of the array are : " + i);
        }

// It is same as for(int i=0; i< arr.length;i++) { sout("element of the array are : " + arr[i]};
    }

    }