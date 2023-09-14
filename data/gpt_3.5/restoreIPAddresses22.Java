
import java.util.ArrayList;
import java.util.List;

public class IPAddressGenerator {

    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();

        if (s.length() > 12 || s.length() < 4) {
            return result;
        }

        backtrack(result, s, 0, new ArrayList<>());

        return result;
    }

    private static void backtrack(List<String> result, String s, int start, List<String> current) {
        if (current.size() == 4 && start == s.length()) {
            result.add(String.join(".", current));
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (start + i > s.length()) {
                break;
            }

            String segment = s.substring(start, start + i);

            if (isValidSegment(segment)) {
                current.add(segment);
                backtrack(result, s, start + i, current);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean isValidSegment(String segment) {
        if (segment.length() > 1 && segment.startsWith("0")) {
            return false;
        }

        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }

    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result = restoreIpAddresses(s);

        System.out.println(result);
    }
}



import java.util.ArrayList;
import java.util.List;

public class IPAddresses {
    
    public static List<String> getAllValidIPAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, "", result);
        return result;
    }
    
    public static void backtrack(String s, int section, String current, List<String> result) {
        if (section == 4 && s.length() == 0) {
            result.add(current.substring(0, current.length() - 1));
            return;
        }
        if (section == 4 || s.length() == 0) {
            return;
        }
        
        for (int i = 1; i <= Math.min(3, s.length()); i++) {
            String sectionString = s.substring(0, i);
            if (!isValidSection(sectionString)) {
                continue;
            }
            backtrack(s.substring(i), section + 1, current + sectionString + ".", result);
        }
    }
    
    public static boolean isValidSection(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') {
            return false;
        }
        int section = Integer.parseInt(s);
        return section >= 0 && section <= 255;
    }
    
    public static void main(String[] args) {
        String s = "19216801";
        List<String> validIPAddresses = getAllValidIPAddresses(s);
        for (String ipAddress : validIPAddresses) {
            System.out.println(ipAddress);
        }
    }
    
}



import java.util.ArrayList;
import java.util.List;

public class IPAddress {

    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() > 12 || s.length() < 4)
            return result;
        dfs(result, s, "", 0);
        return result;
    }

    private static void dfs(List<String> result, String remaining, String ip, int count) {
        if (count == 3 && isValid(remaining)) {
            result.add(ip + remaining);
            return;
        }

        for (int i = 1; i < 4 && i < remaining.length(); i++) {
            String sub = remaining.substring(0, i);
            if (isValid(sub)) {
                dfs(result, remaining.substring(i), ip + sub + ".", count + 1);
            }
        }
    }

    private static boolean isValid(String s) {
        if (s.length() > 3 || s.length() == 0 || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255)
            return false;
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


    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result = restoreIpAddresses(s);
        System.out.println(result);
    }
    

import java.util.ArrayList;
import java.util.List;

public class IPAddressGenerator{
    public static List<String> generateIPAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        backtrack(result, s, "", 0, 0);
        return result;
    }
    
    private static void backtrack(List<String> result, String s, String current, int index, int dots) {
        if (index == s.length() && dots == 3) {
            result.add(current);
            return;
        }
        
        if (index >= s.length() || dots > 3) {
            return;
        }
        
        // case when IP address starts with 0
        if (s.charAt(index) == '0') {
            backtrack(result, s, current + "0.", index + 1, dots + 1);
            return;
        }
        
        // case when IP address has one digit
        for (int i = 1; i <= 3 && index + i <= s.length(); i++) {
            String substring = s.substring(index, index + i);
            if (isValidPart(substring)) {
                if (dots < 3) {
                    backtrack(result, s, current + substring + ".", index + i, dots + 1);
                } else {
                    backtrack(result, s, current + substring, index + i, dots + 1);
                }
            }
        }
    }
    
    private static boolean isValidPart(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') {
            return false;
        }
        int value = Integer.parseInt(s);
        return value >= 0 && value <= 255;
    }
    
    public static void main(String[] args) {
        String input = "25525511135";
        List<String> ipAddresses = generateIPAddresses(input);
        for (String ipAddress : ipAddresses) {
            System.out.println(ipAddress);
        }
    }
}


import java.util.ArrayList;
import java.util.List;

