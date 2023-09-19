public class Prelim{
    public int reverse1(int x) {
        int result = 0; // 1
        while (x != 0) { // 2
            int digit = x % 10; // 3
            int newResult = result * 10 + digit; // 4
            if ((newResult - digit) / 10 != result) { // 5
                return 0;
            }
            result = newResult; // 6
            x = x / 10; // 7
        }
        return result;
    }




    public int reverse2(int x) {
        int rev = 0; // 8
        while (x != 0) { // 9
            int pop = x % 10; // 10
            x = x / 10; // 11
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) { // 12
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) { // 13
                return 0;
            }
            rev = rev * 10 + pop; // 14
        }
        return rev;
    }



    public static int reverse3(int x) {
        int reversed = 0; // 15
        while (x != 0) { // 16
            int digit = x % 10; // 17
            x /= 10; // 18
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) { // 19
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) { // 20
                return 0;
            }
            reversed = reversed * 10 + digit; // 21
        }
        return reversed;
    }


    public int reverse4(int x) {
        int rev = 0; // 22
        while (x != 0) { // 23
            int pop = x % 10; // 24
            x /= 10; // 25
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) { // 26
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) { // 27
                return 0;
            }
            rev = rev * 10 + pop; // 28
        }
        return rev;
    }




    public int reverse5(int x) {
        long rev = 0; // 29
        while (x != 0) { // 30
            rev = rev * 10 + x % 10; // 31
            x /= 10; // 32
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) { // 33
            return 0;
        }
        return (int) rev;
    }




    public static int reverse6(int x) {
        int result = 0; // 34

        while (x != 0) { // 35
            int digit = x % 10; // 36

            if (result > Integer.MAX_VALUE / 10 || // 37
                    (result == Integer.MAX_VALUE / 10 && digit > 7)) // 38
                return 0;

            if (result < Integer.MIN_VALUE / 10 || // 39
                    (result == Integer.MIN_VALUE / 10 && digit < -8)) // 40
                return 0;

            result = result * 10 + digit; // 41
            x /= 10; // 42
        }

        return result;
    }



    public int reverse7(int x) {
        int reversed = 0; // 43

        while (x != 0) { // 44
            int lastDigit = x % 10; // 45
            x /= 10; // 46

            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE/10 && lastDigit > 7)) { // 47
                return 0;
            }
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE/10 && lastDigit < -8)) { // 48
                return 0;
            }

            reversed = reversed * 10 + lastDigit; // 49
        }

        return reversed;
    }




    public static int reverse8(int x) {
        int reversed = 0; // 50
        while (x != 0) { // 51
            int digit = x % 10; // 52
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) { // 53
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) { // 54
                return 0;
            }
            reversed = reversed * 10 + digit; // 55
            x /= 10; // 56
        }
        return reversed;
    }


    public int reverse9(int x) {
        int reversed = 0; // 57
        while (x != 0) { // 58
            int digit = x % 10; // 59
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) { // 60
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) { // 61
                return 0;
            }
            reversed = reversed * 10 + digit; // 62
            x = x / 10; // 63
        }
        return reversed;
    }



        public int reverse10(int x) {
            long result = 0; // 64
            while (x != 0) { // 65
                result = result * 10 + x % 10; // 66
                x /= 10; // 67
            }
            if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) { // 68
                return 0;
            }
            return (int) result;
        }




    public int reverse11(int x) {
        int rev = 0; // 69
        while (x != 0) { // 70
            int pop = x % 10; // 71
            x /= 10; // 72
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) { // 73
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) { // 74
                return 0;
            }
            rev = rev * 10 + pop; // 75
        }
        return rev;
    }




    public int reverse12(int x) {
        long result = 0; // 76
        while (x != 0) { // 77
            result = result * 10 + x % 10; // 78
            x /= 10; // 79
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) { // 80
            return 0;
        }
        return (int) result;
    }



    public int reverse13(int x) {
        int result = 0; // 81
        while (x != 0) { // 82
            int digit = x % 10; // 83
            int newResult = result * 10 + digit; // 84
            if ((newResult - digit) / 10 != result) { // 85
                return 0;
            }
            result = newResult; // 86
            x /= 10; // 87
        }
        return result;
    }



    public int reverse14(int x) {
        long result = 0; // 88
        while (x != 0) { // 89
            result = result * 10 + x % 10; // 90
            x /= 10; // 91
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) { // 92
            return 0;
        }

        return (int) result;
    }




    public int reverse15(int x) {
        int reversed = 0; // 93
        while (x != 0) { // 94
            int pop = x % 10; // 95
            x /= 10; // 96

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) { // 97
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) { // 98
                return 0;
            }
            reversed = reversed * 10 + pop; // 99
        }
        return reversed;
    }




    public static int reverse16(int x) {
        int rev = 0; // 100
        while (x != 0) { // 101
            int pop = x % 10; // 102
            x /= 10; // 103
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) { // 104
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) { // 105
                return 0;
            }
            rev = rev * 10 + pop; // 106
        }
        return rev;
    }


    public int reverse17(int x) {
        long result = 0; // 107

        while (x != 0) { // 108
            result = result * 10 + x % 10; // 109
            x /= 10; // 110
        }

        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) { // 111
            return 0;
        }

        return (int)result;
    }


    public int reverse18(int x) {
        long reversed = 0; // 112

        while (x != 0) { // 113
            reversed = reversed * 10 + x % 10; // 114
            x /= 10; // 115
        }

        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) { // 116
            return 0;
        }

        return (int) reversed;
    }


    public int reverse19(int x) {
        int rev = 0; // 117
        while (x != 0) { // 118
            int digit = x % 10; // 119
            x /= 10; // 120
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) { // 121
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) { // 122
                return 0;
            }
            rev = rev * 10 + digit; // 123
        }
        return rev;
    }





    public int reverse20(int x) {
        int rev = 0; // 124
        while (x != 0) { // 125
            int pop = x % 10; // 126
            x /= 10; // 127
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) { // 128
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) { // 129
                return 0;
            }
            rev = rev * 10 + pop; // 130
        }
        return rev;
    }
}
