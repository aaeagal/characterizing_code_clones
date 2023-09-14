
public class LongestSubstringLength {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int maxLength = 0;
        int start = 0;
        int end = 0;
        boolean[] visited = new boolean[128];
        
        while (end < s.length()) {
            char c = s.charAt(end);
            if (visited[c]) {
                maxLength = Math.max(maxLength, end - start);
                while (start < end && s.charAt(start) != c) {
                    visited[s.charAt(start)] = false;
                    start++;
                }
                start++;
            } else {
                visited[c] = true;
            }
            end++;
        }
        
        maxLength = Math.max(maxLength, end - start);
        return maxLength;
    }
}


import java.util.HashMap;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int left = 0;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            
            map.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s)); // Output: 3
    }
}


public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256];

            for (int j = i; j < n; j++) {
                if (visited[s.charAt(j)])
                    break;

                visited[s.charAt(j)] = true;
                maxLength = Math.max(maxLength, j - i + 1);
            }

            visited[s.charAt(i)] = false;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring(s));
    }
}


public class LongestSubstring {
    public static int findLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        int end = 0;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        
        while (start < n && end < n) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end++));
                maxLength = Math.max(maxLength, end - start);
            } else {
                set.remove(s.charAt(start++));
            }
        }
        return maxLength;
    }
    
    public static void main(String[] args) {
        String s = "abcabcbb";
        int longestSubstringLength = findLongestSubstring(s);
        
        System.out.println("Length of longest substring without repeating characters: " + longestSubstringLength);
    }
}


import java.util.*;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s)); // Output: 3
    }
}


public class LongestSubstringLength {
   public static int lengthOfLongestSubstring(String s) {
      int maxLength = 0;
      int left = 0;
      int right = 0;
      int[] charCount = new int[256];
      
      while (right < s.length()) {
         if (charCount[s.charAt(right)] == 0) {
            charCount[s.charAt(right)] = 1;
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
         } else {
            charCount[s.charAt(left)] = 0;
            left++;
         }
      }
      
      return maxLength;
   }
}


import java.util.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int maxLen = 0;
        int start = 0;
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
}


public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int[] index = new int[128];
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}


import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int i = 0, j = 0;
        HashSet<Character> set = new HashSet<>();

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

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        String s1 = "abcabcbb";
        int length1 = solution.lengthOfLongestSubstring(s1);
        System.out.println("Length of the longest substring without repeating characters: " + length1);

        String s2 = "bbbb";
        int length2 = solution.lengthOfLongestSubstring(s2);
        System.out.println("Length of the longest substring without repeating characters: " + length2);

        String s3 = "pwwkew";
        int length3 = solution.lengthOfLongestSubstring(s3);
        System.out.println("Length of the longest substring without repeating characters: " + length3);
    }
}


import java.util.HashSet;

public class Main {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
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
    
    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}


public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] index = new int[128];
        
        for (int i = 0, j = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            maxLength = Math.max(maxLength, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int length = lengthOfLongestSubstring(input);
        System.out.println("Length of longest substring without repeating characters: " + length);
    }
}


public class Main {
    public static int lengthOfLongestSubstring(String s) {
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

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
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


public class LongestSubstring {
    
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int[] freq = new int[256];
        
        while (right < s.length()) {
            if (freq[s.charAt(right)] == 0) {
                freq[s.charAt(right)]++;
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                freq[s.charAt(left)]--;
                left++;
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}


public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] characters = new int[128];
        int maxLength = 0, start = 0;
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            start = Math.max(start, characters[c]);
            maxLength = Math.max(maxLength, end - start + 1);
            characters[c] = end + 1;
        }
        return maxLength;
    }
}


public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int[] visited = new int[256];
        int maxLen = 0, left = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (visited[s.charAt(i)] == 0 || visited[s.charAt(i)] < left) {
                maxLen = Math.max(maxLen, i - left + 1);
            } else {
                left = visited[s.charAt(i)];
            }
            
            visited[s.charAt(i)] = i + 1;
        }
        
        return maxLen;
    }
     
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of the longest substring: " + lengthOfLongestSubstring(s));
    }
}




public class LongestSubstringLength {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int result = 0;
        int[] index = new int[128];

        for (int i = 0, j = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            result = Math.max(result, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Length of the longest substring without repeating characters: " + lengthOfLongestSubstring(input));
    }
}



public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] visited = new int[256];
        int maxLength = 0;
        int start = 0;

        for (int i = 0; i < 256; i++) {
            visited[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            int currentChar = s.charAt(i);
            if (visited[currentChar] >= start) {
                start = visited[currentChar] + 1;
            }
            visited[currentChar] = i;
            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + length);
    }
}


public class LongestSubstringLength {
    public static int longestSubstringLength(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);
        int i = 0;
        for (int j = 0; j < n; j++) {
            i = Math.max(i, lastIndex[s.charAt(j)] + 1);
            maxLength = Math.max(maxLength, j - i + 1);
            lastIndex[s.charAt(j)] = j;
        }
        return maxLength;
    }
}


public class LongestSubstringLength {
    public static int findLongestSubstringLength(String s) {
        int[] chars = new int[128];
        int left = 0, right = 0;
        int maxLength = 0;
        
        while (right < s.length()) {
            char c = s.charAt(right);
            chars[c]++;
            
            while (chars[c] > 1) {
                char leftChar = s.charAt(left);
                chars[leftChar]--;
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(findLongestSubstringLength(s));
    }
}

