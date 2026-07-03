class Solution {
    public int minLength(String s) {
        Stack<Character> stk = new Stack() ; 
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i) ; 
            if(c == 'B' || c == 'D'){
                if(!stk.isEmpty() && stk.peek() == 'A' && c == 'B'){
                    stk.pop();
                }else if(!stk.isEmpty() && stk.peek() == 'C' && c == 'D'){
                    stk.pop();
                }else{
                    stk.push(c);
                }
            }else{
                stk.push(c);
            }
        }
        return stk.size();
    }
}