

import java.util.Arrays;
import java.util.Scanner;

public class maxarr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {3,5,4,3,566467456,5,2,4,1,99};
        int n = max(arr);
        System.out.println(n);
    }
    static int max( int [] array){

            int mx1= array[0];
            int mx2 = array[1];

        if(array[0]< array[1]) {
            int temp = array[0];
             array[0]= array[1];
             array[1]= temp;
        }
            for(int i= 1; i< array.length ; i++ ){
if( mx1 < array[i]) {
    mx1 = array[i];
                }

            }
return  mx1;
        }
    }

