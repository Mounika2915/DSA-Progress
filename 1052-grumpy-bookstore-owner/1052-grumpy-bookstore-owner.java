class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0 ;
        for(int i = 0 ; i < grumpy.length ; i++){
            if(grumpy[i] == 0){
                satisfied += customers[i] ;
            }
        }
        int unSatisfied = 0 ;
        for(int i = 0 ; i < minutes ;i++){
            if(grumpy[i] == 1){
                unSatisfied += customers[i] ;
            }
        }
        int l = 0 ; 
        int max = unSatisfied;
        for(int r = minutes ; r < grumpy.length ;r++){
            if(grumpy[r] == 1){
                unSatisfied += customers[r] ;
            }
            if(grumpy[l] == 1){
                unSatisfied -= customers[l] ;
            }
            l++;
            max = Math.max(max , unSatisfied);
        }
        return max + satisfied ;
    }
}