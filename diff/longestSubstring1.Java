
import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        int end = 0;
        HashSet<Character> set = new HashSet<>();

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
}



import java.util.HashMap;
import java.util.Map;

public class LongestSubstringLength {

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0; // start index of current substring
        Map<Character, Integer> charToIndexMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            
            if (charToIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charToIndexMap.get(currentChar) + 1);
            }

            charToIndexMap.put(currentChar, end);

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input1 = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(input1));

        String input2 = "bbbbb";
        System.out.println(lengthOfLongestSubstring(input2));

        String input3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(input3));
    }
}



import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0, j = 0, maxLength = 0;
        Set<Character> set = new HashSet<>();

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return maxLength;
    }
}


public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int result = 0;
        int[] lastIndex = new int[128];

        for (int i = 0, j = 0; j < n; j++) {
            i = Math.max(lastIndex[s.charAt(j)], i);
            result = Math.max(result, j - i + 1);
            lastIndex[s.charAt(j)] = j + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + length);
    }
}


public class LongestSubstring {
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
}


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


public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        int end = 0;
        int[] charCount = new int[128];

        while (end < s.length()) {
            char currChar = s.charAt(end);
            charCount[currChar]++;

            while (charCount[currChar] > 1) {
                char startChar = s.charAt(start);
                charCount[startChar]--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }

        return maxLength;
    }
}


public int lengthOfLongestSubstring(String s) {
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


public static int lengthOfLongestSubstring(String s) {
    if (s == null || s.length() == 0) {
        return 0;
    }
    
    int maxLen = 0;
    int left = 0;
    int right = 0;
    int[] charCounts = new int[128];
    
    while (right < s.length()) {
        char rightChar = s.charAt(right);
        charCounts[rightChar]++;
        
        while (charCounts[rightChar] > 1) {
            char leftChar = s.charAt(left);
            charCounts[leftChar]--;
            left++;
        }
        
        maxLen = Math.max(maxLen, right - left + 1);
        right++;
    }
    
    return maxLen;
}


public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int maxLength = 0;
        int start = 0;
        int end = 0;
        int[] index = new int[128]; // Assuming ASCII characters
        
        while (end < s.length()) {
            char c = s.charAt(end);
            if (index[c] > start) {
                start = index[c];
            }
            maxLength = Math.max(maxLength, end - start + 1);
            index[c] = end + 1;
            end++;
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}


public class LongestSubstringWithoutRepeatingCharacters {
    
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] lastIndex = new int[128];
        int i = 0;
        
        for (int j = 0; j < n; j++) {
            i = Math.max(lastIndex[s.charAt(j)], i);
            maxLength = Math.max(maxLength, j - i + 1);
            lastIndex[s.charAt(j)] = j + 1;
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of the longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }
}


import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int maxLength = 0;
        int start = 0;
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (map.containsKey(c)) {
                start = Math.max(map.get(c) + 1, start);
            }
            
            maxLength = Math.max(maxLength, i - start + 1);
            
            map.put(c, i);
        }
        
        return maxLength;
    }
}


public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] visited = new int[256];
        Arrays.fill(visited, -1);
        int maxLength = 0;
        int start = 0;
        
        for (int i = 0; i < n; i++) {
            if (visited[s.charAt(i)] != -1) {
                start = Math.max(start, visited[s.charAt(i)] + 1);
            }
            visited[s.charAt(i)] = i;
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


public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int maxLength = 0;
        int start = 0;
        int end = 0;
        Set<Character> uniqueChars = new HashSet<>();
        
        while (end < s.length()) {
            if (!uniqueChars.contains(s.charAt(end))) {
                uniqueChars.add(s.charAt(end));
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            } else {
                uniqueChars.remove(s.charAt(start));
                start++;
            }
        }
        
        return maxLength;
    }
}


import java.util.*;

public class Main {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        Set<Character> set = new HashSet<>();
        int maxLength = 1;
        int left = 0;
        int right = 0;
        
        while (right < s.length()) {
            char c = s.charAt(right);
            
            if (set.contains(c)) {
                while (set.contains(c)) {
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            
            set.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}


public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        
        int[] charCount = new int[128];
        
        while (right < s.length()) {
            char c = s.charAt(right);
            charCount[c]++;
            
            while (charCount[c] > 1) {
                charCount[s.charAt(left)]--;
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println(length);
    }
}


public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int maxLength = 0;
        int start = 0;
        int[] charIndex = new int[128];
        
        for (int i = 0; i < charIndex.length; i++) {
            charIndex[i] = -1;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (charIndex[c] >= start) {
                start = charIndex[c] + 1;
            }
            
            charIndex[c] = i;
            maxLength = Math.max(maxLength, i - start + 1);
        }
        
        return maxLength;
    }
}


public class LongestSubstring {
    public static int findLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        int[] visited = new int[256];
        Arrays.fill(visited, -1);
        for (int end = 0; end < n; end++) {
            char c = s.charAt(end);
            if (visited[c] != -1) {
                start = Math.max(start, visited[c] + 1);
            }
            maxLength = Math.max(maxLength, end - start + 1);
            visited[c] = end;
        }
        return maxLength;
    }
}


