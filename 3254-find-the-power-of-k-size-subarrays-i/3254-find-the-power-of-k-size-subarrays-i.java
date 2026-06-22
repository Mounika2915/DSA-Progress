class Solution {
    public int[] resultsArray(int[] nums, int k) { 
        int[] ans = new int[nums.length - k + 1] ;
        if(k == 1 && nums.length == 1){
            return new int[]{nums[0]};
        }
        if(k == 1){
            for(int i = 0 ; i < nums.length ; i++){
                ans[i] = nums[i] ; 
            }
        }else{
            int l = 0 , i = 0 ; 
            int count = 1 ; 
            for(int r = 1 ; r < nums.length ; r++){
                if(r > 0 && nums[r - 1] == nums[r] - 1 ){
                    count++;
                }
                if(r - l + 1 > k){
                    if(nums[l] == nums[l + 1] - 1 ){
                        count--;
                    }
                    l = l +1 ; 
                }
                if(r - l + 1 == k ){
                    if(count == k){
                        ans[i++] = nums[r] ; 
                    } else{
                        ans[i++] = -1 ; 
                    }
                }
            }
        }
        return ans ; 
    }

}