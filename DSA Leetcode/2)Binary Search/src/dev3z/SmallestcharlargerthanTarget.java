//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/937878162/
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;

        while (s <=e) {
            int mid = s + (e - s) / 2;
            if (target < letters[mid]) {
                e = mid - 1;
            }

            else{
                s = mid + 1;
            }
        }

        if (s>=letters.length){
            return letters[0];
        }
        else{
            return letters[s]; }
    }

}