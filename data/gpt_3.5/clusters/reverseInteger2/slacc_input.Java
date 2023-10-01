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
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) { // 14
                return 0; // 15
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) { // 16
                return 0; // 17
            }
            rev = rev * 10 + pop; // 18
        }
        return rev; // 19
    }



    public static int reverse3(int x) {
        int reversed = 0; // 20
        while (x != 0) { // 21
            int digit = x % 10; // 22
            x /= 10; // 23
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) { // 24
                return 0; // 25
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) { // 26
                return 0; // 27
            }
            reversed = reversed * 10 + digit; // 28
        }
        return reversed; // 29
    }


    public int reverse4(int x) {
        int rev = 0; // 30
        while (x != 0) { // 31
            int pop = x % 10; // 32
            x /= 10; // 33
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) { // 34
                return 0; // 35
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) { // 36
                return 0; // 37
            }
            rev = rev * 10 + pop; // 38
        }
        return rev; // 39
    }




    public int reverse5(int x) {
        long rev = 0; // 40
        while (x != 0) { // 41
            rev = rev * 10 + x % 10; // 42
            x /= 10; // 43
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) { // 44
            return 0; // 45
        }
        return (int) rev; // 46
    }




    public static int reverse6(int x) {
        int result = 0; // 47

        while (x != 0) { // 48
            int digit = x % 10; // 49

            if (result > Integer.MAX_VALUE / 10 || // 50
                    (result == Integer.MAX_VALUE / 10 && digit > 7)) // 51
                return 0; // 52

            if (result < Integer.MIN_VALUE / 10 || // 53
                    (result == Integer.MIN_VALUE / 10 && digit < -8)) // 54
                return 0; // 55

            result = result * 10 + digit; // 56
            x /= 10; // 57
        }

        return result; // 58
    }



    public int reverse7(int x) {
        int reversed = 0; // 59

        while (x != 0) { // 60
            int lastDigit = x % 10; // 61
            x /= 10; // 62

            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE/10 && lastDigit > 7)) { // 63
                return 0; // 64
            }
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE/10 && lastDigit < -8)) { // 65
                return 0; // 66
            }

            reversed = reversed * 10 + lastDigit; // 67
        }

        return reversed; // 68
    }




    public static int reverse8(int x) {
        int reversed = 0; // 69
        while (x != 0) { // 70
            int digit = x % 10; // 71
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) { // 72
                return 0; // 73
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) { // 74
                return 0; // 75
            }
            reversed = reversed * 10 + digit; // 76
            x /= 10; // 77
        }
        return reversed; // 78
    }


    public int reverse9(int x) {
        int reversed = 0; // 79
        while (x != 0) { // 80
            int digit = x % 10; // 81
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) { // 82
                return 0; // 83
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) { // 84
                return 0; // 85
            }
            reversed = reversed * 10 + digit; // 86
            x = x / 10; // 87
        }
        return reversed; // 88
    }



        public int reverse10(int x) {
            long result = 0; // 89
            while (x != 0) { // 90
                result = result * 10 + x % 10; // 91
                x /= 10; // 92
            }
            if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) { // 93
                return 0; // 94
            }
            return (int) result; // 95
        }




    public int reverse11(int x) {
        int rev = 0; // 96
        while (x != 0) { // 97
            int pop = x % 10; // 98
            x /= 10; // 99
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) { // 100
                return 0; // 101
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) { // 102
                return 0; // 103
            }
            rev = rev * 10 + pop; // 104
        }
        return rev; // 105
    }




    public int reverse12(int x) {
        long result = 0; // 106
        while (x != 0) { // 107
            result = result * 10 + x % 10; // 108
            x /= 10; // 109
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) { // 110
            return 0; // 111
        }
        return (int) result; // 112
    }



    public int reverse13(int x) {
        int result = 0; // 113
        while (x != 0) { // 114
            int digit = x % 10; // 115
            int newResult = result * 10 + digit; // 116
            if ((newResult - digit) / 10 != result) { // 117
                return 0; // 118
            }
            result = newResult; // 119
            x /= 10; // 120
        }
        return result; // 121
    }



    public int reverse14(int x) {
        long result = 0; // 122
        while (x != 0) { // 123
            result = result * 10 + x % 10; // 124
            x /= 10; // 125
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) { // 126
            return 0; // 127
        }

        return (int) result; // 128
    }




    public int reverse15(int x) {
        int reversed = 0; // 129
        while (x != 0) { // 130
            int pop = x % 10; // 131
            x /= 10; // 132

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) { // 133
                return 0; // 134
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) { // 135
                return 0; // 136
            }
            reversed = reversed * 10 + pop; // 137
        }
        return reversed; // 138
    }




    public static int reverse16(int x) {
        int rev = 0; // 139
        while (x != 0) { // 140
            int pop = x % 10; // 141
            x /= 10; // 142
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) { // 143
                return 0; // 144
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) { // 145
                return 0; // 146
            }
            rev = rev * 10 + pop; // 147
        }
        return rev; // 148
    }


    public int reverse17(int x) {
        long result = 0; // 149

        while (x != 0) { // 150
            result = result * 10 + x % 10; // 151
            x /= 10; // 152
        }

        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) { // 153
            return 0; // 154
        }

        return (int)result; // 155
    }


    public int reverse18(int x) {
        long reversed = 0; // 156

        while (x != 0) { // 157
            reversed = reversed * 10 + x % 10; // 158
            x /= 10; // 159
        }

        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) { // 160
            return 0; // 161
        }

        return (int) reversed; // 162
    }


    public int reverse19(int x) {
        int rev = 0; // 163
        while (x != 0) { // 164
            int digit = x % 10; // 165
            x /= 10; // 166
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) { // 167
                return 0; // 168
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) { // 169
                return 0; // 170
            }
            rev = rev * 10 + digit; // 171
        }
        return rev; // 172
    }





    public int reverse20(int x) {
        int rev = 0; // 173
        while (x != 0) { // 174
            int pop = x % 10; // 175
            x /= 10; // 176
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) { // 177
                return 0; // 178
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) { // 179
                return 0; // 180
            }
            rev = rev * 10 + pop; // 181
        }
        return rev; // 182
    }
}
