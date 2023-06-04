class CS_FindAllDuplicatesInArraay {
//    https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
    public List<Integer> findDuplicates(int[] nums) {
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

                  ArrayList<Integer> list = new ArrayList<Integer>();
            for(i =0; i< nums.length; i++){
               if (nums[i] != i+1){
                  list.add(nums[i]);}
}  
return list; 
    }
}