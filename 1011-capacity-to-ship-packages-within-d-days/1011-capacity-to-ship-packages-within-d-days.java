class Solution {
    private boolean isValid(int[] weights , int mid , int days){
        int curr = 0 , count = 0 ; 
        for(int i = 0 ; i < weights.length ; i++){
            if(curr + weights[i] > mid){
                count++ ;
                curr = weights[i];
                
            }else{
                curr += weights[i];
            }
        }
        if(curr != 0 ){
            count++ ; 
        }
        if(count > days){
            return false ; 
        }
        return true  ; 
 
    }
    public int shipWithinDays(int[] weights, int days) {
        int l = weights[0] , r = weights[0];
        for(int i = 1 ; i < weights.length ; i++){
            l = Math.max(l , weights[i]);
            r += weights[i];
        }
         
        int ans = 0 ;
        while(l <= r ) {
            int mid = l + (r - l )/ 2 ;
            if(isValid(weights , mid , days)){
                ans = mid ; 
                r = mid - 1 ;
            }else{
                l = mid + 1 ; 
            }
        }
        return ans ; 
    }
}