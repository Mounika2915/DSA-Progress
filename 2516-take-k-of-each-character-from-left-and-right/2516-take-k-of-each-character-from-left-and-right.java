class Solution {
    public int takeCharacters(String s, int k) {
        if(k == 0){
            return 0;
        }
        HashMap<Character , Integer> map = new HashMap<>() ; 
        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault(c , 0) + 1) ; 
        }
        if(map.size() != 3){
            return -1 ; 
        }

        for(Character c : map.keySet()){
            if(map.get(c) < k){
                return -1;
            }
        }
        
        int l = 0 , max = Integer.MIN_VALUE ; 
        for(int r = 0 ; r < s.length(); r++){
            char c = s.charAt(r) ; 
            map.put(c , map.getOrDefault(c , 0 )-1) ; 
            while(map.get(c) < k){
                char lc = s.charAt(l) ; 
                map.put(lc , map.getOrDefault(lc , 0 ) + 1) ; 
                l++;
            }
            max = Math.max(max , r - l + 1);
        }
        
        return max == Integer.MIN_VALUE ? -1 :  s.length() - max ; 
    }
}