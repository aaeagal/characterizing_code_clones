
public class Solution {
    public int longestConsecutive1(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>(); // 1
        for (int num : nums) { // 2
            numSet.add(num); // 3
        }

        int longestStreak = 0; // 4

        for (int num : numSet) { // 5
            if (!numSet.contains(num-1)) { // 6
                int currentNum = num; // 7
                int currentStreak = 1; // 8

                while (numSet.contains(currentNum+1)) { // 9
                    currentNum += 1; // 10
                    currentStreak += 1; // 11
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 12
            }
        }

        return longestStreak;
    }

    public int longestConsecutive2(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>(); // 13
        for (int num : nums) { // 14
            num_set.add(num); // 15
        }

        int longestStreak = 0; // 16

        for (int num : num_set) { // 17
            if (!num_set.contains(num-1)) { // 18
                int currentNum = num; // 19
                int currentStreak = 1; // 20

                while (num_set.contains(currentNum+1)) { // 21
                    currentNum += 1; // 22
                    currentStreak += 1; // 23
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 24
            }
        }

        return longestStreak;
    }

    public int longestConsecutive3(int[] nums) {

        HashSet<Integer> set = new HashSet<Integer>(); // 25

        for(int num : nums) set.add(num); // 26

        int longestStreak = 0; // 27

        for(int num : set) { // 28
            if(!set.contains(num-1)) { // 29
                int currentNum = num; // 30
                int currentStreak = 1; // 31

                while(set.contains(currentNum+1)) { // 32
                    currentNum = currentNum + 1; // 33
                    currentStreak = currentStreak + 1; // 34
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 35
            }
        }

        return longestStreak;
    }

    public int longestConsecutive4(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>(); // 36
        for (int num : nums) { // 37
            numSet.add(num); // 38
        }

        int longestStreak = 0; // 39

        for (int num : numSet) { // 40
            if (!numSet.contains(num-1)) { // 41
                int currentNum = num; // 42
                int currentStreak = 1; // 43

                while (numSet.contains(currentNum+1)) { // 44
                    currentNum += 1; // 45
                    currentStreak += 1; // 46
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 47
            }
        }

        return longestStreak;
    }

    public int longestConsecutiveSequence5(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // 48
        for (int num : nums) { // 49
            set.add(num); // 50
        }

        int longestStreak = 0; // 51

        for (int num : set) { // 52
            if (!set.contains(num - 1)) { // 53
                int currentNum = num; // 54
                int currentStreak = 1; // 55

                while (set.contains(currentNum + 1)) { // 56
                    currentNum += 1; // 57
                    currentStreak += 1; // 58
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 59
            }
        }

        return longestStreak;
    }

    public int longestConsecutive6(int[] nums) {
        if (nums.length == 0) { // 60
            return 0;
        }

        Set<Integer> numSet = new HashSet<Integer>(); // 61
        for (int num : nums) { // 62
            numSet.add(num); // 63
        }

        int longestStreak = 0; // 64

        for (int num : numSet) { // 65
            if (!numSet.contains(num-1)) { // 66
                int currentNum = num; // 67
                int currentStreak = 1; // 68

                while (numSet.contains(currentNum+1)) { // 69
                    currentNum += 1; // 70
                    currentStreak += 1; // 71
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 72
            }
        }

        return longestStreak;
    }

    public int longestConsecutive7(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>(); // 73
        for (int num : nums) { // 74
            num_set.add(num); // 75
        }

        int longestStreak = 0; // 76

        for (int num : num_set) { // 77
            if (!num_set.contains(num-1)) { // 78
                int currentNum = num; // 79
                int currentStreak = 1; // 80

                while (num_set.contains(currentNum+1)) { // 81
                    currentNum += 1; // 82
                    currentStreak += 1; // 83
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 84
            }
        }

        return longestStreak;
    }

    public int longestConsecutive8(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>(); // 85
        for (int num : nums) { // 86
            num_set.add(num); // 87
        }

        int longestStreak = 0; // 88

        for (int num : num_set) { // 89
            if (!num_set.contains(num-1)) { // 90
                int currentNum = num; // 91
                int currentStreak = 1; // 92

                while (num_set.contains(currentNum+1)) { // 93
                    currentNum += 1; // 94
                    currentStreak += 1; // 95
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 96
            }
        }

        return longestStreak;
    }


    public int longestConsecutive9(int[] nums) {
        if(nums==null || nums.length==0) // 97
            return 0;

        HashSet<Integer> set = new HashSet<Integer>(); // 98
        int max = 1; // 99

        for(int num: nums) // 100
            set.add(num); // 101

        for(int num: nums){ // 102
            int left = num - 1; // 103
            int right = num + 1; // 104
            int count = 1; // 105

            while(set.contains(left)){ // 106
                set.remove(left); // 107
                left--; // 108
                count++; // 109
            }

            while(set.contains(right)){ // 110
                set.remove(right); // 111
                right++; // 112
                count++; // 113
            }
            max = Math.max(count, max); // 114
        }

        return max;
    }


    public int longestConsecutive10(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>(); // 115
        for (int num : nums) { // 116
            num_set.add(num); // 117
        }

        int longestStreak = 0; // 118

        for (int num : num_set) { // 119
            if (!num_set.contains(num - 1)) { // 120
                int currentNum = num; // 121
                int currentStreak = 1; // 122

                while (num_set.contains(currentNum + 1)) { // 123
                    currentNum += 1; // 124
                    currentStreak += 1; // 125
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 126
            }
        }

        return longestStreak;
    }



    public int longestConsecutive11(int[] nums) {
        if(nums.length == 0) return 0;

        Set<Integer> numSet = new HashSet<>(); // 127
        for (int num : nums) { // 128
        numSet.add(num); // 129
        }

        int longestStreak = 0; // 130

        for (int num : numSet) { // 131
        if (!numSet.contains(num - 1)) { // 132
            int currentNum = num; // 133
            int currentStreak = 1; // 134

            while (numSet.contains(currentNum + 1)) { // 135
            currentNum += 1; // 136
            currentStreak += 1; // 137
            }

            longestStreak = Math.max(longestStreak, currentStreak); // 138
        }
        }

        return longestStreak;
    }



    public int longestConsecutive12(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>(); // 139
        for (int num : nums) { // 140
            num_set.add(num); // 141
        }

        int longestStreak = 0; // 142

        for (int num : num_set) { // 143
            if (!num_set.contains(num-1)) { // 144
                int currentNum = num; // 145
                int currentStreak = 1; // 146

                while (num_set.contains(currentNum+1)) { // 147
                    currentNum += 1; // 148
                    currentStreak += 1; // 149
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 150
            }
        }

        return longestStreak;
    }

    public int longestConsecutive13(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>(); // 151
        for (int num : nums) { // 152
            num_set.add(num); // 153
        }

        int longestStreak = 0; // 154

        for (int num : num_set) { // 155
            if (!num_set.contains(num-1)) { // 156
                int currentNum = num; // 157
                int currentStreak = 1; // 158

                while (num_set.contains(currentNum+1)) { // 159
                    currentNum += 1; // 160
                    currentStreak += 1; // 161
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 162
            }
        }
        return longestStreak;
    }

    public int longestConsecutive14(int[] nums) {
        Set<Integer> num_set = new HashSet<>(); // 163
        for (int num : nums) { // 164
            num_set.add(num); // 165
        }

        int longestStreak = 0; // 166

        for (int num : num_set) { // 167
            if (!num_set.contains(num-1)) { // 168
                int currentNum = num; // 169
                int currentStreak = 1; // 170

                while (num_set.contains(currentNum+1)) { // 171
                    currentNum += 1; // 172
                    currentStreak += 1; // 173
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 174
            }
        }

        return longestStreak;
    }

    public int longestConsecutive15(int[] num) {
        HashSet<Integer> set = new HashSet<Integer>(); // 175
        int max = 0; // 176

        for(int n : num) set.add(n); // 177

        for(int n : num) { // 178
            if(!set.contains(n-1)) { // 179
                int m = n + 1; // 180

                while(set.contains(m)) { // 181
                    m++; // 182
                }

                max = Math.max(max, m - n); // 183
            }
        }

        return max;
    }

    public int longestConsecutive16(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>(); // 184
        for (int num : nums) { // 185
            set.add(num); // 186
        }

        int longestStreak = 0; // 187

        for (int num : set) { // 188
            if (!set.contains(num-1)) { // 189
                int currentNum = num; // 190
                int currentStreak = 1; // 191

                while (set.contains(currentNum+1)) { // 192
                    currentNum += 1; // 193
                    currentStreak += 1; // 194
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 195
            }
        }

        return longestStreak;
    }

    public int longestConsecutive17(int[] nums) {
        if(nums.length==0) return 0;

        Set<Integer> num_set = new HashSet<Integer>(); // 196
        for (int num : nums) { // 197
            num_set.add(num); // 198
        }

        int longestLength = 0; // 199

        for (int num : num_set) { // 200
            if (!num_set.contains(num-1)) { // 201
                int currentNum = num; // 202
                int currentLength = 1; // 203

                while (num_set.contains(currentNum+1)) { // 204
                    currentNum += 1; // 205
                    currentLength += 1; // 206
                }

                longestLength = Math.max(longestLength, currentLength); // 207
            }
        }

        return longestLength;
    }

    public static int longestConsecutive18(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>(); // 208
        for (int num : nums) { // 209
            num_set.add(num); // 210
        }

        int longestStreak = 0; // 211

        for (int num : num_set) { // 212
            if (!num_set.contains(num-1)) { // 213
                int currentNum = num; // 214
                int currentStreak = 1; // 215

                while (num_set.contains(currentNum+1)) { // 216
                    currentNum += 1; // 217
                    currentStreak += 1; // 218
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 219
            }
        }

        return longestStreak;
    }


    public int longestConsecutive19(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>(); // 220
        for (int num : nums) { // 221
            numSet.add(num); // 222
        }

        int longestStreak = 0; // 223

        for (int num : numSet) { // 224
            if (!numSet.contains(num-1)) { // 225
                int currentNum = num; // 226
                int currentStreak = 1; // 227

                while (numSet.contains(currentNum+1)) { // 228
                    currentNum += 1; // 229
                    currentStreak += 1; // 230
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 231
            }
        }

        return longestStreak;
    }

    public int longestConsecutive20(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>(); // 232
        for (int num : nums) { // 233
            num_set.add(num); // 234
        }

        int longestStreak = 0; // 235

        for (int num : num_set) { // 236
            if (!num_set.contains(num-1)) { // 237
                int currentNum = num; // 238
                int currentStreak = 1; // 239

                while (num_set.contains(currentNum+1)) { // 240
                    currentNum += 1; // 241
                    currentStreak += 1; // 242
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 243
            }
        }

        return longestStreak;
    }

}
