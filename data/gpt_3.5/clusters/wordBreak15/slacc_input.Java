
import java.util.*;

public class WordBreak {
    public boolean wordBreak1(String s, List<String> wordDict) {
        int n = s.length(); // 1
        boolean[] dp = new boolean[n + 1]; // 2
        dp[0] = true; // 3

        for (int i = 1; i <= n; i++) { // 4
            for (String word : wordDict) { // 5
                int len = word.length(); // 6
                if (len <= i && word.equals(s.substring(i - len, i))) { // 7
                    dp[i] = dp[i - len] || dp[i]; // 8
                }
            }
        }

        return dp[n];
    }

    public boolean wordBreak2(String s, List<String> wordDict) {
        int n = s.length(); // 9
        boolean[] dp = new boolean[n + 1]; // 10
        dp[0] = true; // 11

        for (int i = 1; i <= n; i++) { // 12
            for (int j = 0; j < i; j++) { // 13
                if (dp[j] && wordDict.contains(s.substring(j, i))) { // 14
                    dp[i] = true; // 15
                    break; // 16
                }
            }
        }

        return dp[n];
    }


    public static boolean wordBreak3(String s, List<String> wordDict) {
        int n = s.length(); // 17
        boolean[] dp = new boolean[n + 1]; // 18
        dp[0] = true; // 19

        for (int i = 1; i <= n; i++) { // 20
            for (int j = 0; j < i; j++) { // 21
                if (dp[j] && wordDict.contains(s.substring(j, i))) { // 22
                    dp[i] = true; // 23
                    break; // 24
                }
            }
        }

        return dp[n];
    }


    public static boolean wordBreak4(String s, List<String> wordDict) {
        if (s == null || s.length() == 0 || wordDict == null || wordDict.size() == 0) { // 25
            return false;
        }

        int n = s.length(); // 26
        boolean[] dp = new boolean[n + 1]; // 27
        dp[0] = true; // 28

        for (int i = 1; i <= n; i++) { // 29
            for (int j = 0; j < i; j++) { // 30
                if (dp[j] && wordDict.contains(s.substring(j, i))) { // 31
                    dp[i] = true; // 32
                    break; // 33
                }
            }
        }

        return dp[n];
    }


    public static boolean wordBreak5(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) return true;

        boolean[] dp = new boolean[s.length() + 1]; // 34
        dp[0] = true; // 35

        for (int i = 1; i <= s.length(); i++) { // 36
            for (int j = 0; j < i; j++) { // 37
                if (dp[j] && wordDict.contains(s.substring(j, i))) { // 38
                    dp[i] = true; // 39
                    break; // 40
                }
            }
        }

