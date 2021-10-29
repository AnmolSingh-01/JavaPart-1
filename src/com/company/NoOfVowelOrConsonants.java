package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoOfVowelOrConsonants {
    public static void main(String[] args) {
        // Declare Variables
        Scanner sc = null;
        String str = null;
        Set<Character> vowels = null;
        Set<Character> consonants = null;
        char ch ='\0';

        // Create Scanner class Object
        sc = new Scanner(System.in);

        // Take input
        System.out.println("Enter the string : ");
        str = sc.nextLine();

        // convert String to upperCase
        str = str.toUpperCase();

        //HashSet collection
        vowels = new HashSet<Character>();
        consonants = new HashSet<Character>();

        // Check each character
        for(int i =0;i<str.length();i++){
            ch = str.charAt(i);

            //Check it is alphabet or not
            if(ch>='A' && ch <='Z'){

                // Check it is vowel or consonant
             if(checkVowel(ch)){
                 vowels.add(ch);
             }else{
                 consonants.add(ch);
             }
            }
        }
       // Display Results
        System.out.println(" Vowels are : " + vowels);
        System.out.println("Consonants are : " + consonants);

        //Close Scanner object
        sc.close();
    }
    private static boolean checkVowel(char ch){
        if(ch =='A' || ch =='E' || ch == 'I' || ch=='O' || ch=='U')
            return true;
        return false;
    }
}


