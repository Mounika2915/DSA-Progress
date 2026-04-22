class Solution {
    private static int f(int i , int j , int[][] grid , int[][] dp){
        if(i == 0 && j == 0 ){
            return grid[0][0] ; 
        }
        if(i < 0 || j < 0){
            return Integer.MAX_VALUE ; 
        }
        
        if(dp[i][j] != -1){
            return dp[i][j] ; 
        }
        int right = f(i , j -1 , grid , dp) ; 
        int down =  f(i - 1 , j , grid , dp) ; 
        
        int min = Math.min(right , down) ; 
        if(min == Integer.MAX_VALUE){
            return Integer.MAX_VALUE ; 
        }
        return dp[i][j] = grid[i][j] + min ; 
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length ; 
        int n = grid[0].length ; 
        int[][] dp = new int[m][n] ; 
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        int min = f(m - 1 , n -1 , grid , dp) ;
        return min ; 
    }
}