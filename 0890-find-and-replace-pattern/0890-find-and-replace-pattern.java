class Solution {
    private boolean isValid(String word , String pattern){
        int[] pFreq = new int[26];
        int[] wFreq = new int[26] ; 
        Arrays.fill(pFreq , -1);
        Arrays.fill(wFreq , -1) ; 
        for(int i = 0 ; i < word.length() ;i++){
           char c1 = pattern.charAt(i) ; 
           char c2 = word.charAt(i) ; 
           if(pFreq[c1 - 'a'] != -1 && pFreq[c1-'a'] != c2){
            return false ;
           }
           if(wFreq[c2- 'a'] != -1 && wFreq[c2 - 'a'] != c1){
            return false ; 
           }
           pFreq[c1 - 'a'] = c2 ; 
           wFreq[c2 - 'a'] = c1 ; 

      }
      return true ; 
    }
    
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for(String word : words){
            if(isValid(word , pattern)){
                list.add(word) ;
            }
        }
        return list ;
    }
}