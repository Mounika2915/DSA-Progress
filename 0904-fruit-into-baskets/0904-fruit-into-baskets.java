class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer , Integer> map = new HashMap<>() ; 
        int l = 0 , maxSize = 0 ; 
        for(int r = 0 ; r < fruits.length ; r++){
            map.put(fruits[r] , map.getOrDefault(fruits[r] , 0) + 1) ; 
            while(map.size() > 2){
                map.put(fruits[l] , map.getOrDefault(fruits[l] , 0) - 1) ; 
                if(map.get(fruits[l]) == 0){
                    map.remove(fruits[l]); 
                }
                l++;
            }
            maxSize = Math.max(maxSize , r - l + 1) ;
        }
        return maxSize;
    }
}