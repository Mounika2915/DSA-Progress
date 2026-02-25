class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length ; 
        Arrays.sort(intervals , (a , b ) -> Integer.compare(a[0] , b[0])) ; 
        List<int[]> result = new ArrayList<>() ; 
        result.add(new int[]{intervals[0][0] , intervals[0][1]}) ; 
        for(int i = 1 ; i < n ; i++){
            if(result.get(result.size() -1)[1] < intervals[i][0]){
                result.add(new int[]{intervals[i][0] , intervals[i][1]});
            }else{
                result.get(result.size()-1)[0] = Math.min(result.get(result.size()-1)[0] , intervals[i][0]) ; 
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1] , intervals[i][1]) ; 
            }
        }
        int[][] res = new int[result.size()][2] ; 
        int i = 0 ; 
        for(int[] a : result){
            res[i][0] = a[0] ; 
            res[i][1] = a[1] ; 
            i++ ; 
        }
        return res ; 
    }
}