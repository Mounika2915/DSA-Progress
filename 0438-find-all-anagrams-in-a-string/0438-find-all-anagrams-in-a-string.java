class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pfreq = new int[26];
        int m = p.length();
        for(int i = 0 ; i < m ; i++){
            pfreq[p.charAt(i) - 'a']++;
        }
        List<Integer> res = new ArrayList<>();
        int[] sfreq = new int[26];
        for(int i = 0 ; i < s.length() ;i++){
            sfreq[s.charAt(i) - 'a']++;
            if(i >= m){
                sfreq[s.charAt(i - m) - 'a']--;
            }
            if(Arrays.equals(sfreq , pfreq)){
                res.add(i -m + 1);
            }
        }
        return res;
    }
}