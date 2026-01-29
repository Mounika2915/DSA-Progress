class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length ;
        int[] res  = new int[n] ;
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i < n ;i++){
            while(!stk.isEmpty() && temperatures[stk.peek()] < temperatures[i]){
                int val = stk.pop();
                 res[val] = i - val ; 

            }
            stk.push(i);
               
        }
        return res;
    }
}