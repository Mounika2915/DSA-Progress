class Solution {
    private boolean isValid(int[] piles , int mid , int h){
        int count = 0 ; 
        for(int i : piles){
            count += Math.ceil((double)i / mid);
        }
        return count <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0 ; 
        for(int i : piles){
            max = Math.max(max , i);
        }
        int ans = max ; 
        int l = 1 , r = max ; 
        while(l <= r){
            int mid = l + (r - l ) /2 ;
            if(isValid(piles , mid , h)){
                ans = mid ; 
                r = mid - 1 ;
            }else{
                l= mid + 1 ;
            }
        }
        return ans ; 
    }
}