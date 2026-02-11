class Solution {
    private int binarySearchCount(int[] potions , int val , long success) {
        int l = 0 , r = potions.length -1 ;
        int ans = 0 ;
        while(l <= r){
            int mid = l + (r - l )/2 ;
            if((long) val * potions[mid] >= success ){
                r = mid - 1; 
            }else{
                l = mid + 1 ; 
            }
        }
        // if(r == potions.length - 1 ){
        //     return 0 ; 
        // }
        return potions.length - r - 1; 
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length ;
        int[] result = new int[n] ; 
        for(int i = 0 ; i < spells.length ;i++){
            result[i] = binarySearchCount(potions , spells[i] , success);
        }
        return result ; 
    }
}