package com.company;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        for(int i = 0;i<num;i++){
            sum = sum + sc.nextInt();
        }
        System.out.println(sum);
    }
}
