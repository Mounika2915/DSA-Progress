class Solution {
    public int myAtoi(String s) {
        s = s.trim() ; 
        if(s.isEmpty()){
            return 0 ; 
        }
        int sign = 1 , index = 0 ;
        long val = 0  ; 
        if(s.charAt(0) == '-'){
            sign = -1 ; 
            index++;
        }else if(s.charAt(0) == '+'){
            index++; 
        }

        while(index < s.length() && Character.isDigit(s.charAt(index))){
            int digit = s.charAt(index) - '0' ; 
            val = val * 10 + digit ; 
            index++ ;
            if(sign == 1 && val >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE ; 
            }else if(sign == -1 && val * sign <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE ; 
            }
        }
        return (int) val  * sign ; 
    }
}