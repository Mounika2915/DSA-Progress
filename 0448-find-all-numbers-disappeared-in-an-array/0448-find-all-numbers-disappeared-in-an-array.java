class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int i = 0 ; i < nums.length ; i++){
        //     set.add(nums[i]);
        // }
        // List<Integer> list = new ArrayList<>() ; 
        // for(int i = 1  ; i <= nums.length ;i++){
        //     if(!set.contains(i)){
        //         list.add(i) ; 
        //     }
        // }
        // return list ; 

        for(int i = 0 ; i < nums.length ; i++){
            while(nums[i] != nums[nums[i] - 1]){
                int curr = nums[i]-1 ; 
                int temp = nums[i] ; 
                nums[i] = nums[curr] ; 
                nums[curr] = temp ; 
            }
        }
        List<Integer> list = new ArrayList<>() ; 
        for(int i = 0 ; i < nums.length ; i++){
            if(i+1 != nums[i]){
                list.add(i + 1) ; 
            }
        }
        return list;
    }
}