public class IPAddressGenerator {

    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        generateIPAddresses(s, "", 0, 0, result);
        return result;
    }

    private void generateIPAddresses(String s, String current, int index, int count, List<String> result) {
        if (count == 3 && isSegmentValid(s.substring(index))) {
            result.add(current + s.substring(index));
            return;
        }
        for (int i = 1; i <= 3 && index + i < s.length(); i++) {
            String segment = s.substring(index, index + i);
            if (isSegmentValid(segment)) {
                generateIPAddresses(s, current + segment + ".", index + i, count + 1, result);
            }
        }
    }

    private boolean isSegmentValid(String segment) {
        if (segment.length() > 1 && segment.startsWith("0")) {
            return false;
        }
        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }

    public static void main(String[] args) {
        IPAddressGenerator ipGenerator = new IPAddressGenerator();
        String s = "25525511135";
        List<String> validIPs = ipGenerator.restoreIpAddresses(s);
        for (String ip : validIPs) {
            System.out.println(ip);
        }
    }
}


import java.util.ArrayList;
import java.util.List;

public class IPAddressGenerator {

    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();

        if (s == null || s.isEmpty()) {
            return result;
        }

        backtrack(result, s, new StringBuilder(), 0, 0);

        return result;
    }

    private static void backtrack(List<String> result, String s, StringBuilder current, int start, int dotCount) {
        if (dotCount > 3) {
            return;
        }

        if (start == s.length() && dotCount == 3) {
            result.add(current.toString());
            return;
        }

        for (int i = start; i < s.length() && i < start + 3; i++) {
            String segment = s.substring(start, i + 1);
            if (isValidSegment(segment)) {
                int currentLength = current.length();
                if (currentLength != 0) {
                    current.append('.');
                }
                current.append(segment);
                backtrack(result, s, current, i + 1, dotCount + 1);
                current.setLength(currentLength);
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
        String s = "25525511135";
        List<String> result = restoreIpAddresses(s);
        System.out.println(result);
    }
}



import java.util.ArrayList;
import java.util.List;

public class IPAddressGenerator {
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        generateIPAddresses(s, 0, new StringBuilder(), result, 0);
        return result;
    }

    private static void generateIPAddresses(String s, int index, StringBuilder sb, List<String> result, int count) {
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
            generateIPAddresses(s, index + i, sb, result, count + 1);
            sb.setLength(length);
        }
    }

    public static void main(String[] args) {
        String s = "25525511135";
        List<String> ipAddresses = restoreIpAddresses(s);
        for (String ipAddress : ipAddresses) {
            System.out.println(ipAddress);
        }
    }
}


import java.util.ArrayList;
import java.util.List;

public class IPAddress {
    
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        helper(result, "", s, 0);
        return result;
    }
    
    public static void helper(List<String> result, String cur, String s, int count) {
        if (count == 3 && isValidIPSegment(s)) {
            result.add(cur + s);
            return;
        }
        for (int i = 1; i < 4 && i < s.length(); i++) {
            String segment = s.substring(0, i);
            if (isValidIPSegment(segment)) {
                helper(result, cur + segment + ".", s.substring(i), count + 1);
            }
        }
    }
    
    public static boolean isValidIPSegment(String segment) {
        if (segment.charAt(0) == '0' && segment.length() > 1) {
            return false;
        }
        int num = Integer.parseInt(segment);
        return num >= 0 && num <= 255;
    }
    
    public static void main(String[] args) {
        String s = "25525511135";
        List<String> ips = restoreIpAddresses(s);
        for (String ip : ips) {
            System.out.println(ip);
        }
    }
}



import java.util.ArrayList;
import java.util.List;

public class IPAddresses {
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        restoreIP(s, result, "", 0, 0);
        return result;
    }

    private static void restoreIP(String s, List<String> result, String current, int segCount, int startIndex) {
        if (segCount == 4 && startIndex == s.length()) {
            result.add(current);
        } else if (segCount == 4 || startIndex == s.length()) {
            return;
        }

        for (int i = 1; i <= 3 && startIndex + i <= s.length(); i++) {
            String segment = s.substring(startIndex, startIndex + i);
            if (isValidSegment(segment)) {
                if (segCount == 3) {
                    restoreIP(s, result, current + segment, segCount + 1, startIndex + i);
                } else {
                    restoreIP(s, result, current + segment + ".", segCount + 1, startIndex + i);
                }
            }
        }
    }

    private static boolean isValidSegment(String segment) {
        if (segment.length() > 0 && segment.length() <= 3 && !segment.startsWith("0") && Integer.parseInt(segment) <= 255) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result = restoreIpAddresses(s);
        System.out.println(result);
    }
}



