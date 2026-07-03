class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stk = new Stack<>() ; 
        int i = 0 ; 
        StringBuilder curr = new StringBuilder() ; 
        while(i < s.length()){
            if(s.charAt(i) == '('){
                stk.push(curr) ; 
                curr = new StringBuilder() ;  
            }else if (s.charAt(i) == ')'){
                curr.reverse() ; 
                StringBuilder prev = new StringBuilder() ; 
                prev = stk.pop();
                prev.append(curr);
                curr = prev;
            }else{
                curr.append(s.charAt(i)) ; 
            }
            i++;
        }
        return curr.toString();
    }
}