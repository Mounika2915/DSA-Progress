class Solution {
    public int characterReplacement(String s, int k) {
        int windowSize = 0 , maxLength = 0 ;
        int max = 0 ; 
        int[] arr = new int[26] ; 
        int l = 0  ;
        for(int r = 0 ; r < s.length() ; r++){
            arr[s.charAt(r) - 'A']++ ; 
            windowSize = r - l + 1 ; 
            maxLength = Math.max(maxLength , arr[s.charAt(r) - 'A']) ; 
            if(windowSize - maxLength > k){
                arr[s.charAt(l) - 'A']--;
                l++;
            } 
            max = Math.max(max , r -  l + 1) ; 
        }
        return max ;  
    }
}