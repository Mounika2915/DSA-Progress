class Solution {
    public int c(int n , int[] dp){
        if(n == 0) {
            return dp[0] = 1 ; 
        }
        if(n == 1){
            return dp[1] = 2; 
        }
        dp[n] = c(n - 1 , dp ) + c(n-2 , dp) ; 
        return dp[n] ; 
    }
    public int climbStairs(int n) {
        //Recurrsion
    //    if(n == 1) return 1 ; 
    //    if(n == 2 ) return 2 ; 
    //    return climbStairs(n -1) + climbStairs(n - 2) ; 

       //Memoization
    // int [] dp = new int[n+1] ; 
    // Arrays.fill(dp , -1) ; 
    // c(n , dp) ; 
    // return dp[n - 1] ; 

    //Tabulation ; 
    int[] dp = new int[n + 1 ] ; 
    dp[0] = 1 ; 
    dp[1] = 2 ; 
    for(int i = 2 ; i <= n ; i++){
        dp[i] = dp [i -1] + dp [i -2] ; 
    }
    return dp[n -1 ];
    }
}