public class InterleavingStrings {
    public static boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        
        boolean[][] dp = new boolean[s1.length()+1][s2.length()+1];
        
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                }
                else if (i == 0) {
                    dp[i][j] = (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1));
                }
                else if (j == 0) {
                    dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1));
                }
                else {
                    dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)) ||
                               (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1));
                }
            }
        }
        
        return dp[s1.length()][s2.length()];
    }
}

public class InterleavingStrings {

    public static boolean isInterleaved(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1);
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1);
                } else {
                    dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1))
                            || (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
                }
            }
        }
        
        return dp[s1.length()][s2.length()];
    }
    
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";
        
        System.out.println(isInterleaved(s1, s2, s3));
    }
}
public class InterleavingStrings {

    public static boolean isInterleaved(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
                } else if (j == 0) {
                    dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
                } else {
                    dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1))
                            || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
                }
            }
        }
        
        return dp[s1.length()][s2.length()];
    }
    
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";
        
        System.out.println(isInterleaved(s1, s2, s3)); // Output: true
    }
}
public class StringInterleaving {
    public static boolean isInterleaved(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1);
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1);
                } else {
                    dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1 + i))
                            || (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i - 1 + j));
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";
        System.out.println(isInterleaved(s1, s2, s3)); // Output: true
    }
}

public class InterleavingStrings {
    public static boolean isInterleaved(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        
        boolean[][] dp = new boolean[s1.length()+1][s2.length()+1];
        
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                }
                else if (i == 0) {
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(j-1);
                }
                else if (j == 0) {
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i-1);
                }
                else {
                    dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1))
                            || (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1));
                }
            }
        }
        
        return dp[s1.length()][s2.length()];
    }
}

public class InterleavingStrings {
    public static boolean isInterleaved(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        
        if (m + n != s3.length())
            return false;
        
        boolean[][] dp = new boolean[m+1][n+1];
        
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 && j == 0)
                    dp[i][j] = true;
                else if (i == 0)
                    dp[i][j] = (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(j-1));
                else if (j == 0)
                    dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i-1));
                else
                    dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)) ||
                               (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1));
            }
        }
        
        return dp[m][n];
    }
    
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";
        
        if (isInterleaved(s1, s2, s3))
            System.out.println(s3 + " is an interleaving of " + s1 + " and " + s2);
        else
            System.out.println(s3 + " is not an interleaving of " + s1 + " and " + s2);
    }
}

public class InterleavingStrings {

    public static boolean isInterleaving(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];

        dp[0][0] = true;

        for (int i = 1; i <= s1.length(); i++) {
            if (s1.charAt(i - 1) == s3.charAt(i - 1)) {
                dp[i][0] = dp[i - 1][0];
            }
        }

        for (int j = 1; j <= s2.length(); j++) {
            if (s2.charAt(j - 1) == s3.charAt(j - 1)) {
                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1))
                        || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }

        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";

        if (isInterleaving(s1, s2, s3)) {
            System.out.println(s3 + " is formed by an interleaving of " + s1 + " and " + s2);
        } else {
            System.out.println(s3 + " is not formed by an interleaving of " + s1 + " and " + s2);
        }
    }
}
public class InterleavingStrings {

    public static boolean isInterleaved(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];

        // Base cases
        dp[0][0] = true;

        for (int i = 1; i <= s1.length(); i++) {
            if (s1.charAt(i - 1) == s3.charAt(i - 1)) {
                dp[i][0] = dp[i - 1][0];
            }
        }

        for (int j = 1; j <= s2.length(); j++) {
            if (s2.charAt(j - 1) == s3.charAt(j - 1)) {
                dp[0][j] = dp[0][j - 1];
            }
        }

        // Fill dp table
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s3.charAt(i + j - 1)) {
                    dp[i][j] = dp[i - 1][j];
                }
                if (s2.charAt(j - 1) == s3.charAt(i + j - 1)) {
                    dp[i][j] = dp[i][j] || dp[i][j - 1];
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";
        System.out.println(isInterleaved(s1, s2, s3));
    }
}

public class InterleavingString {
    public static boolean isInterleave(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()) {
            return false;
        }
        
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i - 1);
                } else {
                    dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1))
                            || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
                }
            }
        }
        
        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";
        boolean result = isInterleave(s1, s2, s3);
        System.out.println(result); // Output: true
    }
}

public class InterleavingStrings {
    public static boolean isInterleaved(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();

        if (m + n != s3.length()) {
            return false;
        }

        boolean[][] dp = new boolean[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i - 1);
                } else {
                    dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) ||
                            (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "ef";
        String s3 = "aebcfed";

        if (isInterleaved(s1, s2, s3)) {
            System.out.println(s3 + " is formed by an interleaving of " + s1 + " and " + s2);
        } else {
            System.out.println(s3 + " is not formed by an interleaving of " + s1 + " and " + s2);
        }
    }
}

public class InterleavingString {

    public static boolean isInterleaved(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        return isInterleavedHelper(s1, s2, s3, 0, 0, 0);
    }

    private static boolean isInterleavedHelper(String s1, String s2, String s3, int i, int j, int k) {
        if (k == s3.length()) {
            return true;
        }
        if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
            if (isInterleavedHelper(s1, s2, s3, i + 1, j, k + 1)) {
                return true;
            }
        }
        if (j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
            return isInterleavedHelper(s1, s2, s3, i, j + 1, k + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = "adbecf";
        System.out.println(isInterleaved(s1, s2, s3)); // Output: true
    }
}

public class InterleavingStrings {
    public static boolean isInterleaved(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0] = true;
        for (int i = 1; i <= s1.length(); i++) {
            dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
        }
        for (int j = 1; j <= s2.length(); j++) {
            dp[0][j] = dp[0][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
        }
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1))
                        || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }
        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaabxy";
        System.out.println(isInterleaved(s1, s2, s3));
    }
}

