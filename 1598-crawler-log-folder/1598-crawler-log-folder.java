class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stk = new Stack<>() ; 
        for(int i = 0 ; i < logs.length ; i++){
            if(!stk.isEmpty() && logs[i].equals("../")){
                stk.pop();
            }
            else if(logs[i].equals("./")){
                continue ; 
            }else{
                if(!logs[i].equals("../")){
                    stk.push(logs[i]);
                }
                 
            }
        }
        return stk.size();
    }
}