class Solution {
    public int minCost(String colors, int[] needTime) {
        int total = 0 , max = needTime[0] ; 
        for(int i = 1 ; i < colors.length() ; i++){
            if(colors.charAt(i) == colors.charAt(i-1)){
                total += Math.min(max , needTime[i]) ; 
                max = Math.max(max , needTime[i]);
            }else{
                max = needTime[i];
            }
        }
        return total;
    }
}