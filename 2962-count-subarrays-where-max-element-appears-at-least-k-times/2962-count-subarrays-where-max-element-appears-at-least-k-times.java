class Solution {
    public long countSubarrays(int[] nums, int k) {
        long total = 0 ; int l = 0 , count = 0 ;
        long max = Arrays.stream(nums).max().orElseThrow(); 
        for(int r = 0 ; r < nums.length ; r++){
            if(nums[r] == max){
                count++;
            }
            while(count >= k){
                total += nums.length - r ; 
                if(nums[l] == max){
                    count-- ; 
                }
                l++;
            }
        }
        return total;
    }
}