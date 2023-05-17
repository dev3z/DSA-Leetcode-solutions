package dev3z;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;
public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int []nums = {5,7,7,8,8,10};
        int target=8;

        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    static int[] searchRange(int[] nums, int target) {


        int[] returnarr = new int[nums.length];
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (a == target) {
                returnarr[c] = i;
                c++;
            }
        }
        int[] returnarrfinal = new int[2];
        returnarrfinal[0] = returnarr[0];
        int j= returnarr.length -1;
        while(returnarr[j] == 0){
            j--;
        }
        returnarrfinal[1] = returnarr[j];

        return returnarrfinal;

    }

}
