class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0 ,count = 0 , max = 0 ;
        for(int r = 0 ; r < nums.length ; r++){
            if(nums[r] == 1){
                count++ ; 
            }
            int windowSize = r - l + 1 ; 
            while(windowSize - count > k){
                if(nums[l] == 1){
                    count--;
                }
                l++;
                windowSize = r - l + 1 ; 
            }
            if(windowSize - count <= k){
                max = Math.max(windowSize , max ) ; 
            }
        }
        return max ; 
    }
}