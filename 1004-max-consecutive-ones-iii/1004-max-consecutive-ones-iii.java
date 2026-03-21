class Solution {
    public int longestOnes(int[] nums, int k) {
        int count1s = 0 , l = 0 , max = 0 ; 
        for(int r = 0 ; r < nums.length ; r++){
            if(nums[r] == 1){
                count1s++ ; 
            }
            int windowSize = r - l + 1 ; 
            if(windowSize - count1s > k){
                if(nums[l] == 1){
                    count1s-- ; 
                }
                l++; 
            }
            max = Math.max(max , r - l + 1) ; 
        }
        return max ; 
    }
}