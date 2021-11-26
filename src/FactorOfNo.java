import java.util.Scanner;

class FactorOfNo {

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the no : ");
int num = sc.nextInt();

for(int i = 1 ; i <= num ; i++) {
   if(num % i == 0)
   System.out.println("The factors of " + num + " are : " + i);

}

}

}
// Prime factor program .................//////////////////////////////////////////////25-11-2021

import java.util.*;
class primeFactor {

public static void main(String args[]) {

int number;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number : ");
number = sc.nextInt();

for(int i = 2 ; i < number ; i++) {

   while( number % i ==0) {
            System.out.println(i + " ");
            number = number/i;

               }
}
   if(number > 2)
   System.out.println(number);
}
}
/////////////////////////////////////////////////////////////////////////////////////////////////
