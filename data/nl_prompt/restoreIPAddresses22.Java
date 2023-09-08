
public class ValidIPAddress {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return res;
        }
        backtrack(s, 0, new StringBuilder(), res);
        return res;
    }

    private void backtrack(String s, int index, StringBuilder current, List<String> res) {
        if (index == s.length() && current.length() == s.length() + 3) {
            res.add(current.toString());
            return;
        }

        if (current.length() >= s.length() + 3) {
            return;
        }

        int len = current.length();
        if (index < s.length()) {
            current.append(s.charAt(index));
            backtrack(s, index + 1, current.append("."), res);
            current.setLength(len);
        }

        if (index + 1 < s.length() && s.charAt(index) != '0') {
            current.append(s.charAt(index)).append(s.charAt(index + 1));
            backtrack(s, index + 2, current.append("."), res);
            current.setLength(len);
        }

        if (index + 2 < s.length() && Integer.parseInt(s.substring(index, index + 3)) <= 255 && s.charAt(index) != '0') {
            current.append(s.charAt(index)).append(s.charAt(index + 1)).append(s.charAt(index + 2));
            backtrack(s, index + 3, current.append("."), res);
            current.setLength(len);
        }
    }
}

public class ValidIPAddresses {
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        int n = s.length();
        if (n < 4 || n > 12) {
            return result;
        }
        for (int i = 1; i < 4 && i < n - 2; i++) {
            for (int j = i + 1; j < i + 4 && j < n - 1; j++) {
                for (int k = j + 1; k < j + 4 && k < n; k++) {
                    String s1 = s.substring(0, i);
                    String s2 = s.substring(i, j);
                    String s3 = s.substring(j, k);
                    String s4 = s.substring(k);
                    if (isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)) {
                        result.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    }
                }
            }
        }
        return result;
    }
    private static boolean isValid(String s) {
        if (s.length() > 3 || s.isEmpty() || Integer.parseInt(s) > 255 || (s.charAt(0) == '0' && s.length() > 1)) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result = restoreIpAddresses(s);
        for (String ip : result) {
            System.out.println(ip);
        }
    }
}


public class IPAddressGenerator {

    public List<String> generateIPAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(result, s, new StringBuilder(), 0, 0);
        return result;
    }

    private void backtrack(List<String> result, String s, StringBuilder sb, int index, int count) {
        if (count > 4) {
            return;
        }

        if (count == 4 && index == s.length()) {
            result.add(sb.toString());
            return;
        }

        for (int i = 1; i < 4; i++) {
            if (index + i > s.length()) {
                break;
            }

            String segment = s.substring(index, index + i);
            if (isValidSegment(segment)) {
                if (count != 0) {
                    sb.append('.');
                }
                sb.append(segment);
                backtrack(result, s, sb, index + i, count + 1);
                sb.delete(sb.length() - segment.length() - (count == 0 ? 0 : 1), sb.length());
            }
        }
    }

    private boolean isValidSegment(String segment) {
        int num = Integer.parseInt(segment);
        if (segment.charAt(0) == '0' && segment.length() > 1) {
            return false;
        }
        return num >= 0 && num <= 255;
    }
}

public class IPAddressGenerator {

    public static List<String> generateValidIPAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(result, s, 0, new StringBuilder());
        return result;
    }
    
    private static void backtrack(List<String> result, String s, int index, StringBuilder ip) {
        if (index == 4 && ip.length() == s.length() + 4) {
            result.add(ip.substring(0, ip.length() - 1));
            return;
        }
        
        if (index == 4) {
            return;
        }
        
        for (int i = 1; i < 4; i++) {
            if (index + i > s.length()) {
                break;
            }
            
            String segment = s.substring(index, index + i);
            if (isValidSegment(segment)) {
                ip.append(segment).append(".");
                backtrack(result, s, index + i, ip);
                ip.setLength(ip.length() - segment.length() - 1);
            }
        }
    }
    
    private static boolean isValidSegment(String segment) {
        if (segment.charAt(0) == '0' && segment.length() > 1) {
            return false;
        }
        
        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }

    public static void main(String[] args) {
        String input = "19216811";
        List<String> validIPAddresses = generateValidIPAddresses(input);
        for (String ipAddress : validIPAddresses) {
            System.out.println(ipAddress);
        }
    }
}


