
public int reverse(int x) {
    long reversed = 0;

    while (x != 0) {
        reversed = (reversed * 10) + (x % 10);
        x = x / 10;

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
    }

    return (int) reversed;
}


public int reverse(int x) {
    long res = 0;
    while (x != 0) {
        res = res * 10 + x % 10;
        x = x / 10;
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
    }
    return (int)res;
}


public int reverse(int x) {
    long res = 0;
    while (x != 0) {
        res = res * 10 + x % 10;
        x = x / 10;
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
    }
    return (int) res;
}


public int reverse(int x) {
    long res = 0;
    while (x != 0) {
        res = res * 10 + x % 10;
        x = x / 10;
    }

    if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
        return 0;
    } else {
        return (int)res;
    }
}


public int reverse(int x) {
    long reverse = 0;
    while (x != 0) {
        reverse = reverse * 10 + x % 10;
        x = x / 10;
    }
    if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
        return 0;
    } else {
        return (int) reverse;
    }
}



public int reverse(int x) {
    long res = 0;
    while(x != 0) {
        res = res*10 + x%10;
        x = x/10;
        
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) 
            return 0;
    }
    return (int)res;
}



public int reverse(int x) {
    long res = 0;
    while (x != 0) {
        res = res * 10 + x % 10;
        x = x / 10;
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
    }
    return (int) res;
}



public int reverse(int x) {
    long res = 0;
    while (x != 0) {
        res = res * 10 + x % 10;
        x = x / 10;
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
    }
    return (int) res;
}



public int reverse(int x) {
    long reversed = 0;
    while(x != 0) {
        reversed = reversed * 10 + x % 10;
        x /= 10;
        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
    }
    return (int)reversed;
}


public int reverse(int x) {
    long res = 0;
    while (x != 0) {
        res = res * 10 + x % 10;
        x = x / 10;
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;
    }
    return (int) res;
}


public int reverse(int x) {
    long rev = 0;
    while(x != 0){
        rev = rev*10 + x%10;
        x = x/10;
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
    }
    return (int) rev;
}


public int reverse(int x) {
    long reversed = 0;
    while (x != 0) {
        reversed = reversed * 10 + x % 10;
        x /= 10;
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
    }
    return (int) reversed;
}


public int reverse(int x) {
    long res = 0;
    while(x != 0) {
        res = (res * 10) + (x % 10);
        x = x / 10;
        
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
    }
    return (int)res;
}


public class Solution {
    public int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
            x = x / 10;
        }
        return (int) reversed;
    }
}


public int reverse(int x) {
    long reversed = 0;
    while (x != 0) {
        reversed = reversed * 10 + x % 10;
        x = x / 10;
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
    }
    return (int) reversed;
}


public int reverse(int x) {
    long reversed = 0;
    while(x != 0){
        reversed = reversed * 10 + x % 10;
        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
            return 0;
        }
        x /= 10;
    }
    return (int)reversed;
}


public int reverse(int x) {
    long reversed = 0;
    while(x != 0) {
        int remainder = x % 10;
        x /= 10;
        reversed = reversed * 10 + remainder;
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
        }
    }
    return (int) reversed;
}


public class Main {
    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
                return 0;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        int test = 123;
        System.out.println(reverse(test));
    }
}


public int reverse(int x) {
    long reverse = 0;
    while (x != 0) {
        reverse = reverse * 10 + x % 10;
        x /= 10;
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        }
    }
    return (int)reverse;
}


public class Solution {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
                return 0;
        }
        return (int) res;
    }
}

