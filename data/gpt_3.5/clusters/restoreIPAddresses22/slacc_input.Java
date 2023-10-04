
import java.util.ArrayList;
import java.util.List;

public class Interleave {

    public static List<String> restoreIpAddresses1(String s) {
        List<String> result = new ArrayList<>(); // 1

        if (s.length() > 12 || s.length() < 4) { // 2
            return result;
        }

        backtrack1(result, s, 0, new ArrayList<>()); // 3

        return result;
    }

    private static void backtrack1(List<String> result, String s, int start, List<String> current) { // 4
        if (current.size() == 4 && start == s.length()) { // 5
            result.add(String.join(".", current)); // 6
            return;
        }

        for (int i = 1; i <= 3; i++) { // 7
            if (start + i > s.length()) { // 8
                break; // 9
            }

            String segment = s.substring(start, start + i); // 10

            if (isValidSegment1(segment)) { // 11
                current.add(segment); // 12
                backtrack1(result, s, start + i, current); // 13
                current.remove(current.size() - 1); // 14
            }
        }
    }

    private static boolean isValidSegment1(String segment) { // 15
        if (segment.length() > 1 && segment.startsWith("0")) { // 16
            return false;
        }

        int value = Integer.parseInt(segment); // 17
        return value >= 0 && value <= 255;
    }



    public static List<String> getAllValidIPAddresses2(String s) {
        List<String> result = new ArrayList<>(); // 18
        backtrack2(s, 0, "", result); // 19
        return result;
    }

    public static void backtrack2(String s, int section, String current, List<String> result) {
        if (section == 4 && s.length() == 0) { // 20
            result.add(current.substring(0, current.length() - 1)); // 21
            return;
        }
        if (section == 4 || s.length() == 0) { // 22
            return;
        }

        for (int i = 1; i <= Math.min(3, s.length()); i++) { // 23
            String sectionString = s.substring(0, i); // 24
            if (!isValidSection2(sectionString)) { // 25
                continue; // 26
            }
            backtrack2(s.substring(i), section + 1, current + sectionString + ".", result); // 27
        }
    }

