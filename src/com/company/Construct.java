package com.company;

public class Construct {
 String languages;
 Construct(String lang){
     languages = lang;
     System.out.println(languages+ " Programming language");
 }
    public static void main(String[] args){
        Construct obj = new Construct("python");
        Construct obj1 = new Construct("Java");
    }
}

