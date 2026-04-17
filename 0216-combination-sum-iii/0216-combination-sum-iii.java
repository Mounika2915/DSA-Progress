class Solution {
    private void combine(int k , int n , int idx  , List<Integer> curr , List<List<Integer>> list){
        if(curr.size() == k && n == 0){
            list.add(new ArrayList<>(curr)) ; 
            return ; 
        }
        if(curr.size() > k || n < 0 ){
            return  ; 
        }
        for(int i = idx ; i <= 9 ; i++){
            curr.add(i) ; 
            combine(k , n - i  , i + 1 , curr , list) ; 
            curr.remove(curr.size() - 1 ) ; 
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>() ; 
        combine(k , n , 1 , new ArrayList<>() , list) ; 
        return list ; 

    }
}