
import java.util.ArrayList;
import java.util.List;

public class Interleave {

    public static List<String> restoreIpAddresses1(String s) {
        List<String> result = new ArrayList<>();

        if (s.length() > 12 || s.length() < 4) {
            return result;
        }

        backtrack1(result, s, 0, new ArrayList<>());

        return result;
    }

    private static void backtrack1(List<String> result, String s, int start, List<String> current) {
        if (current.size() == 4 && start == s.length()) {
            result.add(String.join(".", current));
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (start + i > s.length()) {
                break;
            }

            String segment = s.substring(start, start + i);

            if (isValidSegment1(segment)) {
                current.add(segment);
                backtrack1(result, s, start + i, current);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean isValidSegment1(String segment) {
        if (segment.length() > 1 && segment.startsWith("0")) {
            return false;
        }

        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }


    
    public static List<String> getAllValidIPAddresses2(String s) {
        List<String> result = new ArrayList<>();
        backtrack2(s, 0, "", result);
        return result;
    }
    
    public static void backtrack2(String s, int section, String current, List<String> result) {
        if (section == 4 && s.length() == 0) {
            result.add(current.substring(0, current.length() - 1));
            return;
        }
        if (section == 4 || s.length() == 0) {
            return;
        }
        
        for (int i = 1; i <= Math.min(3, s.length()); i++) {
            String sectionString = s.substring(0, i);
            if (!isValidSection2(sectionString)) {
                continue;
            }
            backtrack2(s.substring(i), section + 1, current + sectionString + ".", result);
        }
    }
    
    public static boolean isValidSection2(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') {
            return false;
        }
        int section = Integer.parseInt(s);
        return section >= 0 && section <= 255;
    }
    


    public static List<String> restoreIpAddresses3(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() > 12 || s.length() < 4)
            return result;
        dfs3(result, s, "", 0);
        return result;
    }

    private static void dfs3(List<String> result, String remaining, String ip, int count) {
        if (count == 3 && isValid(remaining)) {
            result.add(ip + remaining);
            return;
        }

        for (int i = 1; i < 4 && i < remaining.length(); i++) {
            String sub = remaining.substring(0, i);
            if (isValid3(sub)) {
                dfs3(result, remaining.substring(i), ip + sub + ".", count + 1);
            }
        }
    }

    private static boolean isValid3(String s) {
        if (s.length() > 3 || s.length() == 0 || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255)
            return false;
        return true;
    }


    public static List<String> generateIPAddresses4(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        backtrack4(result, s, "", 0, 0);
        return result;
    }
    
    private static void backtrack4(List<String> result, String s, String current, int index, int dots) {
        if (index == s.length() && dots == 3) {
            result.add(current);
            return;
        }
        
        if (index >= s.length() || dots > 3) {
            return;
        }
        

        if (s.charAt(index) == '0') {
            backtrack4(result, s, current + "0.", index + 1, dots + 1);
            return;
        }
        

        for (int i = 1; i <= 3 && index + i <= s.length(); i++) {
            String substring = s.substring(index, index + i);
            if (isValidPart4(substring)) {
                if (dots < 3) {
                    backtrack4(result, s, current + substring + ".", index + i, dots + 1);
                } else {
                    backtrack4(result, s, current + substring, index + i, dots + 1);
                }
            }
        }
    }
    
    private static boolean isValidPart4(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') {
            return false;
        }
        int value = Integer.parseInt(s);
        return value >= 0 && value <= 255;
    }

    public List<String> restoreIpAddresses5(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        generateIPAddresses5(s, "", 0, 0, result);
        return result;
    }

    private void generateIPAddresses5(String s, String current, int index, int count, List<String> result) {
        if (count == 3 && isSegmentValid5(s.substring(index))) {
            result.add(current + s.substring(index));
            return;
        }
        for (int i = 1; i <= 3 && index + i < s.length(); i++) {
            String segment = s.substring(index, index + i);
            if (isSegmentValid5(segment)) {
                generateIPAddresses5(s, current + segment + ".", index + i, count + 1, result);
            }
        }
    }

