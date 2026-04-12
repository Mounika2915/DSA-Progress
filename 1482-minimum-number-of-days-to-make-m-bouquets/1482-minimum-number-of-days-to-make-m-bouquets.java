class Solution {
    private boolean isValid(int[] bloomDay , int mid , int m , int k ){
        int adj = 0 , bq = 0 ; 
        for(int i = 0 ; i < bloomDay.length ; i++){
            if(bloomDay[i] <= mid){
                adj++;
                if(adj == k){
                    bq++;
                    adj = 0 ; 
                }
            }else{
                adj = 0 ; 
            }
        }
        return bq >= m ; 
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int l = Integer.MAX_VALUE , r = Integer.MIN_VALUE ; 
        for(int i : bloomDay){
            l = Math.min( l , i) ; 
            r = Math.max(r , i) ; 
        }
        int ans = -1;
        while(l <= r){
            int mid = l + (r - l)  /2 ; 
            if(isValid(bloomDay , mid , m , k)){
                ans = mid ; 
                r = mid - 1 ; 
            }else{
                l = mid + 1 ; 
            }
        }
        return ans ; 
    }
}