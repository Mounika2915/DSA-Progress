class Solution {
    public int compress(char[] chars) {
        int n= chars.length ;
        int r = 0 , count = 0 , l = 0 ;
        while(r < n){
            char curr = chars[r];
            while(r < n  && curr == chars[r]){
                r++;
                count++;
            }
            chars[l] = curr ;
            l++;
            if(count != 1){
                for(char val : String.valueOf(count).toCharArray()){
                    chars[l] = val ;
                    l++;
                }
            }
            count = 0 ;
        }
        return l;
    }
}