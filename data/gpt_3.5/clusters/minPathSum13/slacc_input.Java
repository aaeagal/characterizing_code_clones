
public class MinimumPathSum {
    public int minPathSum1(int[][] grid) {
        int m = grid.length; // 1
        int n = grid[0].length; // 2

        int[][] dp = new int[m][n]; // 3
        dp[0][0] = grid[0][0]; // 4

        for (int i = 1; i < m; i++) { // 5
            dp[i][0] = dp[i-1][0] + grid[i][0]; // 6
        }

        for (int j = 1; j < n; j++) { // 7
            dp[0][j] = dp[0][j-1] + grid[0][j]; // 8
        }

        for (int i = 1; i < m; i++) { // 9
            for (int j = 1; j < n; j++) { // 10
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; // 11
            }
        }

        return dp[m-1][n-1];
    }

    public int minPathSum2(int[][] grid) {
        if (grid == null || grid.length == 0) { // 12
            return 0;
        }
        int m = grid.length; // 13
        int n = grid[0].length; // 14
        int[][] dp = new int[m][n]; // 15

        dp[0][0] = grid[0][0]; // 16

        for (int i = 1; i < m; i++) { // 17
            dp[i][0] = dp[i-1][0] + grid[i][0]; // 18
        }

        for (int j = 1; j < n; j++) { // 19
            dp[0][j] = dp[0][j-1] + grid[0][j]; // 20
        }

        for (int i = 1; i < m; i++) { // 21
            for (int j = 1; j < n; j++) { // 22
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; // 23
            }
        }

        return dp[m-1][n-1];
    }

   public int minPathSum3(int[][] grid) {
      int m = grid.length; // 24
      int n = grid[0].length; // 25

      int[][] dp = new int[m][n]; // 26

      dp[0][0] = grid[0][0]; // 27

      for (int i = 1; i < m; i++) { // 28
         dp[i][0] = dp[i - 1][0] + grid[i][0]; // 29
      }

      for (int j = 1; j < n; j++) { // 30
         dp[0][j] = dp[0][j - 1] + grid[0][j]; // 31
      }

      for (int i = 1; i < m; i++) { // 32
         for (int j = 1; j < n; j++) { // 33
            dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j]; // 34
         }
      }

