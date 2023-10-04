public class Interleave {
    private static final String[] letters1 = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; // 1
    
    public List<String> letterCombinations1(String digits) {
        List<String> combinations = new ArrayList<>(); // 2
        if (digits.length() == 0) { // 3
            return combinations;
        }
        backtrack1(combinations, digits, 0, new StringBuilder()); // 4
        return combinations;
    }
    
    private void backtrack1(List<String> combinations, String digits, int index, StringBuilder currentCombination) { // 5
        if (index == digits.length()) { // 6
            combinations.add(currentCombination.toString()); // 7
        } else { // 8
            int digit = Character.getNumericValue(digits.charAt(index)); // 9
            String lettersForDigit = letters1[digit]; // 10
            int lettersCount = lettersForDigit.length(); // 11
            for (int i = 0; i < lettersCount; i++) { // 12
                currentCombination.append(lettersForDigit.charAt(i)); // 13
                backtrack1(combinations, digits, index + 1, currentCombination); // 14
                currentCombination.deleteCharAt(index); // 15
            }
        }
    }
    
    public List<String> letterCombinations2(String digits) {
        List<String> combinations = new ArrayList<>(); // 16
        if (digits == null || digits.length() == 0) { // 17
            return combinations;
        }
        String[] mapping = { // 18
            "0", // 19
            "1", // 20
            "abc", // 21
            "def", // 22
            "ghi", // 23
            "jkl", // 24
            "mno", // 25
            "pqrs", // 26
            "tuv", // 27
            "wxyz" // 28
        }; // 29
        combinations.add(""); // 30
        for (int i = 0; i < digits.length(); i++) { // 31
            int digit = Character.getNumericValue(digits.charAt(i)); // 32
            while (combinations.get(0).length() == i) { // 33
                String current = combinations.remove(0); // 34
                for (char c : mapping[digit].toCharArray()) { // 35
                    combinations.add(current + c); // 36
                }
            }
        }
        return combinations;
    }
    
    
    public List<String> letterCombinations3(String digits) {
        List<String> result = new ArrayList<String>(); // 37
    
        if (digits == null || digits.length() == 0) { // 38
            return result;
        }
    
        Map<Character, String> map3 = new HashMap<Character, String>(); // 39
        map3.put('2', "abc"); // 40
        map3.put('3', "def"); // 41
        map3.put('4', "ghi"); // 42
        map3.put('5', "jkl"); // 43
        map3.put('6', "mno"); // 44
        map3.put('7', "pqrs"); // 45
        map3.put('8', "tuv"); // 46
        map3.put('9', "wxyz"); // 47
    
        backtrack3(result, map3, digits, "", 0); // 48
    
        return result;
    }
    
    public void backtrack3(List<String> result, Map<Character, String> map, String digits, String current, int index) {
        if (index == digits.length()) { // 49
            result.add(current); // 50
            return;
        }
    
        char digit = digits.charAt(index); // 51
        String letters = map.get(digit); // 52
    
        for (int i = 0; i < letters.length(); i++) { // 53
            char letter = letters.charAt(i); // 54
            backtrack3(result, map, digits, current + letter, index + 1); // 55
        }
    }
    
    
    public List<String> letterCombinations4(String digits) {
        List<String> result = new ArrayList<>(); // 56
        if (digits == null || digits.length() == 0) // 57
            return result;
    
        String[] mappings = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; // 58
    
        backtrack4(result, mappings, digits, 0, new StringBuilder()); // 59
    
        return result;
    }
    
    private void backtrack4(List<String> result, String[] mappings, String digits, int index, StringBuilder combination) { // 60
        if (index == digits.length()) { // 61
            result.add(combination.toString()); // 62
            return;
        }
    
        int digit = Character.getNumericValue(digits.charAt(index)); // 63
        String letters = mappings[digit]; // 64
    
        for (int i = 0; i < letters.length(); i++) { // 65
            combination.append(letters.charAt(i)); // 66
            backtrack4(result, mappings, digits, index+1, combination); // 67
            combination.deleteCharAt(combination.length()-1); // 68
        }
    }
    
    public List<String> letterCombinations5(String digits) {
        List<String> result = new ArrayList<>(); // 69
        if (digits == null || digits.length() == 0) { // 70
            return result;
        }
    
        String[] mappings = new String[] { // 71
            "0", // 72
            "1", // 73
            "abc", // 74
            "def", // 75
            "ghi", // 76
            "jkl", // 77
            "mno", // 78
            "pqrs", // 79
            "tuv", // 80
            "wxyz" // 81
        }; // 82
    
        generateCombination5(result, digits, mappings, "", 0); // 83
    
        return result;
    }
    
    private void generateCombination5(List<String> result, String digits, String[] mappings, String current, int index) { // 84
        if (index == digits.length()) { // 85
            result.add(current); // 86
            return;
        }
    
        String letters = mappings[digits.charAt(index) - '0']; // 87
        for (int i = 0; i < letters.length(); i++) { // 88
            generateCombination5(result, digits, mappings, current + letters.charAt(i), index + 1); // 89
        }
    }
    
    
    public List<String> letterCombinations6(String digits) {
        List<String> combinations = new ArrayList<>(); // 90
        if (digits == null || digits.length() == 0) { // 91
            return combinations;
        }
    
        String[] mapping = new String[] { // 92
            "",     // 0 // 93
            "",     // 1 // 94
            "abc",  // 2 // 95
            "def",  // 3 // 96
            "ghi",  // 4 // 97
            "jkl",  // 5 // 98
            "mno",  // 6 // 99
            "pqrs", // 7 // 100
            "tuv",  // 8 // 101
            "wxyz"  // 9 // 102
        }; // 103
    
        generateCombinations6(combinations, digits, "", 0, mapping); // 104
    
        return combinations;
    }
    
    private void generateCombinations6(List<String> combinations, String digits, String current, int index, String[] mapping) { // 105
        if (index == digits.length()) { // 106
            combinations.add(current); // 107
            return;
        }
    
        String letters = mapping[digits.charAt(index) - '0']; // 108
        for (int i = 0; i < letters.length(); i++) { // 109
            generateCombinations6(combinations, digits, current + letters.charAt(i), index + 1, mapping); // 110
        }
    }
    
    
    private static final String[] mapping7 = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; // 111
    
    public static List<String> letterCombinations7(String digits) {
        List<String> combinations = new ArrayList<>(); // 112
        if(digits == null || digits.length() == 0) { // 113
            return combinations;
        }
        backtrack7(combinations, digits, new StringBuilder(), 0); // 114
        return combinations;
    }
    
    private static void backtrack7(List<String> combinations, String digits, StringBuilder current, int index) { // 115
        if(index == digits.length()) { // 116
            combinations.add(current.toString()); // 117
            return;
        }
        int digit = Character.getNumericValue(digits.charAt(index)); // 118
        String letters = mapping7[digit]; // 119
        for(int i = 0; i < letters.length(); i++) { // 120
            current.append(letters.charAt(i)); // 121
            backtrack7(combinations, digits, current, index + 1); // 122
            current.deleteCharAt(current.length() - 1); // 123
        }
    }
    
    
    
    
    public List<String> letterCombinations8(String digits) {
        List<String> result = new ArrayList<>(); // 124
        if (digits == null || digits.length() == 0) { // 125
            return result;
        }
    
        String[] mapping = new String[] { // 126
            "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" // 127
        }; // 128
    
        letterCombinationsHelper8(digits, "", 0, mapping, result); // 129
    
        return result;
    }
    
    private void letterCombinationsHelper8(String digits, String current, int index, String[] mapping, List<String> result) { // 130
        if (index == digits.length()) { // 131
            result.add(current); // 132
            return;
        }
    
        String letters = mapping[digits.charAt(index) - '0']; // 133
        for (int i = 0; i < letters.length(); i++) { // 134
            letterCombinationsHelper8(digits, current + letters.charAt(i), index + 1, mapping, result); // 135
        }
    }
    
    
    public List<String> letterCombinations9(String digits) {
        List<String> result = new ArrayList<>(); // 136
        if (digits == null || digits.length() == 0) { // 137
            return result;
        }
        String[] mapping = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; // 138
        letterCombinations9(digits, result, "", 0, mapping); // 139
        return result;
    }
    
    private void letterCombinations9(String digits, List<String> result, String current, int index, String[] mapping) { // 140
        if (index == digits.length()) { // 141
            result.add(current); // 142
            return;
        }
        String letters = mapping[digits.charAt(index) - '0']; // 143
        for (int i = 0; i < letters.length(); i++) { // 144
            letterCombinations9(digits, result, current + letters.charAt(i), index + 1, mapping); // 145
        }
    }
    
    
    public List<String> letterCombinations10(String digits) {
        List<String> combinations = new ArrayList<>(); // 146
        if (digits == null || digits.length() == 0) // 147
            return combinations;
    
        String[] letterMap = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; // 148
    
        backtrack10(combinations, letterMap, digits, 0, new StringBuilder()); // 149
        return combinations;
    }
    
    private void backtrack10(List<String> combinations, String[] letterMap, String digits, int index, StringBuilder sb) { // 150
        if (index == digits.length()) { // 151
            combinations.add(sb.toString()); // 152
            return;
        }
    
        int digit = digits.charAt(index) - '0'; // 153
        String letters = letterMap[digit]; // 154
    
        for (int i = 0; i < letters.length(); i++) { // 155
            sb.append(letters.charAt(i)); // 156
            backtrack10(combinations, letterMap, digits, index + 1, sb); // 157
            sb.deleteCharAt(sb.length() - 1); // 158
        }
    }
    
    
    
    
    
    private static final Map<Character, String> digitLetters11 = new HashMap<>(); // 159
    static { // 160
        digitLetters11.put('2', "abc"); // 161
        digitLetters11.put('3', "def"); // 162
        digitLetters11.put('4', "ghi"); // 163
        digitLetters11.put('5', "jkl"); // 164
        digitLetters11.put('6', "mno"); // 165
        digitLetters11.put('7', "pqrs"); // 166
        digitLetters11.put('8', "tuv"); // 167
        digitLetters11.put('9', "wxyz"); // 168
    }
    
    public List<String> letterCombinations11(String digits) {
        List<String> result = new ArrayList<>(); // 169
        if (digits.length() == 0) { // 170
            return result;
        }
        backtrack11(digits, 0, new StringBuilder(), result); // 171
        return result;
    }
    
    private void backtrack11(String digits, int index, StringBuilder current, List<String> result) { // 172
        if (index == digits.length()) { // 173
            result.add(current.toString()); // 174
            return;
        }
        char digit = digits.charAt(index); // 175
        String letters = digitLetters11.get(digit); // 176
        for (char letter : letters.toCharArray()) { // 177
            current.append(letter); // 178
            backtrack11(digits, index + 1, current, result); // 179
            current.deleteCharAt(current.length() - 1); // 180
        }
    }
    
    
    public List<String> letterCombinations12(String digits) {
        List<String> result = new ArrayList<>(); // 181
        if (digits == null || digits.length() == 0) { // 182
            return result;
        }
    
        String[] mapping = { // 183
            "",     //0 // 184
            "",     //1 // 185
            "abc",  //2 // 186
            "def",  //3 // 187
            "ghi",  //4 // 188
            "jkl",  //5 // 189
            "mno",  //6 // 190
            "pqrs", //7 // 191
            "tuv",  //8 // 192
            "wxyz"  //9 // 193
        }; // 194
    
        backtrack12(result, "", mapping, digits, 0); // 195
        return result;
    }
    
    private void backtrack12(List<String> result, String current, String[] mapping, String digits, int index) { // 196
        if (index == digits.length()) { // 197
            result.add(current); // 198
            return;
        }
    
        String letters = mapping[digits.charAt(index) - '0']; // 199
        for (int i = 0; i < letters.length(); i++) { // 200
            backtrack12(result, current + letters.charAt(i), mapping, digits, index + 1); // 201
        }
    }
    
    public List<String> letterCombinations13(String digits) {
        List<String> result = new ArrayList<>(); // 202
        if (digits == null || digits.length() == 0) { // 203
            return result;
        }
        String[] mapping = new String[] { // 204
            "0", // 205
            "1", // 206
            "abc", // 207
            "def", // 208
            "ghi", // 209
            "jkl", // 210
            "mno", // 211
            "pqrs", // 212
            "tuv", // 213
            "wxyz" // 214
        }; // 215
        letterCombinationsHelper13(result, digits, "", 0, mapping); // 216
        return result;
    }
    
    public void letterCombinationsHelper13(List<String> result, String digits, String current, int index, String[] mapping) {
        if (index == digits.length()) { // 217
            result.add(current); // 218
            return;
        }
        String letters = mapping[digits.charAt(index) - '0']; // 219
        for (int i = 0; i < letters.length(); i++) { // 220
            letterCombinationsHelper13(result, digits, current + letters.charAt(i), index + 1, mapping); // 221
        }
    }
    
    
    
    
    public List<String> letterCombinations14(String digits) {
        List<String> result = new ArrayList<>(); // 222
        if (digits == null || digits.length() == 0) { // 223
            return result;
        }
    
        String[] mapping = new String[] { // 224
            "",    // 0 // 225
            "",    // 1 // 226
            "abc", // 2 // 227
            "def", // 3 // 228
            "ghi", // 4 // 229
            "jkl", // 5 // 230
            "mno", // 6 // 231
            "pqrs",// 7 // 232
            "tuv", // 8 // 233
            "wxyz" // 9 // 234
        }; // 235
    
        letterCombinationsHelper14(digits, mapping, result, new StringBuilder(), 0); // 236
        return result;
    }
    
    private void letterCombinationsHelper14(String digits, String[] mapping, List<String> result, StringBuilder combination, int index) { // 237
        if (index == digits.length()) { // 238
            result.add(combination.toString()); // 239
            return;
        }
    
        char digit = digits.charAt(index); // 240
        String letters = mapping[digit - '0']; // 241
        for (char letter : letters.toCharArray()) { // 242
            combination.append(letter); // 243
            letterCombinationsHelper14(digits, mapping, result, combination, index + 1); // 244
            combination.deleteCharAt(combination.length() - 1); // 245
        }
    }
    
    private static final Map<Character, String> letterMap15 = new HashMap<>(); // 246
    
    static { // 247
        letterMap15.put('2', "abc"); // 248
        letterMap15.put('3', "def"); // 249
        letterMap15.put('4', "ghi"); // 250
        letterMap15.put('5', "jkl"); // 251
        letterMap15.put('6', "mno"); // 252
        letterMap15.put('7', "pqrs"); // 253
        letterMap15.put('8', "tuv"); // 254
        letterMap15.put('9', "wxyz"); // 255
    }
    
    public static List<String> letterCombinations15(String digits) {
        List<String> combinations = new ArrayList<>(); // 256
        if (digits == null || digits.length() == 0) { // 257
            return combinations;
        }
        backtrack15(digits, 0, new StringBuilder(), combinations); // 258
        return combinations;
    }
    
    private static void backtrack15(String digits, int index, StringBuilder currentCombination, List<String> combinations) { // 259
        if (index == digits.length()) { // 260
            combinations.add(currentCombination.toString()); // 261
            return;
        }
    
        char digit = digits.charAt(index); // 262
        String letters = letterMap15.get(digit); // 263
    
        for (char letter : letters.toCharArray()) { // 264
            currentCombination.append(letter); // 265
            backtrack15(digits, index + 1, currentCombination, combinations); // 266
            currentCombination.deleteCharAt(currentCombination.length() - 1); // 267
        }
    }
    
    
    public List<String> letterCombinations16(String digits) {
    
        List<String> result = new ArrayList<>(); // 268
    
        if (digits == null || digits.length() == 0) { // 269
            return result;
        }
    
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; // 270
        backtrack16(result, digits, "", 0, mapping); // 271
        return result;
    }
    
    private void backtrack16(List<String> result, String digits, String currentString, int index, String[] mapping) { // 272
    
        if (index == digits.length()) { // 273
            result.add(currentString); // 274
            return;
        }
    
        String letters = mapping[digits.charAt(index) - '0']; // 275
        for (int i = 0; i < letters.length(); i++) { // 276
            backtrack16(result, digits, currentString + letters.charAt(i), index + 1, mapping); // 277
        }
    }
    
    private Map<Character, String> digitMapping20 = new HashMap<>(); // 278
    
    public List<String> letterCombinations20(String digits) {
        List<String> result = new ArrayList<>(); // 279
        if (digits == null || digits.length() == 0) { // 280
            return result;
        }
    
        digitMapping20.put('2', "abc"); // 281
        digitMapping20.put('3', "def"); // 282
        digitMapping20.put('4', "ghi"); // 283
        digitMapping20.put('5', "jkl"); // 284
        digitMapping20.put('6', "mno"); // 285
        digitMapping20.put('7', "pqrs"); // 286
        digitMapping20.put('8', "tuv"); // 287
        digitMapping20.put('9', "wxyz"); // 288
    
        generateCombinations20(digits, 0, new StringBuilder(), result); // 289
    
        return result;
    }
    
    private void generateCombinations20(String digits, int index, StringBuilder sb, List<String> result) { // 290
        if (index == digits.length()) { // 291
            result.add(sb.toString()); // 292
            return;
        }
    
        String letters = digitMapping20.get(digits.charAt(index)); // 293
        for (int i = 0; i < letters.length(); i++) { // 294
            sb.append(letters.charAt(i)); // 295
            generateCombinations20(digits, index + 1, sb, result); // 296
            sb.deleteCharAt(sb.length() - 1); // 297
        }
    }
    
    private static Map<Character, String> phone17 = new HashMap<>() {{ // 298
        put('2', "abc"); // 299
        put('3', "def"); // 300
        put('4', "ghi"); // 301
        put('5', "jkl"); // 302
        put('6', "mno"); // 303
        put('7', "pqrs"); // 304
        put('8', "tuv"); // 305
        put('9', "wxyz"); // 306
    }}; // 307
    
    private static List<String> output17 = new ArrayList<>(); // 308
    
    public static List<String> letterCombinations17(String digits) {
        if (digits.length() != 0) // 309
            backtrack17("", digits); // 310
        return output17;
    }
    
    private static void backtrack17(String combination, String next_digits) { // 311
        if (next_digits.length() == 0) { // 312
            output17.add(combination); // 313
        } else { // 314
            char digit = next_digits.charAt(0); // 315
            String letters = phone17.get(digit); // 316
            for (int i = 0; i < letters.length(); i++) { // 317
                String letter = phone17.get(digit).substring(i, i + 1); // 318
                backtrack17(combination + letter, next_digits.substring(1)); // 319
            }
        }
    }
    
    
    public List<String> letterCombinations18(String digits) {
        List<String> combinations = new ArrayList<>(); // 320
        if (digits == null || digits.length() == 0) { // 321
            return combinations;
        }
    
        Map<Character, String> map18 = new HashMap<>(); // 322
        map18.put('2', "abc"); // 323
        map18.put('3', "def"); // 324
        map18.put('4', "ghi"); // 325
        map18.put('5', "jkl"); // 326
        map18.put('6', "mno"); // 327
        map18.put('7', "pqrs"); // 328
        map18.put('8', "tuv"); // 329
        map18.put('9', "wxyz"); // 330
    
        backtrack18(combinations, map18, digits, 0, new StringBuilder()); // 331
        return combinations;
    }
    
    private void backtrack18(List<String> combinations, Map<Character, String> map, String digits, int index, StringBuilder current) { // 332
        if (index == digits.length()) { // 333
            combinations.add(current.toString()); // 334
            return;
        }
    
        String letters = map.get(digits.charAt(index)); // 335
        for (int i = 0; i < letters.length(); i++) { // 336
            current.append(letters.charAt(i)); // 337
            backtrack18(combinations, map, digits, index+1, current); // 338
            current.deleteCharAt(current.length() - 1); // 339
        }
    }
    
    
    }
    
    
    
    