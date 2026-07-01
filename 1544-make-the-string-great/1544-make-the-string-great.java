class Solution {
    public String makeGood(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(!stk.isEmpty() && (s.charAt(i) == stk.peek() - 32 || s.charAt(i) == stk.peek() + 32) ){
                stk.pop();
            }else{
                stk.push(s.charAt(i)) ;
            }
             
        }
        StringBuilder sb = new StringBuilder() ; 
        for(char c : stk){
            sb.append(c) ; 
        }
        return sb.toString();
    }
}