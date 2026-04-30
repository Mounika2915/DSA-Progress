class Solution {
    private int helper(int[] nums , int k ){
        HashMap<Integer,Integer> map = new HashMap<>() ; 
        int total = 0 ,left = 0 ; 
        for(int i = 0 ; i < nums.length ; i++){
            if(map.getOrDefault(nums[i] , 0 ) == 0 ) k-- ; 
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1) ; 
            while(k < 0){
               map.put(nums[left] , map.getOrDefault(nums[left] , 0) - 1) ;  
               if(map.getOrDefault(nums[left] , 0 ) == 0 ) k++ ; 
               left++;
            }
            total += i - left + 1 ; 
         }
         return total ; 
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums , k) - helper(nums,k-1) ; 
    }
}