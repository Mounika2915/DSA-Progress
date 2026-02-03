class FreqStack {
    Map<Integer , Integer> freqMap ;
    Map<Integer , Stack<Integer>> freqStack ;
    int maxFreq  ;
    public FreqStack() {
        freqMap = new HashMap<>();
        freqStack = new HashMap<>();
        maxFreq = 0 ; 
    }
    
    public void push(int val) {
        freqMap.put(val , freqMap.getOrDefault(val , 0) + 1 );
        int freq = freqMap.get(val) ;
        if(freqStack.containsKey(freq)){
            freqStack.get(freq).push(val);
        }else{
            freqStack.put(freq , new Stack<>());
            freqStack.get(freq).push(val);
        }

        if(freq > maxFreq){
            maxFreq = freq ; 
        }
    }
    
    public int pop() {
        if(freqStack.containsKey(maxFreq) && !freqStack.get(maxFreq).isEmpty()){ 
            int top = freqStack.get(maxFreq).pop();
            freqMap.put(top , freqMap.get(top)-1);
            if(freqStack.get(maxFreq).isEmpty()){
                freqStack.remove(maxFreq);
            }
            return top ;  
        }else{
            maxFreq-- ; 
            int top = freqStack.get(maxFreq).pop();
            freqMap.put(top , freqMap.get(top)-1);
            return top ; 
        }
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */