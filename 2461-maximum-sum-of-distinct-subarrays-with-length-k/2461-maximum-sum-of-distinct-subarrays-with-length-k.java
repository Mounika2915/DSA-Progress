class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>() ; 
        int l = 0 ;long max = 0 , sum = 0 ; 
        for(int r = 0 ; r < nums.length ; r++){
            while(l <= r && !set.add(nums[r])){
                sum -= nums[l] ; 
                set.remove(nums[l]) ;
                l++;
            }
            sum += nums[r] ; 
            
            if(r - l + 1 > k){
                sum -= nums[l] ;
                set.remove(nums[l]) ;
                l++; 
            }
            if(r - l + 1 == k){
                max = Math.max(max , sum) ; 
            }
        }
        return max  ; 
    }
}