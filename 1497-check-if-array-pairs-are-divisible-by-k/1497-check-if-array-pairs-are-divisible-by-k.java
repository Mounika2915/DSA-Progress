class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] modArr = new int[k] ; 
        for(int i = 0 ; i < arr.length ; i++){
            int rem = ((arr[i] % k) + k) % k ; 
            modArr[rem]++;
        }
        if(modArr[0] % 2  != 0) return false ; 
        for(int i =1 ; i <= k / 2 ;i++){
            if(modArr[i] != modArr[ k - i]){
                return false; 
            }
        }
        return true ; 
    }
}