      return dp[m - 1][n - 1];
   }

    public int minPathSum4(int[][] grid) {
        int m = grid.length; // 35
        int n = grid[0].length; // 36
        int[][] dp = new int[m][n]; // 37

        dp[0][0] = grid[0][0]; // 38

        for (int i = 1; i< m; i++) { // 39
            dp[i][0] = dp[i-1][0] + grid[i][0]; // 40
        }

        for (int j = 1; j < n; j++) { // 41
            dp[0][j] = dp[0][j-1] + grid[0][j]; // 42
        }

        for (int i = 1; i < m; i++) { // 43
            for (int j = 1; j < n; j++) { // 44
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; // 45
            }
        }

        return dp[m-1][n-1];
    }



    public int minPathSum5(int[][] grid) {
        int m = grid.length; // 46
        int n = grid[0].length; // 47
        int[][] dp = new int[m][n]; // 48

        dp[0][0] = grid[0][0]; // 49

        for(int i = 1; i < m; i++) { // 50
            dp[i][0] = dp[i-1][0] + grid[i][0]; // 51
        }

        for(int j = 1; j < n; j++) { // 52
            dp[0][j] = dp[0][j-1] + grid[0][j]; // 53
        }

        for(int i = 1; i < m; i++) { // 54
            for(int j = 1; j < n; j++) { // 55
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; // 56
            }
        }

        return dp[m-1][n-1];
    }




   public int minPathSum6(int[][] grid) {
      int m = grid.length; // 57
      int n = grid[0].length; // 58

      int[][] dp = new int[m][n]; // 59

      dp[0][0] = grid[0][0]; // 60

      for (int i = 1; i < m; i++) { // 61
         dp[i][0] = dp[i - 1][0] + grid[i][0]; // 62
      }

      for (int i = 1; i < n; i++) { // 63
         dp[0][i] = dp[0][i - 1] + grid[0][i]; // 64
      }

      for (int i = 1; i < m; i++) { // 65
         for (int j = 1; j < n; j++) { // 66
            dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; // 67
         }
      }

      return dp[m-1][n-1];
   }

    public static int minPathSum7(int[][] grid) {
        int m = grid.length; // 68
        int n = grid[0].length; // 69

        int[][] dp = new int[m][n]; // 70
        dp[0][0] = grid[0][0]; // 71

        for (int i = 1; i < m; i++) { // 72
            dp[i][0] = dp[i-1][0] + grid[i][0]; // 73
        }

        for (int j = 1; j < n; j++) { // 74
            dp[0][j] = dp[0][j-1] + grid[0][j]; // 75
        }

        for (int i = 1; i < m; i++) { // 76
            for (int j = 1; j < n; j++) { // 77
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; // 78
            }
        }

        return dp[m-1][n-1];
    }

  public int minPathSum8(int[][] grid) {
    int m = grid.length; // 79
    int n = grid[0].length; // 80

    int[][] dp = new int[m][n]; // 81
    dp[0][0] = grid[0][0]; // 82

    for (int i = 1; i < m; i++) { // 83
      dp[i][0] = dp[i - 1][0] + grid[i][0]; // 84
    }

    for (int j = 1; j < n; j++) { // 85
      dp[0][j] = dp[0][j - 1] + grid[0][j]; // 86
    }

    for (int i = 1; i < m; i++) { // 87
      for (int j = 1; j < n; j++) { // 88
        dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j]; // 89
      }
    }

    return dp[m - 1][n - 1];
  }

    public int minPathSum9(int[][] grid) {
        if (grid == null || grid.length == 0) { // 90
            return 0;
        }
        int m = grid.length; // 91
        int n = grid[0].length; // 92
        int[][] dp = new int[m][n]; // 93
        dp[0][0] = grid[0][0]; // 94
        for (int i = 1; i < m; i++) { // 95
            dp[i][0] = dp[i - 1][0] + grid[i][0]; // 96
        }
        for (int j = 1; j < n; j++) { // 97
            dp[0][j] = dp[0][j - 1] + grid[0][j]; // 98
        }
        for (int i = 1; i < m; i++) { // 99
            for (int j = 1; j < n; j++) { // 100
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j]; // 101
            }
        }
        return dp[m - 1][n - 1];
    }

  public static int minPathSum10(int[][] grid) {
    int m = grid.length; // 102
    int n = grid[0].length; // 103
    int[][] dp = new int[m][n]; // 104

    dp[0][0] = grid[0][0]; // 105

    for (int i = 1; i < m; i++) { // 106
      dp[i][0] = dp[i - 1][0] + grid[i][0]; // 107
    }

    for (int j = 1; j < n; j++) { // 108
      dp[0][j] = dp[0][j - 1] + grid[0][j]; // 109
    }

    for (int i = 1; i < m; i++) { // 110
      for (int j = 1; j < n; j++) { // 111
        dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j]; // 112
      }
    }

    return dp[m - 1][n - 1];
  }

    public int minPathSum11(int[][] grid) {
        int m = grid.length; // 113
        int n = grid[0].length; // 114
        int[][] dp = new int[m][n]; // 115
        dp[0][0] = grid[0][0]; // 116
        for (int i = 1; i < m; i++) { // 117
            dp[i][0] = dp[i-1][0] + grid[i][0]; // 118
        }
        for (int j = 1; j < n; j++) { // 119
            dp[0][j] = dp[0][j-1] + grid[0][j]; // 120
        }
        for (int i = 1; i < m; i++) { // 121
            for (int j = 1; j < n; j++) { // 122
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; // 123
            }
        }
        return dp[m-1][n-1];
    }

    public int minPathSum12(int[][] grid) {
        int m = grid.length; // 124
        int n = grid[0].length; // 125

        int[][] dp = new int[m][n]; // 126
        dp[0][0] = grid[0][0]; // 127

        for (int i = 1; i < m; i++) { // 128
            dp[i][0] = dp[i-1][0] + grid[i][0]; // 129
        }

        for (int j = 1; j < n; j++) { // 130
            dp[0][j] = dp[0][j-1] + grid[0][j]; // 131
        }

        for (int i = 1; i < m; i++) { // 132
            for (int j = 1; j < n; j++) { // 133
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; // 134
            }
        }

        return dp[m-1][n-1];
    }

    public int minPathSum13(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int m = grid.length; // 135
        int n = grid[0].length; // 136

        int[][] dp = new int[m][n]; // 137
        dp[0][0] = grid[0][0]; // 138

        for (int i = 1; i < m; i++) { // 139
            dp[i][0] = dp[i-1][0] + grid[i][0]; // 140
        }

        for (int j = 1; j < n; j++) { // 141
            dp[0][j] = dp[0][j-1] + grid[0][j]; // 142
        }

        for (int i = 1; i < m; i++) { // 143
            for (int j = 1; j < n; j++) { // 144
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; // 145
            }
        }

        return dp[m-1][n-1];
    }

    public int minPathSum14(int[][] grid) {
        int m = grid.length; // 146
        int n = grid[0].length; // 147

        int[][] dp = new int[m][n]; // 148

        dp[0][0] = grid[0][0]; // 149

        for (int i = 1; i < m; i++) { // 150
            dp[i][0] = dp[i-1][0] + grid[i][0]; // 151
        }

        for (int j = 1; j < n; j++) { // 152
            dp[0][j] = dp[0][j-1] + grid[0][j]; // 153
        }

        for (int i = 1; i < m; i++) { // 154
            for (int j = 1; j < n; j++) { // 155
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; // 156
            }
        }

        return dp[m-1][n-1];
    }

   public int minPathSum15(int[][] grid) {
      int m = grid.length; // 157
      int n = grid[0].length; // 158
      int[][] dp = new int[m][n]; // 159

      for(int i=0; i<m; i++) { // 160
         for(int j=0; j<n; j++) { // 161
            if(i == 0 && j == 0) // 162
               dp[i][j] = grid[i][j]; // 163
            else if(i == 0) // 164
               dp[i][j] = dp[i][j-1] + grid[i][j]; // 165
            else if(j == 0) // 166
               dp[i][j] = dp[i-1][j] + grid[i][j]; // 167
            else // 168
               dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; // 169
         }
      }

      return dp[m-1][n-1];
   }



