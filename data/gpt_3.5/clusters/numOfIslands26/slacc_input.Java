
class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) { // 1
            return 0;
        }

        int numRows = grid.length; // 2
        int numCols = grid[0].length; // 3
        int numIslands = 0; // 4

        for (int i = 0; i < numRows; i++) { // 5
            for (int j = 0; j < numCols; j++) { // 6
                if (grid[i][j] == '1') { // 7
                    numIslands++; // 8
                    dfs(grid, i, j); // 9
                }
            }
        }

        return numIslands;
    }

    private void dfs(char[][] grid, int row, int col) { // 10
        int numRows = grid.length; // 11
        int numCols = grid[0].length; // 12

        if (row < 0 || col < 0 || row >= numRows || col >= numCols || grid[row][col] == '0') { // 13
            return;
        }

        grid[row][col] = '0'; // 14
        dfs(grid, row + 1, col); // 15
        dfs(grid, row - 1, col); // 16
        dfs(grid, row, col + 1); // 17
        dfs(grid, row, col - 1); // 18
    }
}


class Solution {
    public int numIslands(char[][] grid) {
        int numOfIslands = 0; // 19
        for (int i = 0; i < grid.length; i++) { // 20
            for (int j = 0; j < grid[i].length; j++) { // 21
                if (grid[i][j] == '1') { // 22
                    numOfIslands++; // 23
                    dfs(grid, i, j); // 24
                }
            }
        }
        return numOfIslands;
    }

    private void dfs(char[][] grid, int row, int col) { // 25
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[row].length || grid[row][col] == '0') { // 26
            return;
        }

        grid[row][col] = '0'; // 27
        dfs(grid, row-1, col); // 28
        dfs(grid, row+1, col); // 29
        dfs(grid, row, col-1); // 30
        dfs(grid, row, col+1); // 31
    }
}


public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0; // 32
        for (int i = 0; i < grid.length; i++) { // 33
            for (int j = 0; j < grid[0].length; j++) { // 34
                if (grid[i][j] == '1') { // 35
                    dfs(grid, i, j); // 36
                    count++; // 37
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) { // 38
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') { // 39
            return;
        }
        grid[i][j] = '0'; // 40
        dfs(grid, i + 1, j); // 41
        dfs(grid, i - 1, j); // 42
        dfs(grid, i, j + 1); // 43
        dfs(grid, i, j - 1); // 44
    }
}


public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int rows = grid.length; // 45
        int columns = grid[0].length; // 46
        int count = 0; // 47

        for (int i = 0; i < rows; i++) { // 48
            for (int j = 0; j < columns; j++) { // 49
                if (grid[i][j] == '1') { // 50
                    dfs(grid, i, j); // 51
                    count++; // 52
                }
            }
        }

        return count;
    }

    public void dfs(char[][] grid, int row, int column) {
        int rows = grid.length; // 53
        int columns = grid[0].length; // 54

        if (row < 0 || column < 0 || row >= rows || column >= columns || grid[row][column] != '1') { // 55
            return;
        }

        grid[row][column] = '0'; // 56

        dfs(grid, row + 1, column); // 57
        dfs(grid, row - 1, column); // 58
        dfs(grid, row, column + 1); // 59
        dfs(grid, row, column - 1); // 60
    }
}


class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length; // 61
        int n = grid[0].length; // 62
        int count = 0; // 63
        for (int i = 0; i < m; i++) { // 64
            for (int j = 0; j < n; j++) { // 65
                if (grid[i][j] == '1') { // 66
                    count++; // 67
                    dfs(grid, i, j); // 68
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int i, int j) {
        int m = grid.length; // 69
        int n = grid[0].length; // 70
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') { // 71
            return;
        }
        grid[i][j] = '0'; // 72
        dfs(grid, i-1, j); // 73
        dfs(grid, i+1, j); // 74
        dfs(grid, i, j-1); // 75
        dfs(grid, i, j+1); // 76
    }
}


class Solution {
    int numIslands(char[][] grid) { // 77
        int m = grid.length; // 78
        int n = grid[0].length; // 79
        int count = 0; // 80

        for (int i = 0; i < m; i++) { // 81
            for (int j = 0; j < n; j++) { // 82
                if (grid[i][j] == '1') { // 83
                    count++; // 84
                    dfs(grid, i, j); // 85
                }
            }
        }

        return count;
    }

    void dfs(char[][] grid, int i, int j) { // 86
        int m = grid.length; // 87
        int n = grid[0].length; // 88

        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') { // 89
            return;
        }

        grid[i][j] = '0'; // 90

