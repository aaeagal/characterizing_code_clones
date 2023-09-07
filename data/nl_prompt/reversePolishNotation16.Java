

public class ReversePolishNotation {
    public static int evaluateExpression(String[] tokens) {
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
        String[] expression = {"2", "1", "+", "3", "*"};
        int result = evaluateExpression(expression);
        System.out.println("Result: " + result);
    }
}

public class RPNExpressionEvaluator {
    public static int evaluateRPN(String[] tokens) {
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
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evaluateRPN(tokens);
        System.out.println("Result: " + result);
    }
}

public class ReversePolishNotation {
    public static int evaluateExpression(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(token, operand1, operand2);
                stack.push(result);
            }
        }
        return stack.pop();
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
        System.out.println("Expression value: " + result);
    }
}

public static int evaluateRPN(String[] tokens) {
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

public class ReversePolishNotation {
    public static int evaluate(String[] tokens) {
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
}

public class ReversePolishNotation {
  
  public static int evaluateExpression(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    
    for (String token : tokens) {
      if (isOperator(token)) {
        int operand2 = stack.pop();
        int operand1 = stack.pop();
        int result = evaluateOperator(token, operand1, operand2);
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
  
  private static int evaluateOperator(String operator, int operand1, int operand2) {
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
    String[] tokens1 = {"2", "1", "+", "3", "*"};
    System.out.println(evaluateExpression(tokens1));  // Output: 9
    
    String[] tokens2 = {"4", "13", "5", "/", "+"};
    System.out.println(evaluateExpression(tokens2));  // Output: 6
  }
}


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
        System.out.println(evaluateExpression(tokens)); // Output: 9
    }
}

public int evaluateExpr(String[] tokens) {
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


public class ReversePolishNotation {
    public static int evaluateExpression(String[] tokens) {
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
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evaluateExpression(tokens);
        System.out.println("Result: " + result);
    }
}

public class ReversePolishNotation {
    public static int evaluateExpression(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 - num1);
            } else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
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
        String[] expression = {"2", "1", "+", "3", "*"};
        System.out.println(evaluateExpression(expression)); // Output: 9
    }
}


public class ReversePolishNotationEvaluator {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(operand1, operand2, token);
                stack.push(result);
            } else {
                int number = Integer.parseInt(token);
                stack.push(number);
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int performOperation(int operand1, int operand2, String operator) {
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
        int result = evalRPN(tokens);
        System.out.println("Result: " + result);
    }
}

public class ReversePolishNotation {
    public static int evaluateRPN(String[] tokens) {
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
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evaluateRPN(tokens);
        System.out.println("Result: " + result);
    }
}


public class RPNCalculator {
    
    public static int evaluateRPN(String[] tokens) {
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
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(evaluateRPN(tokens)); // Output: 9
        
        tokens = {"4", "13", "5", "/", "+"};
        System.out.println(evaluateRPN(tokens)); // Output: 6
        
        tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evaluateRPN(tokens)); // Output: 22
    }
}


public class RPNCalculator {
    public static int evaluate(String[] tokens) {
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
}

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
        String[] expression = {"2", "1", "+", "3", "*"};

        int result = evaluateExpression(expression);
        System.out.println("Result: " + result);
    }
}

public int evaluateRPN(String[] tokens) {
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

public class ReversePolishNotation {
    public static int evaluateExpression(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
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
        int result = evaluateExpression(tokens);
        System.out.println("Result: " + result);
    }
}


public class EvaluateExpression {
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
      String[] tokens = {"2", "1", "+", "3", "*"};
      int result = evaluateExpression(tokens);
      System.out.println("The result is: " + result);
   }
}

public class ReversePolishNotation {
    public static int evaluateExpression(String[] tokens) {
        if(tokens == null || tokens.length == 0) {
            throw new IllegalArgumentException("Invalid expression!");
        }
        
        Stack<Integer> stack = new Stack<>();
        
        for(String token : tokens) {
            if(isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(num1 - num2);
            } else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (token.equals("/")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(num1 / num2);
            }
        }
        
        if(stack.size() == 1) {
            return stack.pop();
        } else {
            throw new IllegalArgumentException("Invalid expression!");
        }
    }
    
    public static boolean isNumeric(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
    
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evaluateExpression(tokens);
        System.out.println("Result: " + result); // Output: Result: 9
    }
}


public class RPNExpressionEvaluator {
    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(evaluateExpression(token, num1, num2));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int evaluateExpression(String operator, int num1, int num2) {
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
                return 0;
        }
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evaluateRPN(tokens);
        System.out.println("Result: " + result);
    }
}