class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int index, List<String> current, List<String> result) {
        if (index == s.length() && current.size() == 4) {
            result.add(String.join(".", current));
            return;
        }

        if (current.size() >= 4) {
            return;
        }

        for (int i = 1; i <= 3 && index + i <= s.length(); i++) {
            String section = s.substring(index, index + i);
            if (isValidSection(section)) {
                current.add(section);
                backtrack(s, index + i, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    private boolean isValidSection(String section) {
        if (section.length() > 1 && section.charAt(0) == '0') {
            return false;
        }
        int value = Integer.parseInt(section);
        return value >= 0 && value <= 255;
    }
}

public class ValidIPAddresses {

    public static List<String> validIPAddresses(String s) {
        List<String> result = new ArrayList<>();
        dfs(s, 0, "", result);
        return result;
    }

    public static void dfs(String s, int index, String current, List<String> result) {
        if (index == s.length() && countDots(current) == 3) {
            result.add(current);
            return;
        }
        if (index >= s.length() || countDots(current) > 3) {
            return;
        }
        dfs(s, index + 1, current + s.charAt(index), result);
        if (current.length() > 0 && current.charAt(current.length() - 1) != '0') {
            dfs(s, index + 1, current + "." + s.charAt(index), result);
        }
        if (current.length() > 1 && current.charAt(current.length() - 2) != '0' && isValidTwoDigits(s.substring(index - 1, index + 1))) {
            dfs(s, index + 1, current + "." + s.charAt(index), result);
        }
        if (current.length() > 2 && current.charAt(current.length() - 3) != '0' && isValidThreeDigits(s.substring(index - 2, index + 1))) {
            dfs(s, index + 1, current + "." + s.charAt(index), result);
        }
    }

    public static int countDots(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '.') {
                count++;
            }
        }
        return count;
    }

    public static boolean isValidTwoDigits(String s) {
        int num = Integer.parseInt(s);
        return num >= 10 && num <= 99;
    }

    public static boolean isValidThreeDigits(String s) {
        int num = Integer.parseInt(s);
        return num >= 100 && num <= 255;
    }

    public static void main(String[] args) {
        String s = "19216811";
        List<String> result = validIPAddresses(s);
        System.out.println(result);
    }
}

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() < 4 || s.length() > 12)
            return result;
        
        backtrack(s, result, new StringBuilder(), 0, 0);
        return result;
    }
    
    private void backtrack(String s, List<String> result, StringBuilder sb, int index, int count) {
        if (index == s.length() && count == 4) {
            result.add(sb.toString());
            return;
        }
        
        if (count > 3)
            return;
        
        int len = sb.length();
        for (int i = index; i < s.length() && i < index + 3; i++) {
            String segment = s.substring(index, i + 1);
            if (isValidSegment(segment)) {
                if (count < 3)
                    sb.append(segment).append(".");
                else
                    sb.append(segment);
                
                backtrack(s, result, sb, i + 1, count + 1);
                sb.setLength(len); // backtrack
            }
        }
    }
    
    private boolean isValidSegment(String segment) {
        if (segment.length() > 1 && segment.charAt(0) == '0')
            return false;
        
        int num = Integer.parseInt(segment);
        return num >= 0 && num <= 255;
    }
}

