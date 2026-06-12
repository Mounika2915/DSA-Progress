class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        //1.first add the satisfied customeres
        int satisfied = 0 ; 
        for(int i = 0 ; i < grumpy.length ; i++){
            if(grumpy[i] == 0){
                satisfied += customers[i] ; 
            }
        }
        int unSatisfied = 0 ; 
        //now check for maximum consective customers for given minuets 
        for(int i = 0 ; i < minutes ; i++){
            if(grumpy[i] == 1){
                unSatisfied += customers[i] ; 
            }
        }
        int max = unSatisfied ; 
        for(int i = minutes ; i < grumpy.length ; i++){
            if(grumpy[i] == 1){
                unSatisfied += customers[i] ; 
            }
            if(grumpy[i - minutes] == 1){
                unSatisfied -= customers[i - minutes] ; 
            }
            max = Math.max(max  , unSatisfied) ; 
        }
        return max + satisfied;
    }
}