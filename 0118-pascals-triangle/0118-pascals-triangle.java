class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> subList = new ArrayList<>() ; 
        List<List<Integer>> ans = new ArrayList<>() ;
        subList.add(1);
        ans.add(subList) ; 
        for(int i = 1 ; i < numRows ; i++){
            List<Integer> nextRow = new ArrayList<>() ; 
            nextRow.add(1) ; 
            for(int j = 2 ; j <= subList.size() ; j++ ){
                nextRow.add(subList.get(j -1) + subList.get(j-2)) ; 
            }
            nextRow.add(1) ; 
            subList = nextRow ; 
            ans.add(subList) ; 
        }
        return ans ; 
    }
}