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
// This program gives the factor of any no .....Next we will find prime factor of any no....Lets see

