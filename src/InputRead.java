import java.util.Scanner;

public class InputRead {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      double num2 = sc.nextDouble();
      sc.nextLine();
      String str = sc.nextLine();

        System.out.println("String: " + str);
        System.out.println("Double: " + num2);
        System.out.println("Int: " + num1);

    }
}
