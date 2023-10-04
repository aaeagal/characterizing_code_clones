
import java.util.Arrays;

public class Interleave {
    public int[] singleNumber1(int[] nums) {
        int xor = 0; // 1
        for (int num : nums) { // 2
            xor ^= num; // 3
        }

        int rightmostSetBit = xor & (-xor); // 4

        int num1 = 0; // 5
        int num2 = 0; // 6

        for (int num : nums) { // 7
            if ((num & rightmostSetBit) != 0) { // 8
                num1 ^= num; // 9
            } else { // 10
                num2 ^= num; // 11
            }
        }

        return new int[]{num1, num2};
    }

    public int[] findSingleElements2(int[] nums) {
        int xor = 0; // 12

        for (int num : nums) { // 13
            xor ^= num; // 14
        }

        int rightmostSetBit = xor & -xor; // 15

        int firstNum = 0; // 16
        for (int num : nums) { // 17
            if ((num & rightmostSetBit) != 0) { // 18
                firstNum ^= num; // 19
            }
        }

        int[] result = new int[2]; // 20
        result[0] = firstNum; // 21
        result[1] = xor ^ firstNum; // 22

        return result;
    }


    public int[] singleNumber3(int[] nums) {
        int xor = 0; // 23
        for (int num : nums) { // 24
            xor ^= num; // 25
        }

        int mask = 1; // 26
        while ((mask & xor) == 0) { // 27
            mask <<= 1; // 28
        }

        int num1 = 0; // 29
        int num2 = 0; // 30
        for (int num : nums) { // 31
            if ((num & mask) == 0) { // 32
                num1 ^= num; // 33
            } else { // 34
                num2 ^= num; // 35
            }
        }

        return new int[]{num1, num2};
    }



    public int[] singleNumber4(int[] nums) {
        int xor = 0; // 36
        for (int num : nums) { // 37
            xor ^= num; // 38
        }

        int mask = 1; // 39
        while ((xor & mask) == 0) { // 40
            mask <<= 1; // 41
        }

        int num1 = 0, num2 = 0; // 42
        for (int num : nums) { // 43
            if ((num & mask) == 0) { // 44
                num1 ^= num; // 45
            } else { // 46
                num2 ^= num; // 47
            }
        }

        return new int[]{num1, num2};
    }



    public int[] findTwoElements5(int[] nums) {
        int xor = 0; // 48
        for (int num : nums) { // 49
            xor ^= num; // 50
        }

        int mask = 1; // 51
        while ((mask & xor) == 0) { // 52
            mask <<= 1; // 53
        }

        int res1 = 0; // 54
        int res2 = 0; // 55
        for (int num : nums) { // 56
            if ((num & mask) != 0) { // 57
                res1 ^= num; // 58
            } else { // 59
                res2 ^= num; // 60
            }
        }

        return new int[]{res1, res2};
    }


    public int[] singleNumber6(int[] nums) {
        int xor = 0; // 61
        for (int num : nums) { // 62
            xor ^= num; // 63
        }

        int diff = xor & (-xor); // 64

        int num1 = 0; // 65
        int num2 = 0; // 66
        for (int num : nums) { // 67
            if ((num & diff) == 0) { // 68
                num1 ^= num; // 69
            } else { // 70
                num2 ^= num; // 71
            }
        }

        return new int[]{num1, num2};
    }

    public int[] singleNumber7(int[] nums) {
        int[] result = new int[2]; // 72
        HashSet<Integer> set = new HashSet<>(); // 73

        for (int num : nums) { // 74
            if (set.contains(num)) { // 75
                set.remove(num); // 76
            } else { // 77
                set.add(num); // 78
            }
        }

        int i = 0; // 79
        for (int num : set) { // 80
            result[i++] = num; // 81
        }

        return result;
    }

    public int[] singleNumber8(int[] nums) {
        int[] result = new int[2]; // 82

        int xor = 0; // 83
        for (int num : nums) { // 84
            xor ^= num; // 85
        }

        int mask = 1; // 86
        while ((mask & xor) == 0) { // 87
            mask <<= 1; // 88
        }

        int num1 = 0; // 89
        int num2 = 0; // 90
        for (int num : nums) { // 91
            if ((num & mask) == 0) { // 92
                num1 ^= num; // 93
            } else { // 94
                num2 ^= num; // 95
            }
        }

        result[0] = num1; // 96
        result[1] = num2; // 97

        return result;
    }


    public int[] singleNumber9(int[] nums) {
        int xor = 0; // 98
        for (int num : nums) { // 99
            xor ^= num; // 100
        }

        int rightmostBit = xor & -xor; // 101
        int num1 = 0; // 102
        int num2 = 0; // 103
        for (int num : nums) { // 104
            if ((num & rightmostBit) != 0) { // 105
                num1 ^= num; // 106
            } else { // 107
                num2 ^= num; // 108
            }
        }

        return new int[]{num1, num2};
    }


