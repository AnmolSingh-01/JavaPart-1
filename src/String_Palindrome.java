import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        String A ,rev = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        A = sc.nextLine();
        int n = A.length();

        for(int i = n-1 ; i >=0 ; i-- ){
            rev = rev + A.charAt(i);
        }
        if(rev.equalsIgnoreCase(A)){
            System.out.println("Yes");
        }
       else{
            System.out.println("No");
        }
    }
}
