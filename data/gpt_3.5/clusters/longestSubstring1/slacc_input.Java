
import java.util.*;

public class LongestSubstringLength {
    public int length1(String s) {
        if (s == null || s.length() == 0) { // 1
            return 0;
        }

        int maxLength = 0; // 2
        int start = 0; // 3
        int end = 0; // 4
        boolean[] visited = new boolean[128]; // 5

        while (end < s.length()) { // 6
            char c = s.charAt(end); // 7
            if (visited[c]) { // 8
                maxLength = Math.max(maxLength, end - start); // 9
                while (start < end && s.charAt(start) != c) { // 10
                    visited[s.charAt(start)] = false; // 11
                    start++; // 12
                }
                start++; // 13
            } else { // 14
                visited[c] = true; // 15
            }
            end++; // 16
        }

        maxLength = Math.max(maxLength, end - start); // 17
        return maxLength;
    }


    public static int length2(String s) {
        if (s == null || s.length() == 0) { // 18
            return 0;
        }

        int left = 0; // 19
        int maxLength = 0; // 20
        HashMap<Character, Integer> map = new HashMap<>(); // 21

        for (int right = 0; right < s.length(); right++) { // 22
            char c = s.charAt(right); // 23

            if (map.containsKey(c)) { // 24
                left = Math.max(left, map.get(c) + 1); // 25
            }

            map.put(c, right); // 26
            maxLength = Math.max(maxLength, right - left + 1); // 27
        }

        return maxLength;
    }



    public static int length3(String s) {
        int n = s.length(); // 28
        int maxLength = 0; // 29

        for (int i = 0; i < n; i++) { // 30
            boolean[] visited = new boolean[256]; // 31

            for (int j = i; j < n; j++) { // 32
                if (visited[s.charAt(j)]) // 33
                    break; // 34

                visited[s.charAt(j)] = true; // 35
                maxLength = Math.max(maxLength, j - i + 1); // 36
            }

            visited[s.charAt(i)] = false; // 37
        }

        return maxLength;
    }




    public static int length4(String s) {
        int maxLength = 0; // 38
        int start = 0; // 39
        int end = 0; // 40
        int n = s.length(); // 41
        Set<Character> set = new HashSet<>(); // 42

        while (start < n && end < n) { // 43
            if (!set.contains(s.charAt(end))) { // 44
                set.add(s.charAt(end++)); // 45
                maxLength = Math.max(maxLength, end - start); // 46
            } else { // 47
                set.remove(s.charAt(start++)); // 48
            }
        }
        return maxLength;
    }


    public static int length5(String s) {
        int n = s.length(); // 49
        int ans = 0; // 50
        Map<Character, Integer> map = new HashMap<>(); // 51
        for (int j = 0, i = 0; j < n; j++) { // 52
            if (map.containsKey(s.charAt(j))) { // 53
                i = Math.max(map.get(s.charAt(j)), i); // 54
            }
            ans = Math.max(ans, j - i + 1); // 55
            map.put(s.charAt(j), j + 1); // 56
        }
        return ans;
    }


   public static int length6(String s) {
      int maxLength = 0; // 57
      int left = 0; // 58
      int right = 0; // 59
      int[] charCount = new int[256]; // 60

      while (right < s.length()) { // 61
         if (charCount[s.charAt(right)] == 0) { // 62
            charCount[s.charAt(right)] = 1; // 63
            maxLength = Math.max(maxLength, right - left + 1); // 64
            right++; // 65
         } else { // 66
            charCount[s.charAt(left)] = 0; // 67
            left++; // 68
         }
      }

      return maxLength;
   }



    public int length7(String s) {
        if (s == null || s.length() == 0) { // 69
            return 0;
        }

        int maxLen = 0; // 70
        int start = 0; // 71
        Map<Character, Integer> map = new HashMap<>(); // 72

        for (int end = 0; end < s.length(); end++) { // 73
            char ch = s.charAt(end); // 74
            if (map.containsKey(ch)) { // 75
                start = Math.max(start, map.get(ch) + 1); // 76
            }
            map.put(ch, end); // 77
            maxLen = Math.max(maxLen, end - start + 1); // 78
        }

        return maxLen;
    }



    public int length8(String s) {
        int n = s.length(); // 79
        int ans = 0; // 80
        int[] index = new int[128]; // 81
        for (int j = 0, i = 0; j < n; j++) { // 82
            i = Math.max(index[s.charAt(j)], i); // 83
            ans = Math.max(ans, j - i + 1); // 84
            index[s.charAt(j)] = j + 1; // 85
        }
        return ans;
    }



    public int length9(String s) {
        int n = s.length(), ans = 0; // 86
        int i = 0, j = 0; // 87
        HashSet<Character> set = new HashSet<>(); // 88

        while (i < n && j < n) { // 89
            if (!set.contains(s.charAt(j))) { // 90
                set.add(s.charAt(j++)); // 91
                ans = Math.max(ans, j - i); // 92
            } else { // 93
                set.remove(s.charAt(i++)); // 94
            }
        }
        return ans;
    }



