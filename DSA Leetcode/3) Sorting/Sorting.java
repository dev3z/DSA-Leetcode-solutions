import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int []a= {4,2,3,5,1};
        InsertionSort(a);
        System.out.println(Arrays.toString(a));
    }
    static void CyclicSort(int []arr ){
        // apply only for array ------>  1 to N 📌
        int i=0;
        while( i< arr.length){
            int correct = arr[i]-1;
            if ( arr[i] != arr[correct]){
                Swap(arr, i ,correct);
            }
            else {
                i++;
            }
        }
    }
    static void InsertionSort(int []arr){
        for (int i =0 ; i< arr.length -1 ;i++){
            for (int j = i+1; j>0 ; j--){
                if (arr[j]< arr[j-1]){
                    Swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void SelectionSort (int [] arr){
        for (int i=0 ; i < arr.length ; i++){
            //swaping max element to the last
            int last = arr.length - i - 1;
             int MaxIndex= max(arr, 0, last); // finding index of  max element
             Swap(arr,last,MaxIndex); //swapping element
//            System.out.println(Arrays.toString(arr));
        }

    }
    static void BubbleSort(int []arr) {
        //pass n-1 times ( n-1 steps)
        for (int i =0 ;i <arr.length ; i++){
            boolean swap = false;
            //for each steps max element comes to last index
            for (int j =1 ; j < arr.length -i ; j++){  // note i here ⭐
                //swap
                if ( arr[j] < arr[j-1])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr [j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
    static int max(int [] arr, int start , int end){
        int max = start;
        for (int i = 1 ; i<= end ; i++) {
            if ( arr[max] < arr[i]){
            max = i;}
        }
        return max;
    }
    static void Swap(int[] arr, int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }

}
