
public class AdditiveNumber {
    public static boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long num1 = Long.parseLong(num.substring(0, i));
                long num2 = Long.parseLong(num.substring(i, j));
                if (isValidAdditiveNumber(num, num1, num2, j))
                    return true;
            }
        }
        return false;
    }

    private static boolean isValidAdditiveNumber(String num, long num1, long num2, int start) {
        if (start == num.length())
            return true;

        long sum = num1 + num2;
        String sumString = String.valueOf(sum);
        if (!num.startsWith(sumString, start))
            return false;

        return isValidAdditiveNumber(num, num2, sum, start + sumString.length());
    }

    public static void main(String[] args) {
        String num = "112358";
        System.out.println(isAdditiveNumber(num)); // Output: true
    }
}

public class AdditiveNumber {
    public static boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isValid(num, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValid(String num, int start, int mid, int end) {
        if ((num.charAt(start) == '0' && mid - start > 1) || (num.charAt(mid) == '0' && end - mid > 1)) {
            return false;
        }

        long num1 = Long.parseLong(num.substring(start, mid));
        long num2 = Long.parseLong(num.substring(mid, end));

        String sum = String.valueOf(num1 + num2);
        int sumLength = sum.length();

        if (end + sumLength > num.length()) {
            return false;
        }

        if (!sum.equals(num.substring(end, end + sumLength))) {
            return false;
        }

        if (end + sumLength == num.length()) {
            return true;
        }

        return isValid(num, mid, end, end + sumLength);
    }

    public static void main(String[] args) {
        String num1 = "112358";
        System.out.println(isAdditiveNumber(num1)); // Output: true

        String num2 = "199100199";
        System.out.println(isAdditiveNumber(num2)); // Output: true

        String num3 = "123";
        System.out.println(isAdditiveNumber(num3)); // Output: false
    }
}

public class AdditiveNumber {

