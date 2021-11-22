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
// Method 2 

/*
class Array { 
  
    public static void convertToString(int arr[][]) 
    { 
        int n = 0,k = 0;
        while (n != arr.length)
        {
            while (k != arr[n].length)
            {
                System.out.print(arr[n][k] + " ");
                k++;
            }
            k = 0;
            n++;
            System.out.println("");
        }
            
    } 
  
    public static void main(String args[])
    { 
        int arr[][] = { { 23, 70, 39 }, 
                        { 51, 64, 47 }, 
                        { 81, 11, 105 } }; 
        convertToString(arr); 
    } 
}





*/
