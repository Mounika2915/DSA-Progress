class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max = 0 , l = 0 ; 
        HashMap<Integer,Integer> map = new HashMap<>() ; 
        for(int r = 0 ; r < nums.length ;r++){
            map.put(nums[r] , map.getOrDefault(nums[r] , 0) + 1);
            while(l <= r && map.get(nums[r]) > k ){
                map.put(nums[l] , map.getOrDefault(nums[l] , 0) - 1) ; 
                l++;
            }
            max = Math.max(max , r - l + 1) ; 
        }
        return max ; 
    }
}