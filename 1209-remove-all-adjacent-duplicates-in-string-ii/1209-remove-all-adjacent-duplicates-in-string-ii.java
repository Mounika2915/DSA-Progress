class Pair{
    char ele ; 
    int count ; 
    Pair(char ele , int count){
        this.ele = ele ; 
        this.count = count ; 
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stk = new Stack<>() ; 
        for(int i = 0 ; i < s.length() ; i++){
            if(!stk.isEmpty() && stk.peek().ele == s.charAt(i) && stk.peek().count == k-1){
                while(!stk.isEmpty() && stk.peek().ele == s.charAt(i)){
                    stk.pop();
                }
            }else{
                if(!stk.isEmpty() && stk.peek().ele == s.charAt(i)){
                    stk.push(new Pair(s.charAt(i) ,stk.peek().count + 1 ));
                }else{
                    stk.push(new Pair(s.charAt(i) , 1) ) ; 
                }
            }
        }
        StringBuilder sb = new StringBuilder() ; 
        for(Pair p : stk){
            sb.append(p.ele) ; 
        }
        return sb.toString() ;
    }
}