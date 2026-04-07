class Solution {
    public int compress(char[] chars) {
        int idx = 0 ; 
        int l = 0 , r = 0 ;
        while(r < chars.length) {
            if(chars[l] != chars[r]){
                chars[idx++] = chars[l] ; 
                if(r - l > 1){
                    String num = String.valueOf(r - l) ; 
                    for(char c : num.toCharArray()){
                        chars[idx++] = c; 
                    }
                }
                l = r ; 
            }
            r++ ; 
        }
        if(r >= chars.length){
            chars[idx++] = chars[l] ; 
            if(r - l > 1){
               String num = String.valueOf(r - l) ; 
                for(char c : num.toCharArray()){
                    chars[idx++] = c; 
                }
             }
        }
        return idx ; 
    }
}