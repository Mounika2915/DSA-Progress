class Solution {
    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ; 
    }
    private long countSubstrings(String word , int k ){
        HashMap<Character , Integer> map = new HashMap<>() ;
        int l = 0 , count = 0 ; 
        long substrings = 0 ; 
        for(int r = 0 ; r < word.length() ; r++){
            char c = word.charAt(r) ; 
            if(isVowel(c)){
                count++;
                map.put(c , map.getOrDefault(c , 0 ) + 1) ; 
            }
            while(map.size() == 5 && (r - l + 1) - count >= k ){
                char lc = word.charAt(l) ; 
                if(isVowel(lc)){
                    count--;
                    map.put(lc , map.getOrDefault(lc , 0) - 1) ; 
                    if(map.get(lc) == 0){
                        map.remove(lc) ; 
                    }
                }
                substrings += word.length() - r ; 
                
                l++;
            }
            
        }
        return substrings;
    }
    public long countOfSubstrings(String word, int k) {
        return countSubstrings(word , k) - countSubstrings(word , k + 1) ; 
    }
}