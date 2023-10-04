
public class Interleave {
    public static boolean isInterleave1(String s1, String s2, String s3) {
        int m = s1.length(); // 1
        int n = s2.length(); // 2

        if (m + n != s3.length()) { // 3
            return false;
        }

        boolean[][] dp = new boolean[m+1][n+1]; // 4

        for (int i = 0; i <= m; i++) { // 5
            for (int j = 0; j <= n; j++) { // 6
                if (i == 0 && j == 0) { // 7
                    dp[i][j] = true; // 8
                } else if (i == 0) { // 9
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1); // 10
                } else if (j == 0) { // 11
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1); // 12
                } else { // 13
                    dp[i][j] = (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1)) // 14
                            || (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)); // 15
                }
            }
        }

        return dp[m][n];
    }


    public static boolean isInterleaved2(String s1, String s2, String s3) {
        int m = s1.length(); // 16
        int n = s2.length(); // 17

        if (s3.length() != m + n) { // 18
            return false;
        }

        boolean[][] dp = new boolean[m+1][n+1]; // 19

        for (int i = 0; i <= m; i++) { // 20
            for (int j = 0; j <= n; j++) { // 21
                if (i == 0 && j == 0) { // 22
                    dp[i][j] = true; // 23
                } else if (i == 0) { // 24
                    dp[i][j] = (s2.charAt(j-1) == s3.charAt(j-1)) && dp[i][j-1]; // 25
                } else if (j == 0) { // 26
                    dp[i][j] = (s1.charAt(i-1) == s3.charAt(i-1)) && dp[i-1][j]; // 27
                } else { // 28
                    dp[i][j] = ((s1.charAt(i-1) == s3.charAt(i+j-1)) && dp[i-1][j]) || // 29
                            ((s2.charAt(j-1) == s3.charAt(i+j-1)) && dp[i][j-1]); // 30
                }
            }
        }

        return dp[m][n];
    }


   public static boolean isInterleaved3(String s1, String s2, String s3) {
        int m = s1.length(), n = s2.length(); // 31

        if ((m + n) != s3.length()) { // 32
            return false;
        }

        boolean[][] dp = new boolean[m + 1][n + 1]; // 33

        for (int i = 0; i <= m; i++) { // 34
            for (int j = 0; j <= n; j++) { // 35
                if (i == 0 && j == 0) { // 36
                    dp[i][j] = true; // 37
                } else if (i == 0) { // 38
                    dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1)); // 39
                } else if (j == 0) { // 40
                    dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)); // 41
                } else { // 42
                    dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) // 43
                            || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1)); // 44
                }
            }
        }

        return dp[m][n];
    }



    public boolean isInterleaving4(String s1, String s2, String s3) {
        int m = s1.length(); // 45
        int n = s2.length(); // 46

        if (m + n != s3.length()) { // 47
            return false;
        }

        boolean[][] dp = new boolean[m + 1][n + 1]; // 48

        for (int i = 0; i <= m; i++) { // 49
            for (int j = 0; j <= n; j++) { // 50
                if (i == 0 && j == 0) { // 51
                    dp[i][j] = true; // 52
                } else if (i == 0) { // 53
                    dp[i][j] = dp[i][j - 1] && (s2.charAt(j - 1) == s3.charAt(i + j - 1)); // 54
                } else if (j == 0) { // 55
                    dp[i][j] = dp[i - 1][j] && (s1.charAt(i - 1) == s3.charAt(i + j - 1)); // 56
                } else { // 57
                    dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) || // 58
                            (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1)); // 59
                }
            }
        }

        return dp[m][n];
    }

    public static boolean isInterleaved5(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) { // 60
            return false;
        }

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1]; // 61

        for (int i = 0; i <= s1.length(); i++) { // 62
            for (int j = 0; j <= s2.length(); j++) { // 63
                if (i == 0 && j == 0) { // 64
                    dp[i][j] = true; // 65
                } else if (i == 0) { // 66
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(j-1); // 67
                } else if (j == 0) { // 68
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i-1); // 69
                } else { // 70
                    dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)) || // 71
                               (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1)); // 72
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }

    public static boolean isInterleaved6(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) { // 73
            return false;
        }

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1]; // 74

        for (int i = 0; i <= s1.length(); i++) { // 75
            for (int j = 0; j <= s2.length(); j++) { // 76
                if (i == 0 && j == 0) { // 77
                    dp[i][j] = true; // 78
                } else if (i == 0) { // 79
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(j-1); // 80
                } else if (j == 0) { // 81
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i-1); // 82
                } else { // 83
                    dp[i][j] = (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1)) // 84
                            || (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)); // 85
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }



    public boolean isInterleave7(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) { // 86
            return false;
        }

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1]; // 87

        for (int i = 0; i <= s1.length(); i++) { // 88
            for (int j = 0; j <= s2.length(); j++) { // 89
                if (i == 0 && j == 0) { // 90
                    dp[i][j] = true; // 91
                } else if (i == 0) { // 92
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1); // 93
                } else if (j == 0) { // 94
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1); // 95
                } else { // 96
                    dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)) || // 97
                            (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1)); // 98
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }




    public static boolean isInterleaved8(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) { // 99
            return false;
        }

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1]; // 100

        for (int i = 0; i <= s1.length(); i++) { // 101
            for (int j = 0; j <= s2.length(); j++) { // 102
                if (i == 0 && j == 0) { // 103
                    dp[i][j] = true; // 104
                } else if (i == 0) { // 105
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1); // 106
                } else if (j == 0) { // 107
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1); // 108
                } else { // 109
                    dp[i][j] = (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1)) || // 110
                               (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)); // 111
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }



    public static boolean isInterleave9(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length()) { // 112
            return false;
        }

        boolean[][] dp = new boolean[s1.length()+1][s2.length()+1]; // 113

        for(int i=0; i<=s1.length(); i++) { // 114
            for(int j=0; j<=s2.length(); j++) { // 115
                if(i==0 && j==0) { // 116
                    dp[i][j] = true; // 117
                }
                else if(i==0) { // 118
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(j-1); // 119
                }
                else if(j==0) { // 120
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i-1); // 121
                }
                else { // 122
                    dp[i][j] = (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1)) || (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)); // 123
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }


public boolean isInterleave10(String s1, String s2, String s3) {
    int m = s1.length(); // 124
    int n = s2.length(); // 125

    if (s3.length() != m + n) { // 126
        return false;
    }

    boolean[][] dp = new boolean[m + 1][n + 1]; // 127

    for (int i = 0; i <= m; i++) { // 128
        for (int j = 0; j <= n; j++) { // 129
            if (i == 0 && j == 0) { // 130
                dp[i][j] = true; // 131
            } else if (i == 0) { // 132
                dp[i][j] = dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1); // 133
            } else if (j == 0) { // 134
                dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i - 1); // 135
            } else { // 136
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) // 137
                        || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1)); // 138
            }
        }
    }

    return dp[m][n];
}


    public static boolean isInterleaved11(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()) { // 139
            return false;
        }

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1]; // 140
        dp[0][0] = true; // 141

        for (int i = 1; i <= s1.length(); i++) { // 142
            if (s1.charAt(i - 1) == s3.charAt(i - 1) && dp[i - 1][0]) { // 143
                dp[i][0] = true; // 144
            }
        }

        for (int j = 1; j <= s2.length(); j++) { // 145
            if (s2.charAt(j - 1) == s3.charAt(j - 1) && dp[0][j - 1]) { // 146
                dp[0][j] = true; // 147
            }
        }

        for (int i = 1; i <= s1.length(); i++) { // 148
            for (int j = 1; j <= s2.length(); j++) { // 149
                if ((s1.charAt(i - 1) == s3.charAt(i + j - 1) && dp[i - 1][j]) || // 150
                        (s2.charAt(j - 1) == s3.charAt(i + j - 1) && dp[i][j - 1])) { // 151
                    dp[i][j] = true; // 152
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }


    public static boolean isInterleaved12(String s1, String s2, String s3) {
        int m = s1.length(); // 153
        int n = s2.length(); // 154
        if (m + n != s3.length()) { // 155
            return false;
        }
        boolean[][] dp = new boolean[m+1][n+1]; // 156
        for (int i = 0; i <= m; i++) { // 157
            for (int j = 0; j <= n; j++) { // 158
                if (i == 0 && j == 0) { // 159
                    dp[i][j] = true; // 160
                }
                else if (i == 0) { // 161
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(j-1); // 162
                }
                else if (j == 0) { // 163
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i-1); // 164
                }
                else { // 165
                    dp[i][j] = (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1)) || (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)); // 166
                }
            }
        }
        return dp[m][n];
    }


