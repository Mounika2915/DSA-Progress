class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = spaces.length ;
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0,spaces[0]));
        for(int i = 1 ; i < n ; i++){
            sb.append(" ");
            sb.append(s.substring(spaces[i-1] , spaces[i]));
        }
        sb.append(" ");
        sb.append(s.substring(spaces[n-1] , s.length()));
        return sb.toString();
    }
}