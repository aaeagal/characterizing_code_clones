
public class InterleavingString {
    public static boolean isInterleave(String s1, String s2, String s3) {
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
                } else if (i == 0) {
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1);
                } else if (j == 0) {
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1);
                } else {
                    dp[i][j] = (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1))
                            || (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1));
                }
            }
        }
        
        return dp[m][n];
    }
}


public class Interleaving {
    public static boolean isInterleaved(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();

        if (s3.length() != m + n) {
            return false;
        }

        boolean[][] dp = new boolean[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = (s2.charAt(j-1) == s3.charAt(j-1)) && dp[i][j-1];
                } else if (j == 0) {
                    dp[i][j] = (s1.charAt(i-1) == s3.charAt(i-1)) && dp[i-1][j];
                } else {
                    dp[i][j] = ((s1.charAt(i-1) == s3.charAt(i+j-1)) && dp[i-1][j]) ||
                            ((s2.charAt(j-1) == s3.charAt(i+j-1)) && dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";
        System.out.println(isInterleaved(s1, s2, s3)); // Output: true
    }
}


public class Interleaving {

   public static boolean isInterleaved(String s1, String s2, String s3) {
        int m = s1.length(), n = s2.length();

        if ((m + n) != s3.length()) {
            return false;
        }

        boolean[][] dp = new boolean[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
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

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";

        System.out.println(isInterleaved(s1, s2, s3));
    }
}


public boolean isInterleaving(String s1, String s2, String s3) {
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
                dp[i][j] = dp[i][j - 1] && (s2.charAt(j - 1) == s3.charAt(i + j - 1));
            } else if (j == 0) {
                dp[i][j] = dp[i - 1][j] && (s1.charAt(i - 1) == s3.charAt(i + j - 1));
            } else {
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) || 
                           (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }
    }
    
    return dp[m][n];
}


public class InterleavingString {
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
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(j-1);
                } else if (j == 0) {
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i-1);
                } else {
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
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(j-1);
                } else if (j == 0) {
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i-1);
                } else {
                    dp[i][j] = (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1))
                            || (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1));
                }
            }
        }
        
        return dp[s1.length()][s2.length()];
    }
}


public boolean isInterleave(String s1, String s2, String s3) {
    if (s1.length() + s2.length() != s3.length()) {
        return false;
    }
    
    boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
    
    for (int i = 0; i <= s1.length(); i++) {
        for (int j = 0; j <= s2.length(); j++) {
            if (i == 0 && j == 0) {
                dp[i][j] = true;
            } else if (i == 0) {
                dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1);
            } else if (j == 0) {
                dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1);
            } else {
                dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)) ||
                           (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1));
            }
        }
    }
    
    return dp[s1.length()][s2.length()];
}


public class InterleavingString {

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
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1);
                } else if (j == 0) {
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1);
                } else {
                    dp[i][j] = (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1)) ||
                               (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1));
                }
            }
        }
        
        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";
        
        System.out.println(isInterleaved(s1, s2, s3)); // true
    }
}


public class InterleavingString {

    public static boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length()) {
            return false;
        }
        
        boolean[][] dp = new boolean[s1.length()+1][s2.length()+1];
        
        for(int i=0; i<=s1.length(); i++) {
            for(int j=0; j<=s2.length(); j++) {
                if(i==0 && j==0) {
                    dp[i][j] = true;
                }
                else if(i==0) {
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(j-1);
                }
                else if(j==0) {
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i-1);
                }
                else {
                    dp[i][j] = (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1)) || (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1));
                }
            }
        }
        
        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";
        
        System.out.println(isInterleave(s1, s2, s3));
    }
}


public boolean isInterleave(String s1, String s2, String s3) {
    int m = s1.length();
    int n = s2.length();

    if (s3.length() != m + n) {
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
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1))
                        || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }
    }

    return dp[m][n];
}


