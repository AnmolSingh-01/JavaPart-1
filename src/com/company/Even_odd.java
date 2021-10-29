//package com.company;
//
//import java.util.Scanner;
//
//public class Even_odd {
//
//    static boolean EvenOdd(int n){
//       return ((n / 2 )* 2 == n );
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n ;
//        System.out.println("Enter the no to check : ");
//        n = sc.nextInt();
//        if ((EvenOdd(n))) {
//            System.out.println("Even");
//        }else{
//            System.out.println("odd");
//        }
//
//    }
//}
package com.company;

import java.util.Scanner;

public class Even_odd {

        public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to check : ");
        n = sc.nextInt();

//        if(n % 2 == 0){
//            System.out.println(n + " is an even no");
//        }else {
//            System.out.println(n + " is an odd no");
//        }
        String check =  ( n % 2 ==0 ) ? " is even no " : " is odd number" ;

            System.out.println(n + check );

    }
}
