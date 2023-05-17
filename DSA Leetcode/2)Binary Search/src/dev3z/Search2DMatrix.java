// https://leetcode.com/problems/search-a-2d-matrix/
//https://www.youtube.com/watch?v=ZYpYur0znng

// Sorted 2d matrix will a sorted 1-d array if all element placed in line wise -- - will have imiginary index
//          index / (lenght of coloumn) = row index
//          index % (lenght of coloumn) = column index
import java.util.Arrays;
public class Search2DMatrix {


//test case
//{{1, 1}};  --------> target 2
//{{1, 3}}; ----------> target 3
//

        public static void main(String []args) {
            int[][] arr = {
                    {1, 3}
            };

            System.out.println(Arrays.toString(search(arr, 3)));
        }
        static int[] search ( int[][] arr, int target) {
            int r = 0;
            int c = arr[0].length - 1;
            while (c >= 0 && r < arr.length) {
                if (arr[r][c] == target) {
                    return new int[] {r, c};
                }
                if (arr[r][c] > target) {
                    c--;
                } else {
                    r++;
                }
            }
            return new int[] {-1, -1};
        }
    }

    =--------------------==========================================
    //class Solution {
//    public boolean searchMatrix(int[][] arr, int target) {
//        int r = 0;
//        int c = arr[0].length - 1;
//        while (c >= 0 && r < arr.length) {
//            if (arr[r][c] == target) {
//                return true;
//            }
//            if (arr[r][c] > target) {
//                c--;
//            } else {
//                r++;
//            }
//        }
//        return false;
//    }
//}