class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length] ; 
        int l = 0 , r = nums.length - 1 ; 
        int i = nums.length - 1  ; 
        while(l <= r){
            int left = nums[l] * nums[l] ; 
            int right = nums[r] * nums[r] ; 
            if(left > right){
                result[i] = left ; 
                l++;
            }
            else{
                result[i] = right ; 
                r-- ; 
            }
            i--;
        }
        return result ; 
    }
}