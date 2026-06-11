class Solution {
    public int trap(int[] height) {
        int l = 0 , r = height.length - 1 ; 
        int leftHeight = 0 , rightHeight = 0 ; 
        int total = 0 ; 
        while(l < r){
            if(height[l] < height[r]){
                if(leftHeight < height[l]){
                    leftHeight = height[l] ; 
                }else{
                    total += leftHeight - height[l] ; 
                }
                l++;
            }else{
                if(rightHeight < height[r]){
                    rightHeight = height[r] ; 
                }else{
                    total += rightHeight - height[r] ; 
                }
                r--;
            }
        }
        return total ; 
    }
}