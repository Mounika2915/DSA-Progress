class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i < tokens.length ; i++){
            if(stk.size() >= 2 && tokens[i].equals("+")){
                int val = stk.pop();
                stk.push(stk.pop() + val) ; 
            }else if(stk.size() >= 2 && tokens[i].equals("-")){
                int val = stk.pop();
                stk.push(stk.pop() - val) ;
            }
            else if(stk.size() >= 2 && tokens[i].equals("*")){
                int val = stk.pop();
                stk.push(stk.pop() * val) ;
            }
            else if(stk.size() >= 2 && tokens[i].equals("/")){
                int val = stk.pop();
                stk.push(stk.pop() / val) ;
            }else{
                stk.push(Integer.parseInt(tokens[i]));
            }
        }
        return stk.peek();
    }
}