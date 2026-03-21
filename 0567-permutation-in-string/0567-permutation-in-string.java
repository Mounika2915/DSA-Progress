class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Arr = new int[26] ; 
        for(char c : s1.toCharArray()){
            s1Arr[c - 'a']++;
        }

        int len = s1.length() ; 

        int[] s2Arr = new int[26] ; 
        for(int i = 0 ; i < s2.length() ; i++){
            s2Arr[s2.charAt(i) - 'a']++ ; 
            if(i >= len){
                s2Arr[s2.charAt(i - len ) - 'a']-- ; 
            }
            if(Arrays.equals(s1Arr , s2Arr)){
                return true ; 
            }
        }
        return false; 
    }
}