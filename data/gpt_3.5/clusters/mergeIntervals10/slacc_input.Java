
    public int[][] merge1(int[][] intervals) {
        if (intervals.length <= 1) { // 1
            return intervals;
        }

        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0])); // 2

        List<int[]> result = new ArrayList<>(); // 3
        int[] currentInterval = intervals[0]; // 4
        result.add(currentInterval); // 5

        for (int[] interval : intervals) { // 6
            int currentEnd = currentInterval[1]; // 7
            int nextStart = interval[0]; // 8
            int nextEnd = interval[1]; // 9

            if (currentEnd >= nextStart) { // 10
                currentInterval[1] = Math.max(currentEnd, nextEnd); // 11
            } else { // 12
                currentInterval = interval; // 13
                result.add(currentInterval); // 14
            }
        }

        return result.toArray(new int[result.size()][]);
    }



    public int[][] merge2(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // 15
        List<int[]> merged = new ArrayList<>(); // 16
        for (int i = 0; i < intervals.length; i++) { // 17
            int start = intervals[i][0]; // 18
            int end = intervals[i][1]; // 19
            while (i < intervals.length - 1 && intervals[i + 1][0] <= end) { // 20
                end = Math.max(end, intervals[i + 1][1]); // 21
                i++; // 22
            }
            merged.add(new int[]{start, end}); // 23
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public int[][] mergeIntervals3(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // 24
        List<int[]> merged = new ArrayList<>(); // 25
        int[] currentInterval = intervals[0]; // 26
        merged.add(currentInterval); // 27

        for (int[] interval : intervals) { // 28
            int currentEnd = currentInterval[1]; // 29
            int nextStart = interval[0]; // 30
            int nextEnd = interval[1]; // 31

            if (currentEnd >= nextStart) { // 32
                currentInterval[1] = Math.max(currentEnd, nextEnd); // 33
            } else { // 34
                currentInterval = interval; // 35
                merged.add(currentInterval); // 36
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }


    public int[][] merge4(int[][] intervals) {
        if(intervals.length <= 1) { // 37
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // 38

        List<int[]> result = new ArrayList<>(); // 39
        int[] currInterval = intervals[0]; // 40
        result.add(currInterval); // 41

        for(int[] interval : intervals) { // 42
            int currEnd = currInterval[1]; // 43
            int nextStart = interval[0]; // 44
            int nextEnd = interval[1]; // 45

            if(currEnd >= nextStart) { // 46
                currInterval[1] = Math.max(currEnd, nextEnd); // 47
            } else { // 48
                currInterval = interval; // 49
                result.add(currInterval); // 50
            }
        }

        return result.toArray(new int[result.size()][]);
    }


    public int[][] merge5(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // 51

        List<int[]> merged = new ArrayList<>(); // 52
        for (int[] interval : intervals) { // 53
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) { // 54
                merged.add(interval); // 55
            } else { // 56
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]); // 57
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }


    public int[][] merge6(int[][] intervals) {
        if (intervals.length <= 1) // 58
            return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // 59

        List<int[]> result = new ArrayList<>(); // 60
        int[] currInterval = intervals[0]; // 61
        result.add(currInterval); // 62

        for (int[] interval : intervals) { // 63
            int currEnd = currInterval[1]; // 64
            int nextStart = interval[0]; // 65
            int nextEnd = interval[1]; // 66

            if (currEnd >= nextStart) { // 67
                currInterval[1] = Math.max(currEnd, nextEnd); // 68
            } else { // 69
                currInterval = interval; // 70
                result.add(currInterval); // 71
            }
        }

        return result.toArray(new int[result.size()][]);
    }


    public int[][] merge7(int[][] intervals) {
        if (intervals.length <= 1) { // 72
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // 73

        List<int[]> result = new ArrayList<>(); // 74
        int[] currentInterval = intervals[0]; // 75
        result.add(currentInterval); // 76

        for (int[] interval : intervals) { // 77
            int currentEnd = currentInterval[1]; // 78
            int nextStart = interval[0]; // 79
            int nextEnd = interval[1]; // 80

            if (currentEnd >= nextStart) { // 81
                currentInterval[1] = Math.max(currentEnd, nextEnd); // 82
            } else { // 83
                currentInterval = interval; // 84
                result.add(currentInterval); // 85
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public int[][] merge8(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // 86
        List<int[]> merged = new ArrayList<>(); // 87
        for (int[] interval : intervals) { // 88
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) { // 89
                merged.add(interval); // 90
            } else { // 91
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]); // 92
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static int[][] merge9(int[][] intervals) {
        if (intervals.length <= 1) { // 93
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0])); // 94

        List<int[]> mergedList = new ArrayList<>(); // 95
        int[] currentInterval = intervals[0]; // 96
        mergedList.add(currentInterval); // 97

        for (int[] interval : intervals) { // 98
            int currentEnd = currentInterval[1]; // 99
            int nextStart = interval[0]; // 100
            int nextEnd = interval[1]; // 101

            if (currentEnd >= nextStart) { // 102
                currentInterval[1] = Math.max(currentEnd, nextEnd); // 103
            } else { // 104
                currentInterval = interval; // 105
                mergedList.add(currentInterval); // 106
            }
        }

        return mergedList.toArray(new int[mergedList.size()][]);
    }


    public int[][] merge10(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // 107

        List<int[]> merged = new ArrayList<>(); // 108
        int[] currentInterval = intervals[0]; // 109
        merged.add(currentInterval); // 110

        for (int[] interval : intervals) { // 111
            int currentEnd = currentInterval[1]; // 112
            int nextStart = interval[0]; // 113
            int nextEnd = interval[1]; // 114

            if (currentEnd >= nextStart) { // 115
                currentInterval[1] = Math.max(currentEnd, nextEnd); // 116
            } else { // 117
                currentInterval = interval; // 118
                merged.add(currentInterval); // 119
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public int[][] merge11(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // 121

        List<int[]> merged = new ArrayList<>(); // 122
        int[] currentInterval = intervals[0]; // 123
        merged.add(currentInterval); // 124

        for (int[] interval : intervals) { // 125
            int currentEnd = currentInterval[1]; // 126
            int nextStart = interval[0]; // 127

            if (nextStart <= currentEnd) { // 128
                currentInterval[1] = Math.max(currentEnd, interval[1]); // 129
            } else { // 130
                currentInterval = interval; // 131
                merged.add(currentInterval); // 132
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public int[][] mergeIntervals12(int[][] intervals) {
        if(intervals.length <= 1) { // 133
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // 134

        List<int[]> merged = new ArrayList<>(); // 135
        int[] currentInterval = intervals[0]; // 136
        merged.add(currentInterval); // 137

        for(int[] interval : intervals) { // 138
            int currentEnd = currentInterval[1]; // 139
            int nextStart = interval[0]; // 140
            int nextEnd = interval[1]; // 141

            if(currentEnd >= nextStart) { // 142
                currentInterval[1] = Math.max(currentEnd, nextEnd); // 143
            } else { // 144
                currentInterval = interval; // 145
                merged.add(currentInterval); // 146
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public int[][] merge13(int[][] intervals) {
        if (intervals.length <= 1) { // 147
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0])); // 148

        List<int[]> result = new ArrayList<>(); // 149
        int[] currentInterval = intervals[0]; // 150
        result.add(currentInterval); // 151

        for (int[] interval : intervals) { // 152
            int currentEnd = currentInterval[1]; // 153
            int nextBegin = interval[0]; // 154
            int nextEnd = interval[1]; // 155

            if (currentEnd >= nextBegin) { // 156
                currentInterval[1] = Math.max(currentEnd, nextEnd); // 157
            } else { // 158
                currentInterval = interval; // 159
                result.add(currentInterval); // 160
            }
        }

        return result.toArray(new int[result.size()][]);
    }


    public int[][] merge14(int[][] intervals) {
        if (intervals.length <= 1) { // 161
            return intervals;
        }


        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // 162

        LinkedList<int[]> merged = new LinkedList<>(); // 163
        for (int[] interval : intervals) { // 164

            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) { // 165
                merged.add(interval); // 166
            }
            else { // 167
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]); // 168
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }


    public int[][] merge15(int[][] intervals) {
        if(intervals.length <= 1) { // 169
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // 170

        List<int[]> merged = new ArrayList<>(); // 171
        int[] currentInterval = intervals[0]; // 172
        merged.add(currentInterval); // 173

        for(int[] interval : intervals) { // 174
            int currentEnd = currentInterval[1]; // 175
            int nextStart = interval[0]; // 176
            int nextEnd = interval[1]; // 177

            if(currentEnd >= nextStart) { // 178
                currentInterval[1] = Math.max(currentEnd, nextEnd); // 179
            } else { // 180
                currentInterval = interval; // 181
                merged.add(currentInterval); // 182
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public int[][] merge16(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // 184

        List<int[]> merged = new ArrayList<>(); // 185
        for (int[] interval : intervals) { // 186
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) { // 187
                merged.add(interval); // 188
            } else { // 189
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]); // 190
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }


    public int[][] merge17(int[][] intervals) {
        if(intervals==null||intervals.length<=1) // 191
            return intervals;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0])); // 192
        LinkedList<int[]> res = new LinkedList<>(); // 193
        for(int[] interval : intervals) { // 194
            if(res.isEmpty()||interval[0]>res.getLast()[1]) // 195
                res.add(interval); // 196
            else // 197
                res.getLast()[1] = Math.max(res.getLast()[1],interval[1]); // 198
        }
        return res.toArray(new int[res.size()][]);
    }

    public int[][] merge18(int[][] intervals) {
        if (intervals.length <= 1) { // 199
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // 200

        List<int[]> merged = new ArrayList<>(); // 201
        int[] currentInterval = intervals[0]; // 202
        merged.add(currentInterval); // 203

        for (int[] interval : intervals) { // 204
            int currentEnd = currentInterval[1]; // 205
            int nextStart = interval[0]; // 206
            int nextEnd = interval[1]; // 207

            if (currentEnd >= nextStart) { // 208
                currentInterval[1] = Math.max(currentEnd, nextEnd); // 209
            } else { // 210
                currentInterval = interval; // 211
                merged.add(currentInterval); // 212
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }


