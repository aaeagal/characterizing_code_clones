
import java.util.*;

class Solution {
    private static final String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) {
            return combinations;
        }
        backtrack(combinations, digits, 0, new StringBuilder());
        return combinations;
    }
    
    private void backtrack(List<String> combinations, String digits, int index, StringBuilder currentCombination) {
        if (index == digits.length()) {
            combinations.add(currentCombination.toString());
        } else {
            int digit = Character.getNumericValue(digits.charAt(index));
            String lettersForDigit = letters[digit];
            int lettersCount = lettersForDigit.length();
            for (int i = 0; i < lettersCount; i++) {
                currentCombination.append(lettersForDigit.charAt(i));
                backtrack(combinations, digits, index + 1, currentCombination);
                currentCombination.deleteCharAt(index);
            }
        }
    }
}


import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        String[] mapping = {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        combinations.add("");
        for (int i = 0; i < digits.length(); i++) {
            int digit = Character.getNumericValue(digits.charAt(i));
            while (combinations.get(0).length() == i) {
                String current = combinations.remove(0);
                for (char c : mapping[digit].toCharArray()) {
                    combinations.add(current + c);
                }
            }
        }
        return combinations;
    }
}



import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        Map<Character, String> map = new HashMap<Character, String>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        backtrack(result, map, digits, "", 0);
        
        return result;
    }
    
    public void backtrack(List<String> result, Map<Character, String> map, String digits, String current, int index) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        
        char digit = digits.charAt(index);
        String letters = map.get(digit);
        
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            backtrack(result, map, digits, current + letter, index + 1);
        }
    }
}




import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return result;
        
        String[] mappings = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        backtrack(result, mappings, digits, 0, new StringBuilder());
        
        return result;
    }
    
    private void backtrack(List<String> result, String[] mappings, String digits, int index, StringBuilder combination) {
        if (index == digits.length()) {
            result.add(combination.toString());
            return;
        }
        
        int digit = Character.getNumericValue(digits.charAt(index));
        String letters = mappings[digit];
        
        for (int i = 0; i < letters.length(); i++) {
            combination.append(letters.charAt(i));
            backtrack(result, mappings, digits, index+1, combination);
            combination.deleteCharAt(combination.length()-1);
        }
    }
}


import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        String[] mappings = new String[] {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        
        generateCombination(result, digits, mappings, "", 0);
        
        return result;
    }
    
    private void generateCombination(List<String> result, String digits, String[] mappings, String current, int index) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        
        String letters = mappings[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            generateCombination(result, digits, mappings, current + letters.charAt(i), index + 1);
        }
    }
}



import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        
        String[] mapping = new String[] {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };
        
        generateCombinations(combinations, digits, "", 0, mapping);
        
        return combinations;
    }
    
    private void generateCombinations(List<String> combinations, String digits, String current, int index, String[] mapping) {
        if (index == digits.length()) {
            combinations.add(current);
            return;
        }
        
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            generateCombinations(combinations, digits, current + letters.charAt(i), index + 1, mapping);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> combinations = solution.letterCombinations("23");
        System.out.println(combinations);
    }
}


import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    
    private static final String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if(digits == null || digits.length() == 0) {
            return combinations;
        }
        backtrack(combinations, digits, new StringBuilder(), 0);
        return combinations;
    }
    
    private static void backtrack(List<String> combinations, String digits, StringBuilder current, int index) {
        if(index == digits.length()) {
            combinations.add(current.toString());
            return;
        }
        int digit = Character.getNumericValue(digits.charAt(index));
        String letters = mapping[digit];
        for(int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            backtrack(combinations, digits, current, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> combinations = letterCombinations(digits);
        System.out.println(combinations);
    }
}


import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        String[] mapping = new String[] {
            "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        
        letterCombinationsHelper(digits, "", 0, mapping, result);
        
        return result;
    }
    
    private void letterCombinationsHelper(String digits, String current, int index, String[] mapping, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            letterCombinationsHelper(digits, current + letters.charAt(i), index + 1, mapping, result);
        }
    }
}


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        String[] mapping = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        letterCombinations(digits, result, "", 0, mapping);
        return result;
    }
    
    private void letterCombinations(String digits, List<String> result, String current, int index, String[] mapping) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            letterCombinations(digits, result, current + letters.charAt(i), index + 1, mapping);
        }
    }
}


