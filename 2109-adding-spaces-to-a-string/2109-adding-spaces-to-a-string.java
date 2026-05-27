class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder() ; 
        int i = 0 , j = 0 ; 
        while(i < s.length() && j < spaces.length){
            if(i == spaces[j]){
                sb.append(" ") ;
                sb.append(s.charAt(i)) ;
                i++;
                j++;
            }else{
                sb.append(s.charAt(i)) ;
                i++;
            }
        }
        while(i < s.length()){
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}