    public int[] singleNumber10(int[] nums) {
        int[] result = new int[2]; // 109
        Map<Integer, Integer> map = new HashMap<>(); // 110

        for (int num : nums) { // 111
            map.put(num, map.getOrDefault(num, 0) + 1); // 112
        }

        int i = 0; // 113

        for (int num : nums) { // 114
            if (map.get(num) == 1) { // 115
                result[i++] = num; // 116
            }
        }

        return result;
    }

    public int[] singleNumber11(int[] nums) {
        int bitmask = 0; // 117
        for (int num : nums) { // 118
            bitmask ^= num; // 119
        }

        int diff = bitmask & (-bitmask); // 120

        int x = 0; // 121
        for (int num : nums) { // 122
            if ((num & diff) != 0) { // 123
                x ^= num; // 124
            }
        }

        return new int[]{x, bitmask ^ x};
    }

    public int[] singleNumber12(int[] nums) {
        int bitmask = 0; // 125
        for (int num : nums) { // 126
            bitmask ^= num; // 127
        }
        int diff = bitmask & (-bitmask); // 128
        int x = 0; // 129
        for (int num : nums) { // 130
            if ((num & diff) != 0) { // 131
                x ^= num; // 132
            }
        }
        return new int[]{x, bitmask ^ x};
    }



    public int[] singleNumber13(int[] nums) {
        int xor = 0; // 133
        for (int num : nums) { // 134
            xor ^= num; // 135
        }

        int mask = xor & -xor; // 136

        int num1 = 0; // 137
        int num2 = 0; // 138

        for (int num : nums) { // 139
            if ((num & mask) == 0) { // 140
                num1 ^= num; // 141
            } else { // 142
                num2 ^= num; // 143
            }
        }

        return new int[]{num1, num2};
    }


    public int[] singleNumber14(int[] nums) {
        int bitmask = 0; // 144
        for (int num : nums) { // 145
            bitmask ^= num; // 146
        }

        int diff = bitmask & (-bitmask); // 147

        int x = 0; // 148
        for (int num : nums) { // 149
            if ((num & diff) != 0) { // 150
                x ^= num; // 151
            }
        }

        return new int[] {x, bitmask ^ x};
    }

    public static int[] findTwoSingleNumbers15(int[] nums) {
        int xor = 0; // 152
        for (int num : nums) { // 153
            xor ^= num; // 154
        }

        int bitMask = xor & (-xor); // 155

        int[] result = new int[2]; // 156
        for (int num : nums) { // 157
            if ((num & bitMask) != 0) { // 158
                result[0] ^= num; // 159
            } else { // 160
                result[1] ^= num; // 161
            }
        }

        return result;
    }


    public int[] singleNumber16(int[] nums) {
        int bitmask = 0; // 162
        for (int num : nums) { // 163
            bitmask ^= num; // 164
        }
        int diff = bitmask & (-bitmask); // 165
        int x = 0; // 166
        for (int num : nums) { // 167
            if ((diff & num) != 0) { // 168
                x ^= num; // 169
            }
        }
        return new int[]{x, bitmask ^ x};
    }

    public int[] singleNumber17(int[] nums) {
        int bitmask = 0; // 170
        for (int num : nums) { // 171
            bitmask ^= num; // 172
        }

        int diff = bitmask & (-bitmask); // 173

        int x = 0; // 174
        for (int num : nums) { // 175
            if ((num & diff) != 0) { // 176
                x ^= num; // 177
            }
        }

        return new int[]{x, bitmask ^ x};
    }

public int[] singleNumber18(int[] nums) {
    int xor = 0; // 178
    for (int num : nums) { // 179
        xor ^= num; // 180
    }

    int mask = xor & (-xor); // 181

    int[] result = new int[2]; // 182
    for (int num : nums) { // 183
        if ((num & mask) == 0) { // 184
            result[0] ^= num; // 185
        } else { // 186
            result[1] ^= num; // 187
        }
    }

    return result;
}


    public int[] singleNumber19(int[] nums) {
        int bitmask = 0; // 188
        for (int num : nums) { // 189
            bitmask ^= num; // 190
        }

        int diff = bitmask & (-bitmask); // 191

        int x = 0; // 192
        for (int num : nums) { // 193
            if ((num & diff) != 0) { // 194
                x ^= num; // 195
            }
        }

        int[] result = new int[]{x, bitmask ^ x}; // 196
        return result;
    }

    public int[] singleNumber20(int[] nums) {
        int[] result = new int[2]; // 197
        Map<Integer, Integer> map = new HashMap<>(); // 198

        for (int num : nums) { // 199
            map.put(num, map.getOrDefault(num, 0) + 1); // 200
        }

        int index = 0; // 201
        for (int num : map.keySet()) { // 202
            if (map.get(num) == 1) { // 203
                result[index] = num; // 204
                index++; // 205
            }
        }

        return result;
    }
}


