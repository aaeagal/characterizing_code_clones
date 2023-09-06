public int longestSubstringWithoutRepeatingCharacters(String s) {
    int maxLength = 0;
    int start = 0;
    int end = 0;
    Set<Character> set = new HashSet<>();
    
    while (end < s.length()) {
        if (!set.contains(s.charAt(end))) {
            set.add(s.charAt(end));
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        } else {
            set.remove(s.charAt(start));
            start++;
        }
    }
    
    return maxLength;
}

public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    Set<Character> set = new HashSet<>();
    int ans = 0, i = 0, j = 0;
    while (i < n && j < n) {
        if (!set.contains(s.charAt(j))) {
            set.add(s.charAt(j++));
            ans = Math.max(ans, j - i);
        } else {
            set.remove(s.charAt(i++));
        }
    }
    return ans;
}

public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int[] visited = new int[128];
    int maxLength = 0;
    int left = 0;
    for (int right = 0; right < n; right++) {
        char c = s.charAt(right);
        if (visited[c] > left) {
            left = visited[c];
        }
        visited[c] = right + 1;
        maxLength = Math.max(maxLength, right - left + 1);
    }
    return maxLength;
}

public int lengthOfLongestSubstring(String s) {
    int result = 0;
    int[] lastIndex = new int[128];
    Arrays.fill(lastIndex, -1);
    int i = 0;
    
    for (int j = 0; j < s.length(); j++) {
        i = Math.max(i, lastIndex[s.charAt(j)] + 1);
        result = Math.max(result, j - i + 1);
        lastIndex[s.charAt(j)] = j;
    }
    
    return result;
}

public int lengthOfLongestSubstring(String s) {
    int length = 0;
    int startIndex = 0;
    int[] seen = new int[128];
    
    for (int endIndex = 0; endIndex < s.length(); endIndex++) {
        char c = s.charAt(endIndex);
        startIndex = Math.max(startIndex, seen[c]);
        length = Math.max(length, endIndex - startIndex + 1);
        seen[c] = endIndex + 1;
    }
    
    return length;
}

public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int i = 0, j = 0;
    int maxLength = 0;
    Set<Character> set = new HashSet<>();

    while (i < n && j < n) {
        if (!set.contains(s.charAt(j))) {
            set.add(s.charAt(j));
            j++;
            maxLength = Math.max(maxLength, j - i);
        } else {
            set.remove(s.charAt(i));
            i++;
        }
    }

    return maxLength;
}

public int lengthOfLongestSubstring(String s) {
    int maxLen = 0;
    int start = 0;
    int end = 0;
    Set<Character> set = new HashSet<>();

    while (end < s.length()) {
        if (!set.contains(s.charAt(end))) {
            set.add(s.charAt(end));
            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        } else {
            set.remove(s.charAt(start));
            start++;
        }
    }

    return maxLen;
}

public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int maxLength = 0;
    int[] charIndex = new int[128];
    int startIndex = 0;
    
    for(int i = 0; i < n; i++) {
        char c = s.charAt(i);
        startIndex = Math.max(startIndex, charIndex[c] + 1);
        maxLength = Math.max(maxLength, i - startIndex + 1);
        charIndex[c] = i;
    }
    
    return maxLength;
}

public int lengthOfLongestSubstring(String s) {
    int maxLength = 0;
    int start = 0;
    int end = 0;
    Set<Character> charSet = new HashSet<>();
    
    while (end < s.length()) {
        if (!charSet.contains(s.charAt(end))) {
            charSet.add(s.charAt(end));
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        } else {
            charSet.remove(s.charAt(start));
            start++;
        }
    }
    
    return maxLength;
}

public static int lengthOfLongestSubstring(String s) {
   int n = s.length();
   Set<Character> set = new HashSet<>();
   int ans = 0, i = 0, j = 0;
   while (i < n && j < n) {
      if (!set.contains(s.charAt(j))){
          set.add(s.charAt(j++));
          ans = Math.max(ans, j - i);
      }
      else {
          set.remove(s.charAt(i++));
      }
   }
   return ans;
}

