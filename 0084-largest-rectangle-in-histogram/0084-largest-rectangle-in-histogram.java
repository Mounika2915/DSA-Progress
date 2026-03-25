class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stk = new Stack<>() ; 
        int maxi = Integer.MIN_VALUE; 
        for(int i = 0 ; i < heights.length ; i++){
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i]){
                int height = heights[stk.pop()] ; 
                int weight = stk.isEmpty() ? i : i - stk.peek() - 1 ; 
                maxi = Math.max(maxi , height * weight) ; 
            }
            stk.push(i) ; 
        }
        while(!stk.isEmpty()){
            int height = heights[stk.pop()] ; 
            int weight = stk.isEmpty() ? n : n - stk.peek() - 1 ; 
            maxi = Math.max(maxi , height * weight) ;
        }
        return maxi ; 
    }
}