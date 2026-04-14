class Solution {
    private int isValid(int[]nums , int threshold , int mid){
        int sum = 0 ; 
        for(int i : nums){
            sum += (int)Math.ceil((double)i / mid) ; 
        }
        return sum; 
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1 , r =0 ;
        for(int i : nums){
            r = Math.max(r , i) ; 
        }
        int ans = 0 ; 
        while(l <= r){
            int mid = l + (r - l) / 2 ; 
            if(isValid(nums , threshold , mid) <= threshold){
                ans = mid ;
                r = mid - 1 ; 
            }else{
                l = mid + 1; 
            }
        }
        return ans ; 
    }
}