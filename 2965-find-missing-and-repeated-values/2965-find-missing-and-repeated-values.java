class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid.length ; 
        int total = (n * (n +1)) / 2 ; 
        int[] res = new int[2] ; 
        int sum = 0 ; 
        HashSet<Integer> set = new HashSet<>() ; 
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid.length ;j++){
                
                if(set.add(grid[i][j])){
                    sum += grid[i][j] ;
                    
                }else{
                     res[0] = grid[i][j]  ; 
                }
            }
        }
        res[1] = total - sum ; 
        return res ; 
    }
}