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
