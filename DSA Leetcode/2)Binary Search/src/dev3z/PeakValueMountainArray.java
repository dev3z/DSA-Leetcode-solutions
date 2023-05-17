package dev3z;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakValueMountainArray
{
    public static void main(String[] args) {
        int[] arr= { 1,2,3,4,5,4,3,2,1};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    static int peakIndexInMountainArray(int[] arr) {
int s=0;
int e= arr.length-1;

while (s<=e){
    int mid= s + (e-s)/2;
    if (arr[mid]< arr[mid+1]){
        s = mid+1;             // socho
    }

    else if (arr[mid]> arr[mid+1]){
        e = mid;
    }

    if (s==e){
        return mid;
    }
}

return s;  // at the end s == e == mid == max value
    }
}
