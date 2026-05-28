class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod = 1000000007, n = nums.length;
        Arrays.sort(nums);
        
        int[] power = new int[n] ; 
        power[0] = 1 ; 
        for(int i = 1 ; i < n ; i++){
            power[i] = (power[i-1] * 2 ) % mod; 
        }

         int i = 0 , j = n - 1 ; 
        int total = 0 ;
        while(i <= j){
            int sum = nums[i] + nums[j] ; 
            //if sum <= target that means we taking ... its already in sorted so the min element always be first and max element always be last 
            // and we have take it skip it beacause it is a subsequence [2,3,3,4,6,7] 2 is min and 7 is max 2+7 <= 12
            //..so we consider from 0 to  5 i.e 2 power 5 = 32 options
            if(sum <= target){
                int len = j - i ; 
                total = (total + power[len]) % mod ;
                i++;
            }else{
                j--;
            }
        }
        return total % mod ; 
    }
}