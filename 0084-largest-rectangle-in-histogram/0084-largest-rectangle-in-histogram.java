class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        int max = Integer.MIN_VALUE ;
        int n = heights.length ;
        for(int i = 0 ; i < heights.length ;i++){
            while( !stk.isEmpty() && heights[stk.peek()] >= heights[i]){
                int height = heights[stk.pop()];
                int width = stk.isEmpty() ? i : i - stk.peek()-1;
                max = Math.max(max , height * width) ;
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            int height = heights[stk.pop()];
            int width = stk.isEmpty() ? n : n - stk.peek()-1;
            max = Math.max(max , height * width) ;
        }
        return max ; 
    }
}