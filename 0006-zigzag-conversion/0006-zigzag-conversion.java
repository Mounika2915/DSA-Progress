class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()){
            return s ; 
        }
        StringBuilder[] sb = new StringBuilder[numRows] ; 
        for(int i = 0 ; i < numRows ; i++){
            sb[i] = new StringBuilder() ; 
        }
        boolean goingDown = false ; int curr = 0 ; 
        for(char c : s.toCharArray()){
            sb[curr].append(c) ; 
            if(curr == 0 || curr == numRows-1){
                goingDown = !goingDown ; 
            }
            curr += goingDown ? 1 : -1 ;  
        }
        StringBuilder res = new StringBuilder() ; 
        for(StringBuilder r : sb){
            res.append(r) ; 
        }
        return res.toString() ; 
    }
}