class Pair{
    StringBuilder str ; 
    int number ; 
    Pair(StringBuilder str , int number){
        this.str = str ; 
        this.number = number ;
    }
}
class Solution {
    public String decodeString(String s) {
        Stack<Pair> stk = new Stack<>() ;
        StringBuilder currentString = new StringBuilder() ; 
        int currentNum = 0 ; 
        for(int i = 0 ; i < s.length() ;i++){
            char c = s.charAt(i) ; 
            if(c == '['){
                stk.push(new Pair(currentString , currentNum)) ; 
                currentString = new StringBuilder(); 
                currentNum = 0 ; 
            }else if(c == ']'){
                StringBuilder prevString = stk.peek().str ; 
                int prevNum = stk.peek().number ; 
                stk.pop();
                String rep = currentString.toString() ; 
                for(int j = 0 ; j < prevNum - 1 ; j++){ 
                    currentString.append(rep);
                }
                prevString.append(currentString) ; 
                currentString = prevString ; 
            }else if(Character.isLetter(c)){
                currentString.append(c) ; 
            }else {
                currentNum = currentNum * 10 + c -'0';
            }
        }
        return currentString.toString() ; 
    }
}