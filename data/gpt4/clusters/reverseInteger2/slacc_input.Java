
public class Main {
    public int reverse1(int x) {
        long reversed = 0; // 1

        while (x != 0) { // 2
            reversed = (reversed * 10) + (x % 10); // 3
            x = x / 10; // 4

            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) { // 5
                return 0;
            }
        }

        return (int) reversed;
    }


    public int reverse2(int x) {
        long res = 0; // 6
        while (x != 0) { // 7
            res = res * 10 + x % 10; // 8
            x = x / 10; // 9
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) { // 10
                return 0;
            }
        }
        return (int)res;
    }


    public int reverse3(int x) {
        long res = 0; // 11
        while (x != 0) { // 12
            res = res * 10 + x % 10; // 13
            x = x / 10; // 14
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        }
        return (int) res;
    }


    public int reverse4(int x) {
        long res = 0; // 15
        while (x != 0) { // 16
            res = res * 10 + x % 10; // 17
            x = x / 10; // 18
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) { // 19
            return 0;
        } else { // 20
            return (int)res;
        }
    }


    public int reverse5(int x) {
        long reverse = 0; // 21
        while (x != 0) { // 22
            reverse = reverse * 10 + x % 10; // 23
            x = x / 10; // 24
        }
        if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) { // 25
            return 0;
        } else { // 26
            return (int) reverse;
        }
    }



    public int reverse6(int x) {
        long res = 0; // 27
        while(x != 0) { // 28
            res = res*10 + x%10; // 29
            x = x/10; // 30

            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) // 31
                return 0;
        }
        return (int)res;
    }



    public int reverse7(int x) {
        long res = 0; // 32
        while (x != 0) { // 33
            res = res * 10 + x % 10; // 34
            x = x / 10; // 35
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) { // 36
                return 0;
            }
        }
        return (int) res;
    }



    public int reverse8(int x) {
        long res = 0; // 37
        while (x != 0) { // 38
            res = res * 10 + x % 10; // 39
            x = x / 10; // 40
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) { // 41
                return 0;
            }
        }
        return (int) res;
    }



    public int reverse9(int x) {
        long reversed = 0; // 42
        while(x != 0) { // 43
            reversed = reversed * 10 + x % 10; // 44
            x /= 10; // 45
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) { // 46
                return 0;
            }
        }
        return (int)reversed;
    }


    public int reverse10(int x) {
        long res = 0; // 47
        while (x != 0) { // 48
            res = res * 10 + x % 10; // 49
            x = x / 10; // 50
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) // 51
                return 0;
        }
        return (int) res;
    }


    public int reverse11(int x) {
        long rev = 0; // 52
        while(x != 0){ // 53
            rev = rev*10 + x%10; // 54
            x = x/10; // 55
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){ // 56
                return 0;
            }
        }
        return (int) rev;
    }


    public int reverse12(int x) {
        long reversed = 0; // 57
        while (x != 0) { // 58
            reversed = reversed * 10 + x % 10; // 59
            x /= 10; // 60
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) { // 61
                return 0;
            }
        }
        return (int) reversed;
    }


    public int reverse13(int x) {
        long res = 0; // 62
        while(x != 0) { // 63
            res = (res * 10) + (x % 10); // 64
            x = x / 10; // 65

            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) { // 66
                return 0;
            }
        }
        return (int)res;
    }



    public int reverse14(int x) {
        long reversed = 0; // 67
        while (x != 0) { // 68
            reversed = reversed * 10 + x % 10; // 69
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) { // 70
                return 0;
            }
            x = x / 10; // 71
        }
        return (int) reversed;
    }



    public int reverse15(int x) {
        long reversed = 0; // 72
        while (x != 0) { // 73
            reversed = reversed * 10 + x % 10; // 74
            x = x / 10; // 75
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) { // 76
                return 0;
            }
        }
        return (int) reversed;
    }


    public int reverse16(int x) {
        long reversed = 0; // 77
        while(x != 0){ // 78
            reversed = reversed * 10 + x % 10; // 79
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){ // 80
                return 0;
            }
            x /= 10; // 81
        }
        return (int)reversed;
    }


    public int reverse17(int x) {
        long reversed = 0; // 82
        while(x != 0) { // 83
            int remainder = x % 10; // 84
            x /= 10; // 85
            reversed = reversed * 10 + remainder; // 86
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) { // 87
                    return 0;
            }
        }
        return (int) reversed;
    }



    public static int reverse18(int x) {
        long res = 0; // 88
        while (x != 0) { // 89
            res = res * 10 + x % 10; // 90
            x = x / 10; // 91
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) // 92
                return 0;
        }
        return (int)res;
    }



    public int reverse19(int x) {
        long reverse = 0; // 93
        while (x != 0) { // 94
            reverse = reverse * 10 + x % 10; // 95
            x /= 10; // 96
            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) { // 97
                return 0;
            }
        }
        return (int)reverse;
    }


    public int reverse20(int x) {
        long res = 0; // 98
        while (x != 0) { // 99
            res = res * 10 + x % 10; // 100
            x = x / 10; // 101
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) // 102
                return 0;
        }
        return (int) res;
    }
}

