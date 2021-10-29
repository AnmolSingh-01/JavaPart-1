import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        int l,b,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of l , b and h : ");
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();

        float Area = 2*(l*b+b*h+b*h);
        float Volume = l*b*h;

        System.out.println("The area of Cuboid is : " + Area + " Sq. units");
        System.out.println("The volume of Cuboid is : " + Volume + " cubic unit");
    }
}



