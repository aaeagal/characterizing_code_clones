
public class ExpressionEvaluation {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String p1 = expression.substring(0, i);
                String p2 = expression.substring(i + 1);
                List<Integer> res1 = diffWaysToCompute(p1);
                List<Integer> res2 = diffWaysToCompute(p2);
                for (int val1 : res1) {
                    for (int val2 : res2) {
                        if (c == '+') {
                            res.add(val1 + val2);
                        } else if (c == '-') {
                            res.add(val1 - val2);
                        } else {
                            res.add(val1 * val2);
                        }
                    }
                }
            }
        }
        if (res.isEmpty()) {
            res.add(Integer.parseInt(expression));
        }
        return res;
    }
}


class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftExpression = expression.substring(0, i);
                String rightExpression = expression.substring(i + 1);
                List<Integer> leftResults = diffWaysToCompute(leftExpression);
                List<Integer> rightResults = diffWaysToCompute(rightExpression);
                for (int left : leftResults) {
                    for (int right : rightResults) {
                        if (c == '+') {
                            result.add(left + right);
                        } else if (c == '-') {
                            result.add(left - right);
                        } else if (c == '*') {
                            result.add(left * right);
                        }
                    }
                }
            }
        }
        if (result.size() == 0) {
            result.add(Integer.parseInt(expression));
        }
        return result;
    }
}

public class DifferentWaysToAddParentheses {
    
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);
                List<Integer> leftResult = diffWaysToCompute(left);
                List<Integer> rightResult = diffWaysToCompute(right);
                
                for (int leftNum : leftResult) {
                    for (int rightNum : rightResult) {
                        if (c == '+') {
                            result.add(leftNum + rightNum);
                        } else if (c == '-') {
                            result.add(leftNum - rightNum);
                        } else if (c == '*') {
                            result.add(leftNum * rightNum);
                        }
                    }
                }
            }
        }
        
        if (result.isEmpty()) {
            result.add(Integer.valueOf(expression));
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        DifferentWaysToAddParentheses obj = new DifferentWaysToAddParentheses();
        String expression = "2-1-1";
        List<Integer> result = obj.diffWaysToCompute(expression);
        System.out.println(result);
        
        expression = "2*3-4*5";
        result = obj.diffWaysToCompute(expression);
        System.out.println(result);
    }
}

public class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);
                List<Integer> leftResults = diffWaysToCompute(left);
                List<Integer> rightResults = diffWaysToCompute(right);
                for (int num1 : leftResults) {
                    for (int num2 : rightResults) {
                        int num = 0;
                        if (c == '+') {
                            num = num1 + num2;
                        } else if (c == '-') {
                            num = num1 - num2;
                        } else if (c == '*') {
                            num = num1 * num2;
                        }
                        result.add(num);
                    }
                }
            }
        }
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }
        return result;
    }
}

public class DifferentWaysToAddParentheses {
    
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftStr = input.substring(0, i);
                String rightStr = input.substring(i + 1);

                List<Integer> leftRes = diffWaysToCompute(leftStr);
                List<Integer> rightRes = diffWaysToCompute(rightStr);

                for (Integer left : leftRes) {
                    for (Integer right : rightRes) {
                        if (c == '+') {
                            res.add(left + right);
                        } else if (c == '-') {
                            res.add(left - right);
                        } else if (c == '*') {
                            res.add(left * right);
                        }
                    }
                }
            }
        }

        if (res.size() == 0) {
            res.add(Integer.parseInt(input));
        }

        return res;
    }
    
    public static void main(String[] args) {
        DifferentWaysToAddParentheses solution = new DifferentWaysToAddParentheses();
        List<Integer> result = solution.diffWaysToCompute("2-1-1");
        System.out.println(result); // Output: [2, 0]
    }
}

public class ExpressionEvaluator {

    public List<Integer> evaluateExpression(String input) {
        List<Integer> result = new ArrayList<>();
        if (input == null || input.length() == 0) {
            return result;
        }
        evaluateExpressionRecursive(input, result, 0, 0, 0);
        return result;
    }

