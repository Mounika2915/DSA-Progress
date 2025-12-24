class Solution {
    public int trap(int[] height) {
        int leftmax = 0 , rightmax = 0 ; 
        int total = 0 ;
        int l = 0 , r = height.length - 1;
        while(l < r){
            if(height[l] < height[r]){
                if(leftmax < height[l]){
                    leftmax = height[l];
                }else{
                    total += (leftmax - height[l]);
                }
                l++;
            }else{
                if(rightmax < height[r]){
                    rightmax = height[r];
                }else{
                    total += (rightmax - height[r]);
                }
                r--;
            }
        }
        return total ; 
    }
}