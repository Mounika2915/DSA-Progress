class Solution {
    private int square(int n){
        int res = 0 ;
        while(n != 0 ){
            int digit = n % 10 ;
            res = res + (digit * digit) ; 
            n = n / 10 ;
        }
        return res ;
    }
    public boolean isHappy(int n) {
        int slow = n ; 
        int fast = n ; 
        slow = square(slow);
        fast = square(square(fast));
        while( slow != fast){
            slow = square(slow);
            fast = square(square(fast));
        }
        return slow == 1 ; 
    }
}