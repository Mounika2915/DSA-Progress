class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[128];
    int[] window = new int[128];

    for (char c : t.toCharArray()) {
        need[c]++;
    }

    int needCount = 0;
    for (int i = 0; i < 128; i++) {
        if (need[i] > 0) needCount++;
    }

    int left = 0, right = 0, haveCount = 0;
    int min = Integer.MAX_VALUE, startIdx = 0;

    while (right < s.length()) {
        char c = s.charAt(right);
        window[c]++;

        if (need[c] > 0 && window[c] == need[c]) {
            haveCount++;
        }

        while (haveCount == needCount) {
            if (right - left + 1 < min) {
                min = right - left + 1;
                startIdx = left;
            }

            char leftChar = s.charAt(left);
            window[leftChar]--;
            if (need[leftChar] > 0 && window[leftChar] < need[leftChar]) {
                haveCount--;
            }
            left++;
        }

        right++;
    }

    return min == Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx + min);


    }
}