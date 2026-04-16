class Solution {
    public void printSubSets(int[] nums , int idx , List<Integer> curr , List<List<Integer>> list){
        if(idx >= nums.length){
            list.add(new ArrayList<>(curr)) ; 
            return  ;
        }
        curr.add(nums[idx]) ; //take it
        printSubSets(nums , idx + 1 , curr , list) ; 
        curr.remove(curr.size() - 1) ;  // leave it
        printSubSets(nums , idx + 1 , curr , list) ; 
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>() ; 
        printSubSets(nums ,  0 , new ArrayList<>() , list) ; 
        return list ; 
    }
}