public class InterleavingStrings {
    public static boolean isInterleaved(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()) {
            return false;
        }
        
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0] = true;
        
        for (int i = 1; i <= s1.length(); i++) {
            if (s1.charAt(i - 1) == s3.charAt(i - 1) && dp[i - 1][0]) {
                dp[i][0] = true;
            }
        }
        
        for (int j = 1; j <= s2.length(); j++) {
            if (s2.charAt(j - 1) == s3.charAt(j - 1) && dp[0][j - 1]) {
                dp[0][j] = true;
            }
        }
        
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if ((s1.charAt(i - 1) == s3.charAt(i + j - 1) && dp[i - 1][j]) ||
                        (s2.charAt(j - 1) == s3.charAt(i + j - 1) && dp[i][j - 1])) {
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
        
        System.out.println(isInterleaved(s1, s2, s3)); //Expected output: true
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
                    dp[i][j] = (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1)) || (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1));
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";
        System.out.println(isInterleaved(s1, s2, s3)); // true
        
        s1 = "aab";
        s2 = "axy";
        s3 = "aabxay";
        System.out.println(isInterleaved(s1, s2, s3)); // false
        
        s1 = "abc";
        s2 = "xyz";
        s3 = "axbycz";
        System.out.println(isInterleaved(s1, s2, s3)); // true
    }
}



public static boolean isInterleave(String s1, String s2, String s3) {
    if (s1.length() + s2.length() != s3.length()) {
        return false;
    }
    
    boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
    
    for (int i = 0; i <= s1.length(); i++) {
        for (int j = 0; j <= s2.length(); j++) {
            // Base case: both strings are empty, so it is a valid interleave
            if (i == 0 && j == 0) {
                dp[i][j] = true;
            }
            // Case: s1 is empty, so we need to check if the previous s2 chars can form s3
            else if (i == 0) {
                dp[i][j] = dp[i][j - 1] && (s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
            // Case: s2 is empty, so we need to check if the previous s1 chars can form s3
            else if (j == 0) {
                dp[i][j] = dp[i - 1][j] && (s1.charAt(i - 1) == s3.charAt(i + j - 1));
            }
            // Case: both s1 and s2 are non-empty, so we need to check if either the previous s1
            // chars or the previous s2 chars can form s3
            else {
                dp[i][j] = (dp[i - 1][j] && (s1.charAt(i - 1) == s3.charAt(i + j - 1)))
                        || (dp[i][j - 1] && (s2.charAt(j - 1) == s3.charAt(i + j - 1)));
            }
        }
    }
    
    return dp[s1.length()][s2.length()];
}


public class InterleavingStrings {
    public static boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0] = true;
        
        for (int i = 1; i <= s1.length(); i++) {
            dp[i][0] = dp[i-1][0] && (s1.charAt(i-1) == s3.charAt(i-1));
        }
        
        for (int j = 1; j <= s2.length(); j++) {
            dp[0][j] = dp[0][j-1] && (s2.charAt(j-1) == s3.charAt(j-1));
        }
        
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                char c = s3.charAt(i+j-1);
                if (s1.charAt(i-1) == c && s2.charAt(j-1) == c) {
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                } else if (s1.charAt(i-1) == c) {
                    dp[i][j] = dp[i-1][j];
                } else if (s2.charAt(j-1) == c) {
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        
        return dp[s1.length()][s2.length()];
    }
    
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";
        System.out.println(isInterleave(s1, s2, s3)); // true
        
        s1 = "aab";
        s2 = "axy";
        s3 = "aaxabyz";
        System.out.println(isInterleave(s1, s2, s3)); // false
    }
}


public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0] = true;
        
        for (int i = 1; i <= s1.length(); i++) {
            if (s1.charAt(i - 1) == s3.charAt(i - 1) && dp[i - 1][0]) {
                dp[i][0] = true;
            }
        }
        
        for (int j = 1; j <= s2.length(); j++) {
            if (s2.charAt(j - 1) == s3.charAt(j - 1) && dp[0][j - 1]) {
                dp[0][j] = true;
            }
        }
        
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                char c = s3.charAt(i + j - 1);
                if (c == s1.charAt(i - 1) && dp[i - 1][j]) {
                    dp[i][j] = true;
                }
                if (c == s2.charAt(j - 1) && dp[i][j - 1]) {
                    dp[i][j] = true;
                }
            }
        }
        
        return dp[s1.length()][s2.length()];
    }
}