import java.util.ArrayList;
import java.util.List;

public class IPAddress {

    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() < 4 || s.length() > 12) {
            return result;
        }
        restore(s, 0, "", result);
        return result;
    }

    private static void restore(String s, int count, String current, List<String> result) {
        if (count == 3 && isValid(s)) {
            result.add(current + s);
            return;
        }
        
        for (int i = 1; i < 4 && i < s.length(); i++) {
            String subString = s.substring(0, i);
            if (isValid(subString)) {
                restore(s.substring(i), count + 1, current + subString + ".", result);
            }
        }
    }

    private static boolean isValid(String s) {
        if (s == null || s.length() > 3 || s.length() == 0 || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result = restoreIpAddresses(s);
        System.out.println(result);
    }
}


import java.util.ArrayList;
import java.util.List;

public class IPAddress {

    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        int n = s.length();

        for (int i = 1; i < 4 && i < n - 2; i++) {
            for (int j = i + 1; j < i + 4 && j < n - 1; j++) {
                for (int k = j + 1; k < j + 4 && k < n; k++) {
                    String s1 = s.substring(0, i);
                    String s2 = s.substring(i, j);
                    String s3 = s.substring(j, k);
                    String s4 = s.substring(k, n);

                    if (isValidIPPart(s1) && isValidIPPart(s2) &&
                            isValidIPPart(s3) && isValidIPPart(s4)) {
                        result.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    }
                }
            }
        }

        return result;
    }

    private boolean isValidIPPart(String s) {
        if (s.length() > 3 || s.isEmpty() || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255) {
            return false;
        }
        return true;
    }
}


import java.util.ArrayList;
import java.util.List;

public class IPAddress {

    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        backtrack(result, s, 0, new StringBuilder(), 0);
        return result;
    }

    private static void backtrack(List<String> result, String s, int start, StringBuilder current, int segment) {
        if (start == s.length() && segment == 4) {
            result.add(current.toString());
            return;
        }
        if (segment == 4 || start == s.length()) {
            return;
        }
        for (int i = 1; i <= 3 && start + i <= s.length(); i++) {
            String segmentString = s.substring(start, start + i);
            if (isValidSegment(segmentString)) {
                current.append(segmentString);
                if (segment < 3) {
                    current.append(".");
                }
                backtrack(result, s, start + i, current, segment + 1);
                if (segment < 3) {
                    current.deleteCharAt(current.length() - 1);
                }
                current.delete(current.length() - segmentString.length(), current.length());
            }
        }
    }

    private static boolean isValidSegment(String segment) {
        if (segment.length() > 1 && segment.charAt(0) == '0') {
            return false;
        }
        int num = Integer.parseInt(segment);
        return num >= 0 && num <= 255;
    }

    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result = restoreIpAddresses(s);
        for (String ip : result) {
            System.out.println(ip);
        }
    }
}


import java.util.ArrayList;
import java.util.List;

public class IPAddressGenerator {
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, result, "", 0, 0);
        return result;
    }

    private static void backtrack(String s, List<String> result, String current, int count, int index) {
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
            if (isValidSegment(segment)) {
                backtrack(s, result, current + segment, count + 1, index + i);
            }
        }
    }

    private static boolean isValidSegment(String segment) {
        if (segment.length() > 1 && segment.charAt(0) == '0') {
            return false;
        }

        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }

    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result = restoreIpAddresses(s);
        System.out.println("Possible IP addresses: ");
        for (String ip : result) {
            System.out.println(ip);
        }
    }
}


import java.util.ArrayList;
import java.util.List;

