package com.company;

public class TestArray {

    public static void main(String[] args) {
        // Declare an Array
        int[][] a = { {10},{40,30},{70,80,880},{80,90,99,90},{20,30,80,90,100} };
        //Display size of the Array
        System.out.println("The size of the Array is : " + a.length);

        System.out.println("The array elements are :");
        for(int i =0 ; i< a.length;i++){
            for (int j = 0 ; j<a[i].length;j++){
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
