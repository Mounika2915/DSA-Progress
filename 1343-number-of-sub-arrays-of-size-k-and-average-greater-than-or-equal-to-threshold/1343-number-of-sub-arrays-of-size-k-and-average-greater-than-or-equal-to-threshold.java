class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0 ; 
        int count = 0 ; 
        for(int i = 0 ; i < k ;i++){
            sum += arr[i];
        }
        int avg = sum / k ;
        if(avg >= threshold){
            count++;
        }
        int l = 0;
        for(int r = k ; r < arr.length ;r++){
            sum += arr[r];
            sum -= arr[l] ; 
            avg = sum / k;
            if(avg >= threshold){
                count++;
            }
            l++;
        }
        return count ;
    }
}