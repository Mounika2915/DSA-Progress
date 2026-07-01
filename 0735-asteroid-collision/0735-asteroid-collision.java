class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stk = new Stack<>() ; 
        for(int i = 0 ; i < asteroids.length ; i++){
            if(asteroids[i] >= 0 ){
                stk.push(asteroids[i]) ; 
            }else {
                
                while(!stk.isEmpty() && stk.peek() >= 0 && (stk.peek()) < Math.abs(asteroids[i])){
                    stk.pop();
                }
                if(stk.isEmpty() || stk.peek() < 0 ){
                    stk.push(asteroids[i]) ; 
                }
                if(stk.peek() == Math.abs(asteroids[i])){
                    stk.pop();
                }
            }
            
            
        }
        int[] res = new int[stk.size()] ; 
        int i = 0 ; 
        for(int s : stk){
            res[i] = s ; 
            i++;
        }
        return res ; 
















        //3 cases
        //positive positive nothing happens same direction.
        //when negative comes absolute of smallest exploid.
        //if both are same size both  exploid.
        // int n = asteroids.length ;
        // Stack<Integer> stk = new Stack<>();
        // for(int i = 0 ; i < n ; i++){
        //     if(asteroids[i] > 0){
        //         stk.push(asteroids[i]);
        //     }else{
        //         while(!stk.isEmpty() && stk.peek() > 0 && stk.peek() < Math.abs(asteroids[i])){
        //             stk.pop();
        //         }
        //         if(stk.isEmpty() || stk.peek() < 0){
        //             stk.push(asteroids[i]);
        //         }
        //         if(stk.peek() == Math.abs(asteroids[i])){
        //             stk.pop();
        //         }
        //     }
        // }
        // int[] res = new int[stk.size()];
        // int x = 0 ;
        // for(int i : stk){
        //     res[x] = i ; 
        //     x++;
        // }
        // return res ; 



























        
    }
}