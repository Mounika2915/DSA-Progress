class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums) ; 
        int min = nums[k - 1] - nums[0];
         int l = 1;
        for(int r = k ; r < nums.length ;r++){
            min = Math.min(min , nums[r] - nums[l]);
            l++;
        }
        return min;
    }
}