public boolean isInterleave(String s1, String s2, String s3) {
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
                dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1)) ||
                           (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
            }
        }
    }
    
    return dp[s1.length()][s2.length()];
}


public class InterleavingStrings {
    public static boolean isInterleaved(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();

        boolean[][] IL = new boolean[m + 1][n + 1];

        if ((m + n) != s3.length())
            return false;

        for (int i = 0; i <= m; ++i) {
            for (int j = 0; j <= n; ++j) {
                if (i == 0 && j == 0)
                    IL[i][j] = true;
                else if (i == 0 && s2.charAt(j - 1) == s3.charAt(j - 1))
                    IL[i][j] = IL[i][j - 1];
                else if (j == 0 && s1.charAt(i - 1) == s3.charAt(i - 1))
                    IL[i][j] = IL[i - 1][j];
                else if (s1.charAt(i - 1) == s3.charAt(i + j - 1) && s2.charAt(j - 1) != s3.charAt(i + j - 1))
                    IL[i][j] = IL[i - 1][j];
                else if (s1.charAt(i - 1) != s3.charAt(i + j - 1) && s2.charAt(j - 1) == s3.charAt(i + j - 1))
                    IL[i][j] = IL[i][j - 1];
                else if (s1.charAt(i - 1) == s3.charAt(i + j - 1) && s2.charAt(j - 1) == s3.charAt(i + j - 1))
                    IL[i][j] = (IL[i - 1][j] || IL[i][j - 1]);
            }
        }

        return IL[m][n];
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = "abcdef";

        System.out.println(isInterleaved(s1, s2, s3)); // Output: true
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
                } else if (i == 0) {
                    dp[i][j] = (s2.charAt(j-1) == s3.charAt(j-1)) && dp[i][j-1];
                } else if (j == 0) {
                    dp[i][j] = (s1.charAt(i-1) == s3.charAt(i-1)) && dp[i-1][j];
                } else {
                    dp[i][j] = ((s1.charAt(i-1) == s3.charAt(i+j-1)) && dp[i-1][j]) ||
                               ((s2.charAt(j-1) == s3.charAt(i+j-1)) && dp[i][j-1]);
                }
            }
        }
        
        return dp[m][n];
    }
}


public class InterleavingString {
    public static boolean isInterleaved(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();

        if ((m + n) != s3.length()) {
            return false;
        }

        boolean[][] dp = new boolean[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] && (s2.charAt(j - 1) == s3.charAt(i + j - 1));
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] && (s1.charAt(i - 1) == s3.charAt(i + j - 1));
                } else {
                    dp[i][j] = (dp[i][j - 1] && (s2.charAt(j - 1) == s3.charAt(i + j - 1)))
                            || (dp[i - 1][j] && (s1.charAt(i - 1) == s3.charAt(i + j - 1)));
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";

        if (isInterleaved(s1, s2, s3)) {
            System.out.println(s3 + " can be formed by interleaving of " + s1 + " and " + s2);
        } else {
            System.out.println(s3 + " cannot be formed by interleaving of " + s1 + " and " + s2);
        }
    }
}



public class InterleavingStrings {
    public static boolean isInterleaved(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        int n = s1.length();
        int m = s2.length();
        boolean[][] dp = new boolean[n + 1][m + 1];

        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= m; ++j) {
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

        return dp[n][m];
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = "adbecf";

        if (isInterleaved(s1, s2, s3)) {
            System.out.println(s3 + " is formed by an interleaving of " + s1 + " and " + s2);
        } else {
            System.out.println(s3 + " is not formed by an interleaving of " + s1 + " and " + s2);
        }
    }
}


