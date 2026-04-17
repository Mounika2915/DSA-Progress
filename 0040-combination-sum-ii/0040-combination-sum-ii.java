class Solution {
    private void combine(int[] candidates , int idx , int target , List<Integer> curr , List<List<Integer>> list){
        if(target == 0){
            list.add(new ArrayList<>(curr)) ; 
            return ; 
        }
        if(idx == candidates.length){
            return ; 
        }
        for(int i = idx ; i < candidates.length ; i++){
            if( i > idx && candidates[i] == candidates[i - 1]) continue ; 
            if(candidates[idx] > target)  break ; 

            curr.add(candidates[i]) ; 
            combine(candidates , i + 1 , target - candidates[i] , curr , list) ; 
            curr.remove(curr.size() - 1) ; 

        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>() ; 
        Arrays.sort(candidates) ; 
        combine(candidates , 0 , target , new ArrayList<>() , list) ; 
        return list ; 
    }
}