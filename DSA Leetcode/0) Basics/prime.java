import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

        int n = sc.nextInt();
        int c = 2;
        int a = 0;
        if (n == 1) {
            System.out.println(" not prime"); }

            else{
                while (c < n) {
                    if (n % c == 0) {
                        a++;
                    }
//            if (n % c == 0) {
//                System.out.println("not primw");
//                }
//            else {
//                System.out.println("prime");
//            }
                    c++;

                }
                if (a == 0) {
                    System.out.println(" primw");
                } else {
                    System.out.println(" not prime");
                }
            }
        }
    }
