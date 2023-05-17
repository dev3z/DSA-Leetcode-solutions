package dev3z;

public class PositionInInfiniteArrat {
    public static void main(String[] args) {
        int[] arr=  {1,3,4,6,7,8,9,12,23,34,45,56,67,78};
        int target =78;

                int start = 0;
                int end = 1;

        while (target > arr[end]){
            int newst= end+1;
            end = end + 2*(end -start +1); //end + 2* size of array
            start = newst;

        }

        int ans=  Binary(arr, target, start, end);
        System.out.println(ans);
    }
    static int Binary(int arr[], int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;

            if (arr[mid]>target){
                end = mid-1;
            }

            else if (arr[mid] <target){
                start = mid+1;
            }

            else {
                return mid;
            }
        }

return  -1;
    }

}
