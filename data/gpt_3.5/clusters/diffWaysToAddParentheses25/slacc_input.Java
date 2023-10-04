
import java.util.ArrayList;
import java.util.List;

public class Interleave{
    public List<Integer> diffWaysToCompute1(String expression) {
        List<Integer> result = new ArrayList<>(); // 1

        for (int i = 0; i < expression.length(); i++) { // 2
            char c = expression.charAt(i); // 3
            if (c == '+' || c == '-' || c == '*') { // 4
                String leftExpression = expression.substring(0, i); // 5
                String rightExpression = expression.substring(i + 1); // 6
                List<Integer> leftResults = diffWaysToCompute1(leftExpression); // 7
                List<Integer> rightResults = diffWaysToCompute1(rightExpression); // 8

                for (int left : leftResults) { // 9
                    for (int right : rightResults) { // 10
                        if (c == '+') { // 11
                            result.add(left + right); // 12
                        } else if (c == '-') { // 13
                            result.add(left - right); // 14
                        } else if (c == '*') { // 15
                            result.add(left * right); // 16
                        }
                    }
                }
            }
        }

        if (result.isEmpty()) { // 17
            result.add(Integer.parseInt(expression)); // 18
        }

        return result;
    }

    public List<Integer> diffWaysToCompute2(String input) {
        List<Integer> res = new ArrayList<>(); // 19
        for (int i = 0; i < input.length(); i++) { // 20
            char c = input.charAt(i); // 21
            if (c == '+' || c == '-' || c == '*') { // 22
                String leftPart = input.substring(0, i); // 23
                String rightPart = input.substring(i + 1); // 24
                List<Integer> leftRes = diffWaysToCompute2(leftPart); // 25
                List<Integer> rightRes = diffWaysToCompute2(rightPart); // 26
                for (int leftNum : leftRes) { // 27
                    for (int rightNum : rightRes) { // 28
                        if (c == '+') { // 29
                            res.add(leftNum + rightNum); // 30
                        } else if (c == '-') { // 31
                            res.add(leftNum - rightNum); // 32
                        } else if (c == '*') { // 33
                            res.add(leftNum * rightNum); // 34
                        }
                    }
                }
            }
        }
        if (res.size() == 0) { // 35
            res.add(Integer.valueOf(input)); // 36
        }
        return res;
    }

    public List<Integer> diffWaysToCompute3(String expression) {
        List<Integer> result = new ArrayList<>(); // 37
        if (expression == null || expression.length() == 0) { // 38
            return result;
        }

        for (int i = 0; i < expression.length(); i++) { // 39
            char c = expression.charAt(i); // 40
            if (c == '+' || c == '-' || c == '*') { // 41
                String left = expression.substring(0, i); // 42
                String right = expression.substring(i + 1); // 43

                List<Integer> leftResult = diffWaysToCompute3(left); // 44
                List<Integer> rightResult = diffWaysToCompute3(right); // 45

                for (int x : leftResult) { // 46
                    for (int y : rightResult) { // 47
                        if (c == '+') { // 48
                            result.add(x + y); // 49
                        } else if (c == '-') { // 50
                            result.add(x - y); // 51
                        } else { // 52
                            result.add(x * y); // 53
                        }
                    }
                }
            }
        }

        if (result.size() == 0) { // 54
            result.add(Integer.valueOf(expression)); // 55
        }

        return result;
    }

    public List<Integer> diffWaysToCompute4(String input) {
        List<Integer> res = new ArrayList<>(); // 56
        for (int i = 0; i < input.length(); i++) { // 57
            char c = input.charAt(i); // 58
            if (c == '+' || c == '-' || c == '*') { // 59
                String leftPart = input.substring(0, i); // 60
                String rightPart = input.substring(i + 1); // 61
                List<Integer> leftRes = diffWaysToCompute4(leftPart); // 62
                List<Integer> rightRes = diffWaysToCompute4(rightPart); // 63
                for (Integer left : leftRes) { // 64
                    for (Integer right : rightRes) { // 65
                        int val = 0; // 66
                        switch (c) { // 67
                            case '+': // 68
                                val = left + right; // 69
                                break; // 70
                            case '-': // 71
                                val = left - right; // 72
                                break; // 73
                            case '*': // 74
                                val = left * right; // 75
                                break; // 76
                            default: // 77
                                break; // 78
                        }
                        res.add(val); // 79
                    }
                }
            }
        }
        if (res.isEmpty()) { // 80
            res.add(Integer.valueOf(input)); // 81
        }
        return res;
    }

