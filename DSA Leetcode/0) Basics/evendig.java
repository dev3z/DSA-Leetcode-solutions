class Solution {
    public int findNumbers(int[] nums) {
        return even(nums);
    }
    int even(int[] arr){
        int count =0;
        for( int a: arr){
            if(a%2==0){
                count++;
            }
        }
        return count;
    }
}