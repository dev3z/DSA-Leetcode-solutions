package dev3z;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class BSFirstANdLAstPositiom {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int [] ans= {-1,-1};
        ans[0]= BinarySearch(nums, target, true);
        if( ans[0] != -1){
            ans[1]= BinarySearch(nums, target, false);
        }
        return ans;
    }

    int BinarySearch( int [] nums, int target, Boolean FirstOC){
        int ans = -1;

        int s= 0;
        int e = nums.length-1;
        while(s <= e){
            int    mid= s+ (e-s)/2;
            if (target< nums[mid]){
                e= mid-1;
            } else if (target > nums[mid]) {
                s= mid+1;

            }

            else{
                ans= mid;
                if (FirstOC){
                    e= mid-1;
                }
                else {
                    s= mid+1;
                }
            }

        }

        return ans;
    }

}