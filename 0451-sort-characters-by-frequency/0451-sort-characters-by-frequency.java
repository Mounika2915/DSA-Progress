class Solution {
    public String frequencySort(String s) {
        Map<Character , Long> map = s.chars()
        .mapToObj(c -> (char)c)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (e1 , e2) -> e1, LinkedHashMap::new
        ));
        

        StringBuilder sb = new StringBuilder() ; 
        for(char c : map.keySet()){
            char key = c ; 
            long value = map.get(c) ; 
            for(long i = 0 ; i < value ; i++){
                sb.append(key) ; 
            }
        }
        return sb.toString() ;
        
    }
}