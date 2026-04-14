class Solution {
    private boolean isValid(int[] position , int m , int mid) { 
        int count = 1 ;
        int curr = position[0] ; 
        for(int i = 1 ; i < position.length ; i++){
            if(Math.abs(curr - position[i]) >= mid){
                curr = position[i] ; 
                count++ ; 
            }
        }
        return count >= m ; 
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1 , r = position[position.length - 1] ; 
        
        int ans = r ; 
        while(l <= r){
            int mid = l + ( r - l ) / 2 ; 
            if(isValid(position , m , mid)){
                ans = mid ; 
                l = mid + 1 ; 
            }else{
                r = mid - 1 ; 
            }
        }
        return ans ; 
    }
}