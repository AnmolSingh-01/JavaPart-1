package com.company;

    class Animal {
        String name;

        public void eat() {
            System.out.println("I can eat");
        }
    }
    class Dog extends Animal{
        public void display(){
            System.out.println("my Name is " + name);
        }
    }
public class Inheritance {
    public static void main(String[] args){
        Dog obj1 = new Dog();
        obj1.name = "Ankit";
        obj1.display();
        obj1.eat();
    }
}