public int minPathSum16(int[][] grid) {
    if (grid == null || grid.length == 0 || grid[0].length == 0) { // 170
        return 0;
    }

    int m = grid.length; // 171
    int n = grid[0].length; // 172

    int[][] dp = new int[m][n]; // 173
    dp[0][0] = grid[0][0]; // 174

    for (int i = 1; i < m; i++) { // 175
        dp[i][0] = dp[i-1][0] + grid[i][0]; // 176
    }

    for (int j = 1; j < n; j++) { // 177
        dp[0][j] = dp[0][j-1] + grid[0][j]; // 178
    }

    for (int i = 1; i < m; i++) { // 179
        for (int j = 1; j < n; j++) { // 180
            dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; // 181
        }
    }

    return dp[m-1][n-1];
}


    public int minPathSum17(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) { // 182
            return 0;
        }

        int rows = grid.length; // 183
        int cols = grid[0].length; // 184

        int[][] dp = new int[rows][cols]; // 185
        dp[0][0] = grid[0][0]; // 186

        for (int i = 1; i < cols; i++) { // 187
            dp[0][i] = dp[0][i-1] + grid[0][i]; // 188
        }

        for (int i = 1; i < rows; i++) { // 189
            dp[i][0] = dp[i-1][0] + grid[i][0]; // 190
        }

        for (int i = 1; i < rows; i++) { // 191
            for (int j = 1; j < cols; j++) { // 192
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; // 193
            }
        }

        return dp[rows-1][cols-1];
    }

    public int minPathSum18(int[][] grid) {
        int m = grid.length; // 194
        int n = grid[0].length; // 195
        int[][] dp = new int[m][n]; // 196

        dp[0][0] = grid[0][0]; // 197

        for (int i = 1; i < m; i++) { // 198
            dp[i][0] = dp[i-1][0] + grid[i][0]; // 199
        }

        for (int j = 1; j < n; j++) { // 200
            dp[0][j] = dp[0][j-1] + grid[0][j]; // 201
        }

        for (int i = 1; i < m; i++) { // 202
            for (int j = 1; j < n; j++) { // 203
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; // 204
            }
        }

        return dp[m-1][n-1];
    }

    public static int minPathSum19(int[][] grid) {
        int m = grid.length; // 205
        int n = grid[0].length; // 206
        int[][] dp = new int[m][n]; // 207

        dp[0][0] = grid[0][0]; // 208

        for (int i = 1; i < m; i++) { // 209
            dp[i][0] = dp[i-1][0] + grid[i][0]; // 210
        }

        for (int j = 1; j < n; j++) { // 211
            dp[0][j] = dp[0][j-1] + grid[0][j]; // 212
        }

        for (int i = 1; i < m; i++) { // 213
            for (int j = 1; j < n; j++) { // 214
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; // 215
            }
        }

        return dp[m-1][n-1];
    }


    public int minPathSum20(int[][] grid) {
        int m = grid.length; // 216
        int n = grid[0].length; // 217

        int[][] dp = new int[m][n]; // 218
        dp[0][0] = grid[0][0]; // 219

        for (int i = 1; i < m; i++) { // 220
            dp[i][0] = dp[i-1][0] + grid[i][0]; // 221
        }

        for (int j = 1; j < n; j++) { // 222
            dp[0][j] = dp[0][j-1] + grid[0][j]; // 223
        }

        for (int i = 1; i < m; i++) { // 224
            for (int j = 1; j < n; j++) { // 225
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; // 226
            }
        }

        return dp[m-1][n-1];
    }
}

