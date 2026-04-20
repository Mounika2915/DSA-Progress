class Solution {
    // public void f(int[] nums , List<Integer> curr  , List<List<Integer>> list , boolean[] freq ){
    //     if(curr.size() == nums.length){
    //         list.add(new ArrayList<>(curr)) ; 
    //         return ; 
    //     }
    //     for(int i = 0 ; i < nums.length ; i++){
    //         if(!freq[i]){
    //             curr.add(nums[i]) ; 
    //             freq[i] = true ; 
    //             f(nums, curr, list, freq) ; 
    //             freq[i] = false ; 
    //             curr.remove(curr.size() - 1) ; 
    //         }
    //     }
    // }

    private void f(int idx , int[] nums , List<List<Integer>> list){
        if(idx == nums.length){
            List<Integer> curr = new ArrayList<>() ; 
            for(int i = 0 ; i < nums.length ; i++){
                curr.add(nums[i]) ; 
            }
            list.add(new ArrayList<>(curr))  ; 
            return ; 
        }
        for(int i = idx ; i< nums.length ; i++){
            swap(i , idx , nums) ; 
            f(idx + 1 , nums , list) ; 
            swap(i , idx , nums) ;
        }
    }
    private void swap(int i , int j , int[] nums){
        int temp = nums[i] ; 
        nums[i] = nums[j] ; 
        nums[j]  = temp ; 
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // boolean[] freq = new boolean[nums.length] ; 
        // f(nums , new ArrayList<>() , list , freq) ; 
        // return list ; 
        f(0 , nums , list) ; 
        return list ; 
    }
}