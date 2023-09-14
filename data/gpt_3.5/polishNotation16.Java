
import java.util.Stack;

public class RPNCalculator {
    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens) {
            if(isOperator(token)) {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                int result = evaluate(token, firstOperand, secondOperand);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int evaluate(String operator, int operand1, int operand2) {
        if(operator.equals("+")) {
            return operand1 + operand2;
        } else if(operator.equals("-")) {
            return operand1 - operand2;
        } else if(operator.equals("*")) {
            return operand1 * operand2;
        } else if(operator.equals("/")) {
            return operand1 / operand2;
        } else {
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}


import java.util.Stack;

public class ReversePolishNotationEvaluation {
    public static int evaluateExpression(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(token, operand1, operand2);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int performOperation(String operator, int operand1, int operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evaluateExpression(tokens);
        System.out.println("Result: " + result);
    }
}


import java.util.Stack;

public class RPNCalculator {
    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (token.equals("+")) {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                stack.push(firstOperand + secondOperand);
            } else if (token.equals("-")) {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                stack.push(firstOperand - secondOperand);
            } else if (token.equals("*")) {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                stack.push(firstOperand * secondOperand);
            } else if (token.equals("/")) {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                stack.push(firstOperand / secondOperand);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }
    
    public static void main(String[] args) {
        String[] tokens = new String[] { "2", "1", "+", "3", "*" };
        int result = evaluateRPN(tokens);
        System.out.println("Result: " + result); // Expected output: 9
    }
}


    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evaluateExpression(tokens);
        System.out.println("Result: " + result);
    }
    

import java.util.Stack;

public class ReversePolishNotation {
    public static int evaluateExpression(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isOperator(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = evaluateOperation(token, operand1, operand2);
                stack.push(result);
            } else {
                int operand = Integer.parseInt(token);
                stack.push(operand);
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int evaluateOperation(String operator, int operand1, int operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
        }
        return 0;
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evaluateExpression(tokens);
        System.out.println(result); // Output: 9
    }
}


import java.util.Stack;

public class ReversePolishNotation {
    public static int evaluateExpression(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1 + operand2);
            } else if (token.equals("-")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1 - operand2);
            } else if (token.equals("*")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1 * operand2);
            } else if (token.equals("/")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1 / operand2);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        String[] tokens3 = {"3", "4", "*", "2", "5", "*", "+"};
        System.out.println("Result 1: " + evaluateExpression(tokens1));
        System.out.println("Result 2: " + evaluateExpression(tokens2));
        System.out.println("Result 3: " + evaluateExpression(tokens3));
    }
}


    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(evaluateExpression(tokens)); // Output: 9
        
        tokens = {"4", "13", "5", "/", "+"};
        System.out.println(evaluateExpression(tokens)); // Output: 6
    }
    

import java.util.Stack;

public class ReversePolishNotation {
  
  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    
    for (String token : tokens) {
      if (token.equals("+")) {
        int num2 = stack.pop();
        int num1 = stack.pop();
        stack.push(num1 + num2);
      } else if (token.equals("-")) {
        int num2 = stack.pop();
        int num1 = stack.pop();
        stack.push(num1 - num2);
      } else if (token.equals("*")) {
        int num2 = stack.pop();
        int num1 = stack.pop();
        stack.push(num1 * num2);
      } else if (token.equals("/")) {
        int num2 = stack.pop();
        int num1 = stack.pop();
        stack.push(num1 / num2);
      } else {
        stack.push(Integer.parseInt(token));
      }
    }
    
    return stack.pop();
  }
  
  public static void main(String[] args) {
    ReversePolishNotation rpn = new ReversePolishNotation();
    String[] tokens = {"2", "1", "+", "3", "*"};
    int result = rpn.evalRPN(tokens);
    System.out.println(result); // Output: 9
  }
}


import java.util.Stack;

public class ReversePolishNotation {
    public static int evaluateExpression(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 + num1);
            } else if (token.equals("-")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 - num1);
            } else if (token.equals("*")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 * num1);
            } else if (token.equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 / num1);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evaluateExpression(tokens);
        System.out.println("Result: " + result);
    }
}


import java.util.Stack;

