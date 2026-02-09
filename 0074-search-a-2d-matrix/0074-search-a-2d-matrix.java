class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int colLength = matrix[0].length;
        int rowLength = matrix.length ;
        int l = 0 , r = colLength * rowLength - 1 ; 
        while(l <= r){
            int mid = l + (r - l ) /2 ;
            int row = mid / colLength ;
            int col = mid % colLength ;
            if(matrix[row][col] == target){
                return true ; 
            }else if(matrix[row][col] < target){
                l = mid + 1 ;
            }else{
                r = mid - 1 ;
            }
        }
        return false ; 
    }
}