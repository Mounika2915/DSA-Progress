class Solution {
    public int maxArea(int[] height) {
        int max = 0 , min = Integer.MAX_VALUE;
        int l = 0 , r = height.length-1;
        while(l < r){
            if(height[l] < height[r]){
                min = height[l];
                l++;
            }else{
                min = height[r];
                r--;
            }
            max = Math.max(max , (r-l+1) * min);
        }
        return max ; 
    }
}