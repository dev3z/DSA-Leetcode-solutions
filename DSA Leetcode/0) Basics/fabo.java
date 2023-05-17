import java.util.Scanner;

public class fabo {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number");
        int a3= 0;
        int a1 = 0;

        int a2= 1 ;

        int b = in.nextInt();
        for (int i = 0; i < b; i++) {
            System.out.print(a3 + " ");
            a3= a1+a2;
            a1 = a2;
            a2= a3;
        }
    }
    }