public class InterleavingStrings {
   public boolean isInterleaved(String s1, String s2, String s3) {
      if (s1.length() + s2.length() != s3.length()) {
         return false;
      }
      
      boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
      
      for (int i = 0; i <= s1.length(); i++) {
         for (int j = 0; j <= s2.length(); j++) {
            if (i == 0 && j == 0) {
               dp[i][j] = true;
            } else if (i == 0) {
               dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            } else if (j == 0) {
               dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
            } else {
               dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1)) ||
                          (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
            }
         }
      }
      
      return dp[s1.length()][s2.length()];
   }
}

public class InterleavingStrings {
    public static boolean isInterleaved(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();

        if (m + n != s3.length()) {
            return false;
        }

        boolean[][] dp = new boolean[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                }
                else if (i == 0) {
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(j-1);
                }
                else if (j == 0) {
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i-1);
                }
                else {
                    dp[i][j] = (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1))
                            || (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1));
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";

        boolean isInterleaved = isInterleaved(s1, s2, s3);
        System.out.println("Is s3 formed by an interleaving of s1 and s2? " + isInterleaved);
    }
}

public class InterleavingStrings {
    public static boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length()) return false;
        boolean[][] dp = new boolean[s1.length()+1][s2.length()+1];
        for(int i=0; i<=s1.length(); ++i){
            for(int j=0; j<=s2.length(); ++j){
                if(i==0 && j==0) dp[i][j] = true;
                else if(i==0) dp[i][j] = dp[i][j-1] && s2.charAt(j-1)==s3.charAt(i+j-1);
                else if(j==0) dp[i][j] = dp[i-1][j] && s1.charAt(i-1)==s3.charAt(i+j-1);
                else dp[i][j] = (dp[i-1][j] && s1.charAt(i-1)==s3.charAt(i+j-1)) 
                    || (dp[i][j-1] && s2.charAt(j-1)==s3.charAt(i+j-1));
            }
        }
        return dp[s1.length()][s2.length()];
    }
}

public class InterleavingStrings {
    public boolean isInterleaving(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        if (m + n != s3.length()) {
            return false;
        }

        boolean[][] dp = new boolean[m + 1][n + 1];
        
        dp[0][0] = true;
        
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
        }
        
        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
        }
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) ||
                    (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }
        
        return dp[m][n];
    }
}

public class InterleavingStrings {
    public static boolean isInterleaved(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0] = true;

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i > 0 && s1.charAt(i - 1) == s3.charAt(i + j - 1)) {
                    dp[i][j] = dp[i - 1][j];
                }
                if (j > 0 && s2.charAt(j - 1) == s3.charAt(i + j - 1)) {
                    dp[i][j] |= dp[i][j - 1];
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";
        System.out.println(isInterleaved(s1, s2, s3)); // Output: true
    }
}

public class InterleavingStrings {
    public static boolean isInterleaved(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0] = true;

        for (int i = 1; i <= s1.length(); i++) {
            if (s1.charAt(i - 1) == s3.charAt(i - 1) && dp[i - 1][0]) {
                dp[i][0] = true;
            } else {
                break;
            }
        }

        for (int j = 1; j <= s2.length(); j++) {
            if (s2.charAt(j - 1) == s3.charAt(j - 1) && dp[0][j - 1]) {
                dp[0][j] = true;
            } else {
                break;
            }
        }

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if ((s1.charAt(i - 1) == s3.charAt(i + j - 1) && dp[i - 1][j])
                        || (s2.charAt(j - 1) == s3.charAt(i + j - 1) && dp[i][j - 1])) {
                    dp[i][j] = true;
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";
        System.out.println(isInterleaved(s1, s2, s3));

        s1 = "aab";
        s2 = "axy";
        s3 = "aaxyab";
        System.out.println(isInterleaved(s1, s2, s3));

        s1 = "abc";
        s2 = "def";
        s3 = "abcdef";
        System.out.println(isInterleaved(s1, s2, s3));

        s1 = "abc";
        s2 = "def";
        s3 = "acfbed";
        System.out.println(isInterleaved(s1, s2, s3));
    }
}

public static boolean isInterleaved(String s1, String s2, String s3) {
    int m = s1.length();
    int n = s2.length();
    
    if (m + n != s3.length()) {
        return false;
    }
    
    boolean[][] dp = new boolean[m + 1][n + 1];
    
    for (int i = 0; i <= m; i++) {
        for (int j = 0; j <= n; j++) {
            if (i == 0 && j == 0) {
                dp[i][j] = true;
            } else if (i == 0) {
                dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1));
            } else if (j == 0) {
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i - 1));
            } else {
                dp[i][j] = ((dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1))
                            || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1)));
            }
        }
    }
    
    return dp[m][n];
}

public class Interleaving {
    public static boolean isInterleaved(String s1, String s2, String s3) {
        int n = s1.length();
        int m = s2.length();

        if (n + m != s3.length()) {
            return false;
        }

        boolean[][] dp = new boolean[n+1][m+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(j-1);
                } else if (j == 0) {
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i-1);
                } else {
                    dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i-1+j)) ||
                               (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1));
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";

        System.out.println(isInterleaved(s1, s2, s3)); // true
    }
}
