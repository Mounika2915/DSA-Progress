class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length ; 
        int[] rightMax = new int[n] ; 
        rightMax[n-1] = nums[n-1] ; 
        for(int i = n - 2 ; i >= 0 ; i--){
            if(nums[i]  <= rightMax[i + 1]){
                rightMax[i] = rightMax[i + 1] ; 
            }else{
                rightMax[i] = nums[i] ; 
            }
        }
        int l = 0 , r = 0 , max = 0 ; 
        while(r < n){
            while(l < r && nums[l] > rightMax[r]){
                l++;
            }
            max = Math.max(max , r - l ) ; 
            r++;
        }
        return max ; 
        
    }
}