    public static boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i <= n / 2; i++) {
            if (num.charAt(0) == '0' && i > 1) {
                break;
            }
            long firstNum = Long.parseLong(num.substring(0, i));
            for (int j = 1; Math.max(j, i) <= n - i - j; j++) {
                if (num.charAt(i) == '0' && j > 1) {
                    break;
                }
                long secondNum = Long.parseLong(num.substring(i, i + j));
                if (isValid(firstNum, secondNum, i + j, num)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValid(long firstNum, long secondNum, int start, String num) {
        if (start == num.length()) {
            return true;
        }
        long sum = firstNum + secondNum;
        String sumStr = String.valueOf(sum);
        if (!num.startsWith(sumStr, start)) {
            return false;
        }
        return isValid(secondNum, sum, start + sumStr.length(), num);
    }

    public static void main(String[] args) {
        String num = "112358";
        System.out.println(isAdditiveNumber(num));
    }
}

public class AdditiveNumber {
    public static boolean isAdditiveNumber(String num) {
        if (num == null || num.length() < 3) {
            return false;
        }
        for (int i = 1; i <= num.length() / 2; i++) {
            if (num.charAt(0) == '0' && i > 1) {
                break;
            }
            long firstNum = Long.parseLong(num.substring(0, i));
            for (int j = 1; Math.max(i, j) <= num.length() - i - j; j++) {
                if (num.charAt(i) == '0' && j > 1) {
                    break;
                }
                long secondNum = Long.parseLong(num.substring(i, i + j));
                if (isAdditive(num.substring(i + j), firstNum, secondNum)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean isAdditive(String num, long firstNum, long secondNum) {
        if (num.equals("")) {
            return true;
        }
        long sum = firstNum + secondNum;
        String sumStr = String.valueOf(sum);
        if (!num.startsWith(sumStr)) {
            return false;
        }
        return isAdditive(num.substring(sumStr.length()), secondNum, sum);
    }
}

public class AdditiveNumber {
    public static boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long num1 = Long.parseLong(num.substring(0, i));
                long num2 = Long.parseLong(num.substring(i, j));

                if (isAdditive(num.substring(j), num1, num2)) {
                    return true;
                }
                if (num.charAt(i) == '0') {
                    break;
                }
            }
            if (num.charAt(0) == '0') {
                break;
            }
        }
        return false;
    }

    private static boolean isAdditive(String num, long num1, long num2) {
        if (num.equals("")) {
            return true;
        }

        long sum = num1 + num2;
        String sumStr = Long.toString(sum);

        if (!num.startsWith(sumStr)) {
            return false;
        }

        return isAdditive(num.substring(sumStr.length()), num2, sum);
    }

    public static void main(String[] args) {
        String num = "112358";
        System.out.println(isAdditiveNumber(num));

        num = "199100199";
        System.out.println(isAdditiveNumber(num));

        num = "1023";
        System.out.println(isAdditiveNumber(num));
    }
}

public class AdditiveNumber {
    public static boolean isAdditiveNumber(String num) {
        if (num == null || num.length() < 3)
            return false;
        
        for (int i = 1; i <= num.length() / 2; i++) {
            if (num.charAt(0) == '0' && i > 1)
                break;
            
            long num1 = Long.parseLong(num.substring(0, i));
            
            for (int j = 1; Math.max(j, i) <= num.length() - i - j; j++) {
                if (num.charAt(i) == '0' && j > 1)
                    break;
                
                long num2 = Long.parseLong(num.substring(i, i + j));
                if (isAdditive(num.substring(i + j), num1, num2))
                    return true;
            }
        }
        
        return false;
    }
    
    private static boolean isAdditive(String num, long num1, long num2) {
        if (num.equals(""))
            return true;
        
        long sum = num1 + num2;
        String sumStr = String.valueOf(sum);
        if (!num.startsWith(sumStr))
            return false;
        
        return isAdditive(num.substring(sumStr.length()), num2, sum);
    }
    
    public static void main(String[] args) {
        String num = "1235813";
        System.out.println(isAdditiveNumber(num));
    }
}

public class AdditiveNumber {
    
    public static boolean isAdditiveNumber(String num) {
        for (int i = 1; i <= num.length() / 2; i++) {
            if (num.charAt(0) == '0' && i > 1) {
                break;
            }
            long first = Long.parseLong(num.substring(0, i));
            for (int j = 1; Math.max(i, j) <= num.length() - i - j; j++) {
                if (num.charAt(i) == '0' && j > 1) {
                    break;
                }
                long second = Long.parseLong(num.substring(i, i + j));
                if (isAdditive(i + j, first, second, num)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean isAdditive(int start, long first, long second, String num) {
        if (start == num.length()) {
            return true;
        }
        long sum = first + second;
        String sumStr = String.valueOf(sum);
        if (!num.startsWith(sumStr, start)) {
            return false;
        }
        return isAdditive(start + sumStr.length(), second, sum, num);
    }
    
    public static void main(String[] args) {
        System.out.println(isAdditiveNumber("112358")); // true
        System.out.println(isAdditiveNumber("199100199")); // true
        System.out.println(isAdditiveNumber("1023")); // false
        System.out.println(isAdditiveNumber("101")); // true
    }
}

public class AdditiveNumber {

    public static boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long num1 = Long.parseLong(num.substring(0, i));
                long num2 = Long.parseLong(num.substring(i, j));

                if (isAdditive(num, num1, num2, j)) {
                    return true;
                }
                if (num.charAt(i) == '0') {
                    break;
                }
            }
            if (num.charAt(0) == '0') {
                break;
            }
        }
        return false;
    }

    private static boolean isAdditive(String num, long num1, long num2, int start) {
        if (start == num.length()) {
            return true;
        }

        long sum = num1 + num2;
        String sumString = String.valueOf(sum);
        if (!num.startsWith(sumString, start)) {
            return false;
        }
        return isAdditive(num, num2, sum, start + sumString.length());
    }

    public static void main(String[] args) {
        String num = "123581321345589144";
        boolean result = isAdditiveNumber(num);
        System.out.println(result);
    }
}

public class AdditiveNumber {
    public boolean isAdditiveNumber(String num) {
        if (num == null || num.length() < 3) {
            return false;
        }
        for (int i = 1; i <= num.length() / 2; i++) {
            if (num.charAt(0) == '0' && i > 1) {
                return false;
            }
            long num1 = Long.parseLong(num.substring(0, i));
            for (int j = 1; Math.max(i, j) <= num.length() - i - j; j++) {
                if (num.charAt(i) == '0' && j > 1) {
                    break;
                }
                long num2 = Long.parseLong(num.substring(i, i + j));
                if (isValid(num.substring(i + j), num1, num2)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean isValid(String remaining, long num1, long num2) {
        if (remaining.equals("")) {
            return true;
        }
        long sum = num1 + num2;
        String sumString = String.valueOf(sum);
        if (!remaining.startsWith(sumString)) {
            return false;
        }
        return isValid(remaining.substring(sumString.length()), num2, sum);
    }
}

public class AdditiveNumber {
    public static boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long num1 = Long.parseLong(num.substring(0, i));
                long num2 = Long.parseLong(num.substring(i, j));
                if (isValid(num1, num2, num.substring(j))) {
                    return true;
                }
                if (num.charAt(i) == '0') {
                    break;
                }
            }
            if (num.charAt(0) == '0') {
                break;
            }
        }
        return false;
    }

    private static boolean isValid(long num1, long num2, String remaining) {
        if (remaining.equals("")) {
            return true;
        }
        long sum = num1 + num2;
        String sumStr = String.valueOf(sum);
        if (!remaining.startsWith(sumStr)) {
            return false;
        }
        return isValid(num2, sum, remaining.substring(sumStr.length()));
    }

    public static void main(String[] args) {
        System.out.println(isAdditiveNumber("112358")); // true
        System.out.println(isAdditiveNumber("199100199")); // true
        System.out.println(isAdditiveNumber("1023")); // false
    }
}

public class AdditiveNumber {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i <= n / 2; i++) {
            if (num.charAt(0) == '0' && i > 1) {
                return false;
            }
            long first = Long.parseLong(num.substring(0, i));
            for (int j = 1; Math.max(i, j) <= n - i - j; j++) {
                if (num.charAt(i) == '0' && j > 1) {
                    break;
                }
                long second = Long.parseLong(num.substring(i, i + j));
                if (isAdditive(num.substring(i + j), first, second)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean isAdditive(String num, long first, long second) {
        if (num.equals("")) {
            return true;
        }
        long sum = first + second;
        String sumStr = String.valueOf(sum);
        if (!num.startsWith(sumStr)) {
            return false;
        }
        return isAdditive(num.substring(sumStr.length()), second, sum);
    }
}

public class AdditiveNumber {
    
    public static boolean isAdditiveNumber(String num) {
        int n = num.length();
        
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String num1 = num.substring(0, i);
                String num2 = num.substring(i, j);
                
                if (isValidAdditiveNumber(num1, num2, num.substring(j))) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private static boolean isValidAdditiveNumber(String num1, String num2, String remaining) {
        if (remaining.length() == 0) {
            return true;
        }
        
        if (num1.length() > 1 && num1.charAt(0) == '0') {
            return false;
        }
        
        if (num2.length() > 1 && num2.charAt(0) == '0') {
            return false;
        }
        
        long n1 = Long.parseLong(num1);
        long n2 = Long.parseLong(num2);
        String sum = String.valueOf(n1 + n2);
        
        if (remaining.startsWith(sum)) {
            return isValidAdditiveNumber(num2, sum, remaining.substring(sum.length()));
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        String num = "112358";
        System.out.println(isAdditiveNumber(num)); // Output: true
        
        num = "199100";
        System.out.println(isAdditiveNumber(num)); // Output: true
        
        num = "1023";
        System.out.println(isAdditiveNumber(num)); // Output: false
        
        num = "123091238817082751921";
        System.out.println(isAdditiveNumber(num)); // Output: true
        
        num = "101";
        System.out.println(isAdditiveNumber(num)); // Output: false
    }
}

public class AdditiveNumber {

  public static boolean isAdditiveNumber(String num) {
    int n = num.length();
    for (int i = 1; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (checkAdditive(num, 0, i, j)) {
          return true;
        }
      }
    }
    return false;
  }

  private static boolean checkAdditive(String num, int start, int mid, int end) {
    if ((num.charAt(start) == '0' && mid - start > 1) || (num.charAt(mid) == '0' && end - mid > 1)) {
      return false;
    }
    String s1 = num.substring(start, mid);
    String s2 = num.substring(mid, end);
    String sum = addStrings(s1, s2);
    int sumLen = sum.length();
    if (end + sumLen > num.length() || !num.substring(end, end + sumLen).equals(sum)) {
      return false;
    }
    if (end + sumLen == num.length()) {
      return true;
    }
    return checkAdditive(num, mid, end, end + sumLen);
  }

  private static String addStrings(String s1, String s2) {
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    int i = s1.length() - 1;
    int j = s2.length() - 1;
    while (i >= 0 || j >= 0 || carry != 0) {
      int x = i >= 0 ? s1.charAt(i) - '0' : 0;
      int y = j >= 0 ? s2.charAt(j) - '0' : 0;
      int sum = x + y + carry;
      sb.append(sum % 10);
      carry = sum / 10;
      i--;
      j--;
    }
    return sb.reverse().toString();
  }

  public static void main(String[] args) {
    String num = "112358";
    System.out.println(isAdditiveNumber(num));

    num = "199100199";
    System.out.println(isAdditiveNumber(num));

    num = "102303";
    System.out.println(isAdditiveNumber(num));
  }
}

public class AdditiveNumber {
    public static boolean isAdditiveNumber(String num) {
        for (int i = 1; i <= num.length() / 2; i++) {
            if (num.charAt(0) == '0' && i > 1) { 
                break;
            }
            long num1 = Long.parseLong(num.substring(0, i)); 
            for (int j = i + 1; Math.max(i, j - i) <= num.length() - j; j++) {
                if (num.charAt(i) == '0' && j - i > 1) { 
                    break;
                }
                long num2 = Long.parseLong(num.substring(i, j)); 
                if (isValid(num.substring(j), num1, num2)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean isValid(String str, long num1, long num2) {
        if (str.equals("")) {
            return true;
        }
        long sum = num1 + num2;
        String sumStr = String.valueOf(sum);
        if (!str.startsWith(sumStr)) {
            return false;
        }
        return isValid(str.substring(sumStr.length()), num2, sum);
    }
    
    public static void main(String[] args) {
        String num = "112358";
        System.out.println(isAdditiveNumber(num));
    }
}

public class AdditiveNumber {

    public static boolean isAdditiveNumber(String num) {
        if (num == null || num.length() < 3) {
            return false;
        }
        for (int i = 1; i < num.length(); i++) {
            for (int j = i + 1; j < num.length(); j++) {
                String firstNum = num.substring(0, i);
                String secondNum = num.substring(i, j);
                if (isValidAdditiveSequence(num, firstNum, secondNum, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidAdditiveSequence(String num, String firstNum, String secondNum, int index) {
        if ((firstNum.length() > 1 && firstNum.charAt(0) == '0')
                || (secondNum.length() > 1 && secondNum.charAt(0) == '0')) {
            return false;
        }
        long num1 = Long.parseLong(firstNum);
        long num2 = Long.parseLong(secondNum);
        String sum = String.valueOf(num1 + num2);
        if (!num.substring(index).startsWith(sum)) {
            return false;
        }
        if (index + sum.length() == num.length()) {
            return true;
        }
        return isValidAdditiveSequence(num, secondNum, sum, index + sum.length());
    }

    public static void main(String[] args) {
        String num = "1235813";
        System.out.println(isAdditiveNumber(num));
    }
}

public class AdditiveNumber {
    public static boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i <= n / 2; i++) {
            if (num.charAt(0) == '0' && i > 1) {
                break;
            }
            long firstNum = Long.parseLong(num.substring(0, i));
            for (int j = 1; Math.max(i, j) <= n - i - j; j++) {
                if (num.charAt(i) == '0' && j > 1) {
                    break;
                }
                long secondNum = Long.parseLong(num.substring(i, i + j));
                if (isAdditive(num.substring(i + j), firstNum, secondNum)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean isAdditive(String str, long firstNum, long secondNum) {
        if (str.equals("")) {
            return true;
        }
        long sum = firstNum + secondNum;
        String sumStr = Long.toString(sum);
        if (!str.startsWith(sumStr)) {
            return false;
        }
        return isAdditive(str.substring(sumStr.length()), secondNum, sum);
    }
    
    public static void main(String[] args) {
        String num = "1235813";
        System.out.println(isAdditiveNumber(num)); // Output: true
    }
}
