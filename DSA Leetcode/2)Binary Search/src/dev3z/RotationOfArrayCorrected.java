package dev3z;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotationOfArrayCorrected {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int ans = search(arr, 0);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
//        int pivot = -1; ///// 4,5,6,7,0,1,2 -----> 7 is pivot
        int start=0;
        int end= nums.length-1;
        while (start<=end){
            int mid =  (end + start) / 2;
            if (nums[mid] ==target) {return mid;}

            //left side
            if(nums[start]<= nums[mid]){
                if(target >= nums[start] && target<= nums[mid]) {
                    end = mid ;
                }
                else{
                    start= mid +1;
                }
            }

            //right side
            else {
                if (target >= nums[mid] && target<= nums[end]){
                    start = mid;
                }

                else {
                   end = mid-1;
                }
            }
        }
            return -1;
    }

}
