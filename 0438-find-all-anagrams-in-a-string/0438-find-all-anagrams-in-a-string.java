class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>() ; 
        int pSize = p.length() ; 
        int[] pArr = new int[26] ; 
        for(char c : p.toCharArray()){
            pArr[c - 'a']++ ; 
        }
        int[] sArr = new int[26] ; 
        for(int i = 0 ; i < s.length() ;i++){
            sArr[s.charAt(i) - 'a']++;
            if(i >= pSize){
                sArr[s.charAt(i - pSize) - 'a']--;
            }
            if(Arrays.equals(pArr , sArr)){
                list.add(i - pSize + 1) ; 
            }
        }
        return list ; 
    }
}