    public List<Integer> diffWaysToCompute5(String expression) {
        List<Integer> res = new ArrayList<>(); // 82

        for (int i = 0; i < expression.length(); i++) { // 83
            char c = expression.charAt(i); // 84
            if (c == '+' || c == '-' || c == '*') { // 85
                String leftExp = expression.substring(0, i); // 86
                String rightExp = expression.substring(i+1); // 87

                List<Integer> left = diffWaysToCompute5(leftExp); // 88
                List<Integer> right = diffWaysToCompute5(rightExp); // 89

                for (int l : left) { // 90
                    for (int r : right) { // 91
                        if (c == '+') { // 92
                            res.add(l + r); // 93
                        } else if (c == '-') { // 94
                            res.add(l - r); // 95
                        } else if (c == '*') { // 96
                            res.add(l * r); // 97
                        }
                    }
                }
            }
        }

        if (res.isEmpty()) { // 98
            res.add(Integer.valueOf(expression)); // 99
        }

        return res;
    }

    public List<Integer> diffWaysToCompute6(String input) {
        List<Integer> result = new ArrayList<>(); // 100

        for (int i = 0; i < input.length(); i++) { // 101
            char c = input.charAt(i); // 102
            if (c == '+' || c == '-' || c == '*') { // 103
                String left = input.substring(0, i); // 104
                String right = input.substring(i + 1); // 105

                List<Integer> leftResults = diffWaysToCompute6(left); // 106
                List<Integer> rightResults = diffWaysToCompute6(right); // 107

                for (int leftResult : leftResults) { // 108
                    for (int rightResult : rightResults) { // 109
                        int value = 0; // 110
                        if (c == '+') { // 111
                            value = leftResult + rightResult; // 112
                        } else if (c == '-') { // 113
                            value = leftResult - rightResult; // 114
                        } else if (c == '*') { // 115
                            value = leftResult * rightResult; // 116
                        }
                        result.add(value); // 117
                    }
                }
            }
        }

        if (result.isEmpty()) { // 118
            result.add(Integer.parseInt(input)); // 119
        }

        return result;
    }

    public List<Integer> diffWaysToCompute7(String input) {
        List<Integer> result = new ArrayList<>(); // 120
        for (int i = 0; i < input.length(); i++) { // 121
            char c = input.charAt(i); // 122
            if (c == '+' || c == '-' || c == '*') { // 123
                String leftPart = input.substring(0, i); // 124
                String rightPart = input.substring(i + 1); // 125
                List<Integer> leftResults = diffWaysToCompute7(leftPart); // 126
                List<Integer> rightResults = diffWaysToCompute7(rightPart); // 127
                for (int left : leftResults) { // 128
                    for (int right : rightResults) { // 129
                        if (c == '+') { // 130
                            result.add(left + right); // 131
                        } else if (c == '-') { // 132
                            result.add(left - right); // 133
                        } else if (c == '*') { // 134
                            result.add(left * right); // 135
                        }
                    }
                }
            }
        }
        if (result.size() == 0) { // 136
            result.add(Integer.parseInt(input)); // 137
        }
        return result;
    }