        dfs(grid, i + 1, j); // 91
        dfs(grid, i - 1, j); // 92
        dfs(grid, i, j + 1); // 93
        dfs(grid, i, j - 1); // 94
    }
}


class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length; // 95
        int n = grid[0].length; // 96
        int count = 0; // 97

        for (int i = 0; i < m; i++) { // 98
            for (int j = 0; j < n; j++) { // 99
                if (grid[i][j] == '1') { // 100
                    count++; // 101
                    dfs(grid, i, j); // 102
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j) { // 103
        int m = grid.length; // 104
        int n = grid[0].length; // 105

        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') { // 106
            return;
        }

        grid[i][j] = '0'; // 107

        dfs(grid, i-1, j); // 108
        dfs(grid, i+1, j); // 109
        dfs(grid, i, j-1); // 110
        dfs(grid, i, j+1); // 111
    }
}


public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int m = grid.length; // 112
        int n = grid[0].length; // 113
        int count = 0; // 114

        for (int i = 0; i < m; i++) { // 115
            for (int j = 0; j < n; j++) { // 116
                if (grid[i][j] == '1') { // 117
                    count++; // 118
                    dfs(grid, i, j); // 119
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j) { // 120
        int m = grid.length; // 121
        int n = grid[0].length; // 122

        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != '1') { // 123
            return;
        }

        grid[i][j] = '0'; // 124

        dfs(grid, i + 1, j); // 125
        dfs(grid, i - 1, j); // 126
        dfs(grid, i, j + 1); // 127
        dfs(grid, i, j - 1); // 128
    }
}


class Solution {
    public int numIslands(char[][] grid) {
        int count = 0; // 129
        for (int i = 0; i < grid.length; i++) { // 130
            for (int j = 0; j < grid[i].length; j++) { // 131
                if (grid[i][j] == '1') { // 132
                    count++; // 133
                    exploreIsland(grid, i, j); // 134
                }
            }
        }
        return count;
    }

    private void exploreIsland(char[][] grid, int row, int col) { // 135
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[row].length || grid[row][col] != '1') { // 136
            return;
        }

        grid[row][col] = '0'; // 137
        exploreIsland(grid, row+1, col); // 138
        exploreIsland(grid, row-1, col); // 139
        exploreIsland(grid, row, col+1); // 140
        exploreIsland(grid, row, col-1); // 141
    }
}



class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length; // 142
        int n = grid[0].length; // 143

        int count = 0; // 144

        for (int i = 0; i < m; i++) { // 145
            for (int j = 0; j < n; j++) { // 146
                if (grid[i][j] == '1') { // 147
                    dfs(grid, i, j); // 148
                    count++; // 149
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j) { // 150
        int m = grid.length; // 151
        int n = grid[0].length; // 152

        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') { // 153
            return;
        }

        grid[i][j] = '0'; // 154

        dfs(grid, i - 1, j); // 155
        dfs(grid, i + 1, j); // 156
        dfs(grid, i, j - 1); // 157
        dfs(grid, i, j + 1); // 158
    }
}



public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0; // 159
        for (int i = 0; i < grid.length; i++) { // 160
            for (int j = 0; j < grid[i].length; j++) { // 161
                if (grid[i][j] == '1') { // 162
                    count++; // 163
                    dfs(grid, i, j); // 164
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int row, int col) { // 165
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || grid[row][col] == '0') { // 166
            return;
        }

        grid[row][col] = '0'; // 167

        dfs(grid, row - 1, col); // 168
        dfs(grid, row + 1, col); // 169
        dfs(grid, row, col - 1); // 170
        dfs(grid, row, col + 1); // 171
    }
}


public class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length; // 172
        int n = grid[0].length; // 173
        int count = 0; // 174

        for (int i = 0; i < m; i++) { // 175
            for (int j = 0; j < n; j++) { // 176
                if (grid[i][j] == '1') { // 177
                    count++; // 178
                    dfs(grid, i, j); // 179
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int row, int col) { // 180
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0') { // 181
            return;
        }

        grid[row][col] = '0'; // 182

        dfs(grid, row - 1, col); // 183
        dfs(grid, row + 1, col); // 184
        dfs(grid, row, col - 1); // 185
        dfs(grid, row, col + 1); // 186
    }
}


public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int m = grid.length; // 187
        int n = grid[0].length; // 188
        int count = 0; // 189

        for (int i = 0; i < m; i++) { // 190
            for (int j = 0; j < n; j++) { // 191
                if (grid[i][j] == '1') { // 192
                    count++; // 193
                    dfs(grid, i, j); // 194
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j) { // 195
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != '1') { // 196
            return;
        }

        grid[i][j] = '0'; // 197

        dfs(grid, i+1, j); // 198
        dfs(grid, i-1, j); // 199
        dfs(grid, i, j+1); // 200
        dfs(grid, i, j-1); // 201
    }
}


