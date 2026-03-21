class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[128] ; 
        for(char c : t.toCharArray()){
            need[c]++;
        }
        int needCount = 0 ; 
        for(int i = 0 ; i < 128 ; i++){
            if(need[i] > 0){
                needCount++ ; 
            }
        }

        int startIdx = 0 , haveCount = 0 , l = 0 , r = 0  , min = Integer.MAX_VALUE ; 
        int[] window = new int[128] ; 
        while(r < s.length()){
            char c = s.charAt(r);
            window[c]++ ; 
            if(need[c] > 0 && need[c] == window[c]){
                haveCount++;
            }
            while(haveCount == needCount) {
                if(r - l + 1 < min){
                    min = r - l + 1 ; 
                    startIdx = l ; 
                }
                char lc = s.charAt(l);
                window[lc]-- ; 
               

                if(need[lc] > 0 && need[lc] > window[lc]){
                    haveCount-- ; 
                }
                l++;
            }
            r++;
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(startIdx , min + startIdx) ; 
    }
}