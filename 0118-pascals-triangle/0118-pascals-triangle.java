class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> nextRow = new ArrayList<>();
        nextRow.add(1);
        res.add(nextRow);
        for(int i = 2 ; i <= numRows ; i++){
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for(int j = 1 ; j < nextRow.size() ; j++){
                currRow.add(nextRow.get(j) + nextRow.get(j-1));
            }
            currRow.add(1);
            nextRow = currRow ;
            res.add(nextRow);
        }
        return res;
    }
}