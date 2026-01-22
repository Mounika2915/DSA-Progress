class Solution {
    private boolean isRowValid(char[][] board , int i , int j ){
        char val = board[i][j];
        for(int k = 0 ; k < 9 ; k++){
            if(k != j ){
                if(val == board[i][k]){
                    return false ;
                }
            }
        }
        return true ;
    }
    private boolean isColValid(char[][] board , int i , int j ){
        char val = board[i][j];
        for(int k = 0 ; k < 9 ;k++){
            if(k != i){
                if(val == board[k][j]){
                    return false; 
                }
            }
        }
        return true ; 
    }
    private boolean isBoxValid(char[][] board , int i , int j){
        int val = board[i][j];
        int startRow = (i /3)*3;
        int startCol = (j/3) * 3;
        for(int x = startRow ; x < startRow + 3 ; x++){
            for(int y = startCol ; y < startCol + 3 ; y++){
                if(x != i && y!= j){
                    if(val == board[x][y]){
                        return false ;
                    }
                }
            }
        }
        return true ;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(board[i][j] != '.'){
                   if(!isRowValid(board , i , j)){
                     return false ;
                   }
                   if(!isColValid(board , i , j)){
                    return false;
                   }
                   if(!isBoxValid(board , i , j)){
                    return false ;
                   }
                }
            }
        }
        return true ;
    }
}