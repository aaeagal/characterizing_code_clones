public class Prelim{
    public int reverse1(int x) {
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
    
    
    
    
    public int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
    
    
    
    public static int reverse3(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
    
    
    public int reverse4(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
    
    
    
    
    public int reverse5(int x) {
        long rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) rev;
    }
    
    
    
    
    public static int reverse6(int x) {
        int result = 0;
        
        while (x != 0) {
            int digit = x % 10;
            
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            
            if (result < Integer.MIN_VALUE / 10 ||
                    (result == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;
            
            result = result * 10 + digit;
            x /= 10;
        }
        
        return result;
    }
    
    
    
    public int reverse7(int x) {
        int reversed = 0;
        
        while (x != 0) {
            int lastDigit = x % 10;
            x /= 10;
            
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE/10 && lastDigit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE/10 && lastDigit < -8)) {
                return 0;
            }
            
            reversed = reversed * 10 + lastDigit;
        }
        
        return reversed;
    }
    
    
    
    
    public static int reverse8(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;
    }
    
    
    public int reverse9(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        return reversed;
    }
    
    
    
        public int reverse10(int x) {
            long result = 0;
            while (x != 0) {
                result = result * 10 + x % 10;
                x /= 10;
            }
            if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
                return 0;
            }
            return (int) result;
        }
    
    
    
    
    public int reverse11(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
    
    
    
    
    public int reverse12(int x) {
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
    
    
    
    public int reverse13(int x) {
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
    
    
    
    public int reverse14(int x) {
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
    
    
    
    
    public int reverse15(int x) {
        int reversed = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
    
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            reversed = reversed * 10 + pop;
        }
        return reversed;
    }
    
    
    
    
    public static int reverse16(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
    
    
    public int reverse17(int x) {
        long result = 0;
        
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }
        
        return (int)result;
    }
    
    
    public int reverse18(int x) {
        long reversed = 0;
        
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        
        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        }
        
        return (int) reversed;
    }
    
    
    public int reverse19(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            rev = rev * 10 + digit;
        }
        return rev;
    }
    
    
    
    
    
    public int reverse20(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) { 
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}