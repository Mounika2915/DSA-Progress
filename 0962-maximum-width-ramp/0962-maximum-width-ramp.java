class Solution {
    public int maxWidthRamp(int[] nums) {
        // int n = nums.length ; 
        // int[] rightMax = new int[n] ; 
        // rightMax[n-1] = nums[n-1] ; 
        // for(int i = n - 2 ; i >= 0 ; i--){
        //     if(nums[i]  <= rightMax[i + 1]){
        //         rightMax[i] = rightMax[i + 1] ; 
        //     }else{
        //         rightMax[i] = nums[i] ; 
        //     }
        // }
        // int l = 0 , r = 0 , max = 0 ; 
        // while(r < n){
        //     while(l < r && nums[l] > rightMax[r]){
        //         l++;
        //     }
        //     max = Math.max(max , r - l ) ; 
        //     r++;
        // }
        // return max ; 


        Stack<Integer> stkindices = new Stack<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(stkindices.isEmpty()){
                stkindices.push(i) ; 
            }else if(nums[stkindices.peek()] > nums[i]){
                stkindices.push(i) ; 
            }
        }
        int max = 0 ; 
        for(int r = nums.length - 1 ; r >= 0 ; r--){
            while(!stkindices.isEmpty() && nums[stkindices.peek()] <= nums[r]){
                max = Math.max(max , r - stkindices.pop());

            }
        }
        return max ; 
        
    }
}