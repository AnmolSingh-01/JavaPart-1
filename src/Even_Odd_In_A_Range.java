import java.util.Scanner;

public class Even_Odd_In_A_Range {
    public static void main(String[] args) {
//        Given an integer,n, perform the following conditional actions:
//
//        If  is odd, print Weird
//        If  is even and in the inclusive range of 2 to 5, print Not Weird
//        If  is even and in the inclusive range of 6 to 20, print Weird
//        If  is even and greater than 20 , print Not Weird
//        Complete the stub code provided in your editor to print whether or not n is weird.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no you want to check");
        int num = sc.nextInt();

        if(num % 2 != 0) {
            System.out.println("Weired");
        }
        if((num % 2 ==0) && (num >= 2 && num <=5)){
            System.out.println("Not weired");
        }
        if((num % 2 ==0) && (num >=6 && num <=20)){
            System.out.println("weired");
        }
        if((num % 2 ==0) && (num > 20)){
            System.out.println("Weired");
        }
    }
}
