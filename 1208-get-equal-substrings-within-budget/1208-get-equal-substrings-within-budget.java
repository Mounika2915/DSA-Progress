class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int  max = 0 , l = 0 , cost = 0 ; 
        for(int i = 0 ; i < s.length() ;i++){
            cost += Math.abs(s.charAt(i) - t.charAt(i));
            while(cost > maxCost){
                cost -= Math.abs(s.charAt(l)-t.charAt(l));
                l++;
            }
            max = Math.max(max , i - l + 1);
        }
        return max ; 
    }
}