    public List<Integer> diffWaysToCompute8(String expression) {
        List<Integer> res = new ArrayList<>(); // 138
        for (int i = 0; i < expression.length(); i++) { // 139
            char c = expression.charAt(i); // 140
            if (c == '+' || c == '-' || c == '*') { // 141
                String left = expression.substring(0, i); // 142
                String right = expression.substring(i + 1); // 143
                List<Integer> leftRes = diffWaysToCompute8(left); // 144
                List<Integer> rightRes = diffWaysToCompute8(right); // 145
                for (int x: leftRes) { // 146
                    for (int y: rightRes) { // 147
                        if (c == '+') { // 148
                            res.add(x + y); // 149
                        } else if (c == '-') { // 150
                            res.add(x - y); // 151
                        } else { // 152
                            res.add(x * y); // 153
                        }
                    }
                }
            }
        }
        if (res.size() == 0) { // 154
            res.add(Integer.valueOf(expression)); // 155
        }
        return res;
    }

    public List<Integer> diffWaysToCompute9(String input) {
        List<Integer> result = new ArrayList<>(); // 156
        for (int i = 0; i < input.length(); i++) { // 157
            char c = input.charAt(i); // 158
            if (c == '+' || c == '-' || c == '*') { // 159
                String left = input.substring(0, i); // 160
                String right = input.substring(i+1); // 161
                List<Integer> leftResults = diffWaysToCompute9(left); // 162
                List<Integer> rightResults = diffWaysToCompute9(right); // 163
                for (int leftResult : leftResults) { // 164
                    for (int rightResult : rightResults) { // 165
                        if (c == '+') { // 166
                            result.add(leftResult + rightResult); // 167
                        } else if (c == '-') { // 168
                            result.add(leftResult - rightResult); // 169
                        } else { // 170
                            result.add(leftResult * rightResult); // 171
                        }
                    }
                }
            }
        }
        if (result.isEmpty()) { // 172
            result.add(Integer.parseInt(input)); // 173
        }
        return result;
    }

    public List<Integer> diffWaysToCompute10(String expression) {
        List<Integer> result = new ArrayList<>(); // 174
        if (expression == null || expression.length() == 0) { // 175
            return result;
        }
        helper10(result, expression, 0, expression.length() - 1); // 176
        return result;
    }

    private void helper10(List<Integer> result, String expression, int start, int end) { // 177
        boolean isNumber = true; // 178
        for (int i = start; i <= end; i++) { // 179
            char c = expression.charAt(i); // 180
            if (!Character.isDigit(c)) { // 181
                isNumber = false; // 182
                List<Integer> left = new ArrayList<>(); // 183
                List<Integer> right = new ArrayList<>(); // 184
                helper10(left, expression, start, i - 1); // 185
                helper10(right, expression, i + 1, end); // 186
                for (int num1 : left) { // 187
                    for (int num2 : right) { // 188
                        int res = 0; // 189
                        if (c == '+') { // 190
                            res = num1 + num2; // 191
                        } else if (c == '-') { // 192
                            res = num1 - num2; // 193
                        } else if (c == '*') { // 194
                            res = num1 * num2; // 195
                        }
                        result.add(res); // 196
                    }
                }
            }
        }
        if (isNumber) { // 197
            result.add(Integer.parseInt(expression.substring(start, end + 1))); // 198
        }
    }

    public List<Integer> diffWaysToCompute11(String expression) {
        List<Integer> result = new ArrayList<>(); // 199
        if (expression == null || expression.length() == 0) { // 200
            return result;
        }
        helper11(result, expression, 0, 0, 0, ""); // 201
        return result;
    }

    private void helper11(List<Integer> result, String expression, int index, long prevOperand, long curOperand, String curExpression) { // 202
        if (index == expression.length()) { // 203
            if (curOperand == 0) { // 204
                result.add((int) prevOperand); // 205
            } else { // 206
                result.add((int) curOperand); // 207
            }
            return;
        }

        char currentChar = expression.charAt(index); // 208
        curOperand = curOperand * 10 + (currentChar - '0'); // 209

        if (curOperand > 0) { // 210
            helper11(result, expression, index + 1, prevOperand, curOperand, curExpression); // 211
        }

        if (curExpression.length() > 0) { // 212
            helper11(result, expression, index + 1, evalExpression11(prevOperand, curOperand, curExpression.charAt(curExpression.length() - 1)), 0, curExpression); // 213
        }

        if (curExpression.length() == 0 || curExpression.charAt(curExpression.length() - 1) != '0') { // 214
            helper11(result, expression, index + 1, prevOperand, 0, curExpression + currentChar); // 215
        }
    }