class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length; // 202
        int n = grid[0].length; // 203
        int count = 0; // 204

        for (int i = 0; i < m; i++) { // 205
            for (int j = 0; j < n; j++) { // 206
                if (grid[i][j] == '1') { // 207
                    count++; // 208
                    dfs(grid, i, j); // 209
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j) { // 210
        int m = grid.length; // 211
        int n = grid[0].length; // 212

        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') { // 213
            return;
        }

        grid[i][j] = '0'; // 214

        dfs(grid, i - 1, j); // 215
        dfs(grid, i + 1, j); // 216
        dfs(grid, i, j - 1); // 217
        dfs(grid, i, j + 1); // 218
    }
}


class Solution {
    public int numIslands(char[][] grid) {
        int count = 0; // 219
        for (int i = 0; i < grid.length; i++) { // 220
            for (int j = 0; j < grid[i].length; j++) { // 221
                if (grid[i][j] == '1') { // 222
                    dfs(grid, i, j); // 223
                    count++; // 224
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) { // 225
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') { // 226
            return;
        }

        grid[i][j] = '0'; // 227

        dfs(grid, i+1, j); // 228
        dfs(grid, i-1, j); // 229
        dfs(grid, i, j+1); // 230
        dfs(grid, i, j-1); // 231
    }
}



public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0; // 232
        for (int i = 0; i < grid.length; i++) { // 233
            for (int j = 0; j < grid[i].length; j++) { // 234
                if (grid[i][j] == '1') { // 235
                    count++; // 236
                    dfs(grid, i, j); // 237
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) { // 238
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != '1') { // 239
            return;
        }
        grid[i][j] = '0'; // 240
        dfs(grid, i - 1, j); // 241
        dfs(grid, i + 1, j); // 242
        dfs(grid, i, j - 1); // 243
        dfs(grid, i, j + 1); // 244
    }
}



class Solution {
    public int numIslands(char[][] grid) {
        int count = 0; // 245
        for (int i = 0; i < grid.length; i++) { // 246
            for (int j = 0; j < grid[i].length; j++) { // 247
                if (grid[i][j] == '1') { // 248
                    count++; // 249
                    dfs(grid, i, j); // 250
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != '1') { // 251
            return;
        }

        grid[i][j] = '0'; // 252

        dfs(grid, i + 1, j); // 253
        dfs(grid, i - 1, j); // 254
        dfs(grid, i, j + 1); // 255
        dfs(grid, i, j - 1); // 256
    }
}


public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0; // 257
        for (int i = 0; i < grid.length; i++) { // 258
            for (int j = 0; j < grid[0].length; j++) { // 259
                if (grid[i][j] == '1') { // 260
                    count++; // 261
                    dfs(grid, i, j); // 262
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) { // 263
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') { // 264
            return;
        }
        grid[i][j] = '0'; // 265
        dfs(grid, i + 1, j); // 266
        dfs(grid, i - 1, j); // 267
        dfs(grid, i, j + 1); // 268
        dfs(grid, i, j - 1); // 269
    }
}



public class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length; // 270
        int n = grid[0].length; // 271
        int count = 0; // 272

        for (int i = 0; i < m; i++) { // 273
            for (int j = 0; j < n; j++) { // 274
                if (grid[i][j] == '1') { // 275
                    count++; // 276
                    dfs(grid, i, j); // 277
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j) { // 278
        int m = grid.length; // 279
        int n = grid[0].length; // 280

        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0') { // 281
            return;
        }

        grid[i][j] = '0'; // 282

        dfs(grid, i - 1, j); // 283
        dfs(grid, i + 1, j); // 284
        dfs(grid, i, j - 1); // 285
        dfs(grid, i, j + 1); // 286
    }
}



class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length; // 287
        int n = grid[0].length; // 288
        int numIslands = 0; // 289

        for (int i = 0; i < m; i++) { // 290
            for (int j = 0; j < n; j++) { // 291
                if (grid[i][j] == '1') { // 292
                    numIslands++; // 293
                    dfs(grid, i, j); // 294
                }
            }
        }

        return numIslands;
    }

    private void dfs(char[][] grid, int i, int j) { // 295
        int m = grid.length; // 296
        int n = grid[0].length; // 297

        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') { // 298
            return;
        }

        grid[i][j] = '0'; // 299

        dfs(grid, i-1, j); // 300
        dfs(grid, i+1, j); // 301
        dfs(grid, i, j-1); // 302
        dfs(grid, i, j+1); // 303
    }
}

