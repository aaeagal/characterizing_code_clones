
public class AdditiveNumber {
  public static boolean isAdditiveNumber1(String num) {
    return isAdditiveNumberHelper1(num, 0, 0, 0, 0);
  }

  private static boolean isAdditiveNumberHelper1(String num, int index, long sum, long prevNum, int count) { // 1
    if (index == num.length()) { // 2
      return count > 2;
    }

    long currNum = 0; // 3
    for (int i = index; i < num.length(); i++) { // 4
      currNum = currNum * 10 + (num.charAt(i) - '0'); // 5
      if (currNum < 0 || (num.charAt(index) == '0' && i > index)) { // 6
        return false;
      }
      if (count < 2 || currNum == sum) { // 7
        if (isAdditiveNumberHelper1(num, i + 1, prevNum + currNum, currNum, count + 1)) { // 8
          return true;
        }
      }
      if (count >= 2 && currNum >= sum) { // 9
        break; // 10
      }
    }
    return false;
  }

    public static boolean isAdditiveNumber2(String num) {
        return isAdditiveHelper2(num, 0, 0, 0, 0);
    }

    private static boolean isAdditiveHelper2(String num, int start, long num1, long num2, int count) { // 11
        if (start == num.length()) { // 12
            return count > 2;
        }

        long currentNum = 0; // 13
        for (int i = start; i < num.length(); i++) { // 14
            currentNum = currentNum * 10 + (num.charAt(i) - '0'); // 15

            if (count < 2) { // 16
                if (isAdditiveHelper2(num, i + 1, num2, currentNum, count + 1)) { // 17
                    return true;
                }
            } else { // 18
                if (currentNum == num1 + num2 && isAdditiveHelper2(num, i + 1, num2, currentNum, count + 1)) { // 19
                    return true;
                }
            }

            if (num.charAt(start) == '0') { // 20
                break; // 21
            }
        }

        return false;
    }


  public static boolean isAdditiveNumber3(String num) {
    if(num.length() < 3) { // 22
      return false;
    }
    return isAdditiveNumberHelper3(num, 0, 0, 0, 0);
  }

  public static boolean isAdditiveNumberHelper3(String num, int start, long num1, long num2, int count) {
    if(start == num.length()) { // 23
      if(count >= 3) { // 24
        return true;
      }
      return false;
    }

    for(int i = start; i < num.length(); i++) { // 25
      if(num.charAt(start) == '0' && i > start) { // 26
        break; // 27
      }

      long currentNum = Long.parseLong(num.substring(start, i+1)); // 28

      if(count >= 2) { // 29
        if(currentNum < num1 + num2) { // 30
          continue; // 31
        } else if (currentNum > num1 + num2) { // 32
          break; // 33
        }
      }

      if(isAdditiveNumberHelper3(num, i+1, num2, currentNum, count+1)) { // 34
        return true;
      }
    }

    return false;
  }

    public static boolean isAdditiveNumber4(String num) {
        return isAdditiveHelper4(num, 0, 0, 0, 0);
    }

    public static boolean isAdditiveHelper4(String num, int index, long sum, long prev, int count) {
        if (index == num.length()) { // 35
            return count >= 3;
        }

        long currNum = 0; // 36
        for (int i = index; i < num.length(); i++) { // 37
            if (i > index && num.charAt(index) == '0') { // 38
                break; // 39
            }

            currNum = currNum * 10 + num.charAt(i) - '0'; // 40
            if (count >= 2) { // 41
                if (currNum < sum) { // 42
                    continue; // 43
                } else if (currNum > sum) { // 44
                    break; // 45
                }
            }

            if (isAdditiveHelper4(num, i + 1, prev + currNum, currNum, count + 1)) { // 46
                return true;
            }
        }

        return false;
    }

