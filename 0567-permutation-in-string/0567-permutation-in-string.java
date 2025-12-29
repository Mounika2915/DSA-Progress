class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int size = s1.length();
        if(s1.length() > s2.length()){
            return false;
        }
        int[] s1Arr = new int[26];
        for(int i = 0 ; i < size ; i++){
            s1Arr[s1.charAt(i) - 'a']++;
        }
        int[] s2Arr = new int[26];
        for(int i = 0 ; i < size ;i++){
             s2Arr[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(s1Arr,s2Arr)){
                return true ;
            }
        int l = 0 ;
        for(int i = size ; i < s2.length() ; i++ ){
            s2Arr[s2.charAt(l) - 'a']--;
            l++;
            
            s2Arr[s2.charAt(i) - 'a']++;
            if(Arrays.equals(s1Arr,s2Arr)){
                return true ;
            }
        }
        return false ;
    }
}