package dev3z;

public class MinimumINRotatedArray {
    public static void main(String[] args) {
        int[] a = {2,1};
        int ans = findMin(a);
        System.out.println(ans);
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid=0;
        while (start <= end) {
             mid = start + (end - start) / 2;
            if (nums.length == 1) {
                return nums[0];
            }

            }
if (start==end){
    return nums[start];
}
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return nums[mid];
    }
}

