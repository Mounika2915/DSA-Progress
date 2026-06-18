class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0 , prod = 1 , total = 0 ; 
        for(int r = 0 ; r < nums.length ; r++){
            prod = prod * nums[r] ; 
            while(l <=  r && prod >= k){
                prod = prod / nums[l] ; 
                l++;
            }
            total += (r - l + 1) ; 
        }
        return total ; 
    }
}