class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill) ; 
        int diff = skill[0] + skill[skill.length-1] ; 
        long total = skill[0] * skill[skill.length-1] ; 
        int i = 1 , j = skill.length - 2 ; 
        while(i < j){
            if(diff != skill[i] + skill[j]){
                return -1 ; 
            }
        
            total = total +  (skill[i] * skill[j]) ;
            i++;
            j--;
        }
        return total;
    }
}