public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] visited = new int[128];

        int length = 0;
        int start = 0;
        for (int end = 0; end < n; end++) {
            char c = s.charAt(end);
            start = Math.max(start, visited[c]);
            length = Math.max(length, end - start + 1);
            visited[c] = end + 1;
        }
        return length;
    }
}


import java.util.*;

public class LongestSubstring {
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

    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring: " + length);
    }
}


public class LongestSubstring {

    public static int findLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] lastIndex = new int[128];
        for(int i=0, j=0; j<n; j++) {
            i = Math.max(lastIndex[s.charAt(j)], i);
            maxLength = Math.max(maxLength, j-i+1);
            lastIndex[s.charAt(j)] = j+1;
        }
        return maxLength;
    }
    
    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = findLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + length);
    }
}



import java.util.HashMap;

public class LongestSubstringLength {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int maxLen = 0;
        int start = 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }
            
            map.put(c, i);
            maxLen = Math.max(maxLen, i - start + 1);
        }
        
        return maxLen;
    }
    
    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}



import java.util.HashSet;

public class LongestSubstringLength {
    public static int longestSubstringLength(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0, left = 0, right = 0;
        
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, set.size());
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        
        return maxLength;
    }
}


public class LongestSubstringLength {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] lastIndex = new int[256];
        
        for (int i = 0, j = 0; j < n; j++) {
            i = Math.max(lastIndex[s.charAt(j)], i);
            maxLength = Math.max(maxLength, j - i + 1);
            lastIndex[s.charAt(j)] = j + 1;
        }
        
        return maxLength;
    }
}



public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int start = 0;
        int end = 0;
        int n = s.length();
        Set<Character> uniqueChars = new HashSet<>();

        while (start < n && end < n) {
            if (!uniqueChars.contains(s.charAt(end))) {
                uniqueChars.add(s.charAt(end));
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            } else {
                uniqueChars.remove(s.charAt(start));
                start++;
            }
        }

        return maxLength;
    }
}



import java.util.*;

public class LongestSubstring {
    
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> uniqueChars = new HashSet<>();
        int maxLength = 0, i = 0, j = 0;
        
        while (i < n && j < n) {
            if (!uniqueChars.contains(s.charAt(j))) {
                uniqueChars.add(s.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
            } else {
                uniqueChars.remove(s.charAt(i++));
            }
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        String str = "abcabcbb";
        int length = lengthOfLongestSubstring(str);
        
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}



public class LongestSubstring {
   public int lengthOfLongestSubstring(String s) {
       int n = s.length();
       int maxLength = 0;
       int start = 0;
       int end = 0;
       Set<Character> charSet = new HashSet<>();
       
       while (end < n) {
           if (!charSet.contains(s.charAt(end))) {
               charSet.add(s.charAt(end++));
               maxLength = Math.max(maxLength, end - start);
           } else {
               charSet.remove(s.charAt(start++));
           }
       }
       
       return maxLength;
   }
}



public class LongestSubstring {
   public static int lengthOfLongestSubstring(String s) {
      int maxLength = 0;
      int left = 0;
      int right = 0;
      int n = s.length();
      boolean[] visited = new boolean[256];

      while (right < n) {
         if (visited[s.charAt(right)]) {
            maxLength = Math.max(maxLength, right - left);
            while (s.charAt(left) != s.charAt(right)) {
               visited[s.charAt(left)] = false;
               left++;
            }
            left++;
         } else {
            visited[s.charAt(right)] = true;
         }
         right++;
      }

      maxLength = Math.max(maxLength, right - left);
      return maxLength;
   }

   public static void main(String[] args) {
      String s = "abcabcbb";
      int length = lengthOfLongestSubstring(s);
      System.out.println("Length of longest substring without repeating characters: " + length);
   }
}


public int lengthOfLongestSubstring(String s) {
    if (s == null || s.length() == 0) {
        return 0;
    }
    int maxLength = 0;
    int start = 0;
    int end = 0;
    Set<Character> seen = new HashSet<>();
    
    while (end < s.length()) {
        if (seen.contains(s.charAt(end))) {
            seen.remove(s.charAt(start++));
        } else {
            seen.add(s.charAt(end++));
            maxLength = Math.max(maxLength, end - start);
        }
    }
    
    return maxLength;
}


public class LongestSubstringLength {
    public static int findLengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        int end = 0;
        int n = s.length();
        Set<Character> uniqueCharacters = new HashSet<>();

        while (end < n) {
            if (uniqueCharacters.contains(s.charAt(end))) {
                uniqueCharacters.remove(s.charAt(start));
                start++;
            } else {
                uniqueCharacters.add(s.charAt(end));
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = findLengthOfLongestSubstring(s);
        System.out.println(length);
    }
}


public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int maxLength = 0;
        int start = 0;

        int[] charCount = new int[128];

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            charCount[c]++;

            while (charCount[c] > 1) {
                char startChar = s.charAt(start);
                charCount[startChar]--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + length);
    }
}


public class LongestSubstring {
   public static int lengthOfLongestSubstring(String s) {
      int n = s.length();
      int i = 0, j = 0;
      Set<Character> set = new HashSet<>();
      int ans = 0;
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
}



import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        int maxLength = 0;
        int start = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            if (map.containsKey(currentChar)) {
                start = Math.max(start, map.get(currentChar) + 1);
            }
            map.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(obj.lengthOfLongestSubstring("abcabcbb")); // Output: 3
        System.out.println(obj.lengthOfLongestSubstring("bbbbb")); // Output: 1
        System.out.println(obj.lengthOfLongestSubstring("pwwkew")); // Output: 3
        System.out.println(obj.lengthOfLongestSubstring("")); // Output: 0
    }
}



