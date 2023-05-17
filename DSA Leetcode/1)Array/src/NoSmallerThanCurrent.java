//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class NoSmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] returnarr = new int [nums.length];
for(int i=0; i< nums.length; i++){
    int a= nums[i];
    int count=0;
         for(int j=0; j< nums.length; j++){
                if(nums[j]<a){
                count++;
                }
         }
         returnarr[i]= count;


    }
return returnarr;
}

}