public class IPAddresses {
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() > 12 || s.length() < 4) {
            return result;
        }
        backtrack(result, new ArrayList<>(), s, 0);
        return result;
    }

    private static void backtrack(List<String> result, List<String> tempList, String s, int start) {
        if (tempList.size() == 4) {
            if (start == s.length()) {
                result.add(String.join(".", tempList));
            }
            return;
        }
        for (int i = start; i < s.length() && i < start + 3; i++) {
            String substring = s.substring(start, i + 1);
            if (isValid(substring)) {
                tempList.add(substring);
                backtrack(result, tempList, s, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    private static boolean isValid(String s) {
        if (s.startsWith("0") && s.length() > 1) {
            return false;
        }
        int num = Integer.parseInt(s);
        return num >= 0 && num <= 255;
    }

    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result = restoreIpAddresses(s);
        for (String ip : result) {
            System.out.println(ip);
        }
    }
}


    public static void main(String[] args) {
        String s = "25525511135";
        List<String> ips = restoreIpAddresses(s);
        for (String ip : ips) {
            System.out.println(ip);
        }
    }
    

import java.util.ArrayList;
import java.util.List;

public class IPAddressForming {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() < 4 || s.length() > 12) {
            return result;
        }
        restoreIpAddressesHelper(s, 0, 0, "", result);
        return result;
    }

    private void restoreIpAddressesHelper(String s, int start, int count, String current, List<String> result) {
        if (count == 4 && start == s.length()) {
            result.add(current);
        }
        if (count == 4 || start == s.length()) {
            return;
        }
        for (int i = 1; i <= 3 && start + i <= s.length(); i++) {
            String section = s.substring(start, start + i);
            if (isValidSection(section)) {
                restoreIpAddressesHelper(s, start + i, count + 1, current + (count == 0 ? "" : ".") + section, result);
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

    public static void main(String[] args) {
        IPAddressForming ipAddressForming = new IPAddressForming();
        List<String> result = ipAddressForming.restoreIpAddresses("25525511135");
        for (String ip : result) {
            System.out.println(ip);
        }
    }
}


import java.util.List;
import java.util.ArrayList;

public class IPAddressCombinations {
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        dfs(s, 0, "", result);
        return result;
    }

    public static void dfs(String s, int idx, String curr, List<String> result) {
        if (idx == 4 || s.length() == 0) {
            if (idx == 4 && s.length() == 0) {
                result.add(curr.substring(1));
            }
            return;
        }

        for (int i = 1; i <= Math.min(3, s.length()); i++) {
            String part = s.substring(0, i);
            if (isValid(part)) {
                dfs(s.substring(i), idx + 1, curr + "." + part, result);
            }
        }
    }

    public static boolean isValid(String s) {
        if (s.charAt(0) == '0') {
            return s.equals("0");
        }
        int num = Integer.parseInt(s);
        return num <= 255 && num > 0;
    }

    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result = restoreIpAddresses(s);
        for (String ip : result) {
            System.out.println(ip);
        }
    }
}


import java.util.ArrayList;
import java.util.List;

public class IPAddressGenerator {

    public static List<String> generateIPAddresses(String s) {
        List<String> addresses = new ArrayList<>();
        backtrack(s, addresses, 0, new StringBuffer());
        return addresses;
    }

    private static void backtrack(String s, List<String> addresses, int count, StringBuffer ipAddress) {
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
            if (isValidSegment(segment)) {
                if (count != 0) {
                    segment = "." + segment;
                }
                ipAddress.append(segment);

                backtrack(s.substring(i), addresses, count + 1, ipAddress);

                ipAddress.delete(ipAddress.length() - segment.length(), ipAddress.length());
            }
        }
    }

    private static boolean isValidSegment(String segment) {
        if (segment.length() > 1 && segment.charAt(0) == '0') {
            return false;
        }

        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }

    public static void main(String[] args) {
        String s = "25525511135";
        List<String> addresses = generateIPAddresses(s);
        for (String address : addresses) {
            System.out.println(address);
        }
    }
}


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        backtrack(result, s, 0, "", 0);
        return result;
    }

    private void backtrack(List<String> result, String s, int start, String current, int dotCount) {
        if (dotCount == 3) {
            String remaining = s.substring(start);
            if (isValidIpSegment(remaining)) {
                result.add(current + remaining);
            }
            return;
        }
        for (int i = start; i < s.length() && i < start + 3; i++) {
            String segment = s.substring(start, i + 1);
            if (isValidIpSegment(segment)) {
                backtrack(result, s, i + 1, current + segment + ".", dotCount + 1);
            }
        }
    }

    private boolean isValidIpSegment(String segment) {
        if (segment.length() > 3 || segment.isEmpty() || (segment.charAt(0) == '0' && segment.length() > 1) || Integer.parseInt(segment) > 255) {
            return false;
        }
        return true;
    }
}

