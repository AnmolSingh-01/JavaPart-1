package com.company;
class Animal2{
    protected String type = "Animal";
}
class Dog2 extends Animal2{
    public String type = "Mammal";
    public void printType(){
        System.out.println("Hello i'm " + type);
        System.out.println("Hello i'm "+ super.type);
    }
}
class Main2{
    public static void main(String[] args) {
      Dog2 obj = new Dog2();
      obj.printType();
    }
}

