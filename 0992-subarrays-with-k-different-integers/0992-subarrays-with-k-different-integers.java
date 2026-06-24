class Solution {
    private int atMost(int[] nums , int k ){
        HashMap<Integer,Integer> map = new HashMap<>(); 
        int l = 0 , total = 0 ; 
        for(int r = 0 ; r < nums.length ; r++){
            map.put(nums[r] , map.getOrDefault(nums[r] , 0) + 1) ; 
            while( map.size() > k){
                map.put(nums[l] , map.getOrDefault(nums[l] , 0) -1) ; 
                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                l++;
            }
            total += r - l + 1 ; 
        }
        return total ; 
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,  k) - atMost(nums , k - 1) ; 
    }
}