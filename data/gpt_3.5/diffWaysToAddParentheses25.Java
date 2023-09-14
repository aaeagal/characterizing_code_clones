
import java.util.ArrayList;
import java.util.List;

public class Solution {
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
        
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }
        
        return result;
    }
}


import java.util.*;

public class DifferentWaysToAddParentheses {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftPart = input.substring(0, i);
                String rightPart = input.substring(i + 1);
                List<Integer> leftRes = diffWaysToCompute(leftPart);
                List<Integer> rightRes = diffWaysToCompute(rightPart);
                for (int leftNum : leftRes) {
                    for (int rightNum : rightRes) {
                        if (c == '+') {
                            res.add(leftNum + rightNum);
                        } else if (c == '-') {
                            res.add(leftNum - rightNum);
                        } else if (c == '*') {
                            res.add(leftNum * rightNum);
                        }
                    }
                }
            }
        }
        if (res.size() == 0) {
            res.add(Integer.valueOf(input));
        }
        return res;
    }
}


import java.util.*;

public class DifferentWaysToAddParentheses {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        if (expression == null || expression.length() == 0) {
            return result;
        }
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);
                
                List<Integer> leftResult = diffWaysToCompute(left);
                List<Integer> rightResult = diffWaysToCompute(right);
                
                for (int x : leftResult) {
                    for (int y : rightResult) {
                        if (c == '+') {
                            result.add(x + y);
                        } else if (c == '-') {
                            result.add(x - y);
                        } else {
                            result.add(x * y);
                        }
                    }
                }
            }
        }
        
        if (result.size() == 0) {
            result.add(Integer.valueOf(expression));
        }
        
        return result;
    }
}


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftPart = input.substring(0, i);
                String rightPart = input.substring(i + 1);
                List<Integer> leftRes = diffWaysToCompute(leftPart);
                List<Integer> rightRes = diffWaysToCompute(rightPart);
                for (Integer left : leftRes) {
                    for (Integer right : rightRes) {
                        int val = 0;
                        switch (c) {
                            case '+':
                                val = left + right;
                                break;
                            case '-':
                                val = left - right;
                                break;
                            case '*':
                                val = left * right;
                                break;
                            default:
                                break;
                        }
                        res.add(val);
                    }
                }
            }
        }
        if (res.isEmpty()) {
            res.add(Integer.valueOf(input));
        }
        return res;
    }
}


import java.util.*;

public class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftExp = expression.substring(0, i);
                String rightExp = expression.substring(i+1);
                
                List<Integer> left = diffWaysToCompute(leftExp);
                List<Integer> right = diffWaysToCompute(rightExp);
                
                for (int l : left) {
                    for (int r : right) {
                        if (c == '+') {
                            res.add(l + r);
                        } else if (c == '-') {
                            res.add(l - r);
                        } else if (c == '*') {
                            res.add(l * r);
                        }
                    }
                }
            }
        }
        
        if (res.isEmpty()) {
            res.add(Integer.valueOf(expression));
        }
        
        return res;
    }
}



```java
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.diffWaysToCompute("2-1-1")); // [0, 2]
        System.out.println(solution.diffWaysToCompute("2*3-4*5")); // [-34, -10, -14, -10, 10]
    }
}
```



import java.util.ArrayList;
import java.util.List;

public class ExpressionAddOperators {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = input.substring(0, i);
                String right = input.substring(i + 1);

                List<Integer> leftResults = diffWaysToCompute(left);
                List<Integer> rightResults = diffWaysToCompute(right);

