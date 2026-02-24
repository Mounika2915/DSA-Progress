class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length] ; 
        int l = 0 , r = nums.length -1 ; 
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 == 0){
                res[l] = nums[i] ; 
                l++;
            }else{
                res[r] = nums[i] ; 
                r--;
            }
        }
        return res ; 
    }
}