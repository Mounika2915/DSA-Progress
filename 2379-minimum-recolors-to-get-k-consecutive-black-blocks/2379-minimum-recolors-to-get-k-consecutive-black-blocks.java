class Solution {
    public int minimumRecolors(String blocks, int k) {
        int BCount = 0 ;
        for(int i = 0 ; i < k;i++){
            if(blocks.charAt(i)== 'B'){
                BCount++;
            }
        } 
        int min = k- BCount , l = 0 ; 
        for(int i = k ; i < blocks.length(); i++){
            if(blocks.charAt(i) == 'B'){
                BCount++;
            }
            if(blocks.charAt(l++) == 'B'){
                BCount--;
            }
            min = Math.min(min , k - BCount) ;
        }
        return min;
    }
}