    private long evalExpression11(long prevOperand, long curOperand, char operator) { // 216
        if (operator == '+') { // 217
            return prevOperand + curOperand;
        } else if (operator == '-') { // 218
            return prevOperand - curOperand;
        } else if (operator == '*') { // 219
            return prevOperand * curOperand;
        }
        return 0;
    }

    public List<Integer> diffWaysToCompute12(String input) {
        List<Integer> res = new ArrayList<>(); // 220

        for (int i = 0; i < input.length(); i++) { // 221
            char c = input.charAt(i); // 222
            if (c == '+' || c == '-' || c == '*') { // 223
                String left = input.substring(0, i); // 224
                String right = input.substring(i+1); // 225
                List<Integer> leftRes = diffWaysToCompute12(left); // 226
                List<Integer> rightRes = diffWaysToCompute12(right); // 227

                for (int l : leftRes) { // 228
                    for (int r : rightRes) { // 229
                        if (c == '+') { // 230
                            res.add(l + r); // 231
                        } else if (c == '-') { // 232
                            res.add(l - r); // 233
                        } else if (c == '*') { // 234
                            res.add(l * r); // 235
                        }
                    }
                }
            }
        }

        if (res.isEmpty()) { // 236
            res.add(Integer.parseInt(input)); // 237
        }

        return res;
    }

    public List<Integer> diffWaysToCompute13(String expression) {
        List<Integer> result = new ArrayList<>(); // 238

        for(int i=0; i<expression.length(); i++){ // 239
            char c = expression.charAt(i); // 240
            if(c == '+' || c == '-' || c == '*'){ // 241
                String leftStr = expression.substring(0, i); // 242
                String rightStr = expression.substring(i+1); // 243
                List<Integer> leftVal = diffWaysToCompute13(leftStr); // 244
                List<Integer> rightVal = diffWaysToCompute13(rightStr); // 245

                for(int left : leftVal){ // 246
                    for(int right : rightVal){ // 247
                        if(c == '+'){ // 248
                            result.add(left + right); // 249
                        }else if(c == '-'){ // 250
                            result.add(left - right); // 251
                        }else if(c == '*'){ // 252
                            result.add(left * right); // 253
                        }
                    }
                }
            }
        }

        if(result.size() == 0){ // 254
            result.add(Integer.valueOf(expression)); // 255
        }

        return result;
    }

    public List<Integer> diffWaysToCompute14(String expression) {
        List<Integer> result = new ArrayList<>(); // 256
        if (expression == null || expression.length() == 0) { // 257
            return result;
        }

        for (int i = 0; i < expression.length(); i++) { // 258
            char c = expression.charAt(i); // 259
            if (c == '+' || c == '-' || c == '*') { // 260
                String part1 = expression.substring(0, i); // 261
                String part2 = expression.substring(i + 1); // 262
                List<Integer> part1Result = diffWaysToCompute14(part1); // 263
                List<Integer> part2Result = diffWaysToCompute14(part2); // 264
                for (int p1 : part1Result) { // 265
                    for (int p2 : part2Result) { // 266
                        int newVal = 0; // 267
                        switch (c) { // 268
                            case '+': // 269
                                newVal = p1 + p2; // 270
                                break; // 271
                            case '-': // 272
                                newVal = p1 - p2; // 273
                                break; // 274
                            case '*': // 275
                                newVal = p1 * p2; // 276
                                break; // 277
                        }
                        result.add(newVal); // 278
                    }
                }
            }
        }
        if (result.size() == 0) { // 279
            result.add(Integer.parseInt(expression)); // 280
        }
        return result;
    }

