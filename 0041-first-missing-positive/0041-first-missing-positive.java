class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            while(1 <= nums[i] && nums[i] <= nums.length && nums[nums[i]-1] != nums[i]){
                int curr = nums[i] ; 
                int temp = nums[i] ; 
                nums[i] = nums[curr-1] ; 
                nums[curr - 1] =  temp ;
            }
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != i + 1) {
                return i+1 ; 
            }
        }
        return nums.length + 1; 
    }
}