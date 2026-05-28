class Solution {
    public int compress(char[] chars) {
        int l = 0 , r = 0 ; 
        while(r < chars.length){
            char c = chars[r] ; 
            int count = 0 ; 
            while(r < chars.length && c == chars[r] ){
                count++;
                r++;
            }
            chars[l++] = c;
            if(count > 1){
                
                String s = String.valueOf(count) ; 
                for(int i = 0 ; i < s.length() ; i++){
                    chars[l++] = s.charAt(i) ; 
                }
            
            }

            
        }
        return l ; 
    }
}