        return dp[s.length()];
    }

    public static boolean wordBreak6(String s, List<String> wordDict) {
        if (s.length() == 0) { // 41
            return true;
        }

        boolean[] dp = new boolean[s.length() + 1]; // 42
        dp[0] = true; // 43

        for (int i = 1; i <= s.length(); i++) { // 44
            for (int j = 0; j < i; j++) { // 45
                if (dp[j] && wordDict.contains(s.substring(j, i))) { // 46
                    dp[i] = true; // 47
                    break; // 48
                }
            }
        }

        return dp[s.length()];
    }


    public static boolean wordBreak7(String s, List<String> wordDict) {
        int n = s.length(); // 49
        boolean[] dp = new boolean[n + 1]; // 50
        dp[0] = true; // 51

        for (int i = 1; i <= n; i++) { // 52
            for (int j = 0; j < i; j++) { // 53
                if (dp[j] && wordDict.contains(s.substring(j, i))) { // 54
                    dp[i] = true; // 55
                    break; // 56
                }
            }
        }
        return dp[n];
    }

    public static boolean wordBreak8(String s, List<String> wordDict) {
        if (s == null || wordDict == null) { // 57
            return false;
        }
        int n = s.length(); // 58
        boolean[] dp = new boolean[n + 1]; // 59
        dp[0] = true; // 60
        for (int i = 1; i <= n; i++) { // 61
            for (int j = 0; j < i; j++) { // 62
                if (dp[j] && wordDict.contains(s.substring(j, i))) { // 63
                    dp[i] = true; // 64
                    break; // 65
                }
            }
        }
        return dp[n];
    }

  public static boolean wordBreak9(String s, List<String> wordDict) {
    if(s == null || s.length() == 0) { // 66
      return false;
    }
    boolean[] dp = new boolean[s.length() + 1]; // 67
    dp[0] = true; // 68
    for(int i = 1; i <= s.length(); i++) { // 69
      for(int j = 0; j < i; j++) { // 70
        if(dp[j] && wordDict.contains(s.substring(j, i))) { // 71
          dp[i] = true; // 72
          break; // 73
        }
      }
    }
    return dp[s.length()];
  }


    public boolean wordBreak10(String s, List<String> wordDict) {
        int n = s.length(); // 74
        boolean[] dp = new boolean[n + 1]; // 75
        dp[0] = true; // 76

        for (int i = 1; i <= n; i++) { // 77
            for (int j = 0; j < i; j++) { // 78
                if (dp[j] && wordDict.contains(s.substring(j, i))) { // 79
                    dp[i] = true; // 80
                    break; // 81
                }
            }
        }
        return dp[n];
    }

    public static boolean wordBreak11(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) return false;

        boolean[] dp = new boolean[s.length() + 1]; // 82
        dp[0] = true; // 83

        for (int i = 1; i <= s.length(); i++) { // 84
            for (int j = 0; j < i; j++) { // 85
                if (dp[j] && wordDict.contains(s.substring(j, i))) { // 86
                    dp[i] = true; // 87
                    break; // 88
                }
            }
        }

        return dp[s.length()];
    }


    public static boolean wordBreak12(String s, List<String> wordDict) {
        int n = s.length(); // 89
        boolean[] dp = new boolean[n+1]; // 90
        dp[0] = true; // 91

        for (int i = 1; i <= n; i++) { // 92
            for (int j = 0; j < i; j++) { // 93
                if (dp[j] && wordDict.contains(s.substring(j, i))) { // 94
                    dp[i] = true; // 95
                    break; // 96
                }
            }
        }

        return dp[n];
    }

    public static boolean wordBreak13(String s, List<String> wordDict) {
        int n = s.length(); // 97
        boolean[] dp = new boolean[n + 1]; // 98
        dp[0] = true; // 99
        for (int i = 1; i <= n; i++) { // 100
            for (int j = 0; j < i; j++) { // 101
                if (dp[j] && wordDict.contains(s.substring(j, i))) { // 102
                    dp[i] = true; // 103
                    break; // 104
                }
            }
        }
        return dp[n];
    }


    public static boolean wordBreak14(String s, List<String> wordDict) {
        int n = s.length(); // 105
        boolean[] dp = new boolean[n + 1]; // 106
        dp[0] = true; // 107

        for (int i = 1; i <= n; i++) { // 108
            for (int j = 0; j < i; j++) { // 109
                if (dp[j] && wordDict.contains(s.substring(j, i))) { // 110
                    dp[i] = true; // 111
                    break; // 112
                }
            }
        }

        return dp[n];
    }

    public static boolean wordSegmentation15(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) { // 113
            return false;
        }

        Set<String> dictionary = new HashSet<>(wordDict); // 114
        int n = s.length(); // 115
        boolean[] dp = new boolean[n+1]; // 116
        dp[0] = true; // 117

        for (int i = 1; i <= n; i++) { // 118
            for (int j = 0; j < i; j++) { // 119
                if (dp[j] && dictionary.contains(s.substring(j, i))) { // 120
                    dp[i] = true; // 121
                    break; // 122
                }
            }
        }

        return dp[n];
    }

    public boolean wordBreak16(String s, List<String> wordDict) {
        int n = s.length(); // 123
        boolean[] dp = new boolean[n + 1]; // 124
        dp[0] = true; // 125

        for (int i = 1; i <= n; i++) { // 126
            for (int j = 0; j < i; j++) { // 127
                if (dp[j] && wordDict.contains(s.substring(j, i))) { // 128
                    dp[i] = true; // 129
                    break; // 130
                }
            }
        }

        return dp[n];
    }

    public static boolean wordBreak17(String s, List<String> wordDict) {
        int n = s.length(); // 131
        boolean[] dp = new boolean[n+1]; // 132
        dp[0] = true; // 133

        for (int i = 1; i <= n; i++) { // 134
            for (int j = 0; j < i; j++) { // 135
                if (dp[j] && wordDict.contains(s.substring(j, i))) { // 136
                    dp[i] = true; // 137
                    break; // 138
                }
            }
        }

        return dp[n];
    }

    public static boolean wordBreak18(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) { // 139
            return false;
        }
        boolean[] dp = new boolean[s.length() + 1]; // 140
        dp[0] = true; // 141
        for (int i = 1; i <= s.length(); i++) { // 142
            for (int j = 0; j < i; j++) { // 143
                if (dp[j] && wordDict.contains(s.substring(j, i))) { // 144
                    dp[i] = true; // 145
                    break; // 146
                }
            }
        }
        return dp[s.length()];
    }
}