public class ValidIPAddresses {
    
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        backtrack(result, s, new StringBuilder(), 0, 0);
        return result;
    }
    
    private static void backtrack(List<String> result, String s, StringBuilder sb, int index, int count) {
        if (index == s.length() && count == 4) {
            result.add(sb.toString());
        } else if (count < 4) {
            for (int i = index; i < s.length() && i < index + 3; i++) {
                String substring = s.substring(index, i + 1);
                if (isValid(substring)) {
                    int length = sb.length();
                    if (count < 3) {
                        sb.append(substring).append(".");
                    } else {
                        sb.append(substring);
                    }
                    backtrack(result, s, sb, i + 1, count + 1);
                    sb.setLength(length);
                }
            }
        }
    }
    
    private static boolean isValid(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') {
            return false;
        }
        int num = Integer.parseInt(s);
        return num >= 0 && num <= 255;
    }
    
    public static void main(String[] args) {
        String s = "25525511135";
        List<String> validIPs = restoreIpAddresses(s);
        for (String ip : validIPs) {
            System.out.println(ip);
        }
    }
}

public class ValidIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(result, s, new StringBuilder(), 0, 0);
        return result;
    }

    private void backtrack(List<String> result, String s, StringBuilder sb, int start, int count) {
        if (count == 4 && start == s.length()) {
            result.add(sb.toString());
            return;
        }

        for (int i = start; i < s.length() && i < start + 3; i++) {
            String segment = s.substring(start, i + 1);
            if (isValidSegment(segment)) {
                if (count != 0) {
                    sb.append(".");
                }
                sb.append(segment);
                backtrack(result, s, sb, i + 1, count + 1);
                if (count != 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                sb.delete(sb.length() - segment.length(), sb.length());
            }
        }
    }

    private boolean isValidSegment(String segment) {
        if (segment.length() > 1 && segment.charAt(0) == '0') {
            return false;
        }

        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }
}


public class ValidIPAddress {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(result, s, "", 0, 0);
        return result;
    }

    private void backtrack(List<String> result, String s, String current, int index, int count) {
        if (index > s.length() || count > 4) return;
        if (index == s.length() && count == 4) {
            result.add(current.substring(0, current.length() - 1));
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (index + i > s.length()) break;
            String segment = s.substring(index, index + i);
            if (isValidSegment(segment)) {
                backtrack(result, s, current + segment + ".", index + i, count + 1);
            }
        }
    }

    private boolean isValidSegment(String segment) {
        if (segment.length() > 1 && segment.charAt(0) == '0') return false;
        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }
}


public class IPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        backtrack(result, s, 0, "", 0);
        return result;
    }

    private void backtrack(List<String> result, String s, int index, String current, int count) {
        if (count > 4) {
            return;
        }
        if (count == 4 && index == s.length()) {
            result.add(current);
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (index + i > s.length()) {
                break;
            }
            String substring = s.substring(index, index + i);
            if (isValid(substring)) {
                if (count == 3) {
                    backtrack(result, s, index + i, current + substring, count + 1);
                } else {
                    backtrack(result, s, index + i, current + substring + ".", count + 1);
                }
            }
        }
    }

    private boolean isValid(String s) {
        if (s.charAt(0) == '0' && s.length() > 1) {
            return false;
        }
        int num = Integer.parseInt(s);
        return num >= 0 && num <= 255;
    }
}

public class ValidIPAddresses {
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        dfs(s, 0, new StringBuilder(), result);
        return result;
    }
    
    private static void dfs(String s, int index, StringBuilder path, List<String> result) {
        if (index == s.length() && path.length() == s.length() + 3) {
            result.add(path.toString());
            return;
        }
        if (path.length() > s.length() + 3) {
            return;
        }
        for (int i = index; i < s.length(); i++) {
            String temp = s.substring(index, i + 1);
            if (isValid(temp)) {
                int len = path.length();
                if (path.length() != 0) {
                    path.append('.');
                }
                path.append(temp);
                dfs(s, i + 1, path, result);
                path.setLength(len);
            }
        }
    }
    
    private static boolean isValid(String s) {
        if (s.length() > 3 || s.length() == 0 || (s.charAt(0) == '0' && s.length() > 1)) {
            return false;
        }
        int num = Integer.parseInt(s);
        return num >= 0 && num <= 255;
    }
    
    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result = restoreIpAddresses(s);
        System.out.println(result);
    }
}


