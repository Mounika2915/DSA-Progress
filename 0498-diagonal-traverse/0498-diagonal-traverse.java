class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length , col = mat[0].length ; 
        int[] res = new int[row * col];
        int idx = 0 ; 
        boolean direction = true ; 
        for(int i = 0 ; i < col ;i++){
            List<Integer> list = new ArrayList<>() ; 
            int x = 0 , y = i ; 
            while(x >= 0 && x < row && y >= 0 && y < col){
                list.add(mat[x++][y--]);
            }
            if(direction){
                Collections.reverse(list) ; 
            }
            direction = !direction ;
            for(int l : list) {
                res[idx++] = l;
            }
        }

        for(int i = 1 ; i < row ;i++){
             List<Integer> list = new ArrayList<>() ; 
            int x = i , y = col - 1 ; 
            while(x >= 0 && x < row && y >= 0 && y < col){
                list.add(mat[x++][y--]);
            }
            if(direction){
                Collections.reverse(list) ; 
            }
            direction = !direction ;
            for(int l : list) {
                res[idx++] = l;
            }
        }

        return res ;
    }
}