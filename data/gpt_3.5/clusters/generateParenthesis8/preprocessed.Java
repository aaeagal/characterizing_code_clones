
    public List<String> generateParenthesis1(int n) {
        List<String> result = new ArrayList<>();
        backtrack1(result, "", 0, 0, n);
        return result;
    }
    
    private void backtrack1(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        if (open < max) {
            backtrack1(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack1(result, current + ")", open, close + 1, max);
        }
    }



    
    public static List<String> generateParenthesis2(int n) {
        List<String> result = new ArrayList<>();
        backtrack2(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack2(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max)
            backtrack2(result, current + "(", open + 1, close, max);
        if (close < open)
            backtrack2(result, current + ")", open, close + 1, max);
    }
    




    
    public static List<String> generateParenthesis3(int n) {
        List<String> result = new ArrayList<>();
        backtrack3(result, "", 0, 0, n);
        return result;
    }
    
    public static void backtrack3(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack3(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack3(result, current + ")", open, close + 1, max);
        }
    }
    

    public static List<String> generateParentheses4(int n) {
        List<String> result = new ArrayList<>();
        backtrack4(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack4(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack4(result, current + "(", open + 1, close, max);
        }
        
        if (close < open) {
            backtrack4(result, current + ")", open, close + 1, max);
        }
    }

    
    public static List<String> generateParentheses5(int n) {
        List<String> result = new ArrayList<>();
        backtrack5(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack5(List<String> result, String curr, int open, int close, int max) {
        if(curr.length() == max * 2) {
            result.add(curr);
            return;
        }
        
        if(open < max)
            backtrack5(result, curr + "(", open + 1, close, max);
        if(close < open)
            backtrack5(result, curr + ")", open, close + 1, max);
    }
    


    public static List<String> generateParenthesis6(int n) {
        List<String> result = new ArrayList<>();
        backtrack6(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack6(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack6(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack6(result, current + ")", open, close + 1, max);
        }
    }


    public List<String> generateParenthesis7(int n) {
        List<String> result = new ArrayList<>();
        backtrack7(result, "", 0, 0, n);
        return result;
    }
    
    private void backtrack7(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack7(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack7(result, current + ")", open, close + 1, max);
        }
    }

    public static List<String> generateParenthesis8(int n) {
        List<String> res = new ArrayList<>();
        backtrack8(res, "", 0, 0, n);
        return res;
    }

    private static void backtrack8(List<String> res, String curr, int open, int close, int max) {
        if (curr.length() == max * 2) {
            res.add(curr);
            return;
        }

        if (open < max)
            backtrack8(res, curr + "(", open + 1, close, max);
        if (close < open)
            backtrack8(res, curr + ")", open, close + 1, max);
    }

    public static List<String> generateParentheses9(int n) {
        List<String> result = new ArrayList<>();
        backtrack9(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack9(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack9(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack9(result, current + ")", open, close + 1, max);
        }
    }





    public static List<String> generateParenthesis10(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack10(List<String> result, String s, int open, int close, int n) {
        if (s.length() == n * 2) {
            result.add(s);
            return;
        }
        
        if (open < n) {
            backtrack10(result, s + "(", open + 1, close, n);
        }
        if (close < open) {
            backtrack10(result, s + ")", open, close + 1, n);
        }
    }
 
    public static List<String> generateParenthesis11(int n) {
        List<String> result = new ArrayList<>();
        backtrack11(result, "", 0, 0, n);
        return result;
    }

    public static void backtrack11(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack11(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack11(result, current + ")", open, close + 1, max);
        }
    }


    public List<String> generateParenthesis12(int n) {
        List<String> result = new ArrayList<>();
        backtrack12(result, "", 0, 0, n);
        return result;
    }

    private void backtrack12(List<String> result, String current, int open, int close, int n) {
        if (current.length() == n * 2) {
            result.add(current);
            return;
        }

        if (open < n) {
            backtrack12(result, current + "(", open + 1, close, n);
        }
        if (close < open) {
            backtrack12(result, current + ")", open, close + 1, n);
        }
    }

    
    public List<String> generateParenthesis13(int n) {
        List<String> result = new ArrayList<>();
        backtrack13(result, "", 0, 0, n);
        return result;
    }
    
    private void backtrack13(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack13(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack13(result, current + ")", open, close + 1, max);
        }
    }
    
   
    public List<String> generateParenthesis14(int n) {
        List<String> result = new ArrayList<>();
        backtrack14(result, "", 0, 0, n);
        return result;
    }

    private void backtrack14(List<String> result, String current, int open, int close, int n) {
        if (current.length() == n * 2) {
            result.add(current);
            return;
        }

        if (open < n) {
            backtrack14(result, current + "(", open + 1, close, n);
        }
        if (close < open) {
            backtrack14(result, current + ")", open, close + 1, n);
        }
    }

   
    
    public static List<String> generateParentheses15(int n) {
        List<String> result = new ArrayList<>();
        backtrack15(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack15(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack15(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack15(result, current + ")", open, close + 1, max);
        }
    }
    
    public List<String> generateParenthesis16(int n) {
        List<String> result = new ArrayList<>();
        backtrack16(result, "", 0, 0, n);
        return result;
    }

    private void backtrack16(List<String> result, String currentString, int open, int close, int max) {
        if (currentString.length() == max * 2) {
            result.add(currentString);
            return;
        }

        if (open < max) {
            backtrack16(result, currentString + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack16(result, currentString + ")", open, close + 1, max);
        }
    }

 
    public static List<String> generateParentheses17(int n) {
        List<String> result = new ArrayList<>();
        backtrack17(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack17(List<String> result, String curr, int open, int close, int max) {
        if (curr.length() == max * 2) {
            result.add(curr);
            return;
        }

        if (open < max) {
            backtrack17(result, curr + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack17(result, curr + ")", open, close + 1, max);
        }
    }
    

    
    public List<String> generateParenthesis18(int n) {
        List<String> result = new ArrayList<>();
        backtrack18(result, "", 0, 0, n);
        return result;
    }
    
    private void backtrack18(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack18(result, current + "(", open + 1, close, max);
        }
        
        if (close < open) {
            backtrack18(result, current + ")", open, close + 1, max);
        }
    }
    

    public static List<String> generateParenthesis19(int n) {
        List<String> result = new ArrayList<>();
        backtrack19(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack19(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        if (open < max) {
            backtrack19(result, current + "(", open + 1, close, max);
        }
        
        if (close < open) {
            backtrack19(result, current + ")", open, close + 1, max);
        }
    }