    private boolean isSegmentValid5(String segment) {
        if (segment.length() > 1 && segment.startsWith("0")) {
            return false;
        }
        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }


    public static List<String> restoreIpAddresses6(String s) {
        List<String> result = new ArrayList<>();

        if (s == null || s.isEmpty()) {
            return result;
        }

        backtrack6(result, s, new StringBuilder(), 0, 0);

        return result;
    }

    private static void backtrack(6List<String> result, String s, StringBuilder current, int start, int dotCount) {
        if (dotCount > 3) {
            return;
        }

        if (start == s.length() && dotCount == 3) {
            result.add(current.toString());
            return;
        }

        for (int i = start; i < s.length() && i < start + 3; i++) {
            String segment = s.substring(start, i + 1);
            if (isValidSegment6(segment)) {
                int currentLength = current.length();
                if (currentLength != 0) {
                    current.append('.');
                }
                current.append(segment);
                backtrack6(result, s, current, i + 1, dotCount + 1);
                current.setLength(currentLength);
            }
        }
    }

    private static boolean isValidSegment6(String segment) {
        if (segment.charAt(0) == '0' && segment.length() > 1) {
            return false;
        }

        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }

    public static List<String> restoreIpAddresses7(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        generateIPAddresses7(s, 0, new StringBuilder(), result, 0);
        return result;
    }

    private static void generateIPAddresses7(String s, int index, StringBuilder sb, List<String> result, int count) {
        if (count == 4) {
            if (index == s.length()) {
                result.add(sb.toString().substring(0, sb.length() - 1));
            }
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (index + i > s.length()) {
                break;
            }
            String segment = s.substring(index, index + i);
            if ((segment.startsWith("0") && segment.length() > 1) || Integer.parseInt(segment) > 255) {
                break;
            }
            int length = sb.length();
            sb.append(segment).append(".");
            generateIPAddresses7(s, index + i, sb, result, count + 1);
            sb.setLength(length);
        }
    }


    public static List<String> restoreIpAddresses8(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        helper8(result, "", s, 0);
        return result;
    }
    
    public static void helper8(List<String> result, String cur, String s, int count) {
        if (count == 3 && isValidIPSegment8(s)) {
            result.add(cur + s);
            return;
        }
        for (int i = 1; i < 4 && i < s.length(); i++) {
            String segment = s.substring(0, i);
            if (isValidIPSegment8(segment)) {
                helper8(result, cur + segment + ".", s.substring(i), count + 1);
            }
        }
    }
    
    public static boolean isValidIPSegment8(String segment) {
        if (segment.charAt(0) == '0' && segment.length() > 1) {
            return false;
        }
        int num = Integer.parseInt(segment);
        return num >= 0 && num <= 255;
    }

    public static List<String> restoreIpAddresses9(String s) {
        List<String> result = new ArrayList<>();
        restoreIP9(s, result, "", 0, 0);
        return result;
    }

    private static void restoreIP9(String s, List<String> result, String current, int segCount, int startIndex) {
        if (segCount == 4 && startIndex == s.length()) {
            result.add(current);
        } else if (segCount == 4 || startIndex == s.length()) {
            return;
        }

        for (int i = 1; i <= 3 && startIndex + i <= s.length(); i++) {
            String segment = s.substring(startIndex, startIndex + i);
            if (isValidSegment9(segment)) {
                if (segCount == 3) {
                    restoreIP9(s, result, current + segment, segCount + 1, startIndex + i);
                } else {
                    restoreIP9(s, result, current + segment + ".", segCount + 1, startIndex + i);
                }
            }
        }
    }

    private static boolean isValidSegment9(String segment) {
        if (segment.length() > 0 && segment.length() <= 3 && !segment.startsWith("0") && Integer.parseInt(segment) <= 255) {
            return true;
        }
        return false;
    }



