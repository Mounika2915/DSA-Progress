class Solution {
    private void combination(int[] candidates , int idx , int target , List<Integer> curr , List<List<Integer>> list){
        if(target == 0){
            list.add(new ArrayList<>(curr));
            return ; 
        }
        if(idx == candidates.length){
            return ; 
        }
        if(candidates[idx] <= target){
            curr.add(candidates[idx]) ; 
            combination(candidates , idx , target - candidates[idx] , curr , list) ;
            curr.remove(curr.size() - 1) ; 
        }
         
        
        combination(candidates , idx + 1 , target , curr , list) ; 

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        combination(candidates , 0 , target , new ArrayList<>() , list);
        return list ; 
    }
}