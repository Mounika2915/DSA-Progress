class Solution {
    private int f(int idx , int[] nums){
        if(idx == 0) return nums[0] ; 
        if(idx < 0) {return 0 ; }

        int notTake = f(idx - 1 , nums) ; 
        int take = nums[idx] + f(idx - 2 , nums) ;

        return Math.max(notTake , take);
    }
    private int fmemo(int idx , int[] nums , int[] dp){
        if(idx == 0) return nums[0] ; 
        if(idx < 0 ) return  0 ; 
        
        if(dp[idx] !=-1){
            return dp[idx] ; 
        }

        int take = fmemo(idx - 1 , nums , dp ) ; 
        int notTake = fmemo(idx - 2 , nums , dp) + nums[idx] ; 
        return dp[idx] = Math.max(take , notTake) ; 
    }
    public int rob(int[] nums) {
        int n  = nums.length ; 
        //return f(n - 1, nums) ; 

        //memoizatiuon
        int[] dp = new int[n] ; 
        Arrays.fill(dp , -1) ; 
        //fmemo(n - 1 , nums , dp) ; 
        //return dp[n - 1] ; 
        if(n == 1){
            return nums[0] ; 
        }
        dp[0] = nums[0] ; 
        dp[1] = Math.max(nums[0] , nums[1]) ; 
        for(int i = 2 ; i < n ; i++){
           int take = dp[i - 2] + nums[i] ; 
           int notTake =  dp[i - 1]; 

           dp[i] = Math.max(take , notTake) ; 
        }
        return dp[n - 1] ; 
    }
}