public static boolean isInterleave13(String s1, String s2, String s3) {
    if (s1.length() + s2.length() != s3.length()) { // 167
        return false;
    }

    boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1]; // 168

    for (int i = 0; i <= s1.length(); i++) { // 169
        for (int j = 0; j <= s2.length(); j++) { // 170

            if (i == 0 && j == 0) { // 171
                dp[i][j] = true; // 172
            }

            else if (i == 0) { // 173
                dp[i][j] = dp[i][j - 1] && (s2.charAt(j - 1) == s3.charAt(i + j - 1)); // 174
            }

            else if (j == 0) { // 175
                dp[i][j] = dp[i - 1][j] && (s1.charAt(i - 1) == s3.charAt(i + j - 1)); // 176
            }
            else { // 177
                dp[i][j] = (dp[i - 1][j] && (s1.charAt(i - 1) == s3.charAt(i + j - 1))) // 178
                        || (dp[i][j - 1] && (s2.charAt(j - 1) == s3.charAt(i + j - 1))); // 179
            }
        }
    }

    return dp[s1.length()][s2.length()];
}


    public static boolean isInterleave14(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) { // 180
            return false;
        }

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1]; // 181
        dp[0][0] = true; // 182

        for (int i = 1; i <= s1.length(); i++) { // 183
            dp[i][0] = dp[i-1][0] && (s1.charAt(i-1) == s3.charAt(i-1)); // 184
        }

        for (int j = 1; j <= s2.length(); j++) { // 185
            dp[0][j] = dp[0][j-1] && (s2.charAt(j-1) == s3.charAt(j-1)); // 186
        }

        for (int i = 1; i <= s1.length(); i++) { // 187
            for (int j = 1; j <= s2.length(); j++) { // 188
                char c = s3.charAt(i+j-1); // 189
                if (s1.charAt(i-1) == c && s2.charAt(j-1) == c) { // 190
                    dp[i][j] = dp[i-1][j] || dp[i][j-1]; // 191
                } else if (s1.charAt(i-1) == c) { // 192
                    dp[i][j] = dp[i-1][j]; // 193
                } else if (s2.charAt(j-1) == c) { // 194
                    dp[i][j] = dp[i][j-1]; // 195
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }



    public boolean isInterleave15(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) { // 196
            return false;
        }

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1]; // 197
        dp[0][0] = true; // 198

        for (int i = 1; i <= s1.length(); i++) { // 199
            if (s1.charAt(i - 1) == s3.charAt(i - 1) && dp[i - 1][0]) { // 200
                dp[i][0] = true; // 201
            }
        }

        for (int j = 1; j <= s2.length(); j++) { // 202
            if (s2.charAt(j - 1) == s3.charAt(j - 1) && dp[0][j - 1]) { // 203
                dp[0][j] = true; // 204
            }
        }

        for (int i = 1; i <= s1.length(); i++) { // 205
            for (int j = 1; j <= s2.length(); j++) { // 206
                char c = s3.charAt(i + j - 1); // 207
                if (c == s1.charAt(i - 1) && dp[i - 1][j]) { // 208
                    dp[i][j] = true; // 209
                }
                if (c == s2.charAt(j - 1) && dp[i][j - 1]) { // 210
                    dp[i][j] = true; // 211
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }



public boolean isInterleave15(String s1, String s2, String s3) {
    if (s1.length() + s2.length() != s3.length()) { // 212
        return false;
    }

    boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1]; // 213

    for (int i = 0; i <= s1.length(); i++) { // 214
        for (int j = 0; j <= s2.length(); j++) { // 215
            if (i == 0 && j == 0) { // 216
                dp[i][j] = true; // 217
            } else if (i == 0) { // 218
                dp[i][j] = dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1); // 219
            } else if (j == 0) { // 220
                dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1); // 221
            } else { // 222
                dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1)) || // 223
                           (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)); // 224
            }
        }
    }

    return dp[s1.length()][s2.length()];
}


    public static boolean isInterleaved16(String s1, String s2, String s3) {
        int m = s1.length(); // 225
        int n = s2.length(); // 226

        boolean[][] IL = new boolean[m + 1][n + 1]; // 227

        if ((m + n) != s3.length()) // 228
            return false;

        for (int i = 0; i <= m; ++i) { // 229
            for (int j = 0; j <= n; ++j) { // 230
                if (i == 0 && j == 0) // 231
                    IL[i][j] = true; // 232
                else if (i == 0 && s2.charAt(j - 1) == s3.charAt(j - 1)) // 233
                    IL[i][j] = IL[i][j - 1]; // 234
                else if (j == 0 && s1.charAt(i - 1) == s3.charAt(i - 1)) // 235
                    IL[i][j] = IL[i - 1][j]; // 236
                else if (s1.charAt(i - 1) == s3.charAt(i + j - 1) && s2.charAt(j - 1) != s3.charAt(i + j - 1)) // 237
                    IL[i][j] = IL[i - 1][j]; // 238
                else if (s1.charAt(i - 1) != s3.charAt(i + j - 1) && s2.charAt(j - 1) == s3.charAt(i + j - 1)) // 239
                    IL[i][j] = IL[i][j - 1]; // 240
                else if (s1.charAt(i - 1) == s3.charAt(i + j - 1) && s2.charAt(j - 1) == s3.charAt(i + j - 1)) // 241
                    IL[i][j] = (IL[i - 1][j] || IL[i][j - 1]); // 242
            }
        }

        return IL[m][n];
    }


    public static boolean isInterleaved17(String s1, String s2, String s3) {
        int m = s1.length(); // 243
        int n = s2.length(); // 244

        if (m + n != s3.length()) { // 245
            return false;
        }

        boolean[][] dp = new boolean[m+1][n+1]; // 246

        for (int i = 0; i <= m; i++) { // 247
            for (int j = 0; j <= n; j++) { // 248
                if (i == 0 && j == 0) { // 249
                    dp[i][j] = true; // 250
                } else if (i == 0) { // 251
                    dp[i][j] = (s2.charAt(j-1) == s3.charAt(j-1)) && dp[i][j-1]; // 252
                } else if (j == 0) { // 253
                    dp[i][j] = (s1.charAt(i-1) == s3.charAt(i-1)) && dp[i-1][j]; // 254
                } else { // 255
                    dp[i][j] = ((s1.charAt(i-1) == s3.charAt(i+j-1)) && dp[i-1][j]) || // 256
                               ((s2.charAt(j-1) == s3.charAt(i+j-1)) && dp[i][j-1]); // 257
                }
            }
        }

        return dp[m][n];
    }

    public static boolean isInterleaved18(String s1, String s2, String s3) {
        int m = s1.length(); // 258
        int n = s2.length(); // 259

        if ((m + n) != s3.length()) { // 260
            return false;
        }

        boolean[][] dp = new boolean[m + 1][n + 1]; // 261

        for (int i = 0; i <= m; i++) { // 262
            for (int j = 0; j <= n; j++) { // 263
                if (i == 0 && j == 0) { // 264
                    dp[i][j] = true; // 265
                } else if (i == 0) { // 266
                    dp[i][j] = dp[i][j - 1] && (s2.charAt(j - 1) == s3.charAt(i + j - 1)); // 267
                } else if (j == 0) { // 268
                    dp[i][j] = dp[i - 1][j] && (s1.charAt(i - 1) == s3.charAt(i + j - 1)); // 269
                } else { // 270
                    dp[i][j] = (dp[i][j - 1] && (s2.charAt(j - 1) == s3.charAt(i + j - 1))) // 271
                            || (dp[i - 1][j] && (s1.charAt(i - 1) == s3.charAt(i + j - 1))); // 272
                }
            }
        }
        return dp[m][n];
    }


    public static boolean isInterleaved19(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) { // 273
            return false;
        }

        int n = s1.length(); // 274
        int m = s2.length(); // 275
        boolean[][] dp = new boolean[n + 1][m + 1]; // 276

        for (int i = 0; i <= n; ++i) { // 277
            for (int j = 0; j <= m; ++j) { // 278
                if (i == 0 && j == 0) { // 279
                    dp[i][j] = true; // 280
                } else if (i == 0) { // 281
                    dp[i][j] = dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1); // 282
                } else if (j == 0) { // 283
                    dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1); // 284
                } else { // 285
                    dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1)) // 286
                            || (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)); // 287
                }
            }
        }

        return dp[n][m];
    }


}


