package dev3z;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CoinsAndTriangle {
    public static void main(String[] args) {
        int ans;
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println("Enter a number");
            int t = inp.nextInt();
            int s=0;
            int []arr = new int [t];
            for (int j=1; j<t; j++){
                  arr[j-1] = (j*(j+1))/2;
            }
            int e = arr.length - 1;

            while (s <= e){
                int mid = s + (e - s) / 2;
                if (a < arr[mid]) {
                    e = mid - 1;
                }

                else if (a > arr[mid]) {
                    s = mid + 1;
                }

                else {
                    ans= mid;
                }

            }
            ans= e;


            System.out.println(ans);
        }
    }
}