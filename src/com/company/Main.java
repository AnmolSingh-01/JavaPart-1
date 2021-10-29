package com.company;

class Main {

    public void anmol1(){
        System.out.println("without parameter");
       }

    public void anmol2(int a){
        System.out.println("With parameter" + a);
    }

    public static void main(String[] args){
        System.out.println("The object demo's are :");

        Main Obj = new Main();

        Obj.anmol1();
        Obj.anmol2(10);
    }
}