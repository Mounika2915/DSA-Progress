class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 0 , total = 0 ; 
        map.put(0 , 1) ; 
        for(int i = 0 ; i < nums.length ;i++){
            if(nums[i] % 2 == 1){
                count++;
            }
            if(map.containsKey(count - k)){
                total += map.get(count - k ) ; 
            }
            map.put(count , map.getOrDefault(count , 0 ) + 1) ; 
        }
        return total ; 
    }
}