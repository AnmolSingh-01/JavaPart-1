import java.util.Scanner;

public class Vowel_Consonent {
    static void vowel_or_consonant(char ch){
        if(ch == 'a' || ch == 'e'|| ch =='i' || ch == 'o' || ch =='u' || ch == 'A' || ch =='E' || ch =='I' || ch =='O' || ch =='U'){
            System.out.println("vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check : ");
        char ch  = sc.next().charAt(0);
        vowel_or_consonant(ch);
    }
}