    private void evaluateExpressionRecursive(String input, List<Integer> result, int startIndex, int currentSum, int previousNumber) {
        if (startIndex == input.length()) {
            result.add(currentSum);
            return;
        }
        for (int i = startIndex; i < input.length(); i++) {
            String currentString = input.substring(startIndex, i + 1);
            int currentNumber = Integer.parseInt(currentString);
            if (startIndex == 0) {
                evaluateExpressionRecursive(input, result, i + 1, currentNumber, currentNumber);
            } else {
                evaluateExpressionRecursive(input, result, i + 1, currentSum + currentNumber, currentNumber);
                evaluateExpressionRecursive(input, result, i + 1, currentSum - currentNumber, -currentNumber);
                evaluateExpressionRecursive(input, result, i + 1, currentSum - previousNumber + (previousNumber * currentNumber), previousNumber * currentNumber);
            }
        }
    }

    public static void main(String[] args) {
        ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator();
        List<Integer> result = expressionEvaluator.evaluateExpression("123");
        System.out.println(result);
    }
}


class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftPart = input.substring(0, i);
                String rightPart = input.substring(i + 1);
                
                List<Integer> left = diffWaysToCompute(leftPart);
                List<Integer> right = diffWaysToCompute(rightPart);
                
                for (int num1 : left) {
                    for (int num2 : right) {
                        if (c == '+') {
                            result.add(num1 + num2);
                        } else if (c == '-') {
                            result.add(num1 - num2);
                        } else if (c == '*') {
                            result.add(num1 * num2);
                        }
                    }
                }
            }
        }
        
        if (result.isEmpty()) {
            result.add(Integer.parseInt(input));
        }
        
        return result;
    }
}


public class ExpressionEvaluation {
    
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            
            if (c == '+' || c == '-' || c == '*') {
                String leftExpression = expression.substring(0, i);
                String rightExpression = expression.substring(i + 1);
                
                List<Integer> leftResults = diffWaysToCompute(leftExpression);
                List<Integer> rightResults = diffWaysToCompute(rightExpression);
                
                for (int leftVal : leftResults) {
                    for (int rightVal : rightResults) {
                        if (c == '+') {
                            result.add(leftVal + rightVal);
                        } else if (c == '-') {
                            result.add(leftVal - rightVal);
                        } else if (c == '*') {
                            result.add(leftVal * rightVal);
                        }
                    }
                }
            }
        }
        
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        ExpressionEvaluation evaluator = new ExpressionEvaluation();
        String expression = "2-1-1";
        List<Integer> result = evaluator.diffWaysToCompute(expression);
        
        for (int val : result) {
            System.out.println(val);
        }
    }
}

public class DifferentWaysToAddParentheses {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        if (expression == null || expression.length() == 0) {
            return result;
        }
        int len = expression.length();
        for (int i = 0; i < len; i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);
                List<Integer> leftResult = diffWaysToCompute(left);
                List<Integer> rightResult = diffWaysToCompute(right);
                for (int num1 : leftResult) {
                    for (int num2 : rightResult) {
                        int val = 0;
                        if (c == '+') {
                            val = num1 + num2;
                        } else if (c == '-') {
                            val = num1 - num2;
                        } else if (c == '*') {
                            val = num1 * num2;
                        }
                        result.add(val);
                    }
                }
            }
        }
        if (result.size() == 0) {
            result.add(Integer.parseInt(expression));
        }
        return result;
    }

    public static void main(String[] args) {
        DifferentWaysToAddParentheses solution = new DifferentWaysToAddParentheses();
        String expression = "2-1-1";
        List<Integer> result = solution.diffWaysToCompute(expression);
        System.out.println(result);
    }
}


class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftPart = input.substring(0, i);
                String rightPart = input.substring(i + 1);
                List<Integer> leftResults = diffWaysToCompute(leftPart);
                List<Integer> rightResults = diffWaysToCompute(rightPart);
                
                for (int left : leftResults) {
                    for (int right : rightResults) {
                        if (c == '+') {
                            result.add(left + right);
                        } else if (c == '-') {
                            result.add(left - right);
                        } else if (c == '*') {
                            result.add(left * right);
                        }
                    }
                }
            }
        }
        
        if (result.isEmpty()) {
            result.add(Integer.parseInt(input));
        }
        
        return result;
    }
}


