class Solution {
    public int numSquares(int n) {
        // if(n == 0){
        //     return 0 ; 
        // }
        // int min = Integer.MAX_VALUE ; 
        // for(int k = 1 ; k * k < n ; k++){
        //     min = Math.min(min , numSquares(n - k * k )) ; 
        // }
        // if(min == Integer.MAX_VALUE){
        //     return Integer.MAX_VALUE ; 
        // }
        // return 1 + min ; 

        int[] dp = new int[n+1] ;
        
       // Arrays.fill(dp , -1) ;  

        dp[0] = 0 ; 

        for(int i = 1 ; i <= n ; i++){
            dp[i] = Integer.MAX_VALUE ; 
            for(int j = 1 ; j * j <= i ; j++){
                dp[i] = Math.min(dp[i] , 1 + dp[i - j * j]) ;
            }
        }

        return dp[n] ; 

    }
}