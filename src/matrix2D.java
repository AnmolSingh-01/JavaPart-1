import java.util.*;

class Array { 
  
    public static void convertToString(int arr[][]) 
    { 

        for (int n = 0 ; n < arr.length ; n++)
        {
            System.out.println(Arrays.toString(arr[n])); 
        } 
            
    } 
  
    public static void main(String args[])
    { 
        int ar[][] = { { 10, 20, 30 }, 
                        { 40, 50, 60 }, 
                        { 70, 80, 90 } }; 
        convertToString(arr); 
    } 
} 
