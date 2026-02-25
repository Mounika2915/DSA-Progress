class Solution {
    public long countSubarrays(int[] nums, int k) {
        int count = 0 ; 
        int max = Arrays.stream(nums).max().orElseThrow() ; 
        int l = 0 ;
        long total = 0 ;  
        for(int r = 0 ; r < nums.length ; r++){
            if(nums[r] == max){
                count++ ; 
            }
            while(count >= k){
                total  += nums.length - r ; 
                if(nums[l] == max){
                    count-- ; 
                    
                }
                l++;

            }
        }
        return total ; 
    }
}