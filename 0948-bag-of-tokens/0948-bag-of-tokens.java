class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int i = 0 , j = tokens.length - 1 ; 
        int score = 0 , max = 0; 
        Arrays.sort(tokens)  ; 
        while( i <= j ){
            if(tokens[i] <= power){
                power = power - tokens[i] ; 
                score++;
                i++;
            }else if( score > 0 ) {
                power = power + tokens[j] ; 
                score--;
                j--;
            }else{
                break;
            }
            max = Math.max(max , score) ; 
        }
        return max ; 
    }
}