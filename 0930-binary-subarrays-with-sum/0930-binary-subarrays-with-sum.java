class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer , Integer> map = new HashMap<>() ; 
        map.put(0 , 1) ; 
        int total = 0 , sum = 0 ;
        for(int r = 0 ; r < nums.length ; r++){
            sum += nums[r] ; 
            if(map.containsKey(sum - goal)){
                total += map.get(sum-goal) ; 
            }
            map.put(sum , map.getOrDefault(sum , 0 ) + 1) ; 
        }
        return total ; 
    }
}