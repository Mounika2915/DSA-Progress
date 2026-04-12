class Solution {
    private boolean isValid(int[] nums , int mid ,int k) {
        int curr = 0 , require = 0 ; 
        for(int i : nums){
            if(curr + i <= mid){
                curr += i ; 
            }else{
                curr = i ; 
                require++;
            }
        }
        if(curr > 0){
            require++;
        }
        return require <= k ; 
    }
    public int splitArray(int[] nums, int k) {
        int l = Integer.MAX_VALUE ; 
        int r = 0 ; 
        for(int i : nums){
            l = Math.min(l , i) ; 
            r += i ; 
        }
        int ans = r ; 
        while(l < r){
            int mid = l + ( r - l ) /2 ; 
            if(isValid(nums , mid, k)){
                ans = mid ; 
                r = mid ; 
            }else{
                l = mid + 1 ; 
            }
        }
        int max = 0 ; 
        int curr = 0 ; 
        for(int i : nums){
            if(curr + i <= ans){
                curr += i ; 

            }else{
                max = Math.max(max , curr) ; 
                curr = i ; 
            }
        }
        if(curr != 0){
            max = Math.max(max , curr) ; 
        }
        return max;
    }
}