                for (int leftResult : leftResults) {
                    for (int rightResult : rightResults) {
                        int value = 0;
                        if (c == '+') {
                            value = leftResult + rightResult;
                        } else if (c == '-') {
                            value = leftResult - rightResult;
                        } else if (c == '*') {
                            value = leftResult * rightResult;
                        }
                        result.add(value);
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


import java.util.ArrayList;
import java.util.List;

public class Solution {
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
        if (result.size() == 0) {
            result.add(Integer.parseInt(input));
        }
        return result;
    }
}


import java.util.*;

class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);
                List<Integer> leftRes = diffWaysToCompute(left);
                List<Integer> rightRes = diffWaysToCompute(right);
                for (int x: leftRes) {
                    for (int y: rightRes) {
                        if (c == '+') {
                            res.add(x + y);
                        } else if (c == '-') {
                            res.add(x - y);
                        } else {
                            res.add(x * y);
                        }
                    }
                }
            }
        }
        if (res.size() == 0) {
            res.add(Integer.valueOf(expression));
        }
        return res;
    }
}


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = input.substring(0, i);
                String right = input.substring(i+1);
                List<Integer> leftResults = diffWaysToCompute(left);
                List<Integer> rightResults = diffWaysToCompute(right);
                for (int leftResult : leftResults) {
                    for (int rightResult : rightResults) {
                        if (c == '+') {
                            result.add(leftResult + rightResult);
                        } else if (c == '-') {
                            result.add(leftResult - rightResult);
                        } else {
                            result.add(leftResult * rightResult);
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


    public static void main(String[] args) {
        String expression = "2-1-1";
        List<Integer> result = diffWaysToCompute(expression);
        System.out.println(result);
    }
    

import java.util.ArrayList;
import java.util.List;

public class ExpressionAddOperators {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        if (expression == null || expression.length() == 0) {
            return result;
        }
        helper(result, expression, 0, expression.length() - 1);
        return result;
    }

    private void helper(List<Integer> result, String expression, int start, int end) {
        boolean isNumber = true;
        for (int i = start; i <= end; i++) {
            char c = expression.charAt(i);
            if (!Character.isDigit(c)) {
                isNumber = false;
                List<Integer> left = new ArrayList<>();
                List<Integer> right = new ArrayList<>();
                helper(left, expression, start, i - 1);
                helper(right, expression, i + 1, end);
                for (int num1 : left) {
                    for (int num2 : right) {
                        int res = 0;
                        if (c == '+') {
                            res = num1 + num2;
                        } else if (c == '-') {
                            res = num1 - num2;
                        } else if (c == '*') {
                            res = num1 * num2;
                        }
                        result.add(res);
                    }
                }
            }
        }
        if (isNumber) {
            result.add(Integer.parseInt(expression.substring(start, end + 1)));
        }
    }
}


import java.util.ArrayList;
import java.util.List;

public class ExpressionAddOperators {

    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        if (expression == null || expression.length() == 0) {
            return result;
        }
        helper(result, expression, 0, 0, 0, "");
        return result;
    }

    private void helper(List<Integer> result, String expression, int index, long prevOperand, long curOperand, String curExpression) {
        if (index == expression.length()) {
            if (curOperand == 0) {
                result.add((int) prevOperand);
            } else {
                result.add((int) curOperand);
            }
            return;
        }

        char currentChar = expression.charAt(index);
        curOperand = curOperand * 10 + (currentChar - '0');

        if (curOperand > 0) {
            helper(result, expression, index + 1, prevOperand, curOperand, curExpression);
        }

        if (curExpression.length() > 0) {
            helper(result, expression, index + 1, evalExpression(prevOperand, curOperand, curExpression.charAt(curExpression.length() - 1)), 0, curExpression);
        }

        if (curExpression.length() == 0 || curExpression.charAt(curExpression.length() - 1) != '0') {
            helper(result, expression, index + 1, prevOperand, 0, curExpression + currentChar);
        }
    }

    private long evalExpression(long prevOperand, long curOperand, char operator) {
        if (operator == '+') {
            return prevOperand + curOperand;
        } else if (operator == '-') {
            return prevOperand - curOperand;
        } else if (operator == '*') {
            return prevOperand * curOperand;
        }
        return 0;
    }
}



import java.util.*;

class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<>();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = input.substring(0, i);
                String right = input.substring(i+1);
                List<Integer> leftRes = diffWaysToCompute(left);
                List<Integer> rightRes = diffWaysToCompute(right);
                
                for (int l : leftRes) {
                    for (int r : rightRes) {
                        if (c == '+') {
                            res.add(l + r);
                        } else if (c == '-') {
                            res.add(l - r);
                        } else if (c == '*') {
                            res.add(l * r);
                        }
                    }
                }
            }
        }
        
        if (res.isEmpty()) {
            res.add(Integer.parseInt(input));
        }
        
        return res;
    }
}


