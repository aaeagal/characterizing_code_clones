public class Prelim{
    public int reverse1(int x) {
        int result = 0; // 1
        while (x != 0) { // 2
            int digit = x % 10; // 3
            int newResult = result * 10 + digit; // 4
            if ((newResult - digit) / 10 != result) { // 5
                return 0; // 6
            }
            result = newResult; // 7
            x = x / 10; // 8
        }
        return result; // 9
    }




    public int reverse2(int x) {
        int rev = 0; // 10
        while (x != 0) { // 11
            int pop = x % 10; // 12
            x = x / 10; // 13
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0; // 14
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0; // 15
            rev = rev * 10 + pop; // 16
        }
        return rev; // 17
    }



    public static int reverse3(int x) {
        int reversed = 0; // 18
        while (x != 0) { // 19
            int digit = x % 10; // 20
            x /= 10; // 21
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) { // 22
                return 0; // 23
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) { // 24
                return 0; // 25
            }
            reversed = reversed * 10 + digit; // 26
        }
        return reversed; // 27
    }


    public int reverse4(int x) {
        int rev = 0; // 28
        while (x != 0) { // 29
            int pop = x % 10; // 30
            x /= 10; // 31
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0; // 32
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0; // 33
            rev = rev * 10 + pop; // 34
        }
        return rev; // 35
    }




    public int reverse5(int x) {
        long rev = 0; // 36
        while (x != 0) { // 37
            rev = rev * 10 + x % 10; // 38
            x /= 10; // 39
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) { // 40
            return 0; // 41
        }
        return (int) rev; // 42
    }




    public static int reverse6(int x) {
        int result = 0; // 43

        while (x != 0) { // 44
            int digit = x % 10; // 45

            if (result > Integer.MAX_VALUE / 10 || // 46
                    (result == Integer.MAX_VALUE / 10 && digit > 7)) // 47
                return 0; // 48

            if (result < Integer.MIN_VALUE / 10 || // 49
                    (result == Integer.MIN_VALUE / 10 && digit < -8)) // 50
                return 0; // 51

            result = result * 10 + digit; // 52
            x /= 10; // 53
        }

        return result; // 54
    }



    public int reverse7(int x) {
        int reversed = 0; // 55

        while (x != 0) { // 56
            int lastDigit = x % 10; // 57
            x /= 10; // 58

            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE/10 && lastDigit > 7)) { // 59
                return 0; // 60
            }
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE/10 && lastDigit < -8)) { // 61
                return 0; // 62
            }

            reversed = reversed * 10 + lastDigit; // 63
        }

        return reversed; // 64
    }




    public static int reverse8(int x) {
        int reversed = 0; // 65
        while (x != 0) { // 66
            int digit = x % 10; // 67
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) { // 68
                return 0; // 69
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) { // 70
                return 0; // 71
            }
            reversed = reversed * 10 + digit; // 72
            x /= 10; // 73
        }
        return reversed; // 74
    }


    public int reverse9(int x) {
        int reversed = 0; // 75
        while (x != 0) { // 76
            int digit = x % 10; // 77
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) { // 78
                return 0; // 79
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) { // 80
                return 0; // 81
            }
            reversed = reversed * 10 + digit; // 82
            x = x / 10; // 83
        }
        return reversed; // 84
    }



        public int reverse10(int x) {
            long result = 0; // 85
            while (x != 0) { // 86
                result = result * 10 + x % 10; // 87
                x /= 10; // 88
            }
            if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) { // 89
                return 0; // 90
            }
            return (int) result; // 91
        }




    public int reverse11(int x) {
        int rev = 0; // 92
        while (x != 0) { // 93
            int pop = x % 10; // 94
            x /= 10; // 95
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0; // 96
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0; // 97
            rev = rev * 10 + pop; // 98
        }
        return rev; // 99
    }




    public int reverse12(int x) {
        long result = 0; // 100
        while (x != 0) { // 101
            result = result * 10 + x % 10; // 102
            x /= 10; // 103
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) { // 104
            return 0; // 105
        }
        return (int) result; // 106
    }



    public int reverse13(int x) {
        int result = 0; // 107
        while (x != 0) { // 108
            int digit = x % 10; // 109
            int newResult = result * 10 + digit; // 110
            if ((newResult - digit) / 10 != result) { // 111
                return 0; // 112
            }
            result = newResult; // 113
            x /= 10; // 114
        }
        return result; // 115
    }



    public int reverse14(int x) {
        long result = 0; // 116
        while (x != 0) { // 117
            result = result * 10 + x % 10; // 118
            x /= 10; // 119
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) { // 120
            return 0; // 121
        }

        return (int) result; // 122
    }




    public int reverse15(int x) {
        int reversed = 0; // 123
        while (x != 0) { // 124
            int pop = x % 10; // 125
            x /= 10; // 126

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) // 127
                return 0; // 128
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) // 129
                return 0; // 130

            reversed = reversed * 10 + pop; // 131
        }
        return reversed; // 132
    }




    public static int reverse16(int x) {
        int rev = 0; // 133
        while (x != 0) { // 134
            int pop = x % 10; // 135
            x /= 10; // 136
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0; // 137
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0; // 138
            rev = rev * 10 + pop; // 139
        }
        return rev; // 140
    }


    public int reverse17(int x) {
        long result = 0; // 141

        while (x != 0) { // 142
            result = result * 10 + x % 10; // 143
            x /= 10; // 144
        }

        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) { // 145
            return 0; // 146
        }

        return (int)result; // 147
    }


    public int reverse18(int x) {
        long reversed = 0; // 148

        while (x != 0) { // 149
            reversed = reversed * 10 + x % 10; // 150
            x /= 10; // 151
        }

        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) { // 152
            return 0; // 153
        }

        return (int) reversed; // 154
    }


    public int reverse19(int x) {
        int rev = 0; // 155
        while (x != 0) { // 156
            int digit = x % 10; // 157
            x /= 10; // 158
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0; // 159
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0; // 160
            rev = rev * 10 + digit; // 161
        }
        return rev; // 162
    }





    public int reverse20(int x) {
        int rev = 0; // 163
        while (x != 0) { // 164
            int pop = x % 10; // 165
            x /= 10; // 166
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0; // 167
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0; // 168
            rev = rev * 10 + pop; // 169
        }
        return rev; // 170
    }
}
