class Solution {
    private void recurr(int[] nums , int i , int n , List<List<Integer>> list, List<Integer> curr){
        if(i == n){
            list.add(new ArrayList<>(curr)) ; 
            return ; 
        }
        curr.add(nums[i]) ; 
        recurr(nums, i+ 1 , n , list , curr) ; 
        curr.remove(curr.size()-1) ; 
        recurr(nums , i + 1 , n , list , curr) ; 
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>() ; 
        recurr(nums , 0 , nums.length  , list , new ArrayList<>()) ; 
        return list ; 
    }
}