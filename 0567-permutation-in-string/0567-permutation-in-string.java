class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false; 
        }
        int n = s1.length() ; 
        int[] s1Arr = new int[128];
        for(int i = 0 ; i < n ; i++){
            s1Arr[s1.charAt(i)-'a']++;
        }
        int[] s2Arr = new int[128];
        for(int i = 0 ; i < n ; i++){
            s2Arr[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(s1Arr , s2Arr)){
            return true ; 
        }
        for(int i = n ; i < s2.length() ; i++){
            s2Arr[s2.charAt(i)-'a']++;
            s2Arr[s2.charAt(i - n) - 'a']--;
            if(Arrays.equals(s1Arr , s2Arr)){
                return true ; 
            }
        }
        return false ; 
    }
}