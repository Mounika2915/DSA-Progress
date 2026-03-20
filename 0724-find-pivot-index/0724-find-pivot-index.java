class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length ; 
        for(int i = 1 ; i < n;i++){
            nums[i] = nums[i] + nums[i-1] ; 
        }
        int l = 0 ; int r = 0 ; 
        for(int i = 0 ; i < n ; i++){
            if(i != 0 ){
                l = nums[i-1] ; 
            }else{
                l = 0 ; 
            }
            if(i != n-1 ){
                r = nums[n - 1 ] - nums[i];
            }else{
                r = 0 ; 
            }
            if(l == r){
                return i ; 
            }
        }
        return -1;
    }
}