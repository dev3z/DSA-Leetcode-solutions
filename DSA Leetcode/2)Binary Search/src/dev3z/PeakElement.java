package dev3z;
//https://leetcode.com/problems/find-peak-element/
public class PeakElement {
    public static void main(String[] args) {
        int arr[]= {1};
        int ans = findPeakElement(arr);
        System.out.println(ans);
    }

    static int findPeakElement(int[] nums)
    {
        int s=0;
        int e = nums.length -1;
        int mid=0;
        while(s<=e){
            mid = s+(e-s)/2;

            if (s==e){  //when loop break both start and end will be equal and equal to ans
                return s; } //or e

            if (nums[mid]< nums[mid+1]){ //you are at ascending part
                s = mid+1;
            }

            else { //you are at descending part
                e = mid;
            }

            }


        return s;
    }

}