class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack() ; 
        for(int i = 0 ; i < num.length() ; i++){
            char c = num.charAt(i);
            while(!stk.isEmpty() && k != 0 && stk.peek() > c ){
                stk.pop() ; 
                k--;
            }
            stk.push(c);
        }
        while(!stk.isEmpty() && k > 0){
            stk.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for(char s : stk){
            sb.append(s);
        }
       while(sb.length() > 1 && sb.charAt(0) == '0') {
        sb.deleteCharAt(0);
       }
       return sb.length() == 0 ? "0" : sb.toString();

    }
}