class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums) ; 
        int l = 0 , r = 0 ; 
         long sum = 0 ; int maxWindowSize = 0  ; 
        while(r < nums.length){
            sum += nums[r] ; 
            while((long)nums[r] * (r - l + 1 )  - sum  > k){
                 
                sum -= nums[l] ; 
                l++;
                
            }
           maxWindowSize = Math.max(maxWindowSize , r - l +1) ; 
            
            r++;
        }
        return maxWindowSize ; 
    }
}