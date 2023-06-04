//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/954522082/ ===> Google question
class CS_indDisappearedNumber {
    public List<Integer> findDisappearedNumbers(int[] nums) {
          int i=0;
            while( i< nums.length){
                int correct = nums[i]-1;
                if ( nums[i] != nums[correct]){
                    Swap(nums, i ,correct);
                }
                else {
                    i++;
                }
            }

                 List<Integer> ints = new ArrayList<Integer>();
                    int j=0;
            for(i =0; i< nums.length; i++){
               if (nums[i] != i+1){
                  ints.add(i+1);
                  
               }  
               }
            return ints;
    }
    void Swap(int[] arr, int first , int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] =temp;
        }
}