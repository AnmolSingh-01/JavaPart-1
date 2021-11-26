/*
Print no of a particular index :  0,0,550,275,1100,550,1650,825,2200,1100,2750,1375,3300,1650,3850,1925,4400,2200,...

Input : N = 10 

Output: 1100

Input : N = 7

Output: 1650

*/

package com.company;

import java.util.Scanner;

class Main
{
    static void nthPosition(int n)
    {
        // Checking even position
        if (n % 2 == 0)
        {
            n = n / 2;
            n = 275 * (n - 1);
            System.out.println(n);
        }

        // Checking odd position
        else
        {
            n = (n / 2) + 1;
            n = 550 * (n - 1);
            System.out.println(n);
        }
    }

    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       nthPosition(N);
    }
}
