class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length ;
         int l = 0 , r = n -1;
        long total = skill[l] * skill[r];
        int sum = skill[l] + skill[r];
        l++;
        r--;
        while(l < r){
            int curr = skill[l] + skill[r];
            if(curr != sum){
                return -1;
            }
            total += (skill[l] * skill[r]);
            l++;
            r--;
        }
        return total;
    }
}