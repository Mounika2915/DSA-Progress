class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> stk = new Stack<>();
       for(int i = 0 ; i < operations.length; i++){
        String s = operations[i];
        if(s.equals("+")){
            if(stk.size() >= 2){
                int value = stk.pop();
                int sum = value + stk.peek() ;
                stk.push(value);
                stk.push(sum);
            }
        }else if(s.equals("D")){
            stk.push( 2 * stk.peek());
        }else if(s.equals("C")){
            if(stk.size() > 0){
                stk.pop();
            }
        }else{
            stk.push(Integer.parseInt(s));
        }
       } 
       int sum = 0 ;
       for(int i : stk){
        sum += i;
       }
       return sum ;
    }
}