import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return combinations;
        
        String[] letterMap = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        backtrack(combinations, letterMap, digits, 0, new StringBuilder());
        return combinations;
    }
    
    private void backtrack(List<String> combinations, String[] letterMap, String digits, int index, StringBuilder sb) {
        if (index == digits.length()) {
            combinations.add(sb.toString());
            return;
        }
        
        int digit = digits.charAt(index) - '0';
        String letters = letterMap[digit];
        
        for (int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            backtrack(combinations, letterMap, digits, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> combinations = solution.letterCombinations("23");
        System.out.println(combinations);
    }
}


import java.util.*;

class Solution {
    private static final Map<Character, String> digitLetters = new HashMap<>();
    static {
        digitLetters.put('2', "abc");
        digitLetters.put('3', "def");
        digitLetters.put('4', "ghi");
        digitLetters.put('5', "jkl");
        digitLetters.put('6', "mno");
        digitLetters.put('7', "pqrs");
        digitLetters.put('8', "tuv");
        digitLetters.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = digitLetters.get(digit);
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(digits, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}


import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        String[] mapping = {
            "",     //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
        };
        
        backtrack(result, "", mapping, digits, 0);
        return result;
    }
    
    private void backtrack(List<String> result, String current, String[] mapping, String digits, int index) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            backtrack(result, current + letters.charAt(i), mapping, digits, index + 1);
        }
    }
}


import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        String[] mapping = new String[] {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        letterCombinationsHelper(result, digits, "", 0, mapping);
        return result;
    }
    
    public void letterCombinationsHelper(List<String> result, String digits, String current, int index, String[] mapping) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            letterCombinationsHelper(result, digits, current + letters.charAt(i), index + 1, mapping);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23"));
    }
}


import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        String[] mapping = new String[] {
            "",    // 0
            "",    // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs",// 7
            "tuv", // 8
            "wxyz" // 9
        };
        
        letterCombinationsHelper(digits, mapping, result, new StringBuilder(), 0);
        return result;
    }
    
    private void letterCombinationsHelper(String digits, String[] mapping, List<String> result, StringBuilder combination, int index) {
        if (index == digits.length()) {
            result.add(combination.toString());
            return;
        }
        
        char digit = digits.charAt(index);
        String letters = mapping[digit - '0'];
        for (char letter : letters.toCharArray()) {
            combination.append(letter);
            letterCombinationsHelper(digits, mapping, result, combination, index + 1);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}



public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> combinations = solution.letterCombinations("23");
        
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}


import java.util.*;

class Solution {
    private static final Map<Character, String> letterMap = new HashMap<>();
    
    static {
        letterMap.put('2', "abc");
        letterMap.put('3', "def");
        letterMap.put('4', "ghi");
        letterMap.put('5', "jkl");
        letterMap.put('6', "mno");
        letterMap.put('7', "pqrs");
        letterMap.put('8', "tuv");
        letterMap.put('9', "wxyz");
    }
    
    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        backtrack(digits, 0, new StringBuilder(), combinations);
        return combinations;
    }
    
    private static void backtrack(String digits, int index, StringBuilder currentCombination, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(currentCombination.toString());
            return;
        }
        
        char digit = digits.charAt(index);
        String letters = letterMap.get(digit);
        
        for (char letter : letters.toCharArray()) {
            currentCombination.append(letter);
            backtrack(digits, index + 1, currentCombination, combinations);
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
    }
}



import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(result, digits, "", 0, mapping);
        return result;
    }

    private void backtrack(List<String> result, String digits, String currentString, int index, String[] mapping) {

        if (index == digits.length()) {
            result.add(currentString);
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            backtrack(result, digits, currentString + letters.charAt(i), index + 1, mapping);
        }
    }
}



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private Map<Character, String> digitMapping = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        digitMapping.put('2', "abc");
        digitMapping.put('3', "def");
        digitMapping.put('4', "ghi");
        digitMapping.put('5', "jkl");
        digitMapping.put('6', "mno");
        digitMapping.put('7', "pqrs");
        digitMapping.put('8', "tuv");
        digitMapping.put('9', "wxyz");

        generateCombinations(digits, 0, new StringBuilder(), result);

        return result;
    }

    private void generateCombinations(String digits, int index, StringBuilder sb, List<String> result) {
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        String letters = digitMapping.get(digits.charAt(index));
        for (int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            generateCombinations(digits, index + 1, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> combinations = solution.letterCombinations("23");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}


import java.util.*;

class Solution {
    private static Map<Character, String> phone = new HashMap<>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    
    private static List<String> output = new ArrayList<>();
    
    public static List<String> letterCombinations(String digits) {
        if (digits.length() != 0)
            backtrack("", digits);
        return output;
    }
    
    private static void backtrack(String combination, String next_digits) {
        if (next_digits.length() == 0) {
            output.add(combination);
        } else {
            char digit = next_digits.charAt(0);
            String letters = phone.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = phone.get(digit).substring(i, i + 1);
                backtrack(combination + letter, next_digits.substring(1));
            }
        }
    }
    
    public static void main(String[] args) {
        String digits = "23";
        List<String> letterCombinations = letterCombinations(digits);
        
        for (String combination : letterCombinations) {
            System.out.println(combination);
        }
    }
}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        backtrack(combinations, map, digits, 0, new StringBuilder());
        return combinations;
    }
    
    private void backtrack(List<String> combinations, Map<Character, String> map, String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }
        
        String letters = map.get(digits.charAt(index));
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            backtrack(combinations, map, digits, index+1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}

