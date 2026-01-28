class Solution {
    public boolean checkValidString(String s) {
        int n = s.length() , leftMin = 0 , leftMax = 0;
        for(int i = 0 ; i < n ;i++){
            char c = s.charAt(i);
            if(c == '('){
                leftMax++;
                leftMin++;
            }else if(c == ')'){
                leftMin--;
                leftMax--;
            }else{
                leftMin--;
                leftMax++;
            }
            if(leftMax < 0){
                return false ;
            }
            if(leftMin < 0){
                leftMin = 0 ;
            }
        }
        return leftMin == 0;
    }
}