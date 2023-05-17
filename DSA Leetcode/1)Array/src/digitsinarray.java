//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class digitsinarray {
    public static void main(String[] args) {
int [] arr = { 4,54,5645,65,345345,543543};
diginarray(arr);
    }

    static void diginarray( int []arr){
        int c=0;
        for(int i=0; i< arr.length ; i++){
            int a = arr[i];
            int dig= digit(a);
           if(dig%2 == 0){
               c++;
           }
        }
        return c;
    }

    static int digit(int a){
        int p=a;
        int count=1;
        while(p>=10){
         p= a/10;
         a=p;
         count++;

        }
        return count;
    }
}