import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        int end = 0;
        HashSet<Character> set = new HashSet<>();
        
        while (end < s.length()) {
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
        int length = lengthOfLongestSubstring(s);
        System.out.println(length);
    }
}


public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int[] index = new int[128]; // Assume ASCII characters

        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}


public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int n = s.length();
        int maxLen = 0;
        int start = 0;
        int end = 0;
        
        Set<Character> set = new HashSet<>();
        
        while (end < n) {
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
}


public class LongestSubstring {
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
        System.out.println("Length of the longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }
}


public class LongestSubstringLength {
    public static int lengthOfLongestSubstring(String s) {
        int[] charArray = new int[128];
        int start = 0;
        int end = 0;
        int maxLength = 0;
        
        while (end < s.length()) {
            char c = s.charAt(end);
            charArray[c]++;
            
            while (charArray[c] > 1) {
                charArray[s.charAt(start)]--;
                start++;
            }
            
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        
        return maxLength;
    }
}



public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int maxLength = 0;
        int start = 0;
        int end = 0;
        int[] charCount = new int[128];
        
        while (end < s.length()) {
            char currentChar = s.charAt(end);
            charCount[currentChar]++;
            
            while (charCount[currentChar] > 1) {
                charCount[s.charAt(start)]--;
                start++;
            }
            
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        
        return maxLength;
    }
}


public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int result = 0;
        int[] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);
        int i = 0;
        for (int j = 0; j < n; j++) {
            i = Math.max(i, lastIndex[s.charAt(j)] + 1);
            result = Math.max(result, j - i + 1);
            lastIndex[s.charAt(j)] = j;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int longestSubstringLength = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + longestSubstringLength);
    }
}


import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0)
            return 0;

        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }
            maxLength = Math.max(maxLength, i - start + 1);
            map.put(c, i);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}


public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        int[] charMap = new int[256];
        int maxLen = 0, start = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charMap[c] > start) {
                start = charMap[c];
            }
            charMap[c] = i + 1;
            maxLen = Math.max(maxLen, i - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}


public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int i = 0;
        int j = 0;
        int max = 0;
        int n = s.length();
        boolean[] visited = new boolean[128];
        
        while (j < n) {
            if (visited[s.charAt(j)]) {
                max = Math.max(max, j - i);
                while (s.charAt(i) != s.charAt(j)) {
                    visited[s.charAt(i)] = false;
                    i++;
                }
                i++;
                j++;
            } else {
                visited[s.charAt(j)] = true;
                j++;
            }
        }
        
        max = Math.max(max, n - i);
        
        return max;
    }
    
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s)); // Output: 3
    }
}


import java.util.HashMap;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>(); 
        int i = 0; 
        for (int j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}


public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int maxLength = 0;
        int[] charIndex = new int[256];
        Arrays.fill(charIndex, -1);
        int start = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = charIndex[c];
            if (index != -1 && index >= start) {
                start = index + 1;
            }
            
            charIndex[c] = i;
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


public class LongestSubstring {
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
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring: " + length);
    }
}


public class LongestSubstring {

   public static int lengthOfLongestSubstring(String s) {
      int n = s.length();
      int result = 0;
     
      for (int i = 0; i < n; i++) {
         boolean[] visited = new boolean[256];
      
         for (int j = i; j < n; j++) {
            if (visited[s.charAt(j)]) {
               break;
            } 
            else {
               result = Math.max(result, j - i + 1);
               visited[s.charAt(j)] = true;
            }
         }
         visited[s.charAt(i)] = false;
      }
     
      return result;
   }

   public static void main(String[] args) {
      String s = "abcabcbb";
      System.out.println("Length of the longest substring without repeating characters: " + lengthOfLongestSubstring(s));
   }
}


import java.util.*;

public class LongestSubstringLength {
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
    
    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + length);
    }
}



import java.util.HashMap;
import java.util.Map;

public class LongestSubstringLength {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        
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
        System.out.println(lengthOfLongestSubstring(s));
    }
}



public class LongestSubstringLength {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int startIndex = 0;
        Map<Character, Integer> charMap = new HashMap<>();

        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
            char currentChar = s.charAt(endIndex);
            if (charMap.containsKey(currentChar)) {
                startIndex = Math.max(startIndex, charMap.get(currentChar) + 1);
            }
            charMap.put(currentChar, endIndex);
            maxLength = Math.max(maxLength, endIndex - startIndex + 1);
        }
        
        return maxLength;
    }
}

