//https://leetcode.com/problems/missing-number/description/
public class CS_Missing_num {
    public static void main(String[] args) {
        int []a= {0,1};
        int b = missingNumber(a);
        System.out.println(b);
    }

    static int missingNumber(int[] nums) {
        int i=0;
        while( i< nums.length){
            int correct = nums[i];
            if (nums[i]>= nums.length){
                i++;
                if (i == nums.length){
                    break;
                }
                correct = nums[i];
            }
            if ( nums[i] != i){
                Swap(nums, i ,correct);
            }
            else {
                i++;
            }
        }
        for(i =0; i<= nums.length; i++){
            if ( i== nums.length && nums[nums.length-1] != i){
                return i;
            }
            if (nums[i] != i){
                return i;
            }

        }
        return -1;
    }
    static void Swap(int[] arr, int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }
}



