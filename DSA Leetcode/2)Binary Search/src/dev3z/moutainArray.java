package dev3z;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class moutainArray {
    public static void main(String[] args) {
        int [] arr={3,5,6,7,8,9,7,6,5,3,2,1};
        int ans = peakIndexInMountainArray(arr);
        System.out.println( " at index " + ans);
        System.out.println("max element is " + arr[ans]);

    }
    static int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e = arr.length -1;
        int mid=0;
        while(s<=e){
            mid = s+(e-s)/2;
            if (arr[mid]< arr[mid+1]){ //you are at ascending part
                s = mid+1;
            }

            else { //you are at descending part
                e = mid;
            }

            if (s==e){  //when loop break both start and end will be equal and equal to ans
                return s; //or e
            }
        }

        return mid;
    }

}

