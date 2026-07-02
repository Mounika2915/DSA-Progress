class Solution {
    public String simplifyPath(String path) {
        Stack<String> stk = new Stack<>() ; 
        String[] s = path.split("/");
        for(int i = 0 ; i < s.length ; i++){
            if(s[i].equals("..")){
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }else if(!s[i].equals(".") && !s[i].equals("")){
                stk.push(s[i]);
            }
        } 
        StringBuilder sb = new StringBuilder() ; 
        for(String c : stk){
            sb.append('/');
            sb.append(c);
        }
        return sb.toString().length() == 0 ? "/" : sb.toString();
    }
}