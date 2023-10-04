
import java.util.Stack;

public class RPNCalculator {
    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); // 1

        for(String token : tokens) { // 2
            if(isOperator(token)) { // 3
                int secondOperand = stack.pop(); // 4
                int firstOperand = stack.pop(); // 5
                int result = evaluate(token, firstOperand, secondOperand); // 6
                stack.push(result); // 7
            } else { // 8
                stack.push(Integer.parseInt(token)); // 9
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) { // 10
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int evaluate(String operator, int operand1, int operand2) { // 11
        if(operator.equals("+")) { // 12
            return operand1 + operand2;
        } else if(operator.equals("-")) { // 13
            return operand1 - operand2;
        } else if(operator.equals("*")) { // 14
            return operand1 * operand2;
        } else if(operator.equals("/")) { // 15
            return operand1 / operand2;
        } else { // 16
            throw new IllegalArgumentException("Invalid operator: " + operator); // 17
        }
    }
}


import java.util.Stack;

public class ReversePolishNotationEvaluation {
    public static int evaluateExpression(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); // 18

        for (String token : tokens) { // 19
            if (isOperator(token)) { // 20
                int operand2 = stack.pop(); // 21
                int operand1 = stack.pop(); // 22
                int result = performOperation(token, operand1, operand2); // 23
                stack.push(result); // 24
            } else { // 25
                stack.push(Integer.parseInt(token)); // 26
            }
        }

        return stack.peek();
    }

    private static boolean isOperator(String token) { // 27
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int performOperation(String operator, int operand1, int operand2) { // 28
        switch (operator) { // 29
            case "+": // 30
                return operand1 + operand2;
            case "-": // 31
                return operand1 - operand2;
            case "*": // 32
                return operand1 * operand2;
            case "/": // 33
                return operand1 / operand2;
            default: // 34
                throw new IllegalArgumentException("Invalid operator: " + operator); // 35
        }
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"}; // 36
        int result = evaluateExpression(tokens); // 37
        System.out.println("Result: " + result); // 38
    }
}


import java.util.Stack;

public class RPNCalculator {
    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); // 39

        for (String token : tokens) { // 40
            if (token.equals("+")) { // 41
                int secondOperand = stack.pop(); // 42
                int firstOperand = stack.pop(); // 43
                stack.push(firstOperand + secondOperand); // 44
            } else if (token.equals("-")) { // 45
                int secondOperand = stack.pop(); // 46
                int firstOperand = stack.pop(); // 47
                stack.push(firstOperand - secondOperand); // 48
            } else if (token.equals("*")) { // 49
                int secondOperand = stack.pop(); // 50
                int firstOperand = stack.pop(); // 51
                stack.push(firstOperand * secondOperand); // 52
            } else if (token.equals("/")) { // 53
                int secondOperand = stack.pop(); // 54
                int firstOperand = stack.pop(); // 55
                stack.push(firstOperand / secondOperand); // 56
            } else { // 57
                stack.push(Integer.parseInt(token)); // 58
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = new String[] { "2", "1", "+", "3", "*" }; // 59
        int result = evaluateRPN(tokens); // 60
        System.out.println("Result: " + result); // Expected output: 9 // 61
    }
}


    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"}; // 62
        int result = evaluateExpression(tokens); // 63
        System.out.println("Result: " + result); // 64
    }


import java.util.Stack;

