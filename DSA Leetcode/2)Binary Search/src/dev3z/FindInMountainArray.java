package dev3z;
//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {

    public static void main(String[] args) {
        int [] mountain = { 1,2,3,5,6,5,4,2,1};
        int result = findInMountainArray(4,mountain);
        System.out.println(result);
    }
    static int findInMountainArray(int target, int[] mountainArr) {
        int ans;
//finding largest element index
        int largest = LargestInMountainArray(mountainArr);
        //finding element in starting sorted array part using binary search(before largest element)
        int [] startingarray = new int[largest+1];
        //creating new array of initial part of main araay
        for(int i=0; i<= largest; i++){
            startingarray[i]= mountainArr[i];
        }
int findin1st= orderAgnosticBS(target, startingarray);
        if(findin1st != -1){ans = findin1st;
            return  findin1st;}
if(findin1st == -1){
    int [] endingarray= new int[ mountainArr.length  - largest -1 ];
    for (int i= largest+1; i<= mountainArr.length -1; i++){
        endingarray[i-largest -1] = mountainArr[i];
    }
    int findin2nd = orderAgnosticBS(target, endingarray);
    if (findin2nd != -1) {
        ans = largest+1 + findin2nd;
        return ans;
    }
}
return findin1st;
    }

    //finding target in inital array part.
    static int orderAgnosticBS(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    //finding element in starting sorted array part using binary search(before largest element)


    //largest element index
    static int LargestInMountainArray(int[] mountainArr){
        int s=0;
        int e = mountainArr.length -1;
        int mid=0;
        while(s<=e){
            mid = s+(e-s)/2;
            if (s==e){  //when loop break both start and end will be equal and equal to ans
                return s; } //or e
            if (mountainArr[mid]< mountainArr[mid+1]){ //you are at ascending part
                s = mid+1;
            }
            else { //you are at descending part
                e = mid;
            }
        }
        return s;
    }
}

