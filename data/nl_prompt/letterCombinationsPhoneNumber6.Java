```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber {
    private static final Map<Character, String> digitToLettersMap = new HashMap<>();

    static {
        digitToLettersMap.put('2', "abc");
        digitToLettersMap.put('3', "def");
        digitToLettersMap.put('4', "ghi");
        digitToLettersMap.put('5', "jkl");
        digitToLettersMap.put('6', "mno");
        digitToLettersMap.put('7', "pqrs");
        digitToLettersMap.put('8', "tuv");
        digitToLettersMap.put('9', "wxyz");
    }

    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }

        backtrack(combinations, new StringBuilder(), digits, 0);
        return combinations;
    }

    private static void backtrack(List<String> combinations, StringBuilder path, String digits, int index) {
        if (index == digits.length()) {
            combinations.add(path.toString());
            return;
        }

        String letters = digitToLettersMap.get(digits.charAt(index));
        for (char letter : letters.toCharArray()) {
            path.append(letter);
            backtrack(combinations, path, digits, index + 1);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
```
```java
import java.util.*;

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        if (digits == null || digits.length() == 0)
            return result;
        
        String[] mapping = new String[] {
            "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" 
        };
        
        combinationsHelper(result, digits, "", 0, mapping);
        
        return result;
    }
    
    public void combinationsHelper(List<String> result, String digits, String current, int index, String[] mapping) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            combinationsHelper(result, digits, current + letters.charAt(i), index + 1, mapping);
        }
    }
}
```

Note: This solution uses recursion to generate all possible combinations of letters that the given digits could represent. The time complexity of this solution is O(4^n) where n is the number of digits in the input string.
```
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    private static final Map<Character, String> digitToLetters = new HashMap<>();

    static {
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
    }

    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if(digits == null || digits.length() == 0) {
            return combinations;
        }
        generateCombinations(digits, "", combinations, 0);
        return combinations;
    }

    private static void generateCombinations(String digits, String current, List<String> combinations, int index) {
        if(index == digits.length()) {
            combinations.add(current);
            return;
        }
        String letters = digitToLetters.get(digits.charAt(index));
        for(char letter : letters.toCharArray()) {
            generateCombinations(digits, current + letter, combinations, index + 1);
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> combinations = letterCombinations(digits);
        System.out.println(combinations);
    }
}
```
```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        Map<Character, String> phoneMap = new HashMap<>();
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");

        backtrack(result, phoneMap, digits, 0, new StringBuilder());

        return result;
    }

    private void backtrack(List<String> result, Map<Character, String> phoneMap, String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = phoneMap.get(digit);
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            backtrack(result, phoneMap, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
```
```
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private Map<Character, String> phoneMap = new HashMap<>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        backtrack(combinations, new StringBuilder(), digits, 0);
        return combinations;
    }
    
    private void backtrack(List<String> combinations, StringBuilder combination, String digits, int index) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = phoneMap.get(digit);
        for (char letter : letters.toCharArray()) {
            combination.append(letter);
            backtrack(combinations, combination, digits, index + 1);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}
```
import java.util.ArrayList;
import java.util.List;

class Solution {
    