public static int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int maxLength = 0;
    int[] charIndex = new int[128];
    
    for (int i = 0, j = 0; j < n; j++) {
        i = Math.max(charIndex[s.charAt(j)], i);
        maxLength = Math.max(maxLength, j - i + 1);
        charIndex[s.charAt(j)] = j + 1;
    }
    
    return maxLength;
}

public int lengthOfLongestSubstring(String s) {
    int maxLen = 0;
    int n = s.length();
    int[] charIndex = new int[128];
    
    for (int i = 0, j = 0; j < n; j++) {
        i = Math.max(charIndex[s.charAt(j)], i);
        maxLen = Math.max(maxLen, j - i + 1);
        charIndex[s.charAt(j)] = j + 1;
    }
    
    return maxLen;
}

public int lengthOfLongestSubstring(String s) {
    int n = s.length(), longest = 0;
    int[] map = new int[128];

    for (int i = 0, j = 0; i < n; i++) {
        j = Math.max(map[s.charAt(i)], j);
        longest = Math.max(longest, i - j + 1);
        map[s.charAt(i)] = i + 1;
    }

    return longest;
}

public int lengthOfLongestSubstring(String s) {
    if (s == null || s.length() == 0) {
        return 0;
    }

    int maxLen = 0;
    int i = 0;
    int j = 0;
    Set<Character> set = new HashSet<>();

    while (j < s.length()) {
        if (!set.contains(s.charAt(j))) {
            set.add(s.charAt(j));
            maxLen = Math.max(maxLen, j - i + 1);
            j++;
        } else {
            set.remove(s.charAt(i));
            i++;
        }
    }

    return maxLen;
}

public static int lengthOfLongestSubstring(String s) {
    if (s == null || s.length() == 0) {
        return 0;
    }
    
    int maxLen = 0, start = 0;
    Map<Character, Integer> map = new HashMap<>();
    
    for (int end = 0; end < s.length(); end++) {
        char ch = s.charAt(end);
        
        if (map.containsKey(ch)) {
            start = Math.max(start, map.get(ch) + 1);
        }
        
        map.put(ch, end);
        maxLen = Math.max(maxLen, end - start + 1);
    }
    
    return maxLen;
}

public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int ans = 0;
    int[] index = new int[128]; // ASCII value range

    for (int j = 0, i = 0; j < n; j++) {
        i = Math.max(index[s.charAt(j)], i);
        ans = Math.max(ans, j - i + 1);
        index[s.charAt(j)] = j + 1;
    }

    return ans;
}

public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int ans = 0;
    int[] index = new int[128];

    for (int i = 0, j = 0; j < n; j++) {
        i = Math.max(index[s.charAt(j)], i);
        ans = Math.max(ans, j - i + 1);
        index[s.charAt(j)] = j + 1;
    }

    return ans;
}

public int lengthOfLongestSubstring(String s) {
    int[] charCount = new int[128];
    int maxLength = 0;
    int start = 0;
    
    for (int end = 0; end < s.length(); end++) {
        char c = s.charAt(end);
        start = Math.max(start, charCount[c]);
        maxLength = Math.max(maxLength, end - start + 1);
        charCount[c] = end + 1;
    }
    
    return maxLength;
}

public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int maxLength = 0;
    int left = 0;
    int[] lastIndex = new int[128];
    
    for (int i = 0; i < n; i++) {
        char c = s.charAt(i);
        left = Math.max(left, lastIndex[c]);
        maxLength = Math.max(maxLength, i - left + 1);
        lastIndex[c] = i + 1;
    }
    
    return maxLength;
}

public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int longest = 0;
    int[] charIndex = new int[128];
    
    for (int end = 0, start = 0; end < n; end++) {
        char c = s.charAt(end);
        start = Math.max(charIndex[c], start);
        longest = Math.max(longest, end - start + 1);
        charIndex[c] = end + 1;
    }
    
    return longest;
}

