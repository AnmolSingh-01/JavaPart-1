import java.util.Scanner;

public class Quadratic_equation_root {
    public static void main(String[] args) {
        int a , b, c;
        double r1 , r2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a , b , c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int d = (b*b) - 4*a*c;

        r1 = (-b + Math.pow(d,0.5))/2;   // We could also use Math.sqrt function instead of this way i just forget it
        r2 = (-b - Math.pow(d,0.5))/2;   // Later i realized it could have be done in simple way.

        if(d >= 0){
            System.out.println("The root of the equation are : " + r1 +" and" + r2);
        }
        else{
            System.out.println("According to given values result will be NaN, try other values of a,b,c"+"\n"+
                    "However the roots are " + r1+ " and " + r2);
        }


    }
}