public class ReversePolishNotation {
    public static int evaluateExpression(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); // 65
        for (String token : tokens) { // 66
            if (isOperator(token)) { // 67
                int operand2 = stack.pop(); // 68
                int operand1 = stack.pop(); // 69
                int result = evaluateOperation(token, operand1, operand2); // 70
                stack.push(result); // 71
            } else { // 72
                int operand = Integer.parseInt(token); // 73
                stack.push(operand); // 74
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(String token) { // 75
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int evaluateOperation(String operator, int operand1, int operand2) { // 76
        switch (operator) { // 77
            case "+": // 78
                return operand1 + operand2;
            case "-": // 79
                return operand1 - operand2;
            case "*": // 80
                return operand1 * operand2;
            case "/": // 81
                return operand1 / operand2;
        }
        return 0;
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"}; // 82
        int result = evaluateExpression(tokens); // 83
        System.out.println(result); // Output: 9 // 84
    }
}


import java.util.Stack;

public class ReversePolishNotation {
    public static int evaluateExpression(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); // 85

        for (String token : tokens) { // 86
            if (token.equals("+")) { // 87
                int operand2 = stack.pop(); // 88
                int operand1 = stack.pop(); // 89
                stack.push(operand1 + operand2); // 90
            } else if (token.equals("-")) { // 91
                int operand2 = stack.pop(); // 92
                int operand1 = stack.pop(); // 93
                stack.push(operand1 - operand2); // 94
            } else if (token.equals("*")) { // 95
                int operand2 = stack.pop(); // 96
                int operand1 = stack.pop(); // 97
                stack.push(operand1 * operand2); // 98
            } else if (token.equals("/")) { // 99
                int operand2 = stack.pop(); // 100
                int operand1 = stack.pop(); // 101
                stack.push(operand1 / operand2); // 102
            } else { // 103
                stack.push(Integer.parseInt(token)); // 104
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens1 = {"2", "1", "+", "3", "*"}; // 105
        String[] tokens2 = {"4", "13", "5", "/", "+"}; // 106
        String[] tokens3 = {"3", "4", "*", "2", "5", "*", "+"}; // 107
        System.out.println("Result 1: " + evaluateExpression(tokens1)); // 108
        System.out.println("Result 2: " + evaluateExpression(tokens2)); // 109
        System.out.println("Result 3: " + evaluateExpression(tokens3)); // 110
    }
}


    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"}; // 111
        System.out.println(evaluateExpression(tokens)); // Output: 9 // 112

        tokens = {"4", "13", "5", "/", "+"}; // 113
        System.out.println(evaluateExpression(tokens)); // Output: 6 // 114
    }


import java.util.Stack;

public class ReversePolishNotation {

  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>(); // 115

    for (String token : tokens) { // 116
      if (token.equals("+")) { // 117
        int num2 = stack.pop(); // 118
        int num1 = stack.pop(); // 119
        stack.push(num1 + num2); // 120
      } else if (token.equals("-")) { // 121
        int num2 = stack.pop(); // 122
        int num1 = stack.pop(); // 123
        stack.push(num1 - num2); // 124
      } else if (token.equals("*")) { // 125
        int num2 = stack.pop(); // 126
        int num1 = stack.pop(); // 127
        stack.push(num1 * num2); // 128
      } else if (token.equals("/")) { // 129
        int num2 = stack.pop(); // 130
        int num1 = stack.pop(); // 131
        stack.push(num1 / num2); // 132
      } else { // 133
        stack.push(Integer.parseInt(token)); // 134
      }
    }

    return stack.pop();
  }

  public static void main(String[] args) {
    ReversePolishNotation rpn = new ReversePolishNotation(); // 135
    String[] tokens = {"2", "1", "+", "3", "*"}; // 136
    int result = rpn.evalRPN(tokens); // 137
    System.out.println(result); // Output: 9 // 138
  }
}


import java.util.Stack;

public class ReversePolishNotation {
    public static int evaluateExpression(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); // 139

        for (String token : tokens) { // 140
            if (token.equals("+")) { // 141
                int num1 = stack.pop(); // 142
                int num2 = stack.pop(); // 143
                stack.push(num2 + num1); // 144
            } else if (token.equals("-")) { // 145
                int num1 = stack.pop(); // 146
                int num2 = stack.pop(); // 147
                stack.push(num2 - num1); // 148
            } else if (token.equals("*")) { // 149
                int num1 = stack.pop(); // 150
                int num2 = stack.pop(); // 151
                stack.push(num2 * num1); // 152
            } else if (token.equals("/")) { // 153
                int num1 = stack.pop(); // 154
                int num2 = stack.pop(); // 155
                stack.push(num2 / num1); // 156
            } else { // 157
                stack.push(Integer.parseInt(token)); // 158
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"}; // 159
        int result = evaluateExpression(tokens); // 160
        System.out.println("Result: " + result); // 161
    }
}


import java.util.Stack;

public class RPNCalculator {
  public int evaluateExpression(String[] tokens) {
    Stack<Integer> stack = new Stack<>(); // 162

    for (String token : tokens) { // 163
      if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) { // 164
        int operand2 = stack.pop(); // 165
        int operand1 = stack.pop(); // 166

        switch (token) { // 167
          case "+": // 168
            stack.push(operand1 + operand2); // 169
            break; // 170
          case "-": // 171
            stack.push(operand1 - operand2); // 172
            break; // 173
          case "*": // 174
            stack.push(operand1 * operand2); // 175
            break; // 176
          case "/": // 177
            stack.push(operand1 / operand2); // 178
            break; // 179
        }
      } else { // 180
        stack.push(Integer.parseInt(token)); // 181
      }
    }

    return stack.pop();
  }
}


import java.util.Stack;

public class ReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); // 182

