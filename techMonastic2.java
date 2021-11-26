/*

Take a input of a string.Then find frequency of a particular character.And if any character ( after a space )
 is in small letter then change it in a capital letter.Finally add a special character after that string.Special 
character should come random basic for every dynamic input-output

Input: n
Output:

Frequency of n = 2
Final string = I Love Techmonastic Solution %

*/

import java.util.*;
import java.util.random.*;
class Demo {

    static String convert(String str)
    {

        // Create a char array of given String
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {

            // If first character of a word is found
            if (i == 0 && ch[i] != ' ' ||
                    ch[i] != ' ' && ch[i - 1] == ' ') {

                // Check for lowercase
                if (ch[i] >= 'a' && ch[i] <= 'z') {

                    // Convert to Upper
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }
        }

        // Convert the char array to equivalent String
        String st = new String(ch);
        return st;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Enter a particular character :");
        char character = sc.nextLine().charAt(0);
        int count = 0;

        for (int i=0; i<str.length(); i++){
            if(character == str.charAt(i)){
                count++;
            }
        }
        System.out.println("Frequency of "+ character + " = " + count);
       // System.out.println("Final string =" + convert(str));
        Random random = new Random();
        char a = (char) (random.nextInt(32) + '!');
        String str2 = str + " " +  a;
        System.out.println("Final string = " + convert(str2));

    }
}
