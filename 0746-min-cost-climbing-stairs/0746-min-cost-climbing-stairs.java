class Solution {
    //recurrsion
    private int f(int idx , int[] cost){
        if(idx == 0 || idx == 1){
            return 0 ; 
        }
        int left = f(idx - 1 , cost) + cost[idx - 1] ; 
        int right =  f(idx - 2 , cost) + cost[idx - 2] ; 
        
        return Math.min(left , right) ; 
    }
    //memoization
    private int fmemo(int idx , int[] cost , int[] dp){
        if(idx == 0 || idx == 1){
            return 0 ; 
        }
        if(dp[idx - 1] != -1) return dp[idx-1] ; 
        int left = fmemo(idx - 1 , cost , dp) + cost[idx - 1] ; 
        int right =  fmemo(idx - 2 , cost , dp) + cost[idx - 2] ; 
        dp[idx -1] = Math.min(left , right);
        return dp[idx-1] ;
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length ; 
        // int min = f(n, cost) ; 
        // return min ; 
        int[] dp = new int[n + 1] ; 
        //Arrays.fill(dp , -1);
        // fmemo(n , cost , dp ) ; 
        // return dp[n-1] ; 

        dp[0]  = 0 ;
        dp[1] = 0 ; 
        for(int i = 2 ; i <= n ; i++){
            int left = dp[i-1] + cost[i - 1] ; 
            int right = dp[i - 2] + cost[i - 2];
            dp[i] = Math.min(left , right) ; 
        }
        return dp[n];
        
    }
} 