public class ValidIPAddresses {
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        dfs(s, "", result, 0);
        return result;
    }

    private static void dfs(String s, String current, List<String> result, int count) {
        if (count == 4 && s.isEmpty()) {
            result.add(current.substring(1));
            return;
        }
        if (count == 4 || s.isEmpty()) {
            return;
        }
        for (int i = 1; i <= Math.min(3, s.length()); i++) {
            String part = s.substring(0, i);
            if (isValid(part)) {
                dfs(s.substring(i), current + "." + part, result, count + 1);
            }
        }
    }

    private static boolean isValid(String part) {
        if (part.length() > 1 && part.charAt(0) == '0') {
            return false;
        }
        int value = Integer.parseInt(part);
        return value >= 0 && value <= 255;
    }

    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result = restoreIpAddresses(s);
        for (String ip : result) {
            System.out.println(ip);
        }
    }
}

public class IPAddressGenerator {

    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12)
            return result;
        generateIPAddresses(s, 0, new StringBuilder(), result);
        return result;
    }

    private void generateIPAddresses(String s, int dotCount, StringBuilder current, List<String> result) {
        if (dotCount == 3) {
            if (isValid(s)) {
                current.append(s);
                result.add(current.toString());
                current.delete(current.length() - s.length(), current.length());
            }
            return;
        }

        for (int i = 1; i <= 3 && i < s.length(); i++) {
            String currentSegment = s.substring(0, i);
            if (isValid(currentSegment)) {
                current.append(currentSegment).append(".");
                generateIPAddresses(s.substring(i), dotCount + 1, current, result);
                current.delete(current.length() - currentSegment.length() - 1, current.length());
            }
        }
    }

    private boolean isValid(String segment) {
        if (segment.length() > 3 || segment.isEmpty() || (segment.charAt(0) == '0' && segment.length() > 1) || Integer.parseInt(segment) > 255)
            return false;
        return true;
    }

    public static void main(String[] args) {
        IPAddressGenerator generator = new IPAddressGenerator();
        String s = "123456789";
        List<String> ipAddresses = generator.restoreIpAddresses(s);
        for (String ipAddress : ipAddresses) {
            System.out.println(ipAddress);
        }
    }
}

public class IPAddress {

    public static List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return res;
        }
        helper(s, "", res, 0);
        return res;
    }
    
    public static void helper(String s, String cur, List<String> res, int count) {
        if (count == 3 && isValid(s)) {
            res.add(cur + s);
            return;
        }
        for (int i = 1; i < 4 && i < s.length(); i++) {
            String sub = s.substring(0, i);
            if (isValid(sub)) {
                helper(s.substring(i), cur + sub + ".", res, count+1);
            }
        }
    }
    
    public static boolean isValid(String s) {
        if (s.charAt(0) == '0' && s.length() > 1) {
            return false;
        }
        int num = Integer.parseInt(s);
        return num >= 0 && num <= 255;
    }

    public static void main(String[] args) {
        String s = "010010";
        List<String> result = restoreIpAddresses(s);
        System.out.println(result);
    }
}


public class ValidIPAddresses {
    
    public static List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return res;
        }
        dfs(s, res, "", 0, 0);
        return res;
    }
    
    private static void dfs(String s, List<String> res, String ipAddress, int start, int depth) {
        if (depth == 4 && start == s.length()) {
            res.add(ipAddress);
            return;
        }
        if (depth == 4 || start == s.length()) {
            return;
        }
        for (int i = 1; i <= 3 && start + i <= s.length(); i++) {
            String current = s.substring(start, start + i);
            if (isValid(current)) {
                dfs(s, res, ipAddress + current + (depth == 3 ? "" : "."), start + i, depth + 1);
            }
        }
    }
    
    private static boolean isValid(String str) {
        if (str.charAt(0) == '0' && str.length() > 1) {
            return false;
        }
        int num = Integer.parseInt(str);
        return num >= 0 && num <= 255;
    }
    
    public static void main(String[] args) {
        String s = "1122334455";
        List<String> validIPs = restoreIpAddresses(s);
        for (String ipAddress : validIPs) {
            System.out.println(ipAddress);
        }
    }
}


