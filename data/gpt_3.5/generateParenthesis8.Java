
import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}



import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max)
            backtrack(result, current + "(", open + 1, close, max);
        if (close < open)
            backtrack(result, current + ")", open, close + 1, max);
    }
    
    public static void main(String[] args) {
        int n = 3;
        List<String> combinations = generateParenthesis(n);
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}




import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    public static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
    
    public static void main(String[] args) {
        List<String> combinations = generateParenthesis(3);
        
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}



import java.util.ArrayList;
import java.util.List;

public class WellFormedParentheses {
    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParentheses(n);
        System.out.println(result);
    }
}



import java.util.ArrayList;
import java.util.List;

public class WellFormedParentheses {
    
    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack(List<String> result, String curr, int open, int close, int max) {
        if(curr.length() == max * 2) {
            result.add(curr);
            return;
        }
        
        if(open < max)
            backtrack(result, curr + "(", open + 1, close, max);
        if(close < open)
            backtrack(result, curr + ")", open, close + 1, max);
    }
    
    public static void main(String[] args) {
        int n = 3;
        List<String> combinations = generateParentheses(n);
        System.out.println("Combinations of well-formed parentheses for n = " + n + ":");
        for(String combination : combinations) {
            System.out.println(combination);
        }
    }
}



import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
    
    public static void main(String[] args) {
        int n = 3;
        List<String> combinations = generateParenthesis(n);
        
        System.out.println("Combinations of well-formed parentheses for n = " + n + ":");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}


import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}


import java.util.ArrayList;
import java.util.List;

public class WellFormedParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    private static void backtrack(List<String> res, String curr, int open, int close, int max) {
        if (curr.length() == max * 2) {
            res.add(curr);
            return;
        }

        if (open < max)
            backtrack(res, curr + "(", open + 1, close, max);
        if (close < open)
            backtrack(res, curr + ")", open, close + 1, max);
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }
}


import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> combinations = generateParentheses(n);
        System.out.println("Combinations of well-formed parentheses for n=" + n + ":");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}


import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack(List<String> result, String s, int open, int close, int n) {
        if (s.length() == n * 2) {
            result.add(s);
            return;
        }
        
        if (open < n) {
            backtrack(result, s + "(", open + 1, close, n);
        }
        if (close < open) {
            backtrack(result, s + ")", open, close + 1, n);
        }
    }
    
    public static void main(String[] args) {
        int n = 3;
        List<String> combinations = generateParenthesis(n);
        System.out.println(combinations);
    }
}


import java.util.ArrayList;
import java.util.List;

public class Parentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    public static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }
}


import java.util.*;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int n) {
        if (current.length() == n * 2) {
            result.add(current);
            return;
        }

        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses parentheses = new GenerateParentheses();
        List<String> combinations = parentheses.generateParenthesis(3);
        System.out.println(combinations);
    }
}


import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
    
    public static void main(String[] args) {
        GenerateParentheses gp = new GenerateParentheses();
        List<String> combinations = gp.generateParenthesis(3);
        System.out.println(combinations);
    }
}


import java.util.*;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int n) {
        if (current.length() == n * 2) {
            result.add(current);
            return;
        }

        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses gp = new GenerateParentheses();
        int n = 3;
        List<String> combinations = gp.generateParenthesis(n);
        System.out.println("All combinations of well-formed parentheses for n = " + n + ": ");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}



import java.util.*;

public class GenerateParentheses {
    
    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
    
    public static void main(String[] args) {
        int n = 3;
        List<String> combinations = generateParentheses(n);
        System.out.println(combinations);
    }
}


    public static void main(String[] args) {
        int n = 3;
        List<String> parentheses = generateParentheses(n);
        System.out.println("Generated well-formed parentheses for " + n + " pairs:");
        for (String s : parentheses) {
            System.out.println(s);
        }
    }
    

import java.util.ArrayList;
import java.util.List;

public class WellFormedParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String currentString, int open, int close, int max) {
        if (currentString.length() == max * 2) {
            result.add(currentString);
            return;
        }

        if (open < max) {
            backtrack(result, currentString + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, currentString + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        WellFormedParentheses wellFormedParentheses = new WellFormedParentheses();
        List<String> result = wellFormedParentheses.generateParenthesis(3);
        for (String parenthesis : result) {
            System.out.println(parenthesis);
        }
    }
}

 
import java.util.ArrayList;
import java.util.List;

public class WellFormedParentheses {
    
    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack(List<String> result, String curr, int open, int close, int max) {
        if (curr.length() == max * 2) {
            result.add(curr);
            return;
        }

        if (open < max) {
            backtrack(result, curr + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack(result, curr + ")", open, close + 1, max);
        }
    }
    
    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParentheses(n);
        System.out.println(result);
    }
}




import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
    
    public static void main(String[] args) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        int n = 3;
        List<String> combinations = generateParentheses.generateParenthesis(n);
        System.out.println("Combinations of well-formed parentheses for n = " + n + ":");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}



import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> combinations = generateParenthesis(n);
        System.out.println("Combinations of well-formed parentheses for n = " + n + ":");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}

