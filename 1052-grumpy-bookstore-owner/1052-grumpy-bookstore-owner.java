class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0 ; 
        for(int i = 0 ; i < customers.length ; i++){
            if(grumpy[i] == 0 ){
                satisfied += customers[i];
            }
        }
        int unSatisfied = 0 ; 
        
        for(int i = 0 ; i < minutes ; i++){
            if(grumpy[i] == 1){
                unSatisfied += customers[i] ; 
            }
        }
        int l = 0 , max = unSatisfied ; 
        for(int i = minutes ; i < customers.length ; i++){
            if(grumpy[i] == 1){
                unSatisfied += customers[i] ; 
            }
            if(grumpy[l] == 1){
                unSatisfied -= customers[l] ; 
            }
            l++;
            max = Math.max(max , unSatisfied) ; 
        }
        return max + satisfied ; 
    }
}