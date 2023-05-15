import java.util.Arrays;

public class SortingInAsc {
    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 3, 5, 7, 5, 3};
        asc(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void asc(int[] arr) {
        int temp=0;

        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
    }
}
