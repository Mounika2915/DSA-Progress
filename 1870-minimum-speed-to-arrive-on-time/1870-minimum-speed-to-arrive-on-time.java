class Solution {
    private boolean isValid(int[] dist , int mid, double hour){
        double total = 0.0 ; 
        for(int i = 0 ; i < dist.length ;i++){
            double val = (double) dist[i] / mid ; 
            if(i != dist.length - 1){ //we only wrap with last ele
                total += Math.ceil(val) ; 
            }else{
                total += val ; 
            }
            if(total > hour){
                return false;
            }
        }
        return total <= hour ; 
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int l = 1 , r = 10000000 ; 
        int ans = -1 ; 
        while(l <= r){
            int mid = l + ( r - l ) / 2 ; 
            if(isValid(dist , mid , hour)){
                ans = mid ; 
                r = mid - 1 ; 
            }else{
                l = mid + 1 ; 
            }
        }
        return ans ; 
    }
}