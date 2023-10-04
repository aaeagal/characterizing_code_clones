
private static final String[] letters1 = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
public List<String> letterCombinations1(String digits) {
    List<String> combinations = new ArrayList<>();
    if (digits.length() == 0) {
        return combinations;
    }
    backtrack1(combinations, digits, 0, new StringBuilder());
    return combinations;
}

private void backtrack1(List<String> combinations, String digits, int index, StringBuilder currentCombination) {
    if (index == digits.length()) {
        combinations.add(currentCombination.toString());
    } else {
        int digit = Character.getNumericValue(digits.charAt(index));
        String lettersForDigit = letters1[digit];
        int lettersCount = lettersForDigit.length();
        for (int i = 0; i < lettersCount; i++) {
            currentCombination.append(lettersForDigit.charAt(i));
            backtrack1(combinations, digits, index + 1, currentCombination);
            currentCombination.deleteCharAt(index);
        }
    }
}

public List<String> letterCombinations2(String digits) {
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


public List<String> letterCombinations3(String digits) {
    List<String> result = new ArrayList<String>();
    
    if (digits == null || digits.length() == 0) {
        return result;
    }
    
    Map<Character, String> map3 = new HashMap<Character, String>();
    map3.put('2', "abc");
    map3.put('3', "def");
    map3.put('4', "ghi");
    map3.put('5', "jkl");
    map3.put('6', "mno");
    map3.put('7', "pqrs");
    map3.put('8', "tuv");
    map3.put('9', "wxyz");
    
    backtrack3(result, map3, digits, "", 0);
    
    return result;
}

public void backtrack3(List<String> result, Map<Character, String> map, String digits, String current, int index) {
    if (index == digits.length()) {
        result.add(current);
        return;
    }
    
    char digit = digits.charAt(index);
    String letters = map.get(digit);
    
    for (int i = 0; i < letters.length(); i++) {
        char letter = letters.charAt(i);
        backtrack3(result, map, digits, current + letter, index + 1);
    }
}


public List<String> letterCombinations4(String digits) {
    List<String> result = new ArrayList<>();
    if (digits == null || digits.length() == 0)
        return result;
    
    String[] mappings = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    backtrack4(result, mappings, digits, 0, new StringBuilder());
    
    return result;
}

private void backtrack4(List<String> result, String[] mappings, String digits, int index, StringBuilder combination) {
    if (index == digits.length()) {
        result.add(combination.toString());
        return;
    }
    
    int digit = Character.getNumericValue(digits.charAt(index));
    String letters = mappings[digit];
    
    for (int i = 0; i < letters.length(); i++) {
        combination.append(letters.charAt(i));
        backtrack4(result, mappings, digits, index+1, combination);
        combination.deleteCharAt(combination.length()-1);
    }

public List<String> letterCombinations5(String digits) {
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
    
    generateCombination5(result, digits, mappings, "", 0);
    
    return result;
}

private void generateCombination5(List<String> result, String digits, String[] mappings, String current, int index) {
    if (index == digits.length()) {
        result.add(current);
        return;
    }
    
    String letters = mappings[digits.charAt(index) - '0'];
    for (int i = 0; i < letters.length(); i++) {
        generateCombination5(result, digits, mappings, current + letters.charAt(i), index + 1);
    }
}


public List<String> letterCombinations6(String digits) {
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
    
    generateCombinations6(combinations, digits, "", 0, mapping);
    
    return combinations;
}

private void generateCombinations6(List<String> combinations, String digits, String current, int index, String[] mapping) {
    if (index == digits.length()) {
        combinations.add(current);
        return;
    }
    
    String letters = mapping[digits.charAt(index) - '0'];
    for (int i = 0; i < letters.length(); i++) {
        generateCombinations6(combinations, digits, current + letters.charAt(i), index + 1, mapping);
    }
}


private static final String[] mapping7 = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

public static List<String> letterCombinations7(String digits) {
    List<String> combinations = new ArrayList<>();
    if(digits == null || digits.length() == 0) {
        return combinations;
    }
    backtrack7(combinations, digits, new StringBuilder(), 0);
    return combinations;
}

private static void backtrack7(List<String> combinations, String digits, StringBuilder current, int index) {
    if(index == digits.length()) {
        combinations.add(current.toString());
        return;
    }
    int digit = Character.getNumericValue(digits.charAt(index));
    String letters = mapping7[digit];
    for(int i = 0; i < letters.length(); i++) {
        current.append(letters.charAt(i));
        backtrack7(combinations, digits, current, index + 1);
        current.deleteCharAt(current.length() - 1);
    }
}




public List<String> letterCombinations8(String digits) {
    List<String> result = new ArrayList<>();
    if (digits == null || digits.length() == 0) {
        return result;
    }
    
    String[] mapping = new String[] {
        "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    
    letterCombinationsHelper8(digits, "", 0, mapping, result);
    
    return result;
}

private void letterCombinationsHelper8(String digits, String current, int index, String[] mapping, List<String> result) {
    if (index == digits.length()) {
        result.add(current);
        return;
    }
    
    String letters = mapping[digits.charAt(index) - '0'];
    for (int i = 0; i < letters.length(); i++) {
        letterCombinationsHelper8(digits, current + letters.charAt(i), index + 1, mapping, result);
    }
}


public List<String> letterCombinations9(String digits) {
    List<String> result = new ArrayList<>();
    if (digits == null || digits.length() == 0) {
        return result;
    }
    String[] mapping = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    letterCombinations9(digits, result, "", 0, mapping);
    return result;
}

private void letterCombinations9(String digits, List<String> result, String current, int index, String[] mapping) {
    if (index == digits.length()) {
        result.add(current);
        return;
    }
    String letters = mapping[digits.charAt(index) - '0'];
    for (int i = 0; i < letters.length(); i++) {
        letterCombinations9(digits, result, current + letters.charAt(i), index + 1, mapping);
    }
}


public List<String> letterCombinations10(String digits) {
    List<String> combinations = new ArrayList<>();
    if (digits == null || digits.length() == 0)
        return combinations;
    
    String[] letterMap = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    backtrack10(combinations, letterMap, digits, 0, new StringBuilder());
    return combinations;
}

private void backtrack10(List<String> combinations, String[] letterMap, String digits, int index, StringBuilder sb) {
    if (index == digits.length()) {
        combinations.add(sb.toString());
        return;
    }
    
    int digit = digits.charAt(index) - '0';
    String letters = letterMap[digit];
    
    for (int i = 0; i < letters.length(); i++) {
        sb.append(letters.charAt(i));
        backtrack10(combinations, letterMap, digits, index + 1, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}





private static final Map<Character, String> digitLetters11 = new HashMap<>();
static {
    digitLetters11.put('2', "abc");
    digitLetters11.put('3', "def");
    digitLetters11.put('4', "ghi");
    digitLetters11.put('5', "jkl");
    digitLetters11.put('6', "mno");
    digitLetters11.put('7', "pqrs");
    digitLetters11.put('8', "tuv");
    digitLetters11.put('9', "wxyz");
}

public List<String> letterCombinations11(String digits) {
    List<String> result = new ArrayList<>();
    if (digits.length() == 0) {
        return result;
    }
    backtrack11(digits, 0, new StringBuilder(), result);
    return result;
}

private void backtrack11(String digits, int index, StringBuilder current, List<String> result) {
    if (index == digits.length()) {
        result.add(current.toString());
        return;
    }
    char digit = digits.charAt(index);
    String letters = digitLetters11.get(digit);
    for (char letter : letters.toCharArray()) {
        current.append(letter);
        backtrack11(digits, index + 1, current, result);
        current.deleteCharAt(current.length() - 1);
    }
}


public List<String> letterCombinations12(String digits) {
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
    
    backtrack12(result, "", mapping, digits, 0);
    return result;
}

private void backtrack12(List<String> result, String current, String[] mapping, String digits, int index) {
    if (index == digits.length()) {
        result.add(current);
        return;
    }
    
    String letters = mapping[digits.charAt(index) - '0'];
    for (int i = 0; i < letters.length(); i++) {
        backtrack12(result, current + letters.charAt(i), mapping, digits, index + 1);
    }
}

public List<String> letterCombinations13(String digits) {
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
    letterCombinationsHelper13(result, digits, "", 0, mapping);
    return result;
}

public void letterCombinationsHelper13(List<String> result, String digits, String current, int index, String[] mapping) {
    if (index == digits.length()) {
        result.add(current);
        return;
    }
    String letters = mapping[digits.charAt(index) - '0'];
    for (int i = 0; i < letters.length(); i++) {
        letterCombinationsHelper13(result, digits, current + letters.charAt(i), index + 1, mapping);
    }
}




public List<String> letterCombinations14(String digits) {
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
    
    letterCombinationsHelper14(digits, mapping, result, new StringBuilder(), 0);
    return result;
}

private void letterCombinationsHelper14(String digits, String[] mapping, List<String> result, StringBuilder combination, int index) {
    if (index == digits.length()) {
        result.add(combination.toString());
        return;
    }
    
    char digit = digits.charAt(index);
    String letters = mapping[digit - '0'];
    for (char letter : letters.toCharArray()) {
        combination.append(letter);
        letterCombinationsHelper14(digits, mapping, result, combination, index + 1);
        combination.deleteCharAt(combination.length() - 1);
    }
}

private static final Map<Character, String> letterMap15 = new HashMap<>();

static {
    letterMap15.put('2', "abc");
    letterMap15.put('3', "def");
    letterMap15.put('4', "ghi");
    letterMap15.put('5', "jkl");
    letterMap15.put('6', "mno");
    letterMap15.put('7', "pqrs");
    letterMap15.put('8', "tuv");
    letterMap15.put('9', "wxyz");
}

public static List<String> letterCombinations15(String digits) {
    List<String> combinations = new ArrayList<>();
    if (digits == null || digits.length() == 0) {
        return combinations;
    }
    backtrack15(digits, 0, new StringBuilder(), combinations);
    return combinations;
}

private static void backtrack15(String digits, int index, StringBuilder currentCombination, List<String> combinations) {
    if (index == digits.length()) {
        combinations.add(currentCombination.toString());
        return;
    }
    
    char digit = digits.charAt(index);
    String letters = letterMap15.get(digit);
    
    for (char letter : letters.toCharArray()) {
        currentCombination.append(letter);
        backtrack15(digits, index + 1, currentCombination, combinations);
        currentCombination.deleteCharAt(currentCombination.length() - 1);
    }
}


public List<String> letterCombinations16(String digits) {

    List<String> result = new ArrayList<>();

    if (digits == null || digits.length() == 0) {
        return result;
    }

    String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    backtrack16(result, digits, "", 0, mapping);
    return result;
}

private void backtrack16(List<String> result, String digits, String currentString, int index, String[] mapping) {

    if (index == digits.length()) {
        result.add(currentString);
        return;
    }

    String letters = mapping[digits.charAt(index) - '0'];
    for (int i = 0; i < letters.length(); i++) {
        backtrack16(result, digits, currentString + letters.charAt(i), index + 1, mapping);
    }
}

private Map<Character, String> digitMapping20 = new HashMap<>();

public List<String> letterCombinations20(String digits) {
    List<String> result = new ArrayList<>();
    if (digits == null || digits.length() == 0) {
        return result;
    }

    digitMapping20.put('2', "abc");
    digitMapping20.put('3', "def");
    digitMapping20.put('4', "ghi");
    digitMapping20.put('5', "jkl");
    digitMapping20.put('6', "mno");
    digitMapping20.put('7', "pqrs");
    digitMapping20.put('8', "tuv");
    digitMapping20.put('9', "wxyz");

    generateCombinations20(digits, 0, new StringBuilder(), result);

    return result;
}

private void generateCombinations20(String digits, int index, StringBuilder sb, List<String> result) {
    if (index == digits.length()) {
        result.add(sb.toString());
        return;
    }

    String letters = digitMapping20.get(digits.charAt(index));
    for (int i = 0; i < letters.length(); i++) {
        sb.append(letters.charAt(i));
        generateCombinations20(digits, index + 1, sb, result);
        sb.deleteCharAt(sb.length() - 1);
    }
}

private static Map<Character, String> phone17 = new HashMap<>() {{
    put('2', "abc");
    put('3', "def");
    put('4', "ghi");
    put('5', "jkl");
    put('6', "mno");
    put('7', "pqrs");
    put('8', "tuv");
    put('9', "wxyz");
}};

private static List<String> output17 = new ArrayList<>();

public static List<String> letterCombinations17(String digits) {
    if (digits.length() != 0)
        backtrack17("", digits);
    return output;
}

private static void backtrack17(String combination, String next_digits) {
    if (next_digits.length() == 0) {
        output.add(combination);
    } else {
        char digit = next_digits.charAt(0);
        String letters = phone17.get(digit);
        for (int i = 0; i < letters.length(); i++) {
            String letter = phone17.get(digit).substring(i, i + 1);
            backtrack17(combination + letter, next_digits.substring(1));
        }
    }
}


public List<String> letterCombinations18(String digits) {
    List<String> combinations = new ArrayList<>();
    if (digits == null || digits.length() == 0) {
        return combinations;
    }
    
    Map<Character, String> map18 = new HashMap<>();
    map18.put('2', "abc");
    map18.put('3', "def");
    map18.put('4', "ghi");
    map18.put('5', "jkl");
    map18.put('6', "mno");
    map18.put('7', "pqrs");
    map18.put('8', "tuv");
    map18.put('9', "wxyz");
    
    backtrack18(combinations, map18, digits, 0, new StringBuilder());
    return combinations;
}

private void backtrack18(List<String> combinations, Map<Character, String> map, String digits, int index, StringBuilder current) {
    if (index == digits.length()) {
        combinations.add(current.toString());
        return;
    }
    
    String letters = map18.get(digits.charAt(index));
    for (int i = 0; i < letters.length(); i++) {
        current.append(letters.charAt(i));
        backtrack18(combinations, map, digits, index+1, current);
        current.deleteCharAt(current.length() - 1);
    }
}

