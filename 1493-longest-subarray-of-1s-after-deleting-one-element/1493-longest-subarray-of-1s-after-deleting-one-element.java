class Solution {
    public int longestSubarray(int[] nums) {
        int count1s = 0  , l = 0 , max = 0 ; 
        for(int r = 0 ; r < nums.length ; r++){
            if(nums[r] == 1){
                count1s++ ; 
            }
            int windowSize = r - l + 1 ; 
            if(windowSize - count1s > 1){
                if(nums[l] == 1){
                    count1s-- ; 
                }
                l++; 
            }
            max = Math.max(max , count1s) ; 
        }
        if(nums.length == count1s){
            return count1s-1 ; 
        }
        return max ; 
    }
}