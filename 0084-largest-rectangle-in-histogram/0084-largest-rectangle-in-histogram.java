class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>() ; 
        int height = 0  , weight = 0 , max = 0 ; 
        for(int i = 0 ; i < heights.length ; i++){
            while(!stk.isEmpty() && heights[stk.peek()] > heights[i]){
                height = heights[stk.pop()] ; 
                if(!stk.isEmpty()){
                    weight = i - stk.peek() - 1; 
                }else{
                    weight = i ; 
                }
                max = Math.max(max , height * weight) ; 
            }
            stk.push(i) ; 
        }
        while(!stk.isEmpty()){
            height = heights[stk.pop()] ; 
                if(!stk.isEmpty()){
                    weight = heights.length - stk.peek() - 1 ; 
                }else{
                    weight = heights.length ; 
                }
                max = Math.max(max , height * weight) ;
        }
        return max ; 
    }
}