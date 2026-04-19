class Solution {
    public void f(int[] nums , List<Integer> curr  , List<List<Integer>> list , boolean[] freq ){
        if(curr.size() == nums.length){
            list.add(new ArrayList<>(curr)) ; 
            return ; 
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(!freq[i]){
                curr.add(nums[i]) ; 
                freq[i] = true ; 
                f(nums, curr, list, freq) ; 
                freq[i] = false ; 
                curr.remove(curr.size() - 1) ; 
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] freq = new boolean[nums.length] ; 
        f(nums , new ArrayList<>() , list , freq) ; 
        return list ; 
    }
}