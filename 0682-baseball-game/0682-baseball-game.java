class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>() ; 
        for(int i = 0 ; i < operations.length ; i++){
            if(operations[i].equals("C")){
                if(stk.size() >= 1){
                    stk.pop() ;
                }
                 
            }else if(operations[i].equals("D")){
                if(stk.size() >= 1){
                    int val = stk.peek()  ; 
                    stk.push(2* val);
                }
                
            }else if(operations[i].equals("+")){
                if(stk.size() >= 2){
                    int val = stk.pop() ; 
                    int total = stk.peek() + val ; 
                    stk.push(val);
                    stk.push(total) ; 
                }
                
            }else{
                stk.push(Integer.parseInt(operations[i]));
               
            }
        }

        int sum = 0 ; 
        while(!stk.isEmpty()){
            sum += stk.pop() ; 
        }
        return sum ; 
    }
}