public class ExpressionEvaluation {
    public List<Integer> diffWaysToEvaluateExpression(String expression) {
        List<Integer> result = new ArrayList<>();
        if (!expression.contains("+") && !expression.contains("-") && !expression.contains("*")) {
            result.add(Integer.parseInt(expression));
            return result;
        }
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (!Character.isDigit(c)) {
                List<Integer> leftParts = diffWaysToEvaluateExpression(expression.substring(0, i));
                List<Integer> rightParts = diffWaysToEvaluateExpression(expression.substring(i + 1));
                for (int part1 : leftParts) {
                    for (int part2 : rightParts) {
                        if (c == '+')
                            result.add(part1 + part2);
                        else if (c == '-')
                            result.add(part1 - part2);
                        else if (c == '*')
                            result.add(part1 * part2);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ExpressionEvaluation evaluateExpression = new ExpressionEvaluation();
        List<Integer> result = evaluateExpression.diffWaysToEvaluateExpression("1+2*3");
        System.out.println("Expression evaluations: " + result);

        evaluateExpression = new ExpressionEvaluation();
        result = evaluateExpression.diffWaysToEvaluateExpression("2*3-4-5");
        System.out.println("Expression evaluations: " + result);
    }
}


public class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);
                List<Integer> leftResult = diffWaysToCompute(left);
                List<Integer> rightResult = diffWaysToCompute(right);
                for (int num1 : leftResult) {
                    for (int num2 : rightResult) {
                        if (c == '+') {
                            result.add(num1 + num2);
                        } else if (c == '-') {
                            result.add(num1 - num2);
                        } else if (c == '*') {
                            result.add(num1 * num2);
                        }
                    }
                }
            }
        }
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }
        return result;
    }
}


class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);
                List<Integer> leftResults = diffWaysToCompute(left);
                List<Integer> rightResults = diffWaysToCompute(right);
                
                for (int leftRes : leftResults) {
                    for (int rightRes : rightResults) {
                        if (c == '+') {
                            result.add(leftRes + rightRes);
                        } else if (c == '-') {
                            result.add(leftRes - rightRes);
                        } else if (c == '*') {
                            result.add(leftRes * rightRes);
                        }
                    }
                }
            }
        }
        
        if (result.isEmpty()) {
            result.add(Integer.valueOf(expression));
        }
        
        return result;
    }
}


public class ExpressionEvaluation {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ways = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String part1 = expression.substring(0, i);
                String part2 = expression.substring(i + 1);
                List<Integer> part1Ways = diffWaysToCompute(part1);
                List<Integer> part2Ways = diffWaysToCompute(part2);
                for (int num1 : part1Ways) {
                    for (int num2 : part2Ways) {
                        int result = 0;
                        if (c == '+') {
                            result = num1 + num2;
                        } else if (c == '-') {
                            result = num1 - num2;
                        } else if (c == '*') {
                            result = num1 * num2;
                        }
                        ways.add(result);
                    }
                }
            }
        }
        if (ways.isEmpty()) {
            ways.add(Integer.parseInt(expression));
        }
        return ways;
    }
}


public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (c == '+' || c == '-' || c == '*') {
                String leftExpr = input.substring(0, i);
                String rightExpr = input.substring(i + 1);
                
                List<Integer> leftResults = diffWaysToCompute(leftExpr);
                List<Integer> rightResults = diffWaysToCompute(rightExpr);
                
                for (int left : leftResults) {
                    for (int right : rightResults) {
                        int computed = 0;
                        
                        if (c == '+') {
                            computed = left + right;
                        } else if (c == '-') {
                            computed = left - right;
                        } else if (c == '*') {
                            computed = left * right;
                        }
                        
                        result.add(computed);
                    }
                }
            }
        }
        
        if (result.size() == 0) {
            result.add(Integer.parseInt(input));
        }
        
        return result;
    }
}


class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                continue;
            }
            
            List<Integer> leftResults = diffWaysToCompute(expression.substring(0, i));
            List<Integer> rightResults = diffWaysToCompute(expression.substring(i + 1));
            
            for (int left : leftResults) {
                for (int right : rightResults) {
                    switch(c) {
                        case '+':
                            result.add(left + right);
                            break;
                        case '-':
                            result.add(left - right);
                            break;
                        case '*':
                            result.add(left * right);
                            break;
                    }
                }
            }
        }
        
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }
        
        return result;
    }
}

