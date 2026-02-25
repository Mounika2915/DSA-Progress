class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>() ; 
        for(int i = 0 ; i < strs.length ; i++){
            char[] charArray = strs[i].toCharArray() ; 
            Arrays.sort(charArray) ; 
            String s = new String(charArray) ; 
            if(!map.containsKey(s)){
                map.put(s , new ArrayList<>()) ; 
            }
            map.get(s).add(strs[i]) ; 
        }
        // List<List<String>> list = new ArrayList<>() ; 
        // for(String k : map.keySet()){
        //     list.add(map.get(k));
        // }
        // return list ; 
        return new ArrayList<>(map.values()) ; 
    }
}