    public static int evaluateRPN1(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens) {
            if(isOperator1(token)) {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                int result = evaluate1(token, firstOperand, secondOperand);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private static boolean isOperator1(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int evaluate1(String operator, int operand1, int operand2) {
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

    public static int evaluateExpression2(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator2(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation2(token, operand1, operand2);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }

    private static boolean isOperator2(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int performOperation2(String operator, int operand1, int operand2) {
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

    public static int evaluateRPN3(String[] tokens) {
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
    

    public static int evaluateExpression4(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isOperator4(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = evaluateOperation4(token, operand1, operand2);
                stack.push(result);
            } else {
                int operand = Integer.parseInt(token);
                stack.push(operand);
            }
        }
        return stack.pop();
    }

    private static boolean isOperator4(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int evaluateOperation4(String operator, int operand1, int operand2) {
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

  
    public static int evaluateExpression5(String[] tokens) {
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


  
  public int evalRPN6(String[] tokens) {
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
  

    public static int evaluateExpression7(String[] tokens) {
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


  public int evaluateExpression8(String[] tokens) {
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

    public static int evalRPN9(String[] tokens) {
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

    public static int evaluateRPN10(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isNumber10(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = performOperation10(token, num1, num2);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    private static boolean isNumber10(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static int performOperation10(String operator, int num1, int num2) {
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

    public static int evaluateExpression11(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator11(token)) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = performOperation11(token, num1, num2);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private static boolean isOperator11(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int performOperation11(String operation, int num1, int num2) {
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

 
    public static int evaluateExpression12(String[] tokens) {
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
    

    // Method to evaluate value of a postfix expression
    static int evaluatePostfix13(String expression) {
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

    public static int evaluateExpression14(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isOperator14(token)) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = performOperation14(token, num1, num2);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private static boolean isOperator14(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int performOperation14(String operator, int num1, int num2) {
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


    public static int evalRPN15(String[] tokens) {
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

    
    public static int evaluateRPN16(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (isOperator16(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation16(token, operand1, operand2);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }
    
    private static boolean isOperator16(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    
    private static int performOperation16(String operator, int operand1, int operand2) {
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
    



