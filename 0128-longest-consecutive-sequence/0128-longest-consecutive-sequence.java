class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0 ; 
        if(nums.length == 1) return 1 ; 
       Arrays.sort(nums) ; 
       int count = 1 ; 
       int max = count ; 
       for(int i = 1 ; i < nums.length ;i++){
        if(nums[i-1] == nums[i]){
            continue ; 
        }
        if(nums[i]-1 == nums[i-1]){
            count++;
        }else{
            count = 1 ; 
        }
        max = Math.max(max , count) ; 
       }
       return max ; 
    }
}