class Solution {
    public int minimumLength(String s) {
        int i = 0 , j = s.length()-1; 
        while(i < j && s.charAt(i) == s.charAt(j)){
            while(i < j && s.charAt(i) == s.charAt(i + 1)){
                i++;
            }
            i++;
            while(i < j && s.charAt(j) == s.charAt(j - 1)){
                j--;
            }
            j--;
        }
        if(j < i){
            return 0 ; 
        }
        return j - i + 1 ; 
    }
}