class Solution {
    public String longestPalindrome(String s) {
        int start = 0 , end = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            int len1 = findPalindrome(s , i , i );
            int len2 = findPalindrome(s , i , i + 1) ;
            int max = Math.max(len1 , len2) ; 
            if(max > end - start ) {
                start = i - (max- 1 )/2;
                end = i + max / 2  ; 
            }
        }
        return s.substring(start , end + 1);
    }
    public int findPalindrome(String s , int l , int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--; 
            r++ ;
        }
        return r - l - 1 ; 
    }
}