    public static int length10(String s) {
        int n = s.length(); // 95
        HashSet<Character> set = new HashSet<>(); // 96
        int ans = 0, i = 0, j = 0; // 97
        while (i < n && j < n) { // 98
            if (!set.contains(s.charAt(j))) { // 99
                set.add(s.charAt(j++)); // 100
                ans = Math.max(ans, j - i); // 101
            } else { // 102
                set.remove(s.charAt(i++)); // 103
            }
        }
        return ans;
    }



    public static int length11(String s) {
        int n = s.length(); // 104
        int maxLength = 0; // 105
        int[] index = new int[128]; // 106

        for (int i = 0, j = 0; j < n; j++) { // 107
            i = Math.max(index[s.charAt(j)], i); // 108
            maxLength = Math.max(maxLength, j - i + 1); // 109
            index[s.charAt(j)] = j + 1; // 110
        }

        return maxLength;
    }


    public static int length12(String s) {
        int n = s.length(); // 111
        int ans = 0; // 112
        int[] index = new int[128]; // 113

        for (int i = 0, j = 0; j < n; j++) { // 114
            i = Math.max(index[s.charAt(j)], i); // 115
            ans = Math.max(ans, j - i + 1); // 116
            index[s.charAt(j)] = j + 1; // 117
        }

        return ans;
    }




    public int length13(String s) {
        int n = s.length(); // 118
        Set<Character> set = new HashSet<>(); // 119
        int ans = 0, i = 0, j = 0; // 120
        while (i < n && j < n) { // 121
            if (!set.contains(s.charAt(j))) { // 122
                set.add(s.charAt(j++)); // 123
                ans = Math.max(ans, j - i); // 124
            } else { // 125
                set.remove(s.charAt(i++)); // 126
            }
        }
        return ans;
    }



    public static int length14(String s) {
        int maxLength = 0; // 127
        int left = 0; // 128
        int right = 0; // 129
        int[] freq = new int[256]; // 130

        while (right < s.length()) { // 131
            if (freq[s.charAt(right)] == 0) { // 132
                freq[s.charAt(right)]++; // 133
                right++; // 134
                maxLength = Math.max(maxLength, right - left); // 135
            } else { // 136
                freq[s.charAt(left)]--; // 137
                left++; // 138
            }
        }

        return maxLength;
    }


    public int length15(String s) {
        int[] characters = new int[128]; // 139
        int maxLength = 0, start = 0; // 140
        for (int end = 0; end < s.length(); end++) { // 141
            char c = s.charAt(end); // 142
            start = Math.max(start, characters[c]); // 143
            maxLength = Math.max(maxLength, end - start + 1); // 144
            characters[c] = end + 1; // 145
        }
        return maxLength;
    }



    public static int length16(String s) {
        int[] visited = new int[256]; // 146
        int maxLen = 0, left = 0; // 147

        for (int i = 0; i < s.length(); i++) { // 148
            if (visited[s.charAt(i)] == 0 || visited[s.charAt(i)] < left) { // 149
                maxLen = Math.max(maxLen, i - left + 1); // 150
            } else { // 151
                left = visited[s.charAt(i)]; // 152
            }

            visited[s.charAt(i)] = i + 1; // 153
        }

        return maxLen;
    }


    public static int length17(String s) {
        int n = s.length(); // 154
        int result = 0; // 155
        int[] index = new int[128]; // 156

        for (int i = 0, j = 0; j < n; j++) { // 157
            i = Math.max(index[s.charAt(j)], i); // 158
            result = Math.max(result, j - i + 1); // 159
            index[s.charAt(j)] = j + 1; // 160
        }

        return result;
    }



    public static int length18(String s) {
        int n = s.length(); // 161
        int[] visited = new int[256]; // 162
        int maxLength = 0; // 163
        int start = 0; // 164

        for (int i = 0; i < 256; i++) { // 165
            visited[i] = -1; // 166
        }

        for (int i = 0; i < n; i++) { // 167
            int currentChar = s.charAt(i); // 168
            if (visited[currentChar] >= start) { // 169
                start = visited[currentChar] + 1; // 170
            }
            visited[currentChar] = i; // 171
            maxLength = Math.max(maxLength, i - start + 1); // 172
        }

        return maxLength;
    }


    public static int length19(String s) {
        int n = s.length(); // 173
        int maxLength = 0; // 174
        int[] lastIndex = new int[256]; // 175
        Arrays.fill(lastIndex, -1); // 176
        int i = 0; // 177
        for (int j = 0; j < n; j++) { // 178
            i = Math.max(i, lastIndex[s.charAt(j)] + 1); // 179
            maxLength = Math.max(maxLength, j - i + 1); // 180
            lastIndex[s.charAt(j)] = j; // 181
        }
        return maxLength;
    }

    public static int length20(String s) {
        int[] chars = new int[128]; // 182
        int left = 0, right = 0; // 183
        int maxLength = 0; // 184

        while (right < s.length()) { // 185
            char c = s.charAt(right); // 186
            chars[c]++; // 187

            while (chars[c] > 1) { // 188
                char leftChar = s.charAt(left); // 189
                chars[leftChar]--; // 190
                left++; // 191
            }

            maxLength = Math.max(maxLength, right - left + 1); // 192
            right++; // 193
        }

        return maxLength;
    }

}

