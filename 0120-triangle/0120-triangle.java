class Solution {
    private int f(int i , int j , int[][] tri, int n , int[][]dp){
        if(i == n - 1 ){
            return tri[i][j] ; 
        }
        if(dp[i][j] != -1){
            return dp[i][j] ; 
        }
        int down = f(i + 1 , j , tri , n , dp) ; 
        int dia = f(i+1 , j+1 , tri , n , dp) ; 

        return dp[i][j] = tri[i][j] + Math.min(down , dia);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] tri = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                tri[i][j] = triangle.get(i).get(j) ; 
            }
        }
        int[][] dp = new int[n][n] ; 
        for(int[] r : dp){
            Arrays.fill(r , -1) ; 
        }
        //int min = f(0 , 0  , tri , n , dp) ; 
        //return min ; 

        for(int i =  0 ; i < n ; i++){
            dp[n-1][i] = tri[n -1][i] ; 
        }

        for(int i = n - 2 ; i >= 0 ; i--){
            for(int j = 0 ; j <= i ; j++ ){
                dp[i][j] = tri[i][j] + Math.min(dp[i+1][j] , dp[i+1][j+1]) ; 
            }
        }
        return dp[0][0];
    }
}