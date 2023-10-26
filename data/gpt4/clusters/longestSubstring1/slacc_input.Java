

public class Main {
    public int lengthOfLongestSubstring1(String s) {
        int n = s.length(), ans = 0; // 1
        int[] index = new int[128]; // 2
        for (int j = 0, i = 0; j < n; j++) { // 3
            i = Math.max(index[s.charAt(j)], i); // 4
            ans = Math.max(ans, j - i + 1); // 5
            index[s.charAt(j)] = j + 1; // 6
        }
        return ans;
    }




    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length(); // 7
        Set<Character> set = new HashSet<>(); // 8
        int ans = 0, i = 0, j = 0; // 9
        while (i < n && j < n) { // 10
            if (!set.contains(s.charAt(j))){ // 11
                set.add(s.charAt(j++)); // 12
                ans = Math.max(ans, j - i); // 13
            }
            else { // 14
                set.remove(s.charAt(i++)); // 15
            }
        }
        return ans;
    }




    public int lengthOfLongestSubstring3(String s) {
        int n = s.length(); // 16
        Set<Character> set = new HashSet<>(); // 17
        int ans = 0, i = 0, j = 0; // 18

        while (i < n && j < n) { // 19
            if (!set.contains(s.charAt(j))){ // 20
                set.add(s.charAt(j++)); // 21
                ans = Math.max(ans, j - i); // 22
            } else { // 23
                set.remove(s.charAt(i++)); // 24
            }
        }

        return ans;
    }





    public static int lengthOfLongestSubstring4(String s) {
        int n = s.length(); // 25
        HashSet<Character> set = new HashSet<>(); // 26
        int ans = 0, i = 0, j = 0; // 27
        while (i < n && j < n) { // 28
            if (!set.contains(s.charAt(j))){ // 29
                set.add(s.charAt(j++)); // 30
                ans = Math.max(ans, j - i); // 31
            }
            else { // 32
                set.remove(s.charAt(i++)); // 33
            }
        }
        return ans;
    }



    public int lengthOfLongestSubstring5(String s) {
        int n = s.length(); // 34
        Set<Character> set = new HashSet<>(); // 35
        int ans = 0, i = 0, j = 0; // 36
        while (i < n && j < n) { // 37
            // try to extend the range [i, j] // 38
            if (!set.contains(s.charAt(j))){ // 39
                set.add(s.charAt(j++)); // 40
                ans = Math.max(ans, j - i); // 41
            }
            else { // 42
                set.remove(s.charAt(i++)); // 43
            }
        }
        return ans;
    }



    public int lengthOfLongestSubstring6(String s) {
        int n = s.length(); // 44
        Set<Character> set = new HashSet<>(); // 45
        int ans = 0, i = 0, j = 0; // 46
        while (i < n && j < n) { // 47
            if (!set.contains(s.charAt(j))){ // 48
                set.add(s.charAt(j++)); // 49
                ans = Math.max(ans, j - i); // 50
            }
            else { // 51
                set.remove(s.charAt(i++)); // 52
            }
        }
        return ans;
    }



    public int lengthOfLongestSubstring7(String s) {
        if (s == null || s.length() == 0) return 0;

        HashMap<Character, Integer> map = new HashMap<>(); // 53
        int maxLength = 0; // 54
        for (int end = 0, start = 0; end < s.length(); end++) { // 55
            char currentChar = s.charAt(end); // 56
            if (map.containsKey(currentChar)) { // 57
                // if we have already seen the character, move the start position to either // 58
                // 1) position of the current character in the map +1, because we're seeing this character for the second time // 59
                // 2) or to the position of the 'start'. In case where 's' = "tmmzuxt", on second occurrence of 't', we do not // 60
                // want to move start to position of 't' + 1 which would be less than current start position // 61
                start = Math.max(map.get(currentChar) + 1, start); // 62
            }
            // even if we have seen the current character before, we put the new index of it in the map // 63
            map.put(currentChar, end); // 64
            maxLength = Math.max(maxLength, end - start + 1); // 65
        }
        return maxLength;
    }



    public int lengthOfLongestSubstring8(String s) {
        int n = s.length(); // 66
        Set<Character> set = new HashSet<>(); // 67
        int ans = 0, i = 0, j = 0; // 68
        while (i < n && j < n) { // 69
            if (!set.contains(s.charAt(j))){ // 70
                set.add(s.charAt(j++)); // 71
                ans = Math.max(ans, j - i); // 72
            }
            else { // 73
                set.remove(s.charAt(i++)); // 74
            }
        }
        return ans;
    }



    public int lengthOfLongestSubstring9(String s) {
        int n = s.length(), ans = 0; // 75
        int[] index = new int[128]; // Assuming ASCII 128 // 76

        for (int j = 0, i = 0; j < n; j++) { // 77
            i = Math.max(index[s.charAt(j)], i); // 78
            ans = Math.max(ans, j - i + 1); // 79
            index[s.charAt(j)] = j + 1; // 80
        }
        return ans;
    }




    public static int lengthOfLongestSubstring10(String s) {
        if (s == null || s.length() == 0) { // 81
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>(); // 82
        int max = 0; // 83

        for (int right = 0, left = 0; right < s.length(); right++) { // 84
            if (map.containsKey(s.charAt(right))) { // 85
                left = Math.max(left, map.get(s.charAt(right)) + 1); // 86
            }

            map.put(s.charAt(right), right); // 87
            max = Math.max(max, right - left + 1); // 88
        }

        return max;
    }


    public static int lengthOfLongestSubstring11(String s) {
        int n = s.length(); // 89
        Set<Character> set = new HashSet<>(); // 90
        int ans = 0, i = 0, j = 0; // 91
        while (i < n && j < n) { // 92
            if (!set.contains(s.charAt(j))){ // 93
                set.add(s.charAt(j++)); // 94
                ans = Math.max(ans, j - i); // 95
            }
            else { // 96
                set.remove(s.charAt(i++)); // 97
            }
        }
        return ans;
    }

    public static int lengthOfLongestSubstring12(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>(); // 98
        int max = 0; // 99
        for (int i = 0, j = 0; i < s.length(); ++i) { // 100
            if (map.containsKey(s.charAt(i))) { // 101
                j = Math.max(j, map.get(s.charAt(i)) + 1); // 102
            }
            map.put(s.charAt(i), i); // 103
            max = Math.max(max, i - j + 1); // 104
        }
        return max;
    }


    public int lengthOfLongestSubstring13(String s) {
        int n = s.length(); // 105
        Set<Character> set = new HashSet<>(); // 106
        int ans = 0, i = 0, j = 0; // 107
        while (i < n && j < n) { // 108
            // try to extend the range [i, j] // 109
            if (!set.contains(s.charAt(j))) { // 110
                set.add(s.charAt(j++)); // 111
                ans = Math.max(ans, j - i); // 112
            } else { // 113
                set.remove(s.charAt(i++)); // 114
            }
        }
        return ans;
    }


    public int lengthOfLongestSubstring14(String s) {
        int n = s.length(); // 115
        Set<Character> set = new HashSet<>(); // 116
        int ans = 0, i = 0, j = 0; // 117
        while (i < n && j < n) { // 118
            if (!set.contains(s.charAt(j))){ // 119
                set.add(s.charAt(j++)); // 120
                ans = Math.max(ans, j - i); // 121
            }
            else { // 122
                set.remove(s.charAt(i++)); // 123
            }
        }
        return ans;
    }


    public static int lengthOfLongestSubstring15(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(); // 124
        int max=0; // 125
        int left=0; // 126
        for(int i=0; i<s.length(); i++){ // 127
            if(map.containsKey(s.charAt(i))){ // 128
                left = Math.max(left, map.get(s.charAt(i))+1); // 129
            }
            map.put(s.charAt(i), i); // 130
            max = Math.max(max, i-left+1); // 131
        }
        return max;
    }

    public static int lengthOfLongestSubstring16(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(); // 132
        int max=0; // 133
        for (int i=0, j=0; i<s.length(); ++i){ // 134
            if (map.containsKey(s.charAt(i))){ // 135
                j = Math.max(j,map.get(s.charAt(i))+1); // 136
            }
            map.put(s.charAt(i),i); // 137
            max = Math.max(max,i-j+1); // 138
        }
        return max;
    }

    public static int lengthOfLongestSubstring17(String s) {
        int n = s.length(); // 139
        HashSet<Character> set = new HashSet<>(); // 140
        int ans = 0, i = 0, j = 0; // 141
        while (i < n && j < n) { // 142
            if (!set.contains(s.charAt(j))){ // 143
                set.add(s.charAt(j++)); // 144
                ans = Math.max(ans, j - i); // 145
            }
            else { // 146
                set.remove(s.charAt(i++)); // 147
            }
        }
        return ans;
    }


    public static int lengthOfLongestSubstring18(String s) {
        int n = s.length(); // 148
        Set<Character> set = new HashSet<>(); // 149
        int ans = 0, i = 0, j = 0; // 150
        while (i < n && j < n) { // 151
           if (!set.contains(s.charAt(j))){ // 152
               set.add(s.charAt(j++)); // 153
               ans = Math.max(ans, j - i); // 154
           } else { // 155
               set.remove(s.charAt(i++)); // 156
           }
        }
        return ans;
    }


    public int lengthOfLongestSubstring19(String s) {
        int n = s.length(); // 157
        Set<Character> set = new HashSet<>(); // 158
        int ans = 0, i = 0, j = 0; // 159
        while (i < n && j < n) { // 160
            if (!set.contains(s.charAt(j))){ // 161
                set.add(s.charAt(j++)); // 162
                ans = Math.max(ans, j - i); // 163
            }
            else { // 164
                set.remove(s.charAt(i++)); // 165
            }
        }
        return ans;
    }

public int lengthOfLongestSubstring20(String s) {
    if (s == null || s.length() == 0) { // 166
        return 0;
    }
    HashMap<Character, Integer> map = new HashMap<Character, Integer>(); // 167
    int max = 0; // 168
    for (int i = 0, j = 0; i < s.length(); ++i){ // 169
        if (map.containsKey(s.charAt(i))){ // 170
            j = Math.max(j, map.get(s.charAt(i)) + 1); // 171
        }
        map.put(s.charAt(i), i); // 172
        max = Math.max(max, i - j + 1); // 173
    }
    return max;
}

}
