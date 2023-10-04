
public class InsertInterval {
    public int[][] insert1(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(); // 1

        int i = 0; // 2
        while (i < intervals.length && intervals[i][1] < newInterval[0]) { // 3
            result.add(intervals[i]); // 4
            i++; // 5
        }

        while (i < intervals.length && intervals[i][0] <= newInterval[1]) { // 6
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // 7
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // 8
            i++; // 9
        }

        result.add(newInterval); // 10

        while (i < intervals.length) { // 11
            result.add(intervals[i]); // 12
            i++; // 13
        }

        int[][] resultArray = new int[result.size()][2]; // 14
        for (i = 0; i < result.size(); i++) { // 15
            resultArray[i] = result.get(i); // 16
        }

        return resultArray;
    }

    public int[][] insert2(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(); // 17
        int i = 0; // 18
        while (i < intervals.length && intervals[i][1] < newInterval[0]) { // 19
            result.add(intervals[i]); // 20
            i++; // 21
        }
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) { // 22
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]); // 23
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]); // 24
            i++; // 25
        }
        result.add(newInterval); // 26
        while (i < intervals.length) { // 27
            result.add(intervals[i]); // 28
            i++; // 29
        }
        return result.toArray(new int[result.size()][]);
    }

    public int[][] insert3(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(); // 30

        int i = 0; // 31
        int n = intervals.length; // 32

        while(i < n && intervals[i][1] < newInterval[0]) { // 33
            result.add(intervals[i]); // 34
            i++; // 35
        }

        while(i < n && intervals[i][0] <= newInterval[1]) { // 36
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // 37
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // 38
            i++; // 39
        }

        result.add(newInterval); // 40

        while(i < n) { // 41
            result.add(intervals[i]); // 42
            i++; // 43
        }

        int[][] mergedIntervals = new int[result.size()][]; // 44
        for(i = 0; i < result.size(); i++) { // 45
            mergedIntervals[i] = result.get(i); // 46
        }

        return mergedIntervals;
    }

    public int[][] insert4(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(); // 47
        int n = intervals.length; // 48
        int i = 0; // 49

        while (i < n && intervals[i][1] < newInterval[0]) { // 50
            result.add(intervals[i]); // 51
            i++; // 52
        }

        while (i < n && intervals[i][0] <= newInterval[1]) { // 53
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // 54
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // 55
            i++; // 56
        }

        result.add(newInterval); // 57

        while (i < n) { // 58
            result.add(intervals[i]); // 59
            i++; // 60
        }

        int[][] mergedIntervals = new int[result.size()][2]; // 61
        for (int j = 0; j < result.size(); j++) { // 62
            mergedIntervals[j] = result.get(j); // 63
        }

        return mergedIntervals;
    }

    public int[][] insert5(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(); // 64
        int i = 0; // 65
        int n = intervals.length; // 66

        while (i < n && intervals[i][1] < newInterval[0]) { // 67
            result.add(intervals[i]); // 68
            i++; // 69
        }

        while (i < n && intervals[i][0] <= newInterval[1]) { // 70
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // 71
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // 72
            i++; // 73
        }

        result.add(newInterval); // 74

        while (i < n) { // 75
            result.add(intervals[i]); // 76
            i++; // 77
        }

        return result.toArray(new int[result.size()][2]);
    }


    public int[][] insert6(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(); // 78
        int i = 0; // 79
        while (i < intervals.length && intervals[i][1] < newInterval[0]) { // 80
            result.add(intervals[i]); // 81
            i++; // 82
        }
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) { // 83
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // 84
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // 85
            i++; // 86
        }
        result.add(newInterval); // 87
        while (i < intervals.length) { // 88
            result.add(intervals[i]); // 89
            i++; // 90
        }
        return result.toArray(new int[result.size()][2]);
    }

    public int[][] insert7(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>(); // 91
        int i = 0; // 92
        int n = intervals.length; // 93

        while (i < n && intervals[i][1] < newInterval[0]) { // 94
            merged.add(intervals[i]); // 95
            i++; // 96
        }

        while (i < n && intervals[i][0] <= newInterval[1]) { // 97
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // 98
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // 99
            i++; // 100
        }

        merged.add(newInterval); // 101

        while (i < n) { // 102
            merged.add(intervals[i]); // 103
            i++; // 104
        }

        int[][] result = new int[merged.size()][2]; // 105
        for (int j = 0; j < merged.size(); j++) { // 106
            result[j] = merged.get(j); // 107
        }

        return result;
    }

    public int[][] insert8(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(); // 108
        int i = 0; // 109
        int n = intervals.length; // 110


        while (i < n && intervals[i][1] < newInterval[0]) { // 111
            result.add(intervals[i]); // 112
            i++; // 113
        }


        while (i < n && intervals[i][0] <= newInterval[1]) { // 114
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // 115
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // 116
            i++; // 117
        }


        result.add(newInterval); // 118

        while (i < n) { // 119
            result.add(intervals[i]); // 120
            i++; // 121
        }

        return result.toArray(new int[result.size()][2]);
    }



    public int[][] insert9(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(); // 122
        int i = 0; // 123
        int n = intervals.length; // 124


        while (i < n && intervals[i][1] < newInterval[0]) { // 125
            result.add(intervals[i]); // 126
            i++; // 127
        }


        while (i < n && intervals[i][0] <= newInterval[1]) { // 128
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // 129
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // 130
            i++; // 131
        }
        result.add(newInterval); // 132


        while (i < n) { // 133
            result.add(intervals[i]); // 134
            i++; // 135
        }

        return result.toArray(new int[result.size()][2]);
    }

    public int[][] insert10(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>(); // 136
        int i = 0; // 137
        int n = intervals.length; // 138

        while (i < n && intervals[i][1] < newInterval[0]) { // 139
            merged.add(intervals[i]); // 140
            i++; // 141
        }

        while (i < n && intervals[i][0] <= newInterval[1]) { // 142
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]); // 143
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]); // 144
            i++; // 145
        }

        merged.add(newInterval); // 146

        while (i < n) { // 147
            merged.add(intervals[i]); // 148
            i++; // 149
        }

        int[][] result = new int[merged.size()][2]; // 150
        for (int j = 0; j < merged.size(); j++) { // 151
            result[j] = merged.get(j); // 152
        }

        return result;
    }

    public int[][] insert11(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(); // 153
        int i = 0; // 154
        int n = intervals.length; // 155

        while (i < n && intervals[i][1] < newInterval[0]) { // 156
            result.add(intervals[i]); // 157
            i++; // 158
        }

        while (i < n && intervals[i][0] <= newInterval[1]) { // 159
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]); // 160
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]); // 161
            i++; // 162
        }

        result.add(newInterval); // 163

        while (i < n) { // 164
            result.add(intervals[i]); // 165
            i++; // 166
        }

        return result.toArray(new int[result.size()][]);
    }

    public int[][] insert12(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>(); // 167
        int i = 0; // 168
        while (i < intervals.length && intervals[i][1] < newInterval[0]) { // 169
            merged.add(intervals[i]); // 170
            i++; // 171
        }
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) { // 172
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // 173
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // 174
            i++; // 175
        }
        merged.add(newInterval); // 176
        while (i < intervals.length) { // 177
            merged.add(intervals[i]); // 178
            i++; // 179
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public int[][] insert13(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>(); // 180
        int i = 0; // 181
        while (i < intervals.length && intervals[i][1] < newInterval[0]) { // 182
            merged.add(intervals[i]); // 183
            i++; // 184
        }
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) { // 185
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // 186
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // 187
            i++; // 188
        }
        merged.add(newInterval); // 189
        while (i < intervals.length) { // 190
            merged.add(intervals[i]); // 191
            i++; // 192
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public int[][] insert14(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(); // 193
        int i = 0; // 194

        while (i < intervals.length && intervals[i][1] < newInterval[0]) { // 195
            result.add(intervals[i]); // 196
            i++; // 197
        }

        while (i < intervals.length && intervals[i][0] <= newInterval[1]) { // 198
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]); // 199
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]); // 200
            i++; // 201
        }
        result.add(newInterval); // 202


        while (i < intervals.length) { // 203
            result.add(intervals[i]); // 204
            i++; // 205
        }

        return result.toArray(new int[result.size()][]);
    }

  public int[][] insert15(int[][] intervals, int[] newInterval) {
    List<int[]> result = new ArrayList<>(); // 206
    int[] currentInterval = newInterval; // 207

    for (int[] interval : intervals) { // 208
      if (interval[1] < currentInterval[0]) { // 209
        result.add(interval); // 210
      } else if (interval[0] > currentInterval[1]) { // 211
        result.add(currentInterval); // 212
        currentInterval = interval; // 213
      } else { // 214
        currentInterval[0] = Math.min(interval[0], currentInterval[0]); // 215
        currentInterval[1] = Math.max(interval[1], currentInterval[1]); // 216
      }
    }

    result.add(currentInterval); // 217

    return result.toArray(new int[result.size()][2]);
  }

    public int[][] insert16(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>(); // 218
        int i = 0; // 219

        while (i < intervals.length && intervals[i][1] < newInterval[0]) { // 220
            merged.add(intervals[i]); // 221
            i++; // 222
        }

        while (i < intervals.length && intervals[i][0] <= newInterval[1]) { // 223
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // 224
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // 225
            i++; // 226
        }

        merged.add(newInterval); // 227

        while (i < intervals.length) { // 228
            merged.add(intervals[i]); // 229
            i++; // 230
        }

        return merged.toArray(new int[merged.size()][]);
    }


    public static int[][] insert17(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>(); // 231
        int i = 0; // 232
        int n = intervals.length; // 233
        while (i < n && intervals[i][1] < newInterval[0]) { // 234
            merged.add(intervals[i]); // 235
            i++; // 236
        }
        while (i < n && intervals[i][0] <= newInterval[1]) { // 237
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]); // 238
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]); // 239
            i++; // 240
        }
        merged.add(newInterval); // 241
        while (i < n) { // 242
            merged.add(intervals[i]); // 243
            i++; // 244
        }
        return merged.toArray(new int[merged.size()][]);
    }



    public static int[][] insert18(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(); // 245

        int i = 0; // 246
        while (i < intervals.length && intervals[i][1] < newInterval[0]) { // 247
            result.add(intervals[i]); // 248
            i++; // 249
        }

        while (i < intervals.length && intervals[i][0] <= newInterval[1]) { // 250
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]); // 251
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]); // 252
            i++; // 253
        }

        result.add(newInterval); // 254

        while (i < intervals.length) { // 255
            result.add(intervals[i]); // 256
            i++; // 257
        }

        return result.toArray(new int[result.size()][]);
    }


    public int[][] insert19(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(); // 258
        int i = 0; // 259
        int n = intervals.length; // 260

        while (i < n && intervals[i][1] < newInterval[0]) { // 261
            result.add(intervals[i]); // 262
            i++; // 263
        }

        while (i < n && intervals[i][0] <= newInterval[1]) { // 264
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // 265
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // 266
            i++; // 267
        }

        result.add(newInterval); // 268

        while (i < n) { // 269
            result.add(intervals[i]); // 270
            i++; // 271
        }

        return result.toArray(new int[result.size()][]);
    }

    public int[][] insert20(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>(); // 272
        int i = 0; // 273
        while (i < intervals.length && intervals[i][1] < newInterval[0]) { // 274
            merged.add(intervals[i]); // 275
            i++; // 276
        }
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) { // 277
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // 278
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // 279
            i++; // 280
        }
        merged.add(newInterval); // 281
        while (i < intervals.length) { // 282
            merged.add(intervals[i]); // 283
            i++; // 284
        }
        return merged.toArray(new int[merged.size()][]);
    }
}

