import java.util.Scanner;

public class TableOF2Print {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N >=2 && N <=20){
            for(int i =1 ; i <=10 ;i++){
                System.out.println(N +" x "+ i +" = "+ N *i );
            }
        }
    }
}