        for (String token : tokens) { // 183
            if (token.equals("+")) { // 184
                int num2 = stack.pop(); // 185
                int num1 = stack.pop(); // 186
                stack.push(num1 + num2); // 187
            } else if (token.equals("-")) { // 188
                int num2 = stack.pop(); // 189
                int num1 = stack.pop(); // 190
                stack.push(num1 - num2); // 191
            } else if (token.equals("*")) { // 192
                int num2 = stack.pop(); // 193
                int num1 = stack.pop(); // 194
                stack.push(num1 * num2); // 195
            } else if (token.equals("/")) { // 196
                int num2 = stack.pop(); // 197
                int num1 = stack.pop(); // 198
                stack.push(num1 / num2); // 199
            } else { // 200
                stack.push(Integer.parseInt(token)); // 201
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"4", "13", "5", "/", "+"}; // 202
        int result = evalRPN(tokens); // 203
        System.out.println("Result: " + result); // 204
    }
}


import java.util.Stack;

public class RPNExpressionEvaluator {
    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); // 205
        for (String token : tokens) { // 206
            if (isNumber(token)) { // 207
                stack.push(Integer.parseInt(token)); // 208
            } else { // 209
                int num2 = stack.pop(); // 210
                int num1 = stack.pop(); // 211
                int result = performOperation(token, num1, num2); // 212
                stack.push(result); // 213
            }
        }
        return stack.pop();
    }

    private static boolean isNumber(String token) { // 214
        try { // 215
            Integer.parseInt(token); // 216
            return true;
        } catch (NumberFormatException e) { // 217
            return false;
        }
    }

    private static int performOperation(String operator, int num1, int num2) { // 218
        switch (operator) { // 219
            case "+": // 220
                return num1 + num2;
            case "-": // 221
                return num1 - num2;
            case "*": // 222
                return num1 * num2;
            case "/": // 223
                return num1 / num2;
            default: // 224
                throw new IllegalArgumentException("Invalid operator: " + operator); // 225
        }
    }
}



import java.util.Stack;

public class ReversePolishNotation {

    public static int evaluateExpression(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); // 226

