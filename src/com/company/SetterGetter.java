package com.company;

public class SetterGetter {
    String name;
void SetName(String name){
    this.name = name;
}
String GetName(){
    return this.name;
}
public static void main(String[] args){
  SetterGetter obj = new SetterGetter();
  obj.SetName("Anmol");
    System.out.println("My name is : " + obj.name);
   }
}