class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12)
            return result;
        backtrack(result, s, new StringBuilder(), 0, 0);
        return result;
    }

    private void backtrack(List<String> result, String s, StringBuilder current, int index, int count) {
        // Base case: if we have reached the end of the string and have found 4 parts
        if (index == s.length() && count == 4) {
            result.add(current.toString());
            return;
        }

        // Try inserting a dot after the next 1, 2, or 3 digits
        for (int i = 1; i <= 3; i++) {
            if (index + i > s.length())
                break;
            String segment = s.substring(index, index + i);
            if (!isValid(segment))
                continue;

            int len = current.length();
            if (count > 0)
                current.append('.');
            current.append(segment);
            backtrack(result, s, current, index + i, count + 1);
            current.setLength(len);
            if (count > 0)
                current.setLength(len - 1);
        }
    }

    private boolean isValid(String segment) {
        if (segment.length() > 1 && segment.charAt(0) == '0')
            return false;
        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }
}

public class ValidIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        dfs(s, 0, new ArrayList<>(), res);
        return res;
    }

    private void dfs(String s, int start, List<String> curr, List<String> res) {
        if (curr.size() == 4 && start == s.length()) {
            res.add(String.join(".", curr));
            return;
        }
        if (curr.size() == 4 || start == s.length()) {
            return;
        }
        for (int len = 1; len <= 3 && start + len <= s.length(); len++) {
            String sub = s.substring(start, start + len);
            int val = Integer.parseInt(sub);
            if (val > 255 || (len > 1 && sub.charAt(0) == '0')) {
                break;
            }
            curr.add(sub);
            dfs(s, start + len, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}

public class ValidIPAddresses {
  
  public List<String> restoreIpAddresses(String s) {
    List<String> result = new ArrayList<>();
    backtrack(result, s, new StringBuilder(), 0, 0);
    return result;
  }
  
  private void backtrack(List<String> result, String s, StringBuilder current, int index, int count) {
    if (index == s.length() && count == 4) {
      result.add(current.toString());
      return;
    }
    
    if (count >= 4) {
      return;
    }
    
    for (int i = index; i < s.length() && i < index + 3; i++) {
      if (isValidSegment(s, index, i)) {
        current.append(s.substring(index, i + 1));
        if (count < 3) {
          current.append(".");
        }
        backtrack(result, s, current, i + 1, count + 1);
        if (count < 3) {
          current.setLength(current.length() - 1);
        }
        current.setLength(current.length() - (i + 1 - index));
      }
    }
  }
  
  private boolean isValidSegment(String s, int start, int end) {
    if (end - start >= 1 && s.charAt(start) == '0') {
      return false;
    }
    
    int segment = Integer.parseInt(s.substring(start, end + 1));
    return segment >= 0 && segment <= 255;
  }
  
  public static void main(String[] args) {
    ValidIPAddresses solution = new ValidIPAddresses();
    List<String> result = solution.restoreIpAddresses("25525511135");
    for (String ip : result) {
      System.out.println(ip);
    }
  }
}

public class ValidIPAddresses {
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        restoreIpAddressesHelper(s, 0, 0, "", result);
        return result;
    }

    private static void restoreIpAddressesHelper(String s, int start, int count, String current, List<String> result) {
        if (count > 4) {
            return;
        }
        if (count == 4 && start == s.length()) {
            result.add(current);
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if (start + i > s.length()) {
                break;
            }
            String section = s.substring(start, start + i);
            if ((section.startsWith("0") && section.length() > 1) || Integer.parseInt(section) > 255) {
                break;
            }
            String newCurrent = current.isEmpty() ? section : current + "." + section;
            restoreIpAddressesHelper(s, start + i, count + 1, newCurrent, result);
        }
    }

    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result = restoreIpAddresses(s);
        System.out.println(result);
    }
}

