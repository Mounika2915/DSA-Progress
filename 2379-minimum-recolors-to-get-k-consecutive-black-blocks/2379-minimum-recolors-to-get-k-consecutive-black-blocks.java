class Solution {
    public int minimumRecolors(String blocks, int k) {
        int bcount = 0 ;
        for(int i = 0 ; i < k ; i++){
            if(blocks.charAt(i) == 'B'){
                bcount++;
            }
        }
        int min = k - bcount;
        int l = 0 ;
        for(int r = k ; r < blocks.length() ;r++){
            if(blocks.charAt(r) == 'B'){
                bcount++;
            }
            if(blocks.charAt(l) == 'B'){
                bcount--;
            }
            l++;
            min = Math.min(min , k - bcount);
        }
        return min ;
    }
}