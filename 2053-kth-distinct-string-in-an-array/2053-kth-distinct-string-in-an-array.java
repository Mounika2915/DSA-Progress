class Solution {
    public String kthDistinct(String[] arr, int k) {
        return Arrays.stream(arr)
        .collect(Collectors.groupingBy(s -> s ,LinkedHashMap::new, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(e -> e.getValue() == 1)
        .map(Map.Entry::getKey)
        .skip(k-1)
        .findFirst()
        .orElse("");
    }
}