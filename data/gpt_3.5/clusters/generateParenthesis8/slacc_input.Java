
    public List<String> generateParenthesis1(int n) {
        List<String> result = new ArrayList<>(); // 1
        backtrack1(result, "", 0, 0, n); // 2
        return result;
    }

    private void backtrack1(List<String> result, String current, int open, int close, int max) { // 3
        if (current.length() == max * 2) { // 4
            result.add(current); // 5
            return;
        }
        if (open < max) { // 6
            backtrack1(result, current + "(", open + 1, close, max); // 7
        }
        if (close < open) { // 8
            backtrack1(result, current + ")", open, close + 1, max); // 9
        }
    }




    public static List<String> generateParenthesis2(int n) {
        List<String> result = new ArrayList<>(); // 10
        backtrack2(result, "", 0, 0, n); // 11
        return result;
    }

    private static void backtrack2(List<String> result, String current, int open, int close, int max) { // 12
        if (current.length() == max * 2) { // 13
            result.add(current); // 14
            return;
        }

        if (open < max) // 15
            backtrack2(result, current + "(", open + 1, close, max); // 16
        if (close < open) // 17
            backtrack2(result, current + ")", open, close + 1, max); // 18
    }






    public static List<String> generateParenthesis3(int n) {
        List<String> result = new ArrayList<>(); // 19
        backtrack3(result, "", 0, 0, n); // 20
        return result;
    }

    public static void backtrack3(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) { // 21
            result.add(current); // 22
            return;
        }

        if (open < max) { // 23
            backtrack3(result, current + "(", open + 1, close, max); // 24
        }
        if (close < open) { // 25
            backtrack3(result, current + ")", open, close + 1, max); // 26
        }
    }


    public static List<String> generateParentheses4(int n) {
        List<String> result = new ArrayList<>(); // 27
        backtrack4(result, "", 0, 0, n); // 28
        return result;
    }

    private static void backtrack4(List<String> result, String current, int open, int close, int max) { // 29
        if (current.length() == max * 2) { // 30
            result.add(current); // 31
            return;
        }

        if (open < max) { // 32
            backtrack4(result, current + "(", open + 1, close, max); // 33
        }

        if (close < open) { // 34
            backtrack4(result, current + ")", open, close + 1, max); // 35
        }
    }


    public static List<String> generateParentheses5(int n) {
        List<String> result = new ArrayList<>(); // 36
        backtrack5(result, "", 0, 0, n); // 37
        return result;
    }

    private static void backtrack5(List<String> result, String curr, int open, int close, int max) { // 38
        if(curr.length() == max * 2) { // 39
            result.add(curr); // 40
            return;
        }

        if(open < max) // 41
            backtrack5(result, curr + "(", open + 1, close, max); // 42
        if(close < open) // 43
            backtrack5(result, curr + ")", open, close + 1, max); // 44
    }



    public static List<String> generateParenthesis6(int n) {
        List<String> result = new ArrayList<>(); // 45
        backtrack6(result, "", 0, 0, n); // 46
        return result;
    }

    private static void backtrack6(List<String> result, String current, int open, int close, int max) { // 47
        if (current.length() == max * 2) { // 48
            result.add(current); // 49
            return;
        }

        if (open < max) { // 50
            backtrack6(result, current + "(", open + 1, close, max); // 51
        }
        if (close < open) { // 52
            backtrack6(result, current + ")", open, close + 1, max); // 53
        }
    }


    public List<String> generateParenthesis7(int n) {
        List<String> result = new ArrayList<>(); // 54
        backtrack7(result, "", 0, 0, n); // 55
        return result;
    }

    private void backtrack7(List<String> result, String current, int open, int close, int max) { // 56
        if (current.length() == max * 2) { // 57
            result.add(current); // 58
            return;
        }

        if (open < max) { // 59
            backtrack7(result, current + "(", open + 1, close, max); // 60
        }
        if (close < open) { // 61
            backtrack7(result, current + ")", open, close + 1, max); // 62
        }
    }

    public static List<String> generateParenthesis8(int n) {
        List<String> res = new ArrayList<>(); // 63
        backtrack8(res, "", 0, 0, n); // 64
        return res;
    }

    private static void backtrack8(List<String> res, String curr, int open, int close, int max) { // 65
        if (curr.length() == max * 2) { // 66
            res.add(curr); // 67
            return;
        }

        if (open < max) // 68
            backtrack8(res, curr + "(", open + 1, close, max); // 69
        if (close < open) // 70
            backtrack8(res, curr + ")", open, close + 1, max); // 71
    }

    public static List<String> generateParentheses9(int n) {
        List<String> result = new ArrayList<>(); // 72
        backtrack9(result, "", 0, 0, n); // 73
        return result;
    }

    private static void backtrack9(List<String> result, String current, int open, int close, int max) { // 74
        if (current.length() == max * 2) { // 75
            result.add(current); // 76
            return;
        }

        if (open < max) { // 77
            backtrack9(result, current + "(", open + 1, close, max); // 78
        }
        if (close < open) { // 79
            backtrack9(result, current + ")", open, close + 1, max); // 80
        }
    }





    public static List<String> generateParenthesis10(int n) {
        List<String> result = new ArrayList<>(); // 81
        backtrack(result, "", 0, 0, n); // 82
        return result;
    }

    private static void backtrack10(List<String> result, String s, int open, int close, int n) { // 83
        if (s.length() == n * 2) { // 84
            result.add(s); // 85
            return;
        }

        if (open < n) { // 86
            backtrack10(result, s + "(", open + 1, close, n); // 87
        }
        if (close < open) { // 88
            backtrack10(result, s + ")", open, close + 1, n); // 89
        }
    }

    public static List<String> generateParenthesis11(int n) {
        List<String> result = new ArrayList<>(); // 90
        backtrack11(result, "", 0, 0, n); // 91
        return result;
    }

    public static void backtrack11(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) { // 92
            result.add(current); // 93
            return;
        }

        if (open < max) { // 94
            backtrack11(result, current + "(", open + 1, close, max); // 95
        }
        if (close < open) { // 96
            backtrack11(result, current + ")", open, close + 1, max); // 97
        }
    }


    public List<String> generateParenthesis12(int n) {
        List<String> result = new ArrayList<>(); // 98
        backtrack12(result, "", 0, 0, n); // 99
        return result;
    }

    private void backtrack12(List<String> result, String current, int open, int close, int n) { // 100
        if (current.length() == n * 2) { // 101
            result.add(current); // 102
            return;
        }

        if (open < n) { // 103
            backtrack12(result, current + "(", open + 1, close, n); // 104
        }
        if (close < open) { // 105
            backtrack12(result, current + ")", open, close + 1, n); // 106
        }
    }


    public List<String> generateParenthesis13(int n) {
        List<String> result = new ArrayList<>(); // 107
        backtrack13(result, "", 0, 0, n); // 108
        return result;
    }

    private void backtrack13(List<String> result, String current, int open, int close, int max) { // 109
        if (current.length() == max * 2) { // 110
            result.add(current); // 111
            return;
        }

        if (open < max) { // 112
            backtrack13(result, current + "(", open + 1, close, max); // 113
        }
        if (close < open) { // 114
            backtrack13(result, current + ")", open, close + 1, max); // 115
        }
    }


    public List<String> generateParenthesis14(int n) {
        List<String> result = new ArrayList<>(); // 116
        backtrack14(result, "", 0, 0, n); // 117
        return result;
    }

    private void backtrack14(List<String> result, String current, int open, int close, int n) { // 118
        if (current.length() == n * 2) { // 119
            result.add(current); // 120
            return;
        }

        if (open < n) { // 121
            backtrack14(result, current + "(", open + 1, close, n); // 122
        }
        if (close < open) { // 123
            backtrack14(result, current + ")", open, close + 1, n); // 124
        }
    }



    public static List<String> generateParentheses15(int n) {
        List<String> result = new ArrayList<>(); // 125
        backtrack15(result, "", 0, 0, n); // 126
        return result;
    }

    private static void backtrack15(List<String> result, String current, int open, int close, int max) { // 127
        if (current.length() == max * 2) { // 128
            result.add(current); // 129
            return;
        }

        if (open < max) { // 130
            backtrack15(result, current + "(", open + 1, close, max); // 131
        }
        if (close < open) { // 132
            backtrack15(result, current + ")", open, close + 1, max); // 133
        }
    }

    public List<String> generateParenthesis16(int n) {
        List<String> result = new ArrayList<>(); // 134
        backtrack16(result, "", 0, 0, n); // 135
        return result;
    }

    private void backtrack16(List<String> result, String currentString, int open, int close, int max) { // 136
        if (currentString.length() == max * 2) { // 137
            result.add(currentString); // 138
            return;
        }

        if (open < max) { // 139
            backtrack16(result, currentString + "(", open + 1, close, max); // 140
        }
        if (close < open) { // 141
            backtrack16(result, currentString + ")", open, close + 1, max); // 142
        }
    }


    public static List<String> generateParentheses17(int n) {
        List<String> result = new ArrayList<>(); // 143
        backtrack17(result, "", 0, 0, n); // 144
        return result;
    }

    private static void backtrack17(List<String> result, String curr, int open, int close, int max) { // 145
        if (curr.length() == max * 2) { // 146
            result.add(curr); // 147
            return;
        }

        if (open < max) { // 148
            backtrack17(result, curr + "(", open + 1, close, max); // 149
        }

        if (close < open) { // 150
            backtrack17(result, curr + ")", open, close + 1, max); // 151
        }
    }



    public List<String> generateParenthesis18(int n) {
        List<String> result = new ArrayList<>(); // 152
        backtrack18(result, "", 0, 0, n); // 153
        return result;
    }

    private void backtrack18(List<String> result, String current, int open, int close, int max) { // 154
        if (current.length() == max * 2) { // 155
            result.add(current); // 156
            return;
        }

        if (open < max) { // 157
            backtrack18(result, current + "(", open + 1, close, max); // 158
        }

        if (close < open) { // 159
            backtrack18(result, current + ")", open, close + 1, max); // 160
        }
    }


    public static List<String> generateParenthesis19(int n) {
        List<String> result = new ArrayList<>(); // 161
        backtrack19(result, "", 0, 0, n); // 162
        return result;
    }

    private static void backtrack19(List<String> result, String current, int open, int close, int max) { // 163
        if (current.length() == max * 2) { // 164
            result.add(current); // 165
            return;
        }

        if (open < max) { // 166
            backtrack19(result, current + "(", open + 1, close, max); // 167
        }

        if (close < open) { // 168
            backtrack19(result, current + ")", open, close + 1, max); // 169
        }
    }


