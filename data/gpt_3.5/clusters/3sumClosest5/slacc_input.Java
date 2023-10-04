public class Interleave {
    public static int threeSumClosest1(int[] nums, int target) {
        Arrays.sort(nums); // 1
        int closestSum = nums[0] + nums[1] + nums[2]; // 2

        for (int i = 0; i < nums.length - 2; i++) { // 3
            int left = i + 1; // 4
            int right = nums.length - 1; // 5

            while (left < right) { // 6
                int currentSum = nums[i] + nums[left] + nums[right]; // 7

                if (currentSum == target) { // 8
                    return currentSum;
                }

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) { // 9
                    closestSum = currentSum; // 10
                }

                if (currentSum < target) { // 11
                    left++; // 12
                } else { // 13
                    right--; // 14
                }
            }
        }

        return closestSum;
    }


    public int threeSumClosest2(int[] nums, int target) {
        int n = nums.length; // 15
        Arrays.sort(nums); // 16
        int closestSum = Integer.MAX_VALUE; // 17
        int minDiff = Integer.MAX_VALUE; // 18

        for (int i = 0; i < n - 2; i++) { // 19
            int left = i + 1; // 20
            int right = n - 1; // 21

            while (left < right) { // 22
                int sum = nums[i] + nums[left] + nums[right]; // 23
                int diff = Math.abs(sum - target); // 24

                if (diff < minDiff) { // 25
                    minDiff = diff; // 26
                    closestSum = sum; // 27
                }

                if (sum < target) { // 28
                    left++; // 29
                } else { // 30
                    right--; // 31
                }
            }
        }

        return closestSum;
    }





    public int threeSumClosest3(int[] nums, int target) {
        int closestSum = nums[0] + nums[1] + nums[nums.length - 1]; // 32
        Arrays.sort(nums); // 33
        for (int i = 0; i < nums.length - 2; i++) { // 34
            int left = i + 1; // 35
            int right = nums.length - 1; // 36
            while (left < right) { // 37
                int currentSum = nums[i] + nums[left] + nums[right]; // 38
                if (currentSum <= target) { // 39
                    left++; // 40
                } else { // 41
                    right--; // 42
                }
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) { // 43
                    closestSum = currentSum; // 44
                }
            }
        }
        return closestSum;
    }

    public int threeSumClosest4(int[] nums, int target) {
        Arrays.sort(nums); // 45
        int closestSum = Integer.MAX_VALUE; // 46
        int diff = Integer.MAX_VALUE; // 47
        for (int i = 0; i < nums.length - 2; i++) { // 48
            int left = i + 1; // 49
            int right = nums.length - 1; // 50
            while (left < right) { // 51
                int sum = nums[i] + nums[left] + nums[right]; // 52
                if (sum == target) { // 53
                    return target;
                }
                int newDiff = Math.abs(sum - target); // 54
                if (newDiff < diff) { // 55
                    diff = newDiff; // 56
                    closestSum = sum; // 57
                }
                if (sum < target) { // 58
                    left++; // 59
                } else { // 60
                    right--; // 61
                }
            }
        }
        return closestSum;
    }

    public int threeSumClosest5(int[] nums, int target) {
        Arrays.sort(nums); // 62
        int result = nums[0] + nums[1] + nums[nums.length - 1]; // 63
        for (int i = 0; i < nums.length - 2; i++) { // 64
            int start = i + 1, end = nums.length - 1; // 65
            while (start < end) { // 66
                int sum = nums[i] + nums[start] + nums[end]; // 67
                if (sum > target) { // 68
                    end--; // 69
                } else { // 70
                    start++; // 71
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) { // 72
                    result = sum; // 73
                }
            }
        }
        return result;
    }

    public static int threeSumClosest6(int[] nums, int target) {
        Arrays.sort(nums); // 74
        int closestSum = nums[0] + nums[1] + nums[2]; // 75
        for (int i = 0; i < nums.length - 2; i++) { // 76
            int left = i + 1; // 77
            int right = nums.length - 1; // 78
            while (left < right) { // 79
                int currentSum = nums[i] + nums[left] + nums[right]; // 80
                if (currentSum == target) { // 81
                    return currentSum;
                }
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) { // 82
                    closestSum = currentSum; // 83
                }
                if (currentSum < target) { // 84
                    left++; // 85
                } else { // 86
                    right--; // 87
                }
            }
        }
        return closestSum;
    }


    public static int threeSumClosest7(int[] nums, int target) {
        Arrays.sort(nums); // 88
        int closestSum = nums[0] + nums[1] + nums[2]; // 89
        for (int i = 0; i < nums.length - 2; i++) { // 90
            int left = i + 1; // 91
            int right = nums.length - 1; // 92
            while (left < right) { // 93
                int sum = nums[i] + nums[left] + nums[right]; // 94
                if (sum == target) { // 95
                    return sum;
                }
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) { // 96
                    closestSum = sum; // 97
                }
                if (sum < target) { // 98
                    left++; // 99
                } else { // 100
                    right--; // 101
                }
            }
        }
        return closestSum;
    }

   public int threeSumClosest8(int[] nums, int target) {
       int result = nums[0] + nums[1] + nums[nums.length - 1]; // 102
       Arrays.sort(nums); // 103
       for (int i = 0; i < nums.length - 2; i++) { // 104
           int start = i + 1, end = nums.length - 1; // 105
           while (start < end) { // 106
               int sum = nums[i] + nums[start] + nums[end]; // 107
               if (sum > target) { // 108
                   end--; // 109
               } else { // 110
                   start++; // 111
               }
               if (Math.abs(sum - target) < Math.abs(result - target)) { // 112
                   result = sum; // 113
               }
           }
       }
       return result;
   }

    public static int threeSumClosest9(int[] nums, int target) {
        Arrays.sort(nums); // 114
        int closestSum = nums[0] + nums[1] + nums[2]; // 115
        int n = nums.length; // 116

        for (int i = 0; i < n - 2; i++) { // 117
            if (i > 0 && nums[i] == nums[i - 1]) { // 118
                continue; // 119
            }

            int left = i + 1; // 120
            int right = n - 1; // 121

            while (left < right) { // 122
                int sum = nums[i] + nums[left] + nums[right]; // 123
                if (sum == target) { // 124
                    return sum;
                } else if (Math.abs(sum - target) < Math.abs(closestSum - target)) { // 125
                    closestSum = sum; // 126
                }

                if (sum < target) { // 127
                    left++; // 128
                } else { // 129
                    right--; // 130
                }
            }
        }

        return closestSum;
    }


    public static int threeSumClosest10(int[] nums, int target) {
        Arrays.sort(nums); // 131
        int closestSum = nums[0] + nums[1] + nums[2]; // 132
        for (int i = 0; i < nums.length - 2; i++) { // 133
            int left = i + 1, right = nums.length - 1; // 134
            while (left < right) { // 135
                int sum = nums[i] + nums[left] + nums[right]; // 136
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) { // 137
                    closestSum = sum; // 138
                }
                if (sum < target) { // 139
                    left++; // 140
                } else if (sum > target) { // 141
                    right--; // 142
                } else { // 143
                    return sum;
                }
            }
        }
        return closestSum;
    }

    public int threeSumClosest11(int[] nums, int target) {
        Arrays.sort(nums); // 144
        int closestSum = nums[0] + nums[1] + nums[2]; // 145

        for (int i = 0; i < nums.length - 2; i++) { // 146
            int left = i + 1; // 147
            int right = nums.length - 1; // 148

            while (left < right) { // 149
                int currentSum = nums[i] + nums[left] + nums[right]; // 150

                if (currentSum == target) { // 151
                    return currentSum;
                }

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) { // 152
                    closestSum = currentSum; // 153
                }

                if (currentSum < target) { // 154
                    left++; // 155
                } else { // 156
                    right--; // 157
                }
            }
        }

        return closestSum;
    }

    public static int threeSumClosest12(int[] nums, int target) {
        Arrays.sort(nums); // 158
        int closestSum = nums[0] + nums[1] + nums[2]; // 159
        int diff = Math.abs(closestSum - target); // 160

        for (int i = 0; i < nums.length - 2; i++) { // 161
            int left = i + 1; // 162
            int right = nums.length - 1; // 163

            while (left < right) { // 164
                int sum = nums[i] + nums[left] + nums[right]; // 165
                int newDiff = Math.abs(sum - target); // 166

                if (newDiff < diff) { // 167
                    diff = newDiff; // 168
                    closestSum = sum; // 169
                }

                if (sum < target) { // 170
                    left++; // 171
                } else if (sum > target) { // 172
                    right--; // 173
                } else { // 174
                    return sum;
                }
            }
        }

        return closestSum;
    }


    public static int threeSumClosest13(int[] nums, int target) {
        Arrays.sort(nums); // 175
        int closestSum = nums[0] + nums[1] + nums[2]; // 176

        for (int i = 0; i < nums.length - 2; i++) { // 177
            int left = i + 1; // 178
            int right = nums.length - 1; // 179

            while (left < right) { // 180
                int currentSum = nums[i] + nums[left] + nums[right]; // 181

                if (currentSum == target) { // 182
                    return currentSum;
                }

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) { // 183
                    closestSum = currentSum; // 184
                }

                if (currentSum < target) { // 185
                    left++; // 186
                } else { // 187
                    right--; // 188
                }
            }
        }

        return closestSum;
    }

    public static int threeSumClosest14(int[] nums, int target) {
        Arrays.sort(nums); // 189
        int n = nums.length; // 190
        int closestSum = nums[0] + nums[1] + nums[2]; // 191
        for(int i = 0; i<n-2; i++) { // 192
            int left = i + 1; // 193
            int right = n - 1; // 194
            while(left < right) { // 195
                int currentSum = nums[i] + nums[left] + nums[right]; // 196
                if(currentSum == target){ // 197
                    return target;
                }
                if(Math.abs(currentSum - target) < Math.abs(closestSum - target)){ // 198
                    closestSum = currentSum; // 199
                }
                if(currentSum < target){ // 200
                    left++; // 201
                } else { // 202
                    right--; // 203
                }
            }
        }
        return closestSum;
    }


    public int threeSumClosest15(int[] nums, int target) {
        if(nums == null || nums.length < 3) { // 204
            throw new IllegalArgumentException("Invalid input"); // 205
        }

        Arrays.sort(nums); // 206
        int closestSum = nums[0] + nums[1] + nums[2]; // 207

        for(int i=0; i<nums.length-2; i++) { // 208
            int left = i+1; // 209
            int right = nums.length-1; // 210

            while(left < right) { // 211
                int sum = nums[i] + nums[left] + nums[right]; // 212

                if(sum == target) { // 213
                    return sum;
                }

                if(Math.abs(sum - target) < Math.abs(closestSum - target)) { // 214
                    closestSum = sum; // 215
                }

                if(sum < target) { // 216
                    left++; // 217
                } else { // 218
                    right--; // 219
                }
            }
        }

        return closestSum;
    }

    public int threeSumClosest16(int[] nums, int target) {
        Arrays.sort(nums); // 220
        int closestSum = nums[0] + nums[1] + nums[2]; // 221
        for (int i = 0; i < nums.length - 2; i++) { // 222
            int left = i + 1; // 223
            int right = nums.length - 1; // 224
            while (left < right) { // 225
                int sum = nums[i] + nums[left] + nums[right]; // 226
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) { // 227
                    closestSum = sum; // 228
                }
                if (sum < target) { // 229
                    left++; // 230
                } else if (sum > target) { // 231
                    right--; // 232
                } else { // 233
                    return sum;
                }
            }
        }
        return closestSum;
    }


    public int threeSumClosest17(int[] nums, int target) {
        Arrays.sort(nums); // 234
        int closestSum = nums[0] + nums[1] + nums[2]; // 235
        for (int i = 0; i < nums.length - 2; i++) { // 236
            int left = i + 1; // 237
            int right = nums.length - 1; // 238
            while (left < right) { // 239
                int sum = nums[i] + nums[left] + nums[right]; // 240
                if (sum == target) { // 241
                    return sum;
                }
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) { // 242
                    closestSum = sum; // 243
                }
                if (sum < target) { // 244
                    left++; // 245
                } else { // 246
                    right--; // 247
                }
            }
        }
        return closestSum;
    }



    public static int threeSumClosest18(int[] nums, int target) {
        Arrays.sort(nums); // 248
        int closestSum = nums[0] + nums[1] + nums[2]; // 249
        for (int i = 0; i < nums.length - 2; i++) { // 250
            int left = i + 1; // 251
            int right = nums.length - 1; // 252
            while (left < right) { // 253
                int sum = nums[i] + nums[left] + nums[right]; // 254
                if (sum == target) { // 255
                    return sum;
                } else if (sum < target) { // 256
                    left++; // 257
                } else { // 258
                    right--; // 259
                }
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) { // 260
                    closestSum = sum; // 261
                }
            }
        }
        return closestSum;
    }

    public int threeSumClosest19(int[] nums, int target) {
        Arrays.sort(nums); // 262
        int closestSum = nums[0] + nums[1] + nums[2]; // 263
        for (int i = 0; i < nums.length - 2; i++) { // 264
            int left = i + 1; // 265
            int right = nums.length - 1; // 266
            while (left < right) { // 267
                int sum = nums[i] + nums[left] + nums[right]; // 268
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) { // 269
                    closestSum = sum; // 270
                }
                if (sum < target) { // 271
                    left++; // 272
                } else { // 273
                    right--; // 274
                }
            }
        }
        return closestSum;
    }

    public static int threeSumClosest20(int[] nums, int target) {
        Arrays.sort(nums); // 275
        int closestSum = nums[0] + nums[1] + nums[2]; // 276

        for (int i = 0; i < nums.length - 2; i++) { // 277
            int left = i + 1; // 278
            int right = nums.length - 1; // 279

            while (left < right) { // 280
                int currentSum = nums[i] + nums[left] + nums[right]; // 281

                if (currentSum == target) { // 282
                    return currentSum;
                }

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) { // 283
                    closestSum = currentSum; // 284
                }

                if (currentSum < target) { // 285
                    left++; // 286
                } else { // 287
                    right--; // 288
                }
            }
        }

        return closestSum;
    }


}