    public List<Integer> diffWaysToCompute15(String input) {
        List<Integer> res = new ArrayList<>(); // 281
        for (int i = 0; i < input.length(); i++) { // 282
            char c = input.charAt(i); // 283
            if (c == '+' || c == '-' || c == '*') { // 284
                String left = input.substring(0, i); // 285
                String right = input.substring(i + 1); // 286
                List<Integer> leftRes = diffWaysToCompute15(left); // 287
                List<Integer> rightRes = diffWaysToCompute15(right); // 288
                for (int leftNum : leftRes) { // 289
                    for (int rightNum : rightRes) { // 290
                        if (c == '+') { // 291
                            res.add(leftNum + rightNum); // 292
                        } else if (c == '-') { // 293
                            res.add(leftNum - rightNum); // 294
                        } else if (c == '*') { // 295
                            res.add(leftNum * rightNum); // 296
                        }
                    }
                }
            }
        }
        if (res.size() == 0) { // 297
            res.add(Integer.parseInt(input)); // 298
        }
        return res;
    }

    public List<Integer> diffWaysToCompute16(String input) {
        List<Integer> result = new ArrayList<>(); // 299

        for (int i = 0; i < input.length(); i++) { // 300
            char c = input.charAt(i); // 301

            if (c == '+' || c == '-' || c == '*') { // 302
                String leftExpression = input.substring(0, i); // 303
                String rightExpression = input.substring(i + 1); // 304

                List<Integer> leftResults = diffWaysToCompute16(leftExpression); // 305
                List<Integer> rightResults = diffWaysToCompute16(rightExpression); // 306

                for (int left : leftResults) { // 307
                    for (int right : rightResults) { // 308
                        if (c == '+') { // 309
                            result.add(left + right); // 310
                        } else if (c == '-') { // 311
                            result.add(left - right); // 312
                        } else if (c == '*') { // 313
                            result.add(left * right); // 314
                        }
                    }
                }
            }
        }

        if (result.isEmpty()) { // 315
            result.add(Integer.parseInt(input)); // 316
        }

        return result;
    }

    public List<Integer> diffWaysToCompute17(String expression) {
        List<Integer> result = new ArrayList<>(); // 317

        for (int i = 0; i < expression.length(); i++) { // 318
            char c = expression.charAt(i); // 319

            if (c == '+' || c == '-' || c == '*') { // 320
                String leftExpr = expression.substring(0, i); // 321
                String rightExpr = expression.substring(i + 1); // 322

                List<Integer> leftResult = diffWaysToCompute17(leftExpr); // 323
                List<Integer> rightResult = diffWaysToCompute17(rightExpr); // 324

                for (int leftVal : leftResult) { // 325
                    for (int rightVal : rightResult) { // 326
                        int val = 0; // 327

                        if (c == '+') { // 328
                            val = leftVal + rightVal; // 329
                        } else if (c == '-') { // 330
                            val = leftVal - rightVal; // 331
                        } else if (c == '*') { // 332
                            val = leftVal * rightVal; // 333
                        }

                        result.add(val); // 334
                    }
                }
            }
        }

        if (result.isEmpty()) { // 335
            result.add(Integer.parseInt(expression)); // 336
        }

        return result;
    }

    public List<Integer> diffWaysToCompute18(String expression) {
        List<Integer> result = new ArrayList<>(); // 337
        for (int i = 0; i < expression.length(); i++) { // 338
            char c = expression.charAt(i); // 339
            if (c == '+' || c == '-' || c == '*') { // 340
                String leftExpression = expression.substring(0, i); // 341
                String rightExpression = expression.substring(i + 1); // 342
                List<Integer> leftResults = diffWaysToCompute18(leftExpression); // 343
                List<Integer> rightResults = diffWaysToCompute18(rightExpression); // 344
                for (int leftResult : leftResults) { // 345
                    for(int rightResult : rightResults) { // 346
                        if (c == '+') { // 347
                            result.add(leftResult + rightResult); // 348
                        } else if (c == '-') { // 349
                            result.add(leftResult - rightResult); // 350
                        } else if (c == '*') { // 351
                            result.add(leftResult * rightResult); // 352
                        }
                    }
                }
            }
        }

        if (result.isEmpty()) { // 353
            result.add(Integer.parseInt(expression)); // 354
        }

        return result;
    }
}


