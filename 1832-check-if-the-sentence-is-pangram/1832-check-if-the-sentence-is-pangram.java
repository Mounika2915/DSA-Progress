class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] charFreq = new int[26] ; 
        for(int c : sentence.toCharArray()){
            charFreq[c - 'a']++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(charFreq[i] == 0){
                return false; 
            }
        }
        return true ; 
    }
}