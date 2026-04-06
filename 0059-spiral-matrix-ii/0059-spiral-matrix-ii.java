class Solution {
    public int[][] generateMatrix(int n) {
        int[] numbers = new int[n * n] ; 
        for(int i = 0 ; i < numbers.length ;i++){
            numbers[i] = i + 1 ; 
        }
        int idx = 0 ; 
        int[][] matrix = new int[n][n] ;
        int top = 0 , left = 0 , bottom = n - 1 , right = n- 1 ; 
        while(top <= bottom && left <= right){
            for(int i = left ; i <= right ;i++){
                matrix[top][i] =  numbers[idx++]; 
            }
            top++ ; 
            for(int i = top ; i <= bottom ;i++){
                matrix[i][right] = numbers[idx++] ;
            }
            right--;
            if(top <= bottom){
                for(int i = right ; i >= left ; i--){
                    matrix[bottom][i] = numbers[idx++] ;
                }
                bottom--;
            }
            
            if(left <= right){
                for(int i = bottom ; i >= top ; i--){
                    matrix[i][left] = numbers[idx++];
                }
                left++;
            }
        }
        return matrix ;
        
    }
}