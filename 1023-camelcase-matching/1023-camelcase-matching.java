class Solution {
    private boolean isTrue(String s1 , String s2 ){
        int i = 0 , j = 0 ; 
        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z' && s1.charAt(i) != s2.charAt(j)){
                return false ; 
            }
            if(s1.charAt(i) == s2.charAt(j)){
                j++;
            }
            i++;
        }
        if(j < s2.length()){
            return false;
        }
        while(i < s1.length()){
            if(s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z'){
                return false ; 
            }
            i++;
        }
        return true ; 
    }
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list = new ArrayList<>() ; 
        for(int i = 0 ; i < queries.length ; i++){
            if(isTrue(queries[i] , pattern)){
                list.add(true) ; 
            }else{
                list.add(false) ;
            }
        }
        return list ; 
    }
}