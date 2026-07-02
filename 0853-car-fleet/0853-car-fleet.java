class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] dist = new double[position.length][2] ; 
        for(int i = 0 ; i < position.length ; i++){
            dist[i][0] =  position[i]; 
            dist[i][1] = (double)(target - position[i]) / speed[i] ; 
        }
        Arrays.sort(dist , (a, b) -> Double.compare(b[0] , a[0])) ; 
        int count = 1 ;double prev = dist[0][1] ; 
        for(int i = 1 ; i < dist.length ; i++){
            if(dist[i][1] > prev){
                prev = dist[i][1]; 
                count++;
            }
        }
        return count ; 
    }
}