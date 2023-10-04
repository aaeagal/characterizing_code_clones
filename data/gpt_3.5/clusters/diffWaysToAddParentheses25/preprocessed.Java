
import java.util.ArrayList;
import java.util.List;

public class Interleave{
    public List<Integer> diffWaysToCompute1(String expression) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftExpression = expression.substring(0, i);
                String rightExpression = expression.substring(i + 1);
                List<Integer> leftResults = diffWaysToCompute1(leftExpression);
                List<Integer> rightResults = diffWaysToCompute1(rightExpression);
                
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

    public List<Integer> diffWaysToCompute2(String input) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftPart = input.substring(0, i);
                String rightPart = input.substring(i + 1);
                List<Integer> leftRes = diffWaysToCompute2(leftPart);
                List<Integer> rightRes = diffWaysToCompute2(rightPart);
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

    public List<Integer> diffWaysToCompute3(String expression) {
        List<Integer> result = new ArrayList<>();
        if (expression == null || expression.length() == 0) {
            return result;
        }
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);
                
                List<Integer> leftResult = diffWaysToCompute3(left);
                List<Integer> rightResult = diffWaysToCompute3(right);
                
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

    public List<Integer> diffWaysToCompute4(String input) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftPart = input.substring(0, i);
                String rightPart = input.substring(i + 1);
                List<Integer> leftRes = diffWaysToCompute4(leftPart);
                List<Integer> rightRes = diffWaysToCompute4(rightPart);
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

    public List<Integer> diffWaysToCompute5(String expression) {
        List<Integer> res = new ArrayList<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftExp = expression.substring(0, i);
                String rightExp = expression.substring(i+1);
                
                List<Integer> left = diffWaysToCompute5(leftExp);
                List<Integer> right = diffWaysToCompute5(rightExp);
                
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

    public List<Integer> diffWaysToCompute6(String input) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = input.substring(0, i);
                String right = input.substring(i + 1);

                List<Integer> leftResults = diffWaysToCompute6(left);
                List<Integer> rightResults = diffWaysToCompute6(right);

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

    public List<Integer> diffWaysToCompute7(String input) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftPart = input.substring(0, i);
                String rightPart = input.substring(i + 1);
                List<Integer> leftResults = diffWaysToCompute7(leftPart);
                List<Integer> rightResults = diffWaysToCompute7(rightPart);
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

    public List<Integer> diffWaysToCompute8(String expression) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);
                List<Integer> leftRes = diffWaysToCompute8(left);
                List<Integer> rightRes = diffWaysToCompute8(right);
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

    public List<Integer> diffWaysToCompute9(String input) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = input.substring(0, i);
                String right = input.substring(i+1);
                List<Integer> leftResults = diffWaysToCompute9(left);
                List<Integer> rightResults = diffWaysToCompute9(right);
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

    public List<Integer> diffWaysToCompute10(String expression) {
        List<Integer> result = new ArrayList<>();
        if (expression == null || expression.length() == 0) {
            return result;
        }
        helper10(result, expression, 0, expression.length() - 1);
        return result;
    }

    private void helper10(List<Integer> result, String expression, int start, int end) {
        boolean isNumber = true;
        for (int i = start; i <= end; i++) {
            char c = expression.charAt(i);
            if (!Character.isDigit(c)) {
                isNumber = false;
                List<Integer> left = new ArrayList<>();
                List<Integer> right = new ArrayList<>();
                helper10(left, expression, start, i - 1);
                helper10(right, expression, i + 1, end);
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

    public List<Integer> diffWaysToCompute11(String expression) {
        List<Integer> result = new ArrayList<>();
        if (expression == null || expression.length() == 0) {
            return result;
        }
        helper11(result, expression, 0, 0, 0, "");
        return result;
    }

    private void helper11(List<Integer> result, String expression, int index, long prevOperand, long curOperand, String curExpression) {
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
            helper11(result, expression, index + 1, prevOperand, curOperand, curExpression);
        }

        if (curExpression.length() > 0) {
            helper11(result, expression, index + 1, evalExpression11(prevOperand, curOperand, curExpression.charAt(curExpression.length() - 1)), 0, curExpression);
        }

        if (curExpression.length() == 0 || curExpression.charAt(curExpression.length() - 1) != '0') {
            helper11(result, expression, index + 1, prevOperand, 0, curExpression + currentChar);
        }
    }

    private long evalExpression11(long prevOperand, long curOperand, char operator) {
        if (operator == '+') {
            return prevOperand + curOperand;
        } else if (operator == '-') {
            return prevOperand - curOperand;
        } else if (operator == '*') {
            return prevOperand * curOperand;
        }
        return 0;
    }

    public List<Integer> diffWaysToCompute12(String input) {
        List<Integer> res = new ArrayList<>();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = input.substring(0, i);
                String right = input.substring(i+1);
                List<Integer> leftRes = diffWaysToCompute12(left);
                List<Integer> rightRes = diffWaysToCompute12(right);
                
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

    public List<Integer> diffWaysToCompute13(String expression) {
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<expression.length(); i++){
            char c = expression.charAt(i);
            if(c == '+' || c == '-' || c == '*'){
                String leftStr = expression.substring(0, i);
                String rightStr = expression.substring(i+1);
                List<Integer> leftVal = diffWaysToCompute13(leftStr);
                List<Integer> rightVal = diffWaysToCompute13(rightStr);
                
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

    public List<Integer> diffWaysToCompute14(String expression) {
        List<Integer> result = new ArrayList<>();
        if (expression == null || expression.length() == 0) {
            return result;
        }
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String part1 = expression.substring(0, i);
                String part2 = expression.substring(i + 1);
                List<Integer> part1Result = diffWaysToCompute14(part1);
                List<Integer> part2Result = diffWaysToCompute14(part2);
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

    public List<Integer> diffWaysToCompute15(String input) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = input.substring(0, i);
                String right = input.substring(i + 1);
                List<Integer> leftRes = diffWaysToCompute15(left);
                List<Integer> rightRes = diffWaysToCompute15(right);
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

    public List<Integer> diffWaysToCompute16(String input) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (c == '+' || c == '-' || c == '*') {
                String leftExpression = input.substring(0, i);
                String rightExpression = input.substring(i + 1);
                
                List<Integer> leftResults = diffWaysToCompute16(leftExpression);
                List<Integer> rightResults = diffWaysToCompute16(rightExpression);
                
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

    public List<Integer> diffWaysToCompute17(String expression) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            
            if (c == '+' || c == '-' || c == '*') {
                String leftExpr = expression.substring(0, i);
                String rightExpr = expression.substring(i + 1);
                
                List<Integer> leftResult = diffWaysToCompute17(leftExpr);
                List<Integer> rightResult = diffWaysToCompute17(rightExpr);
                
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

    public List<Integer> diffWaysToCompute18(String expression) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftExpression = expression.substring(0, i);
                String rightExpression = expression.substring(i + 1);
                List<Integer> leftResults = diffWaysToCompute18(leftExpression);
                List<Integer> rightResults = diffWaysToCompute18(rightExpression);
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


