class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        
        int max = 1 ; 
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num) ; 
        }
        for(int num : set){
            if(!set.contains(num- 1)){
                int count = 1 ;
                int x = num;
                while(set.contains(x + 1)){
                    count++;
                    x = x+1 ;
                }
                max = Math.max(max , count);
            }
            
        }
        return max ;

    }
}