import java.util.*;

class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<expression.length(); i++){
            char c = expression.charAt(i);
            if(c == '+' || c == '-' || c == '*'){
                String leftStr = expression.substring(0, i);
                String rightStr = expression.substring(i+1);
                List<Integer> leftVal = diffWaysToCompute(leftStr);
                List<Integer> rightVal = diffWaysToCompute(rightStr);
                
                for(int left : leftVal){
                    for(int right : rightVal){
                        if(c == '+'){
                            result.add(left + right);
                        }else if(c == '-'){
                            result.add(left - right);
                        }else if(c == '*'){
                            result.add(left * right);
                        }
                    }
                }
            }
        }
        
        if(result.size() == 0){
            result.add(Integer.valueOf(expression));
        }
        
        return result;
    }
}



import java.util.*;

class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        if (expression == null || expression.length() == 0) {
            return result;
        }
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String part1 = expression.substring(0, i);
                String part2 = expression.substring(i + 1);
                List<Integer> part1Result = diffWaysToCompute(part1);
                List<Integer> part2Result = diffWaysToCompute(part2);
                for (int p1 : part1Result) {
                    for (int p2 : part2Result) {
                        int newVal = 0;
                        switch (c) {
                            case '+':
                                newVal = p1 + p2;
                                break;
                            case '-':
                                newVal = p1 - p2;
                                break;
                            case '*':
                                newVal = p1 * p2;
                                break;
                        }
                        result.add(newVal);
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


import java.util.*;

class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = input.substring(0, i);
                String right = input.substring(i + 1);
                List<Integer> leftRes = diffWaysToCompute(left);
                List<Integer> rightRes = diffWaysToCompute(right);
                for (int leftNum : leftRes) {
                    for (int rightNum : rightRes) {
                        if (c == '+') {
                            res.add(leftNum + rightNum);
                        } else if (c == '-') {
                            res.add(leftNum - rightNum);
                        } else if (c == '*') {
                            res.add(leftNum * rightNum);
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
}


import java.util.ArrayList;
import java.util.List;

public class ExpressionEvaluation {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (c == '+' || c == '-' || c == '*') {
                String leftExpression = input.substring(0, i);
                String rightExpression = input.substring(i + 1);
                
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
        
        if (result.isEmpty()) {
            result.add(Integer.parseInt(input));
        }
        
        return result;
    }
}



import java.util.*;

class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            
            if (c == '+' || c == '-' || c == '*') {
                String leftExpr = expression.substring(0, i);
                String rightExpr = expression.substring(i + 1);
                
                List<Integer> leftResult = diffWaysToCompute(leftExpr);
                List<Integer> rightResult = diffWaysToCompute(rightExpr);
                
                for (int leftVal : leftResult) {
                    for (int rightVal : rightResult) {
                        int val = 0;
                        
                        if (c == '+') {
                            val = leftVal + rightVal;
                        } else if (c == '-') {
                            val = leftVal - rightVal;
                        } else if (c == '*') {
                            val = leftVal * rightVal;
                        }
                        
                        result.add(val);
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



import java.util.*;

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
                for (int leftResult : leftResults) {
                    for(int rightResult : rightResults) {
                        if (c == '+') {
                            result.add(leftResult + rightResult);
                        } else if (c == '-') {
                            result.add(leftResult - rightResult);
                        } else if (c == '*') {
                            result.add(leftResult * rightResult);
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


