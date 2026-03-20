class Solution {
    public int missingNumber(int[] nums) {
        int totalSum = nums.length , currSum = 0 ; 
        for(int i = 0 ; i < nums.length ; i++){
            totalSum = totalSum + i ; 
            currSum = currSum + nums[i] ; 
        }
        if(totalSum == currSum){
            return 0 ; 
        }
        return totalSum - currSum ; 
    }
}