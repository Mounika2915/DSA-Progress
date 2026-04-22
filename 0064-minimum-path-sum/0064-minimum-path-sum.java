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
        //int min = f(m - 1 , n -1 , grid , dp) ;
        //return min ; 

        dp[0][0] = grid[0][0] ; 
        for(int i = 1 ; i < m ; i++){
            dp[i][0] = grid[i][0] + dp[i - 1][0] ; 
        }
        for(int j = 1 ; j < n ; j++){
            dp[0][j] = grid[0][j] + dp[0][j-1] ; 
        }
        for(int i = 1 ; i< m ; i++){
            for(int j = 1 ; j < n ; j++){
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j] , dp[i][j-1]) ; 
            }
        }
        return dp[m-1][n-1] ; 
    }
}