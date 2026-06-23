class Solution {
    public int maximumBeauty(int[] nums, int k) {
        int max = 0 ; 
        Arrays.sort(nums) ; 
        int l = 0 ; 
        for(int r = 0 ; r < nums.length ; r++){
            while(!(nums[r] - nums[l] <= 2 * k)){
                l++ ; 
            }
            max = Math.max(max  , r - l + 1);
        }
        return max ; 
    }
}