class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length , col = mat[0].length ; 
        int[] res = new int[row * col];
        
        int r = 0 , c = 0 ; 
        for(int i = 0 ; i < res.length ;i++){
            res[i] = mat[r][c] ; 
            if((r + c) % 2 == 0){
                //moving up  means when sum is Even we have to move up
                if(c == col -1){
                    r++;
                }else if(r == 0){
                    c++;
                }else{
                    r--;
                    c++ ; 
                }
            }else{
                //moving down
                if(r == row - 1 ){
                    c++;
                }else if(c == 0){
                    r++;
                }else{
                    r++;
                    c--;
                }
            }
        }
        return res;
    }
}