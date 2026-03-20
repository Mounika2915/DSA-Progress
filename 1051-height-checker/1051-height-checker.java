class Solution {
    public int heightChecker(int[] heights) {
        int[] clone = new int[heights.length];
        for(int i = 0 ; i < heights.length ; i++){
            clone[i] = heights[i];
        } 
        Arrays.sort(clone) ; 
        int count = 0  ; 
        for(int i = 0 ; i < heights.length ; i++){
            if(heights[i] != clone[i]){
                count++;
            }
        }
        return count ; 
    }
}