    public static boolean isValidSection2(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') { // 28
            return false;
        }
        int section = Integer.parseInt(s); // 29
        return section >= 0 && section <= 255;
    }



    public static List<String> restoreIpAddresses3(String s) {
        List<String> result = new ArrayList<>(); // 30
        if (s.length() > 12 || s.length() < 4) // 31
            return result;
        dfs3(result, s, "", 0); // 32
        return result;
    }

    private static void dfs3(List<String> result, String remaining, String ip, int count) { // 33
        if (count == 3 && isValid(remaining)) { // 34
            result.add(ip + remaining); // 35
            return;
        }

        for (int i = 1; i < 4 && i < remaining.length(); i++) { // 36
            String sub = remaining.substring(0, i); // 37
            if (isValid3(sub)) { // 38
                dfs3(result, remaining.substring(i), ip + sub + ".", count + 1); // 39
            }
        }
    }

    private static boolean isValid3(String s) { // 40
        if (s.length() > 3 || s.length() == 0 || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255) // 41
            return false;
        return true;
    }


    public static List<String> generateIPAddresses4(String s) {
        List<String> result = new ArrayList<>(); // 42
        if (s.length() < 4 || s.length() > 12) { // 43
            return result;
        }
        backtrack4(result, s, "", 0, 0); // 44
        return result;
    }

    private static void backtrack4(List<String> result, String s, String current, int index, int dots) { // 45
        if (index == s.length() && dots == 3) { // 46
            result.add(current); // 47
            return;
        }

        if (index >= s.length() || dots > 3) { // 48
            return;
        }


        if (s.charAt(index) == '0') { // 49
            backtrack4(result, s, current + "0.", index + 1, dots + 1); // 50
            return;
        }


        for (int i = 1; i <= 3 && index + i <= s.length(); i++) { // 51
            String substring = s.substring(index, index + i); // 52
            if (isValidPart4(substring)) { // 53
                if (dots < 3) { // 54
                    backtrack4(result, s, current + substring + ".", index + i, dots + 1); // 55
                } else { // 56
                    backtrack4(result, s, current + substring, index + i, dots + 1); // 57
                }
            }
        }
    }

    private static boolean isValidPart4(String s) { // 58
        if (s.length() > 1 && s.charAt(0) == '0') { // 59
            return false;
        }
        int value = Integer.parseInt(s); // 60
        return value >= 0 && value <= 255;
    }

    public List<String> restoreIpAddresses5(String s) {
        List<String> result = new ArrayList<>(); // 61
        if (s.length() < 4 || s.length() > 12) { // 62
            return result;
        }
        generateIPAddresses5(s, "", 0, 0, result); // 63
        return result;
    }

    private void generateIPAddresses5(String s, String current, int index, int count, List<String> result) { // 64
        if (count == 3 && isSegmentValid5(s.substring(index))) { // 65
            result.add(current + s.substring(index)); // 66
            return;
        }
        for (int i = 1; i <= 3 && index + i < s.length(); i++) { // 67
            String segment = s.substring(index, index + i); // 68
            if (isSegmentValid5(segment)) { // 69
                generateIPAddresses5(s, current + segment + ".", index + i, count + 1, result); // 70
            }
        }
    }

    private boolean isSegmentValid5(String segment) { // 71
        if (segment.length() > 1 && segment.startsWith("0")) { // 72
            return false;
        }
        int value = Integer.parseInt(segment); // 73
        return value >= 0 && value <= 255;
    }


    public static List<String> restoreIpAddresses6(String s) {
        List<String> result = new ArrayList<>(); // 74

        if (s == null || s.isEmpty()) { // 75
            return result;
        }

        backtrack6(result, s, new StringBuilder(), 0, 0); // 76

        return result;
    }

    private static void backtrack(6List<String> result, String s, StringBuilder current, int start, int dotCount) { // 77
        if (dotCount > 3) { // 78
            return;
        }

        if (start == s.length() && dotCount == 3) { // 79
            result.add(current.toString()); // 80
            return;
        }

        for (int i = start; i < s.length() && i < start + 3; i++) { // 81
            String segment = s.substring(start, i + 1); // 82
            if (isValidSegment6(segment)) { // 83
                int currentLength = current.length(); // 84
                if (currentLength != 0) { // 85
                    current.append('.'); // 86
                }
                current.append(segment); // 87
                backtrack6(result, s, current, i + 1, dotCount + 1); // 88
                current.setLength(currentLength); // 89
            }
        }
    }

    private static boolean isValidSegment6(String segment) { // 90
        if (segment.charAt(0) == '0' && segment.length() > 1) { // 91
            return false;
        }

        int value = Integer.parseInt(segment); // 92
        return value >= 0 && value <= 255;
    }

    public static List<String> restoreIpAddresses7(String s) {
        List<String> result = new ArrayList<>(); // 93
        if (s.length() < 4 || s.length() > 12) { // 94
            return result;
        }
        generateIPAddresses7(s, 0, new StringBuilder(), result, 0); // 95
        return result;
    }

    private static void generateIPAddresses7(String s, int index, StringBuilder sb, List<String> result, int count) { // 96
        if (count == 4) { // 97
            if (index == s.length()) { // 98
                result.add(sb.toString().substring(0, sb.length() - 1)); // 99
            }
            return;
        }

        for (int i = 1; i <= 3; i++) { // 100
            if (index + i > s.length()) { // 101
                break; // 102
            }
            String segment = s.substring(index, index + i); // 103
            if ((segment.startsWith("0") && segment.length() > 1) || Integer.parseInt(segment) > 255) { // 104
                break; // 105
            }
            int length = sb.length(); // 106
            sb.append(segment).append("."); // 107
            generateIPAddresses7(s, index + i, sb, result, count + 1); // 108
            sb.setLength(length); // 109
        }
    }


    public static List<String> restoreIpAddresses8(String s) {
        List<String> result = new ArrayList<>(); // 110
        if (s.length() < 4 || s.length() > 12) { // 111
            return result;
        }
        helper8(result, "", s, 0); // 112
        return result;
    }

    public static void helper8(List<String> result, String cur, String s, int count) {
        if (count == 3 && isValidIPSegment8(s)) { // 113
            result.add(cur + s); // 114
            return;
        }
        for (int i = 1; i < 4 && i < s.length(); i++) { // 115
            String segment = s.substring(0, i); // 116
            if (isValidIPSegment8(segment)) { // 117
                helper8(result, cur + segment + ".", s.substring(i), count + 1); // 118
            }
        }
    }

    public static boolean isValidIPSegment8(String segment) {
        if (segment.charAt(0) == '0' && segment.length() > 1) { // 119
            return false;
        }
        int num = Integer.parseInt(segment); // 120
        return num >= 0 && num <= 255;
    }

    public static List<String> restoreIpAddresses9(String s) {
        List<String> result = new ArrayList<>(); // 121
        restoreIP9(s, result, "", 0, 0); // 122
        return result;
    }

    private static void restoreIP9(String s, List<String> result, String current, int segCount, int startIndex) { // 123
        if (segCount == 4 && startIndex == s.length()) { // 124
            result.add(current); // 125
        } else if (segCount == 4 || startIndex == s.length()) { // 126
            return;
        }

        for (int i = 1; i <= 3 && startIndex + i <= s.length(); i++) { // 127
            String segment = s.substring(startIndex, startIndex + i); // 128
            if (isValidSegment9(segment)) { // 129
                if (segCount == 3) { // 130
                    restoreIP9(s, result, current + segment, segCount + 1, startIndex + i); // 131
                } else { // 132
                    restoreIP9(s, result, current + segment + ".", segCount + 1, startIndex + i); // 133
                }
            }
        }
    }

    private static boolean isValidSegment9(String segment) { // 134
        if (segment.length() > 0 && segment.length() <= 3 && !segment.startsWith("0") && Integer.parseInt(segment) <= 255) { // 135
            return true;
        }
        return false;
    }



    public static List<String> restoreIpAddresses10(String s) {
        List<String> result = new ArrayList<>(); // 136
        if (s == null || s.length() < 4 || s.length() > 12) { // 137
            return result;
        }
        restore10(s, 0, "", result); // 138
        return result;
    }

    private static void restore10(String s, int count, String current, List<String> result) { // 139
        if (count == 3 && isValid10(s)) { // 140
            result.add(current + s); // 141
            return;
        }

        for (int i = 1; i < 4 && i < s.length(); i++) { // 142
            String subString = s.substring(0, i); // 143
            if (isValid10(subString)) { // 144
                restore10(s.substring(i), count + 1, current + subString + ".", result); // 145
            }
        }
    }

    private static boolean isValid10(String s) { // 146
        if (s == null || s.length() > 3 || s.length() == 0 || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255) { // 147
            return false;
        }
        return true;
    }




    public List<String> restoreIpAddresses11(String s) {
        List<String> result = new ArrayList<>(); // 148
        int n = s.length(); // 149

        for (int i = 1; i < 4 && i < n - 2; i++) { // 150
            for (int j = i + 1; j < i + 4 && j < n - 1; j++) { // 151
                for (int k = j + 1; k < j + 4 && k < n; k++) { // 152
                    String s1 = s.substring(0, i); // 153
                    String s2 = s.substring(i, j); // 154
                    String s3 = s.substring(j, k); // 155
                    String s4 = s.substring(k, n); // 156

                    if (isValidIPPart11(s1) && isValidIPPart11(s2) && // 157
                            isValidIPPart11(s3) && isValidIPPart11(s4)) { // 158
                        result.add(s1 + "." + s2 + "." + s3 + "." + s4); // 159
                    }
                }
            }
        }

        return result;
    }

    private boolean isValidIPPart11(String s) { // 160
        if (s.length() > 3 || s.isEmpty() || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255) { // 161
            return false;
        }
        return true;
    }


    public static List<String> restoreIpAddresses12(String s) {
        List<String> result = new ArrayList<>(); // 162
        if (s.length() < 4 || s.length() > 12) { // 163
            return result;
        }
        backtrack12(result, s, 0, new StringBuilder(), 0); // 164
        return result;
    }

    private static void backtrack12(List<String> result, String s, int start, StringBuilder current, int segment) { // 165
        if (start == s.length() && segment == 4) { // 166
            result.add(current.toString()); // 167
            return;
        }
        if (segment == 4 || start == s.length()) { // 168
            return;
        }
        for (int i = 1; i <= 3 && start + i <= s.length(); i++) { // 169
            String segmentString = s.substring(start, start + i); // 170
            if (isValidSegment12(segmentString)) { // 171
                current.append(segmentString); // 172
                if (segment < 3) { // 173
                    current.append("."); // 174
                }
                backtrack12(result, s, start + i, current, segment + 1); // 175
                if (segment < 3) { // 176
                    current.deleteCharAt(current.length() - 1); // 177
                }
                current.delete(current.length() - segmentString.length(), current.length()); // 178
            }
        }
    }

    private static boolean isValidSegment12(String segment) { // 179
        if (segment.length() > 1 && segment.charAt(0) == '0') { // 180
            return false;
        }
        int num = Integer.parseInt(segment); // 181
        return num >= 0 && num <= 255;
    }


    public static List<String> restoreIpAddresses13(String s) {
        List<String> result = new ArrayList<>(); // 182
        backtrack13(s, result, "", 0, 0); // 183
        return result;
    }

    private static void backtrack13(String s, List<String> result, String current, int count, int index) { // 184
        if (count == 4 && index == s.length()) { // 185
            result.add(current); // 186
            return;
        }

        if (count > 4 || index >= s.length()) { // 187
            return;
        }

        if (current.length() > 0) { // 188
            current += "."; // 189
        }

        for (int i = 1; i <= 3 && index + i <= s.length(); i++) { // 190
            String segment = s.substring(index, index + i); // 191
            if (isValidSegment13(segment)) { // 192
                backtrack13(s, result, current + segment, count + 1, index + i); // 193
            }
        }
    }

    private static boolean isValidSegment13(String segment) { // 194
        if (segment.length() > 1 && segment.charAt(0) == '0') { // 195
            return false;
        }

        int value = Integer.parseInt(segment); // 196
        return value >= 0 && value <= 255;
    }


    public static List<String> restoreIpAddresses14(String s) {
        List<String> result = new ArrayList<>(); // 197
        if (s.length() > 12 || s.length() < 4) { // 198
            return result;
        }
        backtrack14(result, new ArrayList<>(), s, 0); // 199
        return result;
    }

    private static void backtrack14(List<String> result, List<String> tempList, String s, int start) { // 200
        if (tempList.size() == 4) { // 201
            if (start == s.length()) { // 202
                result.add(String.join(".", tempList)); // 203
            }
            return;
        }
        for (int i = start; i < s.length() && i < start + 3; i++) { // 204
            String substring = s.substring(start, i + 1); // 205
            if (isValid14(substring)) { // 206
                tempList.add(substring); // 207
                backtrack14(result, tempList, s, i + 1); // 208
                tempList.remove(tempList.size() - 1); // 209
            }
        }
    }

    private static boolean isValid14(String s) { // 210
        if (s.startsWith("0") && s.length() > 1) { // 211
            return false;
        }
        int num = Integer.parseInt(s); // 212
        return num >= 0 && num <= 255;
    }


    public List<String> restoreIpAddresses15(String s) {
        List<String> result = new ArrayList<>(); // 213
        if (s == null || s.length() < 4 || s.length() > 12) { // 214
            return result;
        }
        restoreIpAddressesHelper15(s, 0, 0, "", result); // 215
        return result;
    }

    private void restoreIpAddressesHelper(15String s, int start, int count, String current, List<String> result) { // 216
        if (count == 4 && start == s.length()) { // 217
            result.add(current); // 218
        }
        if (count == 4 || start == s.length()) { // 219
            return;
        }
        for (int i = 1; i <= 3 && start + i <= s.length(); i++) { // 220
            String section = s.substring(start, start + i); // 221
            if (isValidSection15(section)) { // 222
                restoreIpAddressesHelper15(s, start + i, count + 1, current + (count == 0 ? "" : ".") + section, result); // 223
            }
        }
    }

    private boolean isValidSection15(String section) { // 224
        if (section.length() > 1 && section.charAt(0) == '0') { // 225
            return false;
        }
        int value = Integer.parseInt(section); // 226
        return value >= 0 && value <= 255;
    }

    public static List<String> restoreIpAddresses16(String s) {
        List<String> result = new ArrayList<>(); // 227
        dfs16(s, 0, "", result); // 228
        return result;
    }

    public static void dfs16(String s, int idx, String curr, List<String> result) {
        if (idx == 4 || s.length() == 0) { // 229
            if (idx == 4 && s.length() == 0) { // 230
                result.add(curr.substring(1)); // 231
            }
            return;
        }

        for (int i = 1; i <= Math.min(3, s.length()); i++) { // 232
            String part = s.substring(0, i); // 233
            if (isValid16(part)) { // 234
                dfs16(s.substring(i), idx + 1, curr + "." + part, result); // 235
            }
        }
    }

    public static boolean isValid16(String s) {
        if (s.charAt(0) == '0') { // 236
            return s.equals("0");
        }
        int num = Integer.parseInt(s); // 237
        return num <= 255 && num > 0;
    }


    public static List<String> generateIPAddresses17(String s) {
        List<String> addresses = new ArrayList<>(); // 238
        backtrack17(s, addresses, 0, new StringBuffer()); // 239
        return addresses;
    }

    private static void backtrack17(String s, List<String> addresses, int count, StringBuffer ipAddress) { // 240
        if (count == 4) { // 241
            if (s.length() == 0) { // 242
                addresses.add(ipAddress.toString()); // 243
            }
            return;
        }

        for (int i = 1; i <= 3; i++) { // 244
            if (s.length() < i) { // 245
                break; // 246
            }

            String segment = s.substring(0, i); // 247
            if (isValidSegment17(segment)) { // 248
                if (count != 0) { // 249
                    segment = "." + segment; // 250
                }
                ipAddress.append(segment); // 251

                backtrack17(s.substring(i), addresses, count + 1, ipAddress); // 252

                ipAddress.delete(ipAddress.length() - segment.length(), ipAddress.length()); // 253
            }
        }
    }

    private static boolean isValidSegment17(String segment) { // 254
        if (segment.length() > 1 && segment.charAt(0) == '0') { // 255
            return false;
        }

        int value = Integer.parseInt(segment); // 256
        return value >= 0 && value <= 255;
    }


    public List<String> restoreIpAddresses18(String s) {
        List<String> result = new ArrayList<>(); // 257
        if (s.length() < 4 || s.length() > 12) { // 258
            return result;
        }
        backtrack18(result, s, 0, "", 0); // 259
        return result;
    }

    private void backtrack18(List<String> result, String s, int start, String current, int dotCount) { // 260
        if (dotCount == 3) { // 261
            String remaining = s.substring(start); // 262
            if (isValidIpSegment18(remaining)) { // 263
                result.add(current + remaining); // 264
            }
            return;
        }
        for (int i = start; i < s.length() && i < start + 3; i++) { // 265
            String segment = s.substring(start, i + 1); // 266
            if (isValidIpSegment18(segment)) { // 267
                backtrack18(result, s, i + 1, current + segment + ".", dotCount + 1); // 268
            }
        }
    }

    private boolean isValidIpSegment18(String segment) { // 269
        if (segment.length() > 3 || segment.isEmpty() || (segment.charAt(0) == '0' && segment.length() > 1) || Integer.parseInt(segment) > 255) { // 270
            return false;
        }
        return true;
    }
}

