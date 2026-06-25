class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b)-> b[0] - a[0]);
        for(int i = 0 ; i < nums.length ;i++){
            maxHeap.add(new int[]{nums[i] , i});
            while(maxHeap.peek()[1] <= i-k){
                maxHeap.remove();
            }
            if(i >= k-1 ){
                res[i -k + 1] = maxHeap.peek()[0];
            }
        }
        return res;

    }
}