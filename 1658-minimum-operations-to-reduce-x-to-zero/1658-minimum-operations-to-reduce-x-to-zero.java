class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0 ; 
        for(int n : nums){
            total += n ; 
        }
        int l = 0 ; 
        int sum = 0 , min = Integer.MIN_VALUE; 
        for(int r = 0 ; r < nums.length ; r++){
            sum += nums[r] ; 
            while(l <= r && sum > total - x){
                sum -= nums[l] ; 
                l++;
            }
            if(sum == total - x){
                min = Math.max(min  , r - l + 1) ; 
            }
        }
        return min == Integer.MIN_VALUE ? -1 : nums.length - min ; 
    }
}