    private static final String[] LETTERS = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    private static final List<String> combinations = new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return combinations;
        }
        
        combinations.clear();
        backtrack(digits, 0, new StringBuilder());
        
        return combinations;
    }
    
    private void backtrack(String digits, int index, StringBuilder path) {
        if (index == digits.length()) {
            combinations.add(path.toString());
            return;
        }
        
        String letters = LETTERS[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            path.append(c);
            backtrack(digits, index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
```java
import java.util.*;

class Solution {
    private static final String[] mapping = new String[]{
        "abc", "def", "ghi", "jkl", 
        "mno", "pqrs", "tuv", "wxyz"
    };
    
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        backtrack("", digits, 0, result);
        return result;
    }
    
    private static void backtrack(String current, String digits, int index, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        
        String letters = mapping[digits.charAt(index) - '2'];
        for (char c : letters.toCharArray()) {
            backtrack(current + c, digits, index + 1, result);
        }
    }
}
```
The requested Java function can be implemented as:

```java
import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    private static final String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();

        if (digits.length() != 0) {
            backtrack(combinations, digits, "", 0);
        }

        return combinations;
    }

    private static void backtrack(List<String> combinations, String digits, String combination, int index) {
        if (index == digits.length()) {
            combinations.add(combination);
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            backtrack(combinations, digits, combination + letter, index + 1);
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> result = letterCombinations(digits);
        System.out.println(result);
    }
}
```

This function uses backtracking to generate all possible letter combinations. The `mapping` array maps each digit from 2 to 9 to a string consisting of the corresponding letters. The function starts by checking if the input string is empty. If not, it calls the `backtrack` method, passing an empty combination string and an initial index of 0. The `backtrack` method recursively builds the combinations by iterating through the letters corresponding to the current digit and appending them to the combination string. When the index reaches the length of the input string, the combination is added to the list of combinations. Finally, the `main` method is provided as an example of usage, where the input digits are set to "23" and the resulting combinations are printed.
```java
import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        String[] mappings = new String[]{
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
        backtrack(res, mappings, digits, "", 0);
        return res;
    }
    
    private void backtrack(List<String> res, String[] mappings, String digits, String combination, int index) {
        if (index == digits.length()) {
            res.add(combination);
            return;
        }
        String letters = mappings[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            backtrack(res, mappings, digits, combination + letters.charAt(i), index + 1);
        }
    }
}
```
```java
import java.util.ArrayList;
import java.util.List;

public class PhoneNumberLetterCombinations {
    private static final String[] LETTERS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) {
            return combinations;
        }
        backtrack(combinations, digits, new StringBuilder(), 0);
        return combinations;
    }

    private static void backtrack(List<String> combinations, String digits, StringBuilder currentCombination, int index) {
        if (index == digits.length()) {
            combinations.add(currentCombination.toString());
        } else {
            char digit = digits.charAt(index);
            String letters = LETTERS[digit - '0'];
            for (int i = 0; i < letters.length(); i++) {
                currentCombination.append(letters.charAt(i));
                backtrack(combinations, digits, currentCombination, index + 1);
                currentCombination.deleteCharAt(currentCombination.length() - 1);
            }
        }
    }
}
```
```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0) {
            return result;
        }
        
        String[] mapping = new String[] {
            "", 
            "", 
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
    
    private static void letterCombinationsHelper(List<String> result, String digits, String current, int index, String[] mapping) {
        if(index == digits.length()) {
            result.add(current);
            return;
        }
        
        String letters = mapping[digits.charAt(index) - '0'];
        for(int i = 0; i < letters.length(); i++) {
            letterCombinationsHelper(result, digits, current + letters.charAt(i), index + 1, mapping);
        }
    }
}
```
```
import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    
    private static final String[] mapping = {
            "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        backtrack("", digits, combinations);
        return combinations;
    }
    
    private void backtrack(String combination, String digits, List<String> combinations) {
        if (digits.length() == 0) {
            combinations.add(combination);
        } else {
            int digit = Integer.parseInt(digits.substring(0, 1));
            String letters = mapping[digit];
            for (int i = 0; i < letters.length(); i++) {
                String letter = mapping[digit].substring(i, i + 1);
                backtrack(combination + letter, digits.substring(1), combinations);
            }
        }
    }
    
    public static void main(String[] args) {
        LetterCombinations lc = new LetterCombinations();
        List<String> combinations = lc.letterCombinations("23");
        System.out.println(combinations);
    }
}
```
```
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        
        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
        
        backtrack(combinations, digitToLetters, digits, new StringBuilder(), 0);
        
        return combinations;
    }
    
    private void backtrack(List<String> combinations, Map<Character, String> digitToLetters, String digits, StringBuilder current, int index) {
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }
        
        char digit = digits.charAt(index);
        String letters = digitToLetters.get(digit);
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            backtrack(combinations, digitToLetters, digits, current, index + 1);
            current.deleteCharAt(index);
        }
    }

    public static void main(String[] args) {
        LetterCombinations obj = new LetterCombinations();
        System.out.println(obj.letterCombinations("23"));
    }
}
```
```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    private static final Map<Character, String> digitToLetters = new HashMap<>();

    static {
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
    }

    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) {
            return combinations;
        }
        backtrack(combinations, new StringBuilder(), digits, 0);
        return combinations;
    }

    private static void backtrack(List<String> combinations, StringBuilder current, String digits, int index) {
        if (current.length() == digits.length()) {
            combinations.add(current.toString());
            return;
        }

        String letters = digitToLetters.get(digits.charAt(index));
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(combinations, current, digits, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> combinations = letterCombinations(digits);
        System.out.println(combinations);
    }
}
```
```
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        String[] mapping = {
            "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        letterCombinationsHelper(combinations, digits, "", 0, mapping);
        return combinations;
    }
    
    private void letterCombinationsHelper(List<String> combinations, String digits,
                                          String current, int index, String[] mapping) {
        if (index == digits.length()) {
            combinations.add(current);
            return;
        }
        
        String letters = mapping[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            letterCombinationsHelper(combinations, digits, current + c, index + 1, mapping);
        }
    }
}
```
Here is a possible implementation of the requested function:

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final String[] letters = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        backtrack(result, "", digits, 0);
        return result;
    }
    
    private void backtrack(List<String> result, String current, String digits, int index) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        int digit = digits.charAt(index) - '0';
        String alpha = letters[digit];
        for (int i = 0; i < alpha.length(); i++) {
            backtrack(result, current + alpha.charAt(i), digits, index + 1);
        }
    }
}
```

The `letterCombinations` function takes a string `digits` as input and returns a list containing all possible letter combinations that the number could represent. The function uses backtracking to generate all combinations.

The `letters` array stores the corresponding letters for each digit from 2 to 9.

In the `letterCombinations` function, an empty result list is initialized. If the input digits are null or empty, the function returns the empty result list.

Otherwise, the function calls the `backtrack` function to generate all combinations. The `backtrack` function takes the current combination (`current`), the input digits (`digits`), and the current index (`index`) as parameters.

If the index reaches the end of digits, the current combination is added to the result list and the function returns.

Otherwise, the digit at the current index is retrieved and used to get the corresponding letters. The `backtrack` function recursively calls itself for each letter in the current digit's set of letters, adding the letter to the current combination and incrementing the index.

After all recursive calls, the backtracking process is complete, and the `letterCombinations` function returns the result list.
```java
import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        if (digits.length() == 0) {
            return ans;
        }
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for (int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            while (ans.get(0).length() == i) {
                String t = ans.remove(0);
                for (char s : mapping[x].toCharArray())
                    ans.add(t + s);
            }
        }
        return ans;
    }
}
```
```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    private static final Map<Character, String[]> digitToLetters = new HashMap<>();
	static {
		digitToLetters.put('2', new String[] { "a", "b", "c" });
		digitToLetters.put('3', new String[] { "d", "e", "f" });
		digitToLetters.put('4', new String[] { "g", "h", "i" });
		digitToLetters.put('5', new String[] { "j", "k", "l" });
		digitToLetters.put('6', new String[] { "m", "n", "o" });
		digitToLetters.put('7', new String[] { "p", "q", "r", "s" });
		digitToLetters.put('8', new String[] { "t", "u", "v" });
		digitToLetters.put('9', new String[] { "w", "x", "y", "z" });
	}
    
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;
        backtrack(result, "", digits);
        return result;
    }
    
    private static void backtrack(List<String> combinations, String combination, String digits) {
        if (digits.isEmpty()) {
            combinations.add(combination);
            return;
        }
        
        String[] letters = digitToLetters.get(digits.charAt(0));
        for (int i = 0; i < letters.length; i++) {
            backtrack(combinations, combination + letters[i], digits.substring(1));
        }
    }
    
    public static void main(String[] args) {
        String digits = "23";
        List<String> combinations = letterCombinations(digits);
        System.out.println(combinations);
    }
}
```
```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private static final Map<Character, String> digitToLetters = new HashMap<>();
    
    static {
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        backtrack(combinations, digits, new StringBuilder(), 0);
        return combinations;
    }

    private void backtrack(List<String> combinations, String digits, StringBuilder currentCombination, int index) {
        if (index == digits.length()) {
            combinations.add(currentCombination.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = digitToLetters.get(digit);
        for (char letter : letters.toCharArray()) {
            currentCombination.append(letter);
            backtrack(combinations, digits, currentCombination, index + 1);
            currentCombination.deleteCharAt(index);
        }
    }
}
```
```java
import java.util.*;

class Solution {

    private static final String[] KEYBOARD = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) {
            return combinations;
        }
        backtrack(combinations, digits, 0, new StringBuilder());
        return combinations;
    }

    private void backtrack(List<String> combinations, String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }
        int digit = digits.charAt(index) - '0';
        String letters = KEYBOARD[digit];
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(combinations, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
```
