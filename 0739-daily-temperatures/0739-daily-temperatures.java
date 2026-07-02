class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack<>() ; 
        for(int i = 0 ; i < temperatures.length ; i++){
            while(!stk.isEmpty() && temperatures[stk.peek()] < temperatures[i]){
                int idx = stk.pop() ; 
                temperatures[idx] = i - idx ; 
            }
            stk.push(i) ; 
        }
        while(!stk.isEmpty()){
            int idx = stk.pop() ; 
            temperatures[idx] = 0 ; 
        }
        return temperatures ; 
    }
}