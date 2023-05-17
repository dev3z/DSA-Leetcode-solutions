package dev3z;

public class CeilingProblm {
    public static void main(String[] args) {
        int[] arr = {1, 22, 33, 44,44,55, 66, 78, 99};
        int target = 4;
        int ans = ceiling(target, arr);
        System.out.println(arr[ans]);
        System.out.println("ans=");
    }

    static int ceiling(int tar, int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
        int mid = s + (e - s) / 2;
            if (tar < arr[mid]) {
                e = mid - 1;
            }

            else if (tar > arr[mid]) {
                s = mid + 1;
            }

            else {
                return mid;
                }


        }
        return e;     //return e for floor question and return s for ceiling
    }
}
