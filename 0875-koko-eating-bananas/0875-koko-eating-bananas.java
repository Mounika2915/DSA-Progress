class Solution {
    private boolean isValid(int[] piles , int idx , int h){
        int total = 0 ; 
        for(int i : piles){
            total += Math.ceil((double)i / idx);
        }
        return total <= h ; 
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l =  1 , r = 1; 
        for(int i : piles){
            r = Math.max(r , i) ; 
        }
        int ans = r ; 
        while(l < r){
            int mid = l + ( r - l ) / 2 ; 
            if(isValid(piles , mid , h) ){
                ans = mid ; 
                r = mid ; 
            }else{
                l = mid  + 1 ; 
            }
        }
        return ans ; 
    }
}