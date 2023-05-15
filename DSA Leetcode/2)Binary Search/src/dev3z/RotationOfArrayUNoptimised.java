package dev3z;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotationOfArrayUNoptimised {

    public static void main(String[] args) {
        int[] arr = {3,1,0};

        int ans = search(arr, 3);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        if (nums.length<=3){
           int returnvalue =orderAgnosticBS( nums,target);
            return returnvalue;
        }
        //sorting array;        int [] Arr =new int[nums.length];
            asc(nums);
//finding index of target in sorted array
        int index = BS(target, nums);
        if (index == -1) {
            return -1;
        } else {
                if (index > 2) {
                     return index - 3;}
                else {
                return nums.length + index - 3; }
                    }
                }
        static int BS ( int tar, int[] arr){
            int s = 0;
            int e = arr.length - 1;

            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (tar < arr[mid]) {
                    e = mid - 1;
                } else if (tar > arr[mid]) {
                    s = mid + 1;
                } else {
                    return mid;
                }

            }
            return -1;
        }

        //sorting in ascending
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

    static int orderAgnosticBS(int[] arr, int target) {
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
}