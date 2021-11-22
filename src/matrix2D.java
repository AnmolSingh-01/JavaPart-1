// Printing of matrix using JAVA 2D array --> Method-1 : using 2 for loops , complexity is O(n*n)
import java.io.*;
 
class Matrix {
 
    public static void print2D(int arr[][])
    {
        // Loop through all rows
        for (int i = 0; i < arr.length;i++) {
 
            // Loop through all elements of current row
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
                   System.out.println();          
        }
    }
 
    public static void main(String args[]) throws IOException
    {
        int arr[][] = { { 10,20,30,40,50 },
                        { 40,80,100,13,45},
                        { 90,90,80,70,22} };
        print2D(arr);
    }
}
// Method 2 - Time complexity is reduced only one for loop used but using Arrays.toString method so we have to import java.util.* package for that...

import java.util.*;

class Demo {

public static void matrixPrint(int arr[][])
{

 for(int i =0;i <arr.length;i++) 
 { 
   System.out.println(Arrays.toString(arr[i]));
 }

}
public static void main(String args[])

{

int arr[][] = { {10,20,30},
                {40,50,60}
              };
matrixPrint(arr);
}

}

//Method 3 -->
