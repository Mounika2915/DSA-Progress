class Solution {
    public String reverseWords(String s) {
        s = s.trim() ; 
        StringBuilder sb = new StringBuilder() ; 
        int i = s.length() - 1 ; int j = s.length() - 1 ;
        while(i >= 0){
            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            String word = s.substring(i + 1 , j + 1) ; 
            sb.append(word).append(" ") ;
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            } 
            j = i ; 
            
        }
        
        return sb.substring(0 , sb.length()-1).toString();
    }
}