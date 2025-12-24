class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0 , r = people.length-1 ; 
        int count = 0 ;
        while(l <= r){
            int target = people[l] + people[r];
            if(target > limit){
                count++;
                r--;
            }else{
                count++;
                l++;
                r--;
            }
        }
        return count ; 
    }
}