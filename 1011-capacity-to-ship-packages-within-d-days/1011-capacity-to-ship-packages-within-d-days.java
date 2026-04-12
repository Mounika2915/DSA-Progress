class Solution {
    private boolean isValid(int[] weights , int weight , int days){
        int currWeight = 0 , d= 0 ; 
        for(int i : weights){
            if(currWeight + i <= weight){
                currWeight += i ;
            }else{
                currWeight = i ; 
                d++;
            }
        }
        if(currWeight > 0){
            d++;
        }
        return d <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l = Integer.MIN_VALUE , r = 0 ; 
        for(int i : weights){
            l = Math.max(l , i) ; 
            r += i; 
        }
        int ans = r ; 
        while(l < r){
            int mid = l + (r - l) / 2 ; 
            if(isValid(weights , mid , days)){
                ans = mid ; 
                r = mid ; 
            }else{
                l = mid + 1 ; 
            }
        }
        return ans ; 
    }
}