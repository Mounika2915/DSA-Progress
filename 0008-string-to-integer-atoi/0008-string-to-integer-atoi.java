class Solution {
    public int myAtoi(String s) {
        s = s.trim() ; 
        if(s.length() == 0){
            return 0; 
        }
        int sign = 1 ;
        int i =0 ; 
        if(s.charAt(i) == '-'){
            sign = -1 ; 
            i++;

        }else if(s.charAt(i) == '+'){
            sign = 1 ;
            i++;
        }
        long res = 0 ; 
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int num = s.charAt(i) -'0';
            res = res * 10 + num ; 
            i++ ; 
            if(sign == -1 && sign * res <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE ; 
            }
            if(sign == 1 && res >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE ; 
            }
        }
        return (int)res * sign; 
    }
}