public class ExpressionGrouping {
    
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            
            if (c == '+' || c == '-' || c == '*') {
                String leftPart = expression.substring(0, i);
                String rightPart = expression.substring(i + 1);
                
                List<Integer> leftResults = diffWaysToCompute(leftPart);
                List<Integer> rightResults = diffWaysToCompute(rightPart);
                
                for (int left : leftResults) {
                    for (int right : rightResults) {
                        if (c == '+') {
                            result.add(left + right);
                        } else if (c == '-') {
                            result.add(left - right);
                        } else if (c == '*') {
                            result.add(left * right);
                        }
                    }
                }
            }
        }
        
        if (result.size() == 0) {
            result.add(Integer.parseInt(expression));
        }
        
        return result;
    }
    
}

public class ExpressionGrouping {
    
    public static List<Integer> computeAllPossibleResults(String expression) {
        List<Integer> results = new ArrayList<>();
        if (expression == null || expression.length() == 0) {
            return results;
        }
        
        dfs(expression, results, new ArrayList<>(), 0);
        
        return results;
    }
    
    private static void dfs(String expression, List<Integer> results, List<String> path, int index) {
        if (index == expression.length()) {
            results.add(evalExpression(path));
            return;
        }
        
        // Add a single digit number
        path.add(expression.substring(index, index + 1));
        dfs(expression, results, path, index + 1);
        path.remove(path.size() - 1);
        
        // Add multiple digit number
        if (index < expression.length() - 1) {
            path.add(expression.substring(index, index + 2));
            dfs(expression, results, path, index + 2);
            path.remove(path.size() - 1);
        }
        
        // Add operator
        path.add(expression.substring(index, index + 1));
        dfs(expression, results, path, index + 1);
        path.remove(path.size() - 1);
    }
    
    private static int evalExpression(List<String> path) {
        String expression = String.join("", path);
        return evalExpressionHelper(expression, 0)[0];
    }
    
    private static int[] evalExpressionHelper(String expression, int index) {
        int num = 0;
        int[] result = new int[2];
        char sign = '+';
        
        while (index < expression.length()) {
            char c = expression.charAt(index);
            
            if (Character.isDigit(c)) {
                num = (num * 10) + (c - '0');
            }
            
            if (!Character.isDigit(c) || index == expression.length() - 1) {
                if (sign == '+') {
                    result[0] += num;
                    result[1] = num;
                } else if (sign == '-') {
                    result[0] -= num;
                    result[1] = -num;
                } else if (sign == '*') {
                    result[0] = result[0] - result[1] + (result[1] * num);
                    result[1] *= num;
                } else if (sign == '/') {
                    result[0] = result[0] - result[1] + (result[1] / num);
                    result[1] /= num;
                }
                
                sign = c;
                num = 0;
            }
            
            index++;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        String expression = "2-1-1";
        List<Integer> results = computeAllPossibleResults(expression);
        
        for (int result : results) {
            System.out.println(result);
        }
    }
}

public class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            
            if (c == '+' || c == '-' || c == '*') {
                String part1 = expression.substring(0, i);
                String part2 = expression.substring(i+1);
                
                List<Integer> part1Result = diffWaysToCompute(part1);
                List<Integer> part2Result = diffWaysToCompute(part2);
                
                for (int num1 : part1Result) {
                    for (int num2 : part2Result) {
                        if (c == '+') {
                            result.add(num1 + num2);
                        } else if (c == '-') {
                            result.add(num1 - num2);
                        } else if (c == '*') {
                            result.add(num1 * num2);
                        }
                    }
                }
            }
        }
        
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }
        
        return result;
    }
}

class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (c == '+' || c == '-' || c == '*') {
                String leftPart = input.substring(0, i);
                String rightPart = input.substring(i + 1);
                
                List<Integer> leftResults = diffWaysToCompute(leftPart);
                List<Integer> rightResults = diffWaysToCompute(rightPart);
                
                for (int left : leftResults) {
                    for (int right : rightResults) {
                        if (c == '+') {
                            result.add(left + right);
                        } else if (c == '-') {
                            result.add(left - right);
                        } else if (c == '*') {
                            result.add(left * right);
                        }
                    }
                }
            }
        }
        
        if (result.isEmpty()) {
            result.add(Integer.parseInt(input));
        }
        
        return result;
    }
}
