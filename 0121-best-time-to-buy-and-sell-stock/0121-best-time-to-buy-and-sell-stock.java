class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, minProfit = prices[0]; 
        for(int i = 0 ;  i < prices.length ; i++){
            minProfit = Math.min(minProfit , prices[i]);
            maxProfit = Math.max(maxProfit , prices[i] - minProfit) ;
        }
        return maxProfit;
    }
}