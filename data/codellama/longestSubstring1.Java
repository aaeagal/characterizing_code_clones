
public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int max = 0;
    int[] index = new int[128];
    for (int i = 0, j = 0; i < n; i++) {
        char c = s.charAt(i);
        if (index[c] > 0) {
            j = Math.max(j, index[c]);
        }
        max = Math.max(max, i - j + 1);
        index[c] = i + 1;
    }
    return max;
}