        for (String token : tokens) { // 227
            if (isOperator(token)) { // 228
                int num2 = stack.pop(); // 229
                int num1 = stack.pop(); // 230
                int result = performOperation(token, num1, num2); // 231
                stack.push(result); // 232
            } else { // 233
                stack.push(Integer.parseInt(token)); // 234
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) { // 235
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int performOperation(String operation, int num1, int num2) { // 236
        switch (operation) { // 237
            case "+": // 238
                return num1 + num2;
            case "-": // 239
                return num1 - num2;
            case "*": // 240
                return num1 * num2;
            case "/": // 241
                return num1 / num2;
            default: // 242
                throw new IllegalArgumentException("Invalid operation: " + operation); // 243
        }
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"}; // 244
        int result = evaluateExpression(tokens); // 245
        System.out.println("Result: " + result); // 246
    }
}




import java.util.Stack;

public class ReversePolishNotation {

    public static int evaluateExpression(String[] tokens) {
        Stack<String> stack = new Stack<>(); // 247

        for (String token : tokens) { // 248
            if (token.matches("-?\\d+")) { // 249
                stack.push(token); // 250
            } else { // 251
                int operand2 = Integer.parseInt(stack.pop()); // 252
                int operand1 = Integer.parseInt(stack.pop()); // 253

                switch (token) { // 254
                    case "+": // 255
                        stack.push(String.valueOf(operand1 + operand2)); // 256
                        break; // 257
                    case "-": // 258
                        stack.push(String.valueOf(operand1 - operand2)); // 259
                        break; // 260
                    case "*": // 261
                        stack.push(String.valueOf(operand1 * operand2)); // 262
                        break; // 263
                    case "/": // 264
                        stack.push(String.valueOf(operand1 / operand2)); // 265
                        break; // 266
                    default: // 267
                        break; // 268
                }
            }
        }

        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"}; // 269
        int result = evaluateExpression(tokens); // 270
        System.out.println("Expression value: " + result); // 271
    }
}



    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"}; // 272
        int result = evaluateRPN(tokens); // 273
        System.out.println("Result: " + result); // 274
    }


// Java program to evaluate value of a given arithmetic expression in Reverse Polish Notation // 275

// Class to evaluate value of a given expression // 276
class EvaluateString {
    // Method to evaluate value of a postfix expression // 277
    static int evaluatePostfix(String expression) { // 278
        //create a stack // 279
        Stack<Integer> stack = new Stack<>(); // 280

        // Scan all characters one by one // 281
        for(int i = 0; i < expression.length(); i++) { // 282
            char c = expression.charAt(i); // 283

            // If the scanned character is an operand (number here), // 284
            // push it to the stack // 285
            if(Character.isDigit(c)) { // 286
                stack.push(c - '0'); // 287
            } else { // 288
                // If the scanned character is an operator, pop two // 289
                // elements from stack apply the operator // 290
                int val1 = stack.pop(); // 291
                int val2 = stack.pop(); // 292

                switch(c) { // 293
                    case '+': // 294
                        stack.push(val2 + val1); // 295
                        break; // 296

                    case '-': // 297
                        stack.push(val2 - val1); // 298
                        break; // 299

                    case '/': // 300
                        stack.push(val2 / val1); // 301
                        break; // 302

                    case '*': // 303
                        stack.push(val2 * val1); // 304
                        break; // 305
                }
            }
        }

        return stack.pop();
    }
}


import java.util.Stack;

public class RPNCalculator {
    public static int evaluateExpression(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); // 306
        for (String token : tokens) { // 307
            if (isOperator(token)) { // 308
                int num2 = stack.pop(); // 309
                int num1 = stack.pop(); // 310
                int result = performOperation(token, num1, num2); // 311
                stack.push(result); // 312
            } else { // 313
                stack.push(Integer.parseInt(token)); // 314
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(String token) { // 315
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int performOperation(String operator, int num1, int num2) { // 316
        if (operator.equals("+")) { // 317
            return num1 + num2;
        } else if (operator.equals("-")) { // 318
            return num1 - num2;
        } else if (operator.equals("*")) { // 319
            return num1 * num2;
        } else { // 320
            return num1 / num2;
        }
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"}; // 321
        int result = evaluateExpression(tokens); // 322
        System.out.println("Result: " + result); // 323
    }
}


    public static void main(String[] args) {
        Solution solution = new Solution(); // 324

        String[] tokens1 = {"2", "1", "+", "3", "*"}; // 325
        int result1 = solution.evalRPN(tokens1); // 326
        System.out.println(result1); // Output: 9 // 327

        String[] tokens2 = {"4", "13", "5", "/", "+"}; // 328
        int result2 = solution.evalRPN(tokens2); // 329
        System.out.println(result2); // Output: 6 // 330

        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}; // 331
        int result3 = solution.evalRPN(tokens3); // 332
        System.out.println(result3); // Output: 22 // 333
    }


import java.util.Stack;

public class ReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); // 334

        for (String token : tokens) { // 335
            if (token.equals("+")) { // 336
                int b = stack.pop(); // 337
                int a = stack.pop(); // 338
                stack.push(a + b); // 339
            } else if (token.equals("-")) { // 340
                int b = stack.pop(); // 341
                int a = stack.pop(); // 342
                stack.push(a - b); // 343
            } else if (token.equals("*")) { // 344
                int b = stack.pop(); // 345
                int a = stack.pop(); // 346
                stack.push(a * b); // 347
            } else if (token.equals("/")) { // 348
                int b = stack.pop(); // 349
                int a = stack.pop(); // 350
                stack.push(a / b); // 351
            } else { // 352
                stack.push(Integer.parseInt(token)); // 353
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"}; // 354
        int result = evalRPN(tokens); // 355
        System.out.println(result); // 356
    }
}



import java.util.Stack;

public class ReversePolishNotation {

    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); // 357

        for (String token : tokens) { // 358
            if (isOperator(token)) { // 359
                int operand2 = stack.pop(); // 360
                int operand1 = stack.pop(); // 361
                int result = performOperation(token, operand1, operand2); // 362
                stack.push(result); // 363
            } else { // 364
                stack.push(Integer.parseInt(token)); // 365
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) { // 366
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int performOperation(String operator, int operand1, int operand2) { // 367
        switch (operator) { // 368
            case "+": // 369
                return operand1 + operand2;
            case "-": // 370
                return operand1 - operand2;
            case "*": // 371
                return operand1 * operand2;
            case "/": // 372
                return operand1 / operand2;
            default: // 373
                throw new IllegalArgumentException("Invalid operator: " + operator); // 374
        }
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"}; // 375
        int result = evaluateRPN(tokens); // 376
        System.out.println("Result: " + result); // 377
    }
}


