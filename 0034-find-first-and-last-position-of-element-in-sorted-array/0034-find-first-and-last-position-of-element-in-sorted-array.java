class Solution {
    private int findLower(int[] nums , int target){
        int l = 0 , r = nums.length - 1; 
        while(l <= r){
            int mid = l + (r - l) / 2 ; 
            if(nums[mid] == target){
                if(mid == 0){
                    return mid ; 
                }else if(nums[mid] == nums[mid - 1]){
                    r = mid - 1 ; 
                }else{
                    return mid ; 
                }
            }else if(nums[mid] < target){
                l = mid + 1 ; 
            }else{
                r = mid - 1 ; 
            }
        }
        return -1 ; 
    }
    private int findUpper(int[] nums, int target){
        int l = 0 , r = nums.length - 1 ; 
        while(l <= r) {
            int mid = l + (r - l) / 2 ; 
            if(nums[mid] == target) {
                if(mid == nums.length - 1) {
                    return mid ; 
                }else if(nums[mid] == nums[mid +1]){
                    l = mid + 1 ; 
                }else{
                    return mid ; 
                }
            }else if(nums[mid] < target){
                l = mid +1 ; 
            }else{
                r = mid - 1 ; 
            }
        } 
        return -1 ; 
    }
    public int[] searchRange(int[] nums, int target) {
        int lower = findLower(nums , target) ; 
        if(lower == -1){
            return new int[]{-1,-1};
        }
        int upper = findUpper(nums , target) ; 
        return new int[]{lower , upper}  ; 
    }
}