    public static boolean isAdditiveNumber5(String num) {
        int n = num.length(); // 47
        for (int i = 1; i < n; i++) { // 48
            for (int j = i + 1; j < n; j++) { // 49
                if (isValid5(num, 0, i, j)) { // 50
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValid5(String num, int start, int mid, int end) { // 51
        if (num.charAt(start) == '0' && mid - start > 1) { // 52
            return false;
        }
        if (num.charAt(mid) == '0' && end - mid > 1) { // 53
            return false;
        }
        String sum; // 54
        long x1 = Long.parseLong(num.substring(start, mid)); // 55
        long x2 = Long.parseLong(num.substring(mid, end)); // 56
        for (int i = end; i < num.length(); i += sum.length()) { // 57
            x2 = x1 + x2; // 58
            x1 = x2 - x1; // 59
            sum = String.valueOf(x2); // 60
            if (!num.startsWith(sum, i)) { // 61
                return false;
            }
        }
        return true;
    }

   public static boolean isAdditiveNumber6(String num) {
      return helper6(num, 0, 0, 0, 0);
   }

   private static boolean helper6(String num, int index, long sum, long prevNum, int count) { // 62
      if(index == num.length()) { // 63
         return count > 2;
      }

      long current = 0; // 64
      for(int i=index; i<num.length(); i++) { // 65
         if(i > index && num.charAt(index) == '0') { // 66
            break; // 67
         }

         current = current * 10 + (num.charAt(i) - '0'); // 68

         if(count >= 2) { // 69
            if(current < sum) { // 70
               continue; // 71
            } else if(current > sum) { // 72
               break; // 73
            }
         }

         if(helper6(num, i + 1, prevNum + current, current, count + 1)) { // 74
            return true;
         }
      }

      return false;
   }

    public static boolean isAdditiveNumber7(String num) {
        return isAdditiveNumberHelper7(num, 0, 0, 0, 0);
    }

    public static boolean isAdditiveNumberHelper7(String num, int index, long num1, long num2, int count) {
        if (index == num.length()) { // 75
            if (count >= 3) { // 76
                return true;
            } else { // 77
                return false;
            }
        }

        for (int i = index; i < num.length(); i++) { // 78
            if (num.charAt(index) == '0' && i != index) { // 79
                break; // 80
            }
            long currentNum = Long.parseLong(num.substring(index, i + 1)); // 81
            if (count >= 2) { // 82
                if (currentNum > num1 + num2) { // 83
                    break; // 84
                } else if (currentNum < num1 + num2) { // 85
                    continue; // 86
                }
            }
            if (isAdditiveNumberHelper7(num, i + 1, num2, currentNum, count + 1)) { // 87
                return true;
            }
        }
        return false;
    }


    public static boolean isAdditiveNumber8(String num) {
        int n = num.length(); // 88
        for (int i = 1; i <= n / 2; i++) { // 89
            if (num.charAt(0) == '0' && i > 1) { // 90
                continue; // 91
            }
            BigInteger firstNum = new BigInteger(num.substring(0, i)); // 92
            for (int j = 1; Math.max(i, j) <= n - i - j; j++) { // 93
                if (num.charAt(i) == '0' && j > 1) { // 94
                    continue; // 95
                }
                BigInteger secondNum = new BigInteger(num.substring(i, i + j)); // 96
                if (isValid8(num, i + j, firstNum, secondNum)) { // 97
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValid8(String num, int start, BigInteger firstNum, BigInteger secondNum) { // 98
        if (start == num.length()) { // 99
            return true;
        }
        BigInteger sum = firstNum.add(secondNum); // 100
        String sumStr = sum.toString(); // 101
        if (!num.startsWith(sumStr, start)) { // 102
            return false;
        }
        return isValid8(num, start + sumStr.length(), secondNum, sum);
    }


    public boolean isAdditiveNumber9(String num) {
        for (int i = 1; i < num.length(); i++) { // 103
            for (int j = i + 1; j < num.length(); j++) { // 104
                String num1 = num.substring(0, i); // 105
                String num2 = num.substring(i, j); // 106
                if (isValid9(num1) && isValid9(num2) && isAdditive9(num1, num2, num.substring(j))) { // 107
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isValid9(String num) { // 108
        if (num.length() > 1 && num.charAt(0) == '0') { // 109
            return false;
        }

        return true;
    }

    private boolean isAdditive9(String num1, String num2, String num) { // 110
        if (num.length() < Math.max(num1.length(), num2.length())) { // 111
            return false;
        }

        String sum = addStrings(num1, num2); // 112
        if (num.startsWith(sum)) { // 113
            if (num.equals(sum)) { // 114
                return true;
            } else { // 115
                return isAdditive9(num2, sum, num.substring(sum.length()));
            }
        }

        return false;
    }

    private String addStrings9(String num1, String num2) { // 116
        StringBuilder sb = new StringBuilder(); // 117
        int carry = 0; // 118
        int i = num1.length() - 1; // 119
        int j = num2.length() - 1; // 120

        while (i >= 0 || j >= 0 || carry != 0) { // 121
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0; // 122
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0; // 123
            int sum = digit1 + digit2 + carry; // 124
            sb.append(sum % 10); // 125
            carry = sum / 10; // 126
            i--; // 127
            j--; // 128
        }

        return sb.reverse().toString();
    }

    public static boolean isAdditiveNumber10(String num) {
        return backtrack10(num, 0, 0, 0, 0);
    }

    public static boolean backtrack10(String num, int index, long sum, long prev, int count) {
        if (index == num.length()) { // 129
            return count > 2;
        }

        long currNum = 0; // 130
        for (int i = index; i < num.length(); i++) { // 131
            if (i > index && num.charAt(index) == '0') { // 132
                break; // 133
            }
            currNum = currNum * 10 + (num.charAt(i) - '0'); // 134

            if (count >= 2) { // 135
                if (currNum < sum) { // 136
                    continue; // 137
                } else if (currNum > sum) { // 138
                    break; // 139
                }
            }

            if (backtrack10(num, i + 1, prev + currNum, currNum, count + 1)) { // 140
                return true;
            }
        }

        return false;
    }


    public static boolean isAdditiveNumber11(String num) {
        return isAdditiveNumberHelper11(num, 0, 0, 0, 0);
    }

    private static boolean isAdditiveNumberHelper11(String num, int index, long num1, long num2, int count) { // 141
        if (index == num.length()) { // 142
            return count > 2;
        }

        for (int i = index; i < num.length(); i++) { // 143
            if (num.charAt(index) == '0' && i > index) { // 144
                break; // 145
            }

            long currentNum = Long.parseLong(num.substring(index, i+1)); // 146

            if (count >= 2) { // 147
                if (currentNum != num1 + num2) { // 148
                    continue; // 149
                }
            }

            if (isAdditiveNumberHelper11(num, i + 1, num2, currentNum, count + 1)) { // 150
                return true;
            }
        }

        return false;
    }

    public static boolean isAdditive12(String num) {
        int n = num.length(); // 151
        for (int i = 1; i < n; i++) { // 152
            for (int j = i + 1; j < n; j++) { // 153
                if (isValid12(i, j, num)) { // 154
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValid12(int i, int j, String num) { // 155
        if (num.charAt(0) == '0' && i > 1) { // 156
            return false;
        }
        if (num.charAt(i) == '0' && j - i > 1) { // 157
            return false;
        }

        long num1 = Long.parseLong(num.substring(0, i)); // 158
        long num2 = Long.parseLong(num.substring(i, j)); // 159
        String remaining = num.substring(j); // 160

        while (!remaining.isEmpty()) { // 161
            long sum = num1 + num2; // 162
            String sumString = String.valueOf(sum); // 163
            if (!remaining.startsWith(sumString)) { // 164
                return false;
            }
            remaining = remaining.substring(sumString.length()); // 165
            num1 = num2; // 166
            num2 = sum; // 167
        }

        return true;
    }

  public static boolean isAdditiveNumber13(String num) {
    int n = num.length(); // 168
    for (int i = 1; i < n; i++) { // 169
      for (int j = i + 1; j < n; j++) { // 170
        long first = Long.parseLong(num.substring(0, i)); // 171
        long second = Long.parseLong(num.substring(i, j)); // 172

        if (isValidAdditive13(num, j, first, second)) { // 173
          return true;
        }

        if (num.charAt(i) == '0') { // 174
          break; // 175
        }
      }

      if (num.charAt(0) == '0') { // 176
        break; // 177
      }
    }

    return false;
  }

  private static boolean isValidAdditive13(String num, int start, long first, long second) { // 178
    if (start == num.length()) { // 179
      return true;
    }

    long sum = first + second; // 180
    String sumString = String.valueOf(sum); // 181
    if (!num.startsWith(sumString, start)) { // 182
      return false;
    }

    return isValidAdditive13(num, start + sumString.length(), second, sum);
  }


    public static boolean isAdditiveNumber14(String num) {
        int n = num.length(); // 183
        for (int i = 1; i < n; i++) { // 184
            for (int j = i + 1; j < n; j++) { // 185
                if (validate14(num, 0, i, j)) { // 186
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean validate14(String num, int start, int second, int third) { // 187
        if ((num.charAt(start) == '0' && second - start > 1) || // 188
            (num.charAt(second) == '0' && third - second > 1)) { // 189
            return false;
        }

        long firstNum = Long.parseLong(num.substring(start, second)); // 190
        long secondNum = Long.parseLong(num.substring(second, third)); // 191

        String sum = String.valueOf(firstNum + secondNum); // 192
        int sumLen = sum.length(); // 193

        if (third + sumLen > num.length() || !num.substring(third, third + sumLen).equals(sum)) { // 194
            return false;
        }

        if (third + sumLen == num.length()) { // 195
            return true;
        }

        return validate14(num, second, third, third + sumLen);
    }

    public static boolean isAdditiveNumber15(String num) {
        return isAdditiveNumber15(num, 0, 0, 0, 0);
    }

    private static boolean isAdditiveNumber15(String num, int start, long num1, long num2, int count) { // 196
        if (start == num.length()) { // 197
            return count >= 3;
        }

        for (int i = start; i < num.length(); i++) { // 198
            if (num.charAt(start) == '0' && i > start) { // 199
                break; // 200
            }

            long current = Long.parseLong(num.substring(start, i + 1)); // 201

            if (count >= 2 && current != num1 + num2) { // 202
                continue; // 203
            }

            if (isAdditiveNumber15(num, i + 1, num2, current, count + 1)) { // 204
                return true;
            }
        }

        return false;
    }

    public static boolean isAdditiveNumber16(String num) {
        int n = num.length(); // 205
        for (int i = 1; i < n; i++) { // 206
            for (int j = i + 1; j < n; j++) { // 207
                String s1 = num.substring(0, i); // 208
                String s2 = num.substring(i, j); // 209

                if (isValid16(s1, s2, j, num)) { // 210
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isValid16(String s1, String s2, int start, String num) {
        if ((s1.length() > 1 && s1.charAt(0) == '0') || (s2.length() > 1 && s2.charAt(0) == '0')) { // 211
            return false;
        }

        String sum; // 212
        long num1 = Long.parseLong(s1); // 213
        long num2 = Long.parseLong(s2); // 214
        int n = num.length(); // 215

        for (int i = start; i < n; i += sum.length()) { // 216

            num2 = num1 + num2; // 217
            num1 = num2 - num1; // 218
            sum = String.valueOf(num2); // 219

            if (!num.startsWith(sum, i)) { // 220
                return false;
            }
        }

        return true;
    }

    public boolean isAdditiveNumber17(String num) {
        int n = num.length(); // 221
        for (int i = 1; i <= n / 2; i++) { // 222
            if (num.charAt(0) == '0' && i > 1) { // 223
                continue; // 224
            }
            for (int j = i + 1; j < n; j++) { // 225
                if (num.charAt(i) == '0' && j - i > 1) { // 226
                    continue; // 227
                }
                long num1 = Long.parseLong(num.substring(0, i)); // 228
                long num2 = Long.parseLong(num.substring(i, j)); // 229
                if (isAdditive17(num.substring(j), num1, num2)) { // 230
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isAdditive17(String num, long num1, long num2) { // 231
        if (num.equals("")) { // 232
            return true;
        }
        long sum = num1 + num2; // 233
        String sumStr = String.valueOf(sum); // 234
        if (!num.startsWith(sumStr)) { // 235
            return false;
        }
        return isAdditive17(num.substring(sumStr.length()), num2, sum);
    }

   public static boolean isAdditiveNumber18(String num) {
       return isAdditiveNumber18(num, 0, new ArrayList<>());
   }

   private static boolean isAdditiveNumber18(String num, int start, List<Long> sequence) { // 236
       if (start == num.length()) { // 237
           return sequence.size() >= 3;
       }

       for (int i = start; i < num.length(); i++) { // 238
           String str = num.substring(start, i + 1); // 239
           if (str.length() > 1 && str.startsWith("0")) { // 240
               break; // 241
           }
           long numValue = Long.parseLong(str); // 242

           int sequenceSize = sequence.size(); // 243
           if (sequenceSize >= 2) { // 244
               long sum = sequence.get(sequenceSize - 1) + sequence.get(sequenceSize - 2); // 245
               if (numValue > sum) { // 246
                   break; // 247
               } else if (numValue < sum) { // 248
                   continue; // 249
               }
           }

           sequence.add(numValue); // 250
           if (isAdditiveNumber18(num, i + 1, sequence)) { // 251
               return true;
           }
           sequence.remove(sequence.size() - 1); // 252
       }

       return false;
   }

    public static boolean isAdditiveNumber19(String num) {
        if (num == null) { // 253
            return false;
        }
        int n = num.length(); // 254

        for (int i = 1; i <= n / 2; i++) { // 255
            for (int j = 1; Math.max(i, j) <= n - i - j; j++) { // 256
                if (isAdditive19(num, i, j)) { // 257
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isAdditive19(String num, int i, int j) { // 258
        if (num.charAt(0) == '0' && i > 1) { // 259
            return false;
        }
        if (num.charAt(i) == '0' && j > 1) { // 260
            return false;
        }
        Long x1 = Long.parseLong(num.substring(0, i)); // 261
        Long x2 = Long.parseLong(num.substring(i, i + j)); // 262

        String sum; // 263
        for (int start = i + j; start != num.length(); start += sum.length()) { // 264
            x2 = x2 + x1; // 265
            x1 = x2 - x1; // 266
            sum = x2.toString(); // 267
            if (!num.startsWith(sum, start)) { // 268
                return false;
            }
        }
        return true;
    }


    public static boolean isAdditiveNumber20(String num) {
        return dfs(num, 0, 0, 0, 0);
    }

    private static boolean dfs20(String num, int index, long sum, long prev, int count) { // 269
        if (index == num.length()) { // 270
            return count > 2;
        }
        for (int i = index; i < num.length(); i++) { // 271
            if (i > index && num.charAt(index) == '0') { // 272
                break; // 273
            }
            long curr = Long.parseLong(num.substring(index, i + 1)); // 274
            if (count >= 2 && curr != sum) { // 275
                continue; // 276
            }
            if (dfs20(num, i + 1, prev + curr, curr, count + 1)) { // 277
                return true;
            }
        }
        return false;
    }
}