public class RPNCalculator {
  public int evaluateExpression(String[] tokens) {
    Stack<Integer> stack = new Stack<>();

    for (String token : tokens) {
      if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
        int operand2 = stack.pop();
        int operand1 = stack.pop();

        switch (token) {
          case "+":
            stack.push(operand1 + operand2);
            break;
          case "-":
            stack.push(operand1 - operand2);
            break;
          case "*":
            stack.push(operand1 * operand2);
            break;
          case "/":
            stack.push(operand1 / operand2);
            break;
        }
      } else {
        stack.push(Integer.parseInt(token));
      }
    }

    return stack.pop();
  }
}


import java.util.Stack;

public class ReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(num1 + num2);
            } else if (token.equals("-")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(num1 - num2);
            } else if (token.equals("*")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(num1 * num2);
            } else if (token.equals("/")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(num1 / num2);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"4", "13", "5", "/", "+"};
        int result = evalRPN(tokens);
        System.out.println("Result: " + result);
    }
}


import java.util.Stack;

public class RPNExpressionEvaluator {
    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = performOperation(token, num1, num2);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    private static boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static int performOperation(String operator, int num1, int num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}



import java.util.Stack;

public class ReversePolishNotation {

    public static int evaluateExpression(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = performOperation(token, num1, num2);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int performOperation(String operation, int num1, int num2) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evaluateExpression(tokens);
        System.out.println("Result: " + result);
    }
}




import java.util.Stack;

public class ReversePolishNotation {
    
    public static int evaluateExpression(String[] tokens) {
        Stack<String> stack = new Stack<>();
        
        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                stack.push(token);
            } else {
                int operand2 = Integer.parseInt(stack.pop());
                int operand1 = Integer.parseInt(stack.pop());
                
                switch (token) {
                    case "+":
                        stack.push(String.valueOf(operand1 + operand2));
                        break;
                    case "-":
                        stack.push(String.valueOf(operand1 - operand2));
                        break;
                    case "*":
                        stack.push(String.valueOf(operand1 * operand2));
                        break;
                    case "/":
                        stack.push(String.valueOf(operand1 / operand2));
                        break;
                    default:
                        break;
                }
            }
        }
        
        return Integer.parseInt(stack.pop());
    }
    
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evaluateExpression(tokens);
        System.out.println("Expression value: " + result);
    }
}



    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evaluateRPN(tokens);
        System.out.println("Result: " + result);
    }
    

// Java program to evaluate value of a given arithmetic expression in Reverse Polish Notation

// Class to evaluate value of a given expression
class EvaluateString {
    // Method to evaluate value of a postfix expression
    static int evaluatePostfix(String expression) {
        //create a stack
        Stack<Integer> stack = new Stack<>();
        
        // Scan all characters one by one
        for(int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            
            // If the scanned character is an operand (number here),
            // push it to the stack
            if(Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                // If the scanned character is an operator, pop two
                // elements from stack apply the operator
                int val1 = stack.pop();
                int val2 = stack.pop();
                
                switch(c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                        
                    case '-':
                        stack.push(val2 - val1);
                        break;
                        
                    case '/':
                        stack.push(val2 / val1);
                        break;
                        
                    case '*':
                        stack.push(val2 * val1);
                        break;
                }
            }
        }
        
        return stack.pop();    
    }
}


import java.util.Stack;

public class RPNCalculator {
    public static int evaluateExpression(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isOperator(token)) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = performOperation(token, num1, num2);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int performOperation(String operator, int num1, int num2) {
        if (operator.equals("+")) {
            return num1 + num2;
        } else if (operator.equals("-")) {
            return num1 - num2;
        } else if (operator.equals("*")) {
            return num1 * num2;
        } else {
            return num1 / num2;
        }
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evaluateExpression(tokens);
        System.out.println("Result: " + result);
    }
}


    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] tokens1 = {"2", "1", "+", "3", "*"};
        int result1 = solution.evalRPN(tokens1);
        System.out.println(result1); // Output: 9

        String[] tokens2 = {"4", "13", "5", "/", "+"};
        int result2 = solution.evalRPN(tokens2);
        System.out.println(result2); // Output: 6

        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int result3 = solution.evalRPN(tokens3);
        System.out.println(result3); // Output: 22
    }
    

import java.util.Stack;

public class ReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            } else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (token.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            } else if (token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evalRPN(tokens);
        System.out.println(result);
    }
}



import java.util.Stack;

public class ReversePolishNotation {
    
    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (isOperator(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(token, operand1, operand2);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }
    
    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    
    private static int performOperation(String operator, int operand1, int operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evaluateRPN(tokens);
        System.out.println("Result: " + result);
    }
}


