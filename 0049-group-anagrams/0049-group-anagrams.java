class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>() ; 
        HashMap<String , List<String>> map = new HashMap();

        for(int i = 0 ; i < strs.length ; i++){
            char[] charArray = strs[i].toCharArray() ; 
            Arrays.sort(charArray) ; 
            String sb = new String(charArray) ; 
            if(!map.containsKey(sb)){
                map.put(sb , new ArrayList<>());
            }
            map.get(sb).add(strs[i]) ; 
        }
        for(String key : map.keySet()){
            res.add(map.get(key));
        }
        return res; 
    }
}