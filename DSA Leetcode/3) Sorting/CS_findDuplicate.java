
class CS_findDuplicate {
//    https://leetcode.com/problems/find-the-duplicate-number/description/
    public int findDuplicate(int[] nums) {
      int i=0;
            while( i< nums.length){
                int correct = nums[i]-1;
                if ( nums[i] != nums[correct])
                {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] =temp;
                }

                else {
                    i++;
                }
                }

                    int j=0;
            for(i =0; i< nums.length; i++){
               if (nums[i] != i+1){
                  return nums[i];}
}  
return -1;
    }
}