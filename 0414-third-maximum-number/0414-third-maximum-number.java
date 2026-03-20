class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE , second = Long.MIN_VALUE , third = Long.MIN_VALUE ; 
        for(int i = 0 ; i < nums.length ; i++){
            if(max < nums[i]){
                third = second ; 
                second = max ; 
                max = nums[i] ; 
            }else if(second < nums[i] && max > nums[i]){
                third = second ;
                second = nums[i] ; 
            }else if(third < nums[i] && second > nums[i]){
                third = nums[i] ; 
            }
        }
        if(third == Long.MIN_VALUE){
            return (int) max ; 
        }
        return (int)third ; 
    }
} 