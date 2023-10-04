
public class AdditiveNumber {
  public static boolean isAdditiveNumber1(String num) {
    return isAdditiveNumberHelper1(num, 0, 0, 0, 0);
  }

  private static boolean isAdditiveNumberHelper1(String num, int index, long sum, long prevNum, int count) {
    if (index == num.length()) {
      return count > 2;
    }
    
    long currNum = 0;
    for (int i = index; i < num.length(); i++) {
      currNum = currNum * 10 + (num.charAt(i) - '0');
      if (currNum < 0 || (num.charAt(index) == '0' && i > index)) {
        return false;
      }
      if (count < 2 || currNum == sum) {
        if (isAdditiveNumberHelper1(num, i + 1, prevNum + currNum, currNum, count + 1)) {
          return true;
        }
      }
      if (count >= 2 && currNum >= sum) {
        break;
      }
    }
    return false;
  }

    public static boolean isAdditiveNumber2(String num) {
        return isAdditiveHelper2(num, 0, 0, 0, 0);
    }

    private static boolean isAdditiveHelper2(String num, int start, long num1, long num2, int count) {
        if (start == num.length()) {
            return count > 2;
        }

        long currentNum = 0;
        for (int i = start; i < num.length(); i++) {
            currentNum = currentNum * 10 + (num.charAt(i) - '0');

            if (count < 2) {
                if (isAdditiveHelper2(num, i + 1, num2, currentNum, count + 1)) {
                    return true;
                }
            } else {
                if (currentNum == num1 + num2 && isAdditiveHelper2(num, i + 1, num2, currentNum, count + 1)) {
                    return true;
                }
            }

            if (num.charAt(start) == '0') {
                break;
            }
        }

        return false;
    }

  
  public static boolean isAdditiveNumber3(String num) {
    if(num.length() < 3) {
      return false;
    }
    return isAdditiveNumberHelper3(num, 0, 0, 0, 0);
  }
  
  public static boolean isAdditiveNumberHelper3(String num, int start, long num1, long num2, int count) {
    if(start == num.length()) {
      if(count >= 3) {
        return true;
      }
      return false;
    }
    
    for(int i = start; i < num.length(); i++) {
      if(num.charAt(start) == '0' && i > start) {
        break;
      }
      
      long currentNum = Long.parseLong(num.substring(start, i+1));
      
      if(count >= 2) {
        if(currentNum < num1 + num2) {
          continue;
        } else if (currentNum > num1 + num2) {
          break;
        }
      }
      
      if(isAdditiveNumberHelper3(num, i+1, num2, currentNum, count+1)) {
        return true;
      }
    }
    
    return false;
  }

    public static boolean isAdditiveNumber4(String num) {
        return isAdditiveHelper4(num, 0, 0, 0, 0);
    }
    
    public static boolean isAdditiveHelper4(String num, int index, long sum, long prev, int count) {
        if (index == num.length()) {
            return count >= 3;
        }
        
        long currNum = 0;
        for (int i = index; i < num.length(); i++) {
            if (i > index && num.charAt(index) == '0') {
                break;
            }
            
            currNum = currNum * 10 + num.charAt(i) - '0';
            if (count >= 2) {
                if (currNum < sum) {
                    continue;
                } else if (currNum > sum) {
                    break;
                }
            }
            
            if (isAdditiveHelper4(num, i + 1, prev + currNum, currNum, count + 1)) {
                return true;
            }
        }
        
        return false;
    }

    public static boolean isAdditiveNumber5(String num) {
        int n = num.length();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isValid5(num, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean isValid5(String num, int start, int mid, int end) {
        if (num.charAt(start) == '0' && mid - start > 1) {
            return false;
        }
        if (num.charAt(mid) == '0' && end - mid > 1) {
            return false;
        }
        String sum;
        long x1 = Long.parseLong(num.substring(start, mid));
        long x2 = Long.parseLong(num.substring(mid, end));
        for (int i = end; i < num.length(); i += sum.length()) {
            x2 = x1 + x2;
            x1 = x2 - x1;
            sum = String.valueOf(x2);
            if (!num.startsWith(sum, i)) {
                return false;
            }
        }
        return true;
    }

   public static boolean isAdditiveNumber6(String num) {
      return helper6(num, 0, 0, 0, 0);
   }
   
   private static boolean helper6(String num, int index, long sum, long prevNum, int count) {
      if(index == num.length()) {
         return count > 2;
      }
      
      long current = 0;
      for(int i=index; i<num.length(); i++) {
         if(i > index && num.charAt(index) == '0') {
            break;
         }
         
         current = current * 10 + (num.charAt(i) - '0');
         
         if(count >= 2) {
            if(current < sum) {
               continue;
            } else if(current > sum) {
               break;
            }
         }
         
         if(helper6(num, i + 1, prevNum + current, current, count + 1)) {
            return true;
         }
      }
      
      return false;
   }

    public static boolean isAdditiveNumber7(String num) {
        return isAdditiveNumberHelper7(num, 0, 0, 0, 0);
    }

    public static boolean isAdditiveNumberHelper7(String num, int index, long num1, long num2, int count) {
        if (index == num.length()) {
            if (count >= 3) {
                return true;
            } else {
                return false;
            }
        }

        for (int i = index; i < num.length(); i++) {
            if (num.charAt(index) == '0' && i != index) {
                break;
            }
            long currentNum = Long.parseLong(num.substring(index, i + 1));
            if (count >= 2) {
                if (currentNum > num1 + num2) {
                    break;
                } else if (currentNum < num1 + num2) {
                    continue;
                }
            }
            if (isAdditiveNumberHelper7(num, i + 1, num2, currentNum, count + 1)) {
                return true;
            }
        }
        return false;
    }


    public static boolean isAdditiveNumber8(String num) {
        int n = num.length();
        for (int i = 1; i <= n / 2; i++) {
            if (num.charAt(0) == '0' && i > 1) {
                continue;
            }
            BigInteger firstNum = new BigInteger(num.substring(0, i));
            for (int j = 1; Math.max(i, j) <= n - i - j; j++) {
                if (num.charAt(i) == '0' && j > 1) {
                    continue;
                }
                BigInteger secondNum = new BigInteger(num.substring(i, i + j));
                if (isValid8(num, i + j, firstNum, secondNum)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValid8(String num, int start, BigInteger firstNum, BigInteger secondNum) {
        if (start == num.length()) {
            return true;
        }
        BigInteger sum = firstNum.add(secondNum);
        String sumStr = sum.toString();
        if (!num.startsWith(sumStr, start)) {
            return false;
        }
        return isValid8(num, start + sumStr.length(), secondNum, sum);
    }


    public boolean isAdditiveNumber9(String num) {
        for (int i = 1; i < num.length(); i++) {
            for (int j = i + 1; j < num.length(); j++) {
                String num1 = num.substring(0, i);
                String num2 = num.substring(i, j);
                if (isValid9(num1) && isValid9(num2) && isAdditive9(num1, num2, num.substring(j))) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean isValid9(String num) {
        if (num.length() > 1 && num.charAt(0) == '0') {
            return false;
        }
        
        return true;
    }
    
    private boolean isAdditive9(String num1, String num2, String num) {
        if (num.length() < Math.max(num1.length(), num2.length())) {
            return false;
        }
        
        String sum = addStrings(num1, num2);
        if (num.startsWith(sum)) {
            if (num.equals(sum)) {
                return true;
            } else {
                return isAdditive9(num2, sum, num.substring(sum.length()));
            }
        }
        
        return false;
    }
    
    private String addStrings9(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        
        return sb.reverse().toString();
    }

    public static boolean isAdditiveNumber10(String num) {
        return backtrack10(num, 0, 0, 0, 0);
    }
    
    public static boolean backtrack10(String num, int index, long sum, long prev, int count) {
        if (index == num.length()) {
            return count > 2;
        }
        
        long currNum = 0;
        for (int i = index; i < num.length(); i++) {
            if (i > index && num.charAt(index) == '0') {
                break;
            }
            currNum = currNum * 10 + (num.charAt(i) - '0');
            
            if (count >= 2) {
                if (currNum < sum) {
                    continue;
                } else if (currNum > sum) {
                    break;
                }
            }
            
            if (backtrack10(num, i + 1, prev + currNum, currNum, count + 1)) {
                return true;
            }
        }
        
        return false;
    }
    

    public static boolean isAdditiveNumber11(String num) {
        return isAdditiveNumberHelper11(num, 0, 0, 0, 0);
    }

    private static boolean isAdditiveNumberHelper11(String num, int index, long num1, long num2, int count) {
        if (index == num.length()) {
            return count > 2;
        }
        
        for (int i = index; i < num.length(); i++) {
            if (num.charAt(index) == '0' && i > index) {
                break;
            }
            
            long currentNum = Long.parseLong(num.substring(index, i+1));
            
            if (count >= 2) {
                if (currentNum != num1 + num2) {
                    continue;
                }
            }
            
            if (isAdditiveNumberHelper11(num, i + 1, num2, currentNum, count + 1)) {
                return true;
            }
        }
        
        return false;
    }

    public static boolean isAdditive12(String num) {
        int n = num.length();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isValid12(i, j, num)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValid12(int i, int j, String num) {
        if (num.charAt(0) == '0' && i > 1) {
            return false;
        }
        if (num.charAt(i) == '0' && j - i > 1) {
            return false;
        }

        long num1 = Long.parseLong(num.substring(0, i));
        long num2 = Long.parseLong(num.substring(i, j));
        String remaining = num.substring(j);

        while (!remaining.isEmpty()) {
            long sum = num1 + num2;
            String sumString = String.valueOf(sum);
            if (!remaining.startsWith(sumString)) {
                return false;
            }
            remaining = remaining.substring(sumString.length());
            num1 = num2;
            num2 = sum;
        }

        return true;
    }

  public static boolean isAdditiveNumber13(String num) {
    int n = num.length();
    for (int i = 1; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        long first = Long.parseLong(num.substring(0, i));
        long second = Long.parseLong(num.substring(i, j));
        
        if (isValidAdditive13(num, j, first, second)) {
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
  
  private static boolean isValidAdditive13(String num, int start, long first, long second) {
    if (start == num.length()) {
      return true;
    }
    
    long sum = first + second;
    String sumString = String.valueOf(sum);
    if (!num.startsWith(sumString, start)) {
      return false;
    }
    
    return isValidAdditive13(num, start + sumString.length(), second, sum);
  }
  

    public static boolean isAdditiveNumber14(String num) {
        int n = num.length();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (validate14(num, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean validate14(String num, int start, int second, int third) {
        if ((num.charAt(start) == '0' && second - start > 1) ||
            (num.charAt(second) == '0' && third - second > 1)) {
            return false;
        }
        
        long firstNum = Long.parseLong(num.substring(start, second));
        long secondNum = Long.parseLong(num.substring(second, third));
        
        String sum = String.valueOf(firstNum + secondNum);
        int sumLen = sum.length();
        
        if (third + sumLen > num.length() || !num.substring(third, third + sumLen).equals(sum)) {
            return false;
        }
        
        if (third + sumLen == num.length()) {
            return true;
        }
        
        return validate14(num, second, third, third + sumLen);
    }

    public static boolean isAdditiveNumber15(String num) {
        return isAdditiveNumber15(num, 0, 0, 0, 0);
    }
    
    private static boolean isAdditiveNumber15(String num, int start, long num1, long num2, int count) {
        if (start == num.length()) {
            return count >= 3;
        }
        
        for (int i = start; i < num.length(); i++) {
            if (num.charAt(start) == '0' && i > start) {
                break;
            }
            
            long current = Long.parseLong(num.substring(start, i + 1));
            
            if (count >= 2 && current != num1 + num2) {
                continue;
            }
            
            if (isAdditiveNumber15(num, i + 1, num2, current, count + 1)) {
                return true;
            }
        }
        
        return false;
    }

    public static boolean isAdditiveNumber16(String num) {
        int n = num.length();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String s1 = num.substring(0, i);
                String s2 = num.substring(i, j);
                
                if (isValid16(s1, s2, j, num)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static boolean isValid16(String s1, String s2, int start, String num) {
        if ((s1.length() > 1 && s1.charAt(0) == '0') || (s2.length() > 1 && s2.charAt(0) == '0')) {
            return false;
        }
        
        String sum;
        long num1 = Long.parseLong(s1);
        long num2 = Long.parseLong(s2);
        int n = num.length();
        
        for (int i = start; i < n; i += sum.length()) {
            
            num2 = num1 + num2;
            num1 = num2 - num1;
            sum = String.valueOf(num2);
            
            if (!num.startsWith(sum, i)) {
                return false;
            }
        }
        
        return true;
    }

    public boolean isAdditiveNumber17(String num) {
        int n = num.length();
        for (int i = 1; i <= n / 2; i++) {
            if (num.charAt(0) == '0' && i > 1) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (num.charAt(i) == '0' && j - i > 1) {
                    continue;
                }
                long num1 = Long.parseLong(num.substring(0, i));
                long num2 = Long.parseLong(num.substring(i, j));
                if (isAdditive17(num.substring(j), num1, num2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isAdditive17(String num, long num1, long num2) {
        if (num.equals("")) {
            return true;
        }
        long sum = num1 + num2;
        String sumStr = String.valueOf(sum);
        if (!num.startsWith(sumStr)) {
            return false;
        }
        return isAdditive17(num.substring(sumStr.length()), num2, sum);
    }

   public static boolean isAdditiveNumber18(String num) {
       return isAdditiveNumber18(num, 0, new ArrayList<>());
   }

   private static boolean isAdditiveNumber18(String num, int start, List<Long> sequence) {
       if (start == num.length()) {
           return sequence.size() >= 3;
       }

       for (int i = start; i < num.length(); i++) {
           String str = num.substring(start, i + 1);
           if (str.length() > 1 && str.startsWith("0")) {
               break;
           }
           long numValue = Long.parseLong(str);

           int sequenceSize = sequence.size();
           if (sequenceSize >= 2) {
               long sum = sequence.get(sequenceSize - 1) + sequence.get(sequenceSize - 2);
               if (numValue > sum) {
                   break;
               } else if (numValue < sum) {
                   continue;
               }
           }

           sequence.add(numValue);
           if (isAdditiveNumber18(num, i + 1, sequence)) {
               return true;
           }
           sequence.remove(sequence.size() - 1);
       }

       return false;
   }

    public static boolean isAdditiveNumber19(String num) {
        if (num == null) {
            return false;
        }
        int n = num.length();

        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; Math.max(i, j) <= n - i - j; j++) {
                if (isAdditive19(num, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isAdditive19(String num, int i, int j) {
        if (num.charAt(0) == '0' && i > 1) {
            return false;
        }
        if (num.charAt(i) == '0' && j > 1) {
            return false;
        }
        Long x1 = Long.parseLong(num.substring(0, i));
        Long x2 = Long.parseLong(num.substring(i, i + j));

        String sum;
        for (int start = i + j; start != num.length(); start += sum.length()) {
            x2 = x2 + x1;
            x1 = x2 - x1;
            sum = x2.toString();
            if (!num.startsWith(sum, start)) {
                return false;
            }
        }
        return true;
    }


    public static boolean isAdditiveNumber20(String num) {
        return dfs(num, 0, 0, 0, 0);
    }
    
    private static boolean dfs20(String num, int index, long sum, long prev, int count) {
        if (index == num.length()) {
            return count > 2;
        }
        for (int i = index; i < num.length(); i++) {
            if (i > index && num.charAt(index) == '0') {
                break;
            }
            long curr = Long.parseLong(num.substring(index, i + 1));
            if (count >= 2 && curr != sum) {
                continue;
            }
            if (dfs20(num, i + 1, prev + curr, curr, count + 1)) {
                return true;
            }
        }
        return false;
    }
}

