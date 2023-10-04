public class Interleave {
    public int longestConsecutive1(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // 1
        for (int num : nums) { // 2
            set.add(num); // 3
        }

        int longestStreak = 0; // 4
        for (int num : nums) { // 5
            if (!set.contains(num - 1)) { // 6
                int currentNum = num; // 7
                int currentStreak = 1; // 8

                while (set.contains(currentNum + 1)) { // 9
                    currentNum++; // 10
                    currentStreak++; // 11
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 12
            }
        }

        return longestStreak;
    }

    public int longestConsecutive2(int[] nums) {
        if (nums == null || nums.length == 0) { // 13
            return 0;
        }
        HashSet<Integer> numSet = new HashSet<>(); // 14
        for (int num : nums) { // 15
            numSet.add(num); // 16
        }
        int maxLen = 1; // 17
        for (int num : nums) { // 18
            if (!numSet.contains(num - 1)) { // 19
                int currNum = num; // 20
                int currLen = 1; // 21
                while (numSet.contains(currNum + 1)) { // 22
                    currNum += 1; // 23
                    currLen += 1; // 24
                }
                maxLen = Math.max(maxLen, currLen); // 25
            }
        }
        return maxLen;
    }

    public static int longestConsecutive3(int[] nums) {
        if (nums == null || nums.length == 0) { // 26
            return 0;
        }

        HashSet<Integer> numSet = new HashSet<>(); // 27
        for (int num : nums) { // 28
            numSet.add(num); // 29
        }

        int longestSeqLength = 0; // 30

        for (int num : nums) { // 31
            if (!numSet.contains(num - 1)) { // 32
                int currentNum = num; // 33
                int currentSeqLength = 1; // 34

                while (numSet.contains(currentNum + 1)) { // 35
                    currentNum++; // 36
                    currentSeqLength++; // 37
                }

                longestSeqLength = Math.max(longestSeqLength, currentSeqLength); // 38
            }
        }

        return longestSeqLength;
    }

    public static int longestConsecutive4(int[] nums) {
        if (nums == null || nums.length == 0) { // 39
            return 0;
        }

        HashSet<Integer> numSet = new HashSet<>(); // 40
        for (int num : nums) { // 41
            numSet.add(num); // 42
        }

        int maxLength = 1; // 43
        for (int num : nums) { // 44
            if (!numSet.contains(num - 1)) { // 45
                int currentNum = num; // 46
                int currentLength = 1; // 47

                while (numSet.contains(currentNum + 1)) { // 48
                    currentNum++; // 49
                    currentLength++; // 50
                }

                maxLength = Math.max(maxLength, currentLength); // 51
            }
        }

        return maxLength;
    }


    public int longestConsecutive5(int[] nums) {
        if (nums == null || nums.length == 0) { // 52
            return 0;
        }

        HashSet<Integer> set = new HashSet<>(); // 53
        for (int num : nums) { // 54
            set.add(num); // 55
        }

        int maxLen = 0; // 56
        for (int num : nums) { // 57
            if (!set.contains(num - 1)) { // 58
                int currNum = num; // 59
                int currLen = 1; // 60

                while (set.contains(currNum + 1)) { // 61
                    currNum += 1; // 62
                    currLen += 1; // 63
                }

                maxLen = Math.max(maxLen, currLen); // 64
            }
        }

        return maxLen;
    }

   public int longestConsecutive6(int[] nums) {
      HashSet<Integer> set = new HashSet<Integer>(); // 65
      for (int num : nums) { // 66
         set.add(num); // 67
      }

      int longestStreak = 0; // 68

      for (int num : nums) { // 69
         if (!set.contains(num - 1)) { // 70
            int currentNum = num; // 71
            int currentStreak = 1; // 72

            while (set.contains(currentNum + 1)) { // 73
               currentNum += 1; // 74
               currentStreak += 1; // 75
            }

            longestStreak = Math.max(longestStreak, currentStreak); // 76
         }
      }

      return longestStreak;
   }

    public int longestConsecutive7(int[] nums) {
        Set<Integer> num_set = new HashSet<>(); // 77
        for (int num : nums) { // 78
            num_set.add(num); // 79
        }

        int longestStreak = 0; // 80

        for (int num : num_set) { // 81
            if (!num_set.contains(num - 1)) { // 82
                int currentNum = num; // 83
                int currentStreak = 1; // 84

                while (num_set.contains(currentNum + 1)) { // 85
                    currentNum += 1; // 86
                    currentStreak += 1; // 87
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 88
            }
        }

        return longestStreak;
    }

    public int longestConsecutive8(int[] nums) {
        if (nums == null || nums.length == 0) { // 89
            return 0;
        }

        HashSet<Integer> set = new HashSet<>(); // 90
        for (int num : nums) { // 91
            set.add(num); // 92
        }

        int longestStreak = 0; // 93

        for (int num : set) { // 94
            if (!set.contains(num - 1)) { // 95
                int currentNum = num; // 96
                int currentStreak = 1; // 97

                while (set.contains(currentNum + 1)) { // 98
                    currentNum++; // 99
                    currentStreak++; // 100
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 101
            }
        }

        return longestStreak;
    }


    public int longestConsecutive9(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // 102
        for (int num : nums) { // 103
            set.add(num); // 104
        }

        int longestStreak = 0; // 105

        for (int num : nums) { // 106
            if (!set.contains(num - 1)) { // 107
                int currentNum = num; // 108
                int currentStreak = 1; // 109

                while (set.contains(currentNum + 1)) { // 110
                    currentNum += 1; // 111
                    currentStreak += 1; // 112
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 113
            }
        }

        return longestStreak;
    }

    public int longestConsecutive10(int[] nums) {
        if (nums == null || nums.length == 0) { // 114
            return 0;
        }

        HashSet<Integer> set = new HashSet<Integer>(); // 115
        for (int num : nums) { // 116
            set.add(num); // 117
        }

        int longestStreak = 0; // 118

        for (int num : set) { // 119
            if (!set.contains(num - 1)) { // 120
                int currentNum = num; // 121
                int currentStreak = 1; // 122

                while (set.contains(currentNum + 1)) { // 123
                    currentNum += 1; // 124
                    currentStreak += 1; // 125
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 126
            }
        }

        return longestStreak;
    }

    public static int longestConsecutive11(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // 127
        for (int num : nums) { // 128
            set.add(num); // 129
        }

        int longestStreak = 0; // 130

        for (int num : nums) { // 131
            if (!set.contains(num - 1)) { // 132
                int currentNum = num; // 133
                int currentStreak = 1; // 134

                while (set.contains(currentNum + 1)) { // 135
                    currentNum += 1; // 136
                    currentStreak += 1; // 137
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 138
            }
        }

        return longestStreak;
    }


    public static int longestConsecutive12(int[] nums) {
        if (nums == null || nums.length == 0) // 139
            return 0;

        HashSet<Integer> set = new HashSet<>(); // 140
        for (int num : nums) { // 141
            set.add(num); // 142
        }

        int maxLength = 0; // 143

        for (int num : nums) { // 144
            if (!set.contains(num - 1)) { // 145
                int currentNum = num; // 146
                int currentLength = 1; // 147

                while (set.contains(currentNum + 1)) { // 148
                    currentNum += 1; // 149
                    currentLength += 1; // 150
                }

                maxLength = Math.max(maxLength, currentLength); // 151
            }
        }

        return maxLength;
    }


    public int longestConsecutive13(int[] nums) {
        if (nums == null || nums.length == 0) { // 152
            return 0;
        }

        HashSet<Integer> set = new HashSet<Integer>(); // 153
        for (int num : nums) { // 154
            set.add(num); // 155
        }

        int maxLength = 1; // 156
        for (int num : nums) { // 157
            if (!set.contains(num - 1)) { // 158
                int currNum = num; // 159
                int currLength = 1; // 160

                while (set.contains(currNum + 1)) { // 161
                    currNum += 1; // 162
                    currLength += 1; // 163
                }

                maxLength = Math.max(maxLength, currLength); // 164
            }
        }

        return maxLength;
    }

  public int longestConsecutive14(int[] nums) {
    HashSet<Integer> set = new HashSet<Integer>(); // 165
    for (int num : nums) { // 166
        set.add(num); // 167
    }

    int longestStreak = 0; // 168
    for (int num : set) { // 169
        if (!set.contains(num-1)) { // 170
            int currentNum = num; // 171
            int currentStreak = 1; // 172

            while (set.contains(currentNum+1)) { // 173
                currentNum += 1; // 174
                currentStreak += 1; // 175
            }

            longestStreak = Math.max(longestStreak, currentStreak); // 176
        }
    }

    return longestStreak;
  }

    public static int longestConsecutive15(int[] nums) {
        if(nums == null || nums.length == 0) // 177
            return 0;

        HashSet<Integer> set = new HashSet<>(); // 178
        for(int num : nums) // 179
            set.add(num); // 180

        int maxLen = 1; // 181
        for(int num : nums) { // 182
            if(!set.contains(num-1)) { // 183
                int currNum = num; // 184
                int currLen = 1; // 185
                while(set.contains(currNum+1)) { // 186
                    currNum++; // 187
                    currLen++; // 188
                }
                maxLen = Math.max(maxLen, currLen); // 189
            }
        }

        return maxLen;
    }


    public static int longestConsecutive16(int[] nums) {
        HashSet<Integer> num_set = new HashSet<Integer>(); // 190
        for (int num : nums) { // 191
            num_set.add(num); // 192
        }

        int longestStreak = 0; // 193

        for (int num : num_set) { // 194
            if (!num_set.contains(num - 1)) { // 195
                int currentNum = num; // 196
                int currentStreak = 1; // 197

                while (num_set.contains(currentNum + 1)) { // 198
                    currentNum += 1; // 199
                    currentStreak += 1; // 200
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 201
            }
        }

        return longestStreak;
    }


    public int longestConsecutive17(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // 202
        for(int num: nums){ // 203
            set.add(num); // 204
        }

        int longestStreak = 0; // 205

        for(int num: nums){ // 206
            if(!set.contains(num-1)){ // 207
                int currentNum = num; // 208
                int currentStreak = 1; // 209

                while(set.contains(currentNum+1)){ // 210
                    currentNum++; // 211
                    currentStreak++; // 212
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 213
            }
        }

        return longestStreak;
    }

    public static int longestConsecutive18(int[] nums) {
        if (nums == null || nums.length == 0) { // 214
            return 0;
        }

        HashSet<Integer> set = new HashSet<Integer>(); // 215
        for (int num : nums) { // 216
            set.add(num); // 217
        }

        int longestStreak = 0; // 218
        for (int num : nums) { // 219
            if (!set.contains(num - 1)) { // 220
                int currentNum = num; // 221
                int currentStreak = 1; // 222

                while (set.contains(currentNum + 1)) { // 223
                    currentNum += 1; // 224
                    currentStreak += 1; // 225
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 226
            }
        }

        return longestStreak;
    }


    public static int longestConsecutive19(int[] nums) {
        if (nums == null || nums.length == 0) // 227
            return 0;

        HashSet<Integer> set = new HashSet<>(); // 228
        for (int num : nums) // 229
            set.add(num); // 230

        int longest = 0; // 231
        for (int num : nums) { // 232
            int streak = 1; // 233
            int current = num - 1; // 234

            while (set.contains(current)) { // 235
                set.remove(current); // 236
                streak++; // 237
                current--; // 238
            }

            current = num + 1; // 239
            while (set.contains(current)) { // 240
                set.remove(current); // 241
                streak++; // 242
                current++; // 243
            }

            longest = Math.max(longest, streak); // 244
        }

        return longest;
    }

}


