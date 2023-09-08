
public class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}

public int reverse(int x) {
    long result = 0;
    while (x != 0) {
        result = result * 10 + x % 10;
        x /= 10;
    }
    return (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) ? 0 : (int) result;
}

public class ReverseInteger {
    public int reverse(int x) {
        long reversedNum = 0;
        while (x != 0) {
            reversedNum = reversedNum * 10 + x % 10;
            x = x / 10;
        }
        if (reversedNum < Integer.MIN_VALUE || reversedNum > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) reversedNum;
        }
    }
}

public class ReverseInteger {
    public static int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) reversed;
        }
    }
}

public class ReverseInteger {
    public int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reversed;
    }
}

public int reverse(int x) {
    int result = 0;
    while (x != 0) {
        int pop = x % 10;
        x /= 10;
        if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
        if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
        result = result * 10 + pop;
    }
    return result;
}

public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}

public class Solution {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;
    }
}

public class ReverseInteger {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) result;
    }
}

public class ReverseInteger {
    public int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
            if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
                return 0;
            }
        }
        return (int) reversed;
    }
}

public int reverse(int x) {
    int reversed = 0;
    while (x != 0) {
        int digit = x % 10;
        if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) 
            return 0;
        if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) 
            return 0;
        reversed = reversed * 10 + digit;
        x /= 10;
    }
    return reversed;
}

public class ReverseInteger {
  public int reverse(int x) {
    
    int rev = 0;
    while (x != 0) {
      int pop = x % 10;
      x /= 10;
      
      if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
      if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
      
      rev = rev * 10 + pop;
    }
    
    return rev;
  }
}

public int reverse(int x) {
    long result = 0;
    while (x != 0) {
        result = result * 10 + x % 10;
        x /= 10;
    }
    if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
        return 0;
    }
    return (int) result;
}

public int reverse(int x) {
    long num = 0;
    while(x != 0) {
        num = num * 10 + x % 10;
        x /= 10;
    }
    if(num < Integer.MIN_VALUE || num > Integer.MAX_VALUE) {
        return 0;
    }
    return (int) num;
}

public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        
        while (x != 0) {
            int digit = x % 10;
            int newResult = result * 10 + digit;
            
            if ((newResult - digit) / 10 != result) {
                return 0;
            }
            
            result = newResult;
            x = x / 10;
        }
        
        return result;
    }
}

public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            int newResult = result * 10 + digit;
            if ((newResult - digit) / 10 != result) {
                return 0;
            }
            result = newResult;
            x /= 10;
        }
        return result;
    }
}

public int reverse(int x) {
    int rev = 0;
    while (x != 0) {
        int pop = x % 10;
        x /= 10;
        if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
        if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
        rev = rev * 10 + pop;
    }
    return rev;
}

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}



public static int reverse(int x) {
    int reversed = 0;
    while (x != 0) {
        int digit = x % 10;
        if ((reversed > Integer.MAX_VALUE / 10) || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
            return 0;
        }
        if ((reversed < Integer.MIN_VALUE / 10) || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
            return 0;
        }
        reversed = reversed * 10 + digit;
        x /= 10;
    }
    return reversed;
}

public class ReverseInteger {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            reversed = reversed * 10 + pop;
        }
        return reversed;
    }
}