    public static List<String> restoreIpAddresses10(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() < 4 || s.length() > 12) {
            return result;
        }
        restore10(s, 0, "", result);
        return result;
    }

    private static void restore10(String s, int count, String current, List<String> result) {
        if (count == 3 && isValid10(s)) {
            result.add(current + s);
            return;
        }
        
        for (int i = 1; i < 4 && i < s.length(); i++) {
            String subString = s.substring(0, i);
            if (isValid10(subString)) {
                restore10(s.substring(i), count + 1, current + subString + ".", result);
            }
        }
    }

    private static boolean isValid10(String s) {
        if (s == null || s.length() > 3 || s.length() == 0 || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255) {
            return false;
        }
        return true;
    }




    public List<String> restoreIpAddresses11(String s) {
        List<String> result = new ArrayList<>();
        int n = s.length();

        for (int i = 1; i < 4 && i < n - 2; i++) {
            for (int j = i + 1; j < i + 4 && j < n - 1; j++) {
                for (int k = j + 1; k < j + 4 && k < n; k++) {
                    String s1 = s.substring(0, i);
                    String s2 = s.substring(i, j);
                    String s3 = s.substring(j, k);
                    String s4 = s.substring(k, n);

                    if (isValidIPPart11(s1) && isValidIPPart11(s2) &&
                            isValidIPPart11(s3) && isValidIPPart11(s4)) {
                        result.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    }
                }
            }
        }

        return result;
    }

    private boolean isValidIPPart11(String s) {
        if (s.length() > 3 || s.isEmpty() || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255) {
            return false;
        }
        return true;
    }


    public static List<String> restoreIpAddresses12(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        backtrack12(result, s, 0, new StringBuilder(), 0);
        return result;
    }

    private static void backtrack12(List<String> result, String s, int start, StringBuilder current, int segment) {
        if (start == s.length() && segment == 4) {
            result.add(current.toString());
            return;
        }
        if (segment == 4 || start == s.length()) {
            return;
        }
        for (int i = 1; i <= 3 && start + i <= s.length(); i++) {
            String segmentString = s.substring(start, start + i);
            if (isValidSegment12(segmentString)) {
                current.append(segmentString);
                if (segment < 3) {
                    current.append(".");
                }
                backtrack12(result, s, start + i, current, segment + 1);
                if (segment < 3) {
                    current.deleteCharAt(current.length() - 1);
                }
                current.delete(current.length() - segmentString.length(), current.length());
            }
        }
    }

    private static boolean isValidSegment12(String segment) {
        if (segment.length() > 1 && segment.charAt(0) == '0') {
            return false;
        }
        int num = Integer.parseInt(segment);
        return num >= 0 && num <= 255;
    }


    public static List<String> restoreIpAddresses13(String s) {
        List<String> result = new ArrayList<>();
        backtrack13(s, result, "", 0, 0);
        return result;
    }

    private static void backtrack13(String s, List<String> result, String current, int count, int index) {
        if (count == 4 && index == s.length()) {
            result.add(current);
            return;
        }

        if (count > 4 || index >= s.length()) {
            return;
        }

        if (current.length() > 0) {
            current += ".";
        }
        
        for (int i = 1; i <= 3 && index + i <= s.length(); i++) {
            String segment = s.substring(index, index + i);
            if (isValidSegment13(segment)) {
                backtrack13(s, result, current + segment, count + 1, index + i);
            }
        }
    }

    private static boolean isValidSegment13(String segment) {
        if (segment.length() > 1 && segment.charAt(0) == '0') {
            return false;
        }

        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }


    public static List<String> restoreIpAddresses14(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() > 12 || s.length() < 4) {
            return result;
        }
        backtrack14(result, new ArrayList<>(), s, 0);
        return result;
    }

    private static void backtrack14(List<String> result, List<String> tempList, String s, int start) {
        if (tempList.size() == 4) {
            if (start == s.length()) {
                result.add(String.join(".", tempList));
            }
            return;
        }
        for (int i = start; i < s.length() && i < start + 3; i++) {
            String substring = s.substring(start, i + 1);
            if (isValid14(substring)) {
                tempList.add(substring);
                backtrack14(result, tempList, s, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    private static boolean isValid14(String s) {
        if (s.startsWith("0") && s.length() > 1) {
            return false;
        }
        int num = Integer.parseInt(s);
        return num >= 0 && num <= 255;
    }


    public List<String> restoreIpAddresses15(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() < 4 || s.length() > 12) {
            return result;
        }
        restoreIpAddressesHelper15(s, 0, 0, "", result);
        return result;
    }

    private void restoreIpAddressesHelper(15String s, int start, int count, String current, List<String> result) {
        if (count == 4 && start == s.length()) {
            result.add(current);
        }
        if (count == 4 || start == s.length()) {
            return;
        }
        for (int i = 1; i <= 3 && start + i <= s.length(); i++) {
            String section = s.substring(start, start + i);
            if (isValidSection15(section)) {
                restoreIpAddressesHelper15(s, start + i, count + 1, current + (count == 0 ? "" : ".") + section, result);
            }
        }
    }

    private boolean isValidSection15(String section) {
        if (section.length() > 1 && section.charAt(0) == '0') {
            return false;
        }
        int value = Integer.parseInt(section);
        return value >= 0 && value <= 255;
    }

    public static List<String> restoreIpAddresses16(String s) {
        List<String> result = new ArrayList<>();
        dfs16(s, 0, "", result);
        return result;
    }

    public static void dfs16(String s, int idx, String curr, List<String> result) {
        if (idx == 4 || s.length() == 0) {
            if (idx == 4 && s.length() == 0) {
                result.add(curr.substring(1));
            }
            return;
        }

        for (int i = 1; i <= Math.min(3, s.length()); i++) {
            String part = s.substring(0, i);
            if (isValid16(part)) {
                dfs16(s.substring(i), idx + 1, curr + "." + part, result);
            }
        }
    }

    public static boolean isValid16(String s) {
        if (s.charAt(0) == '0') {
            return s.equals("0");
        }
        int num = Integer.parseInt(s);
        return num <= 255 && num > 0;
    }


    public static List<String> generateIPAddresses17(String s) {
        List<String> addresses = new ArrayList<>();
        backtrack17(s, addresses, 0, new StringBuffer());
        return addresses;
    }

    private static void backtrack17(String s, List<String> addresses, int count, StringBuffer ipAddress) {
        if (count == 4) {
            if (s.length() == 0) {
                addresses.add(ipAddress.toString());
            }
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (s.length() < i) {
                break;
            }

            String segment = s.substring(0, i);
            if (isValidSegment17(segment)) {
                if (count != 0) {
                    segment = "." + segment;
                }
                ipAddress.append(segment);

                backtrack17(s.substring(i), addresses, count + 1, ipAddress);

                ipAddress.delete(ipAddress.length() - segment.length(), ipAddress.length());
            }
        }
    }

    private static boolean isValidSegment17(String segment) {
        if (segment.length() > 1 && segment.charAt(0) == '0') {
            return false;
        }

        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }


    public List<String> restoreIpAddresses18(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        backtrack18(result, s, 0, "", 0);
        return result;
    }

    private void backtrack18(List<String> result, String s, int start, String current, int dotCount) {
        if (dotCount == 3) {
            String remaining = s.substring(start);
            if (isValidIpSegment18(remaining)) {
                result.add(current + remaining);
            }
            return;
        }
        for (int i = start; i < s.length() && i < start + 3; i++) {
            String segment = s.substring(start, i + 1);
            if (isValidIpSegment18(segment)) {
                backtrack18(result, s, i + 1, current + segment + ".", dotCount + 1);
            }
        }
    }

    private boolean isValidIpSegment18(String segment) {
        if (segment.length() > 3 || segment.isEmpty() || (segment.charAt(0) == '0' && segment.length() > 1) || Integer.parseInt(segment) > 255) {
            return false;
        }
        return true;
    }
}

