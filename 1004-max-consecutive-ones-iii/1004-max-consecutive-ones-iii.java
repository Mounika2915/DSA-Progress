class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0 , count = 0 ,max = 0 ;
        for(int r = 0 ; r < nums.length ;r++){
            if(nums[r] == 1){
                count++;
            }
            while(r-l+1 - count > k){
                if(nums[l] == 1){
                    count--;
                }
                l++;
            }
            if(r-l+1 -count <= k){
                max = Math.max(max , r-l+1);
            }
        }
        return max ;
    }
}