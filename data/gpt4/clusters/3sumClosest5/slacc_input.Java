import java.util.Arrays;

public class Solution {
    public int threeSumClosest1(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1]; // 1
        Arrays.sort(nums); // 2
        for (int i = 0; i < nums.length - 2; i++) { // 3
            int start = i + 1, end = nums.length - 1; // 4
            while (start < end) { // 5
                int sum = nums[i] + nums[start] + nums[end]; // 6
                if (sum > target) { // 7
                    end--; // 8
                } else { // 9
                    start++; // 10
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) { // 11
                    result = sum; // 12
                }
            }
        }
        return result;
    }



    public int threeSumClosest2(int[] nums, int target) {
        if (nums == null || nums.length < 3) { // 13
            return 0;
        }
        Arrays.sort(nums); // 14
        int closestSum = nums[0] + nums[1] + nums[nums.length - 1]; // 15
        for (int i = 0; i < nums.length - 2; i++) { // 16
            int left = i + 1; // 17
            int right = nums.length - 1; // 18
            while (left < right) { // 19
                int currentSum = nums[i] + nums[left] + nums[right]; // 20
                if (currentSum > target) { // 21
                    right--; // 22
                } else { // 23
                    left++; // 24
                }
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) { // 25
                    closestSum = currentSum; // 26
                }
            }
        }
        return closestSum;
    }


    public int threeSumClosest3(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1]; // 27
        Arrays.sort(nums); // 28
        for (int i = 0; i < nums.length - 2; i++) { // 29
            int start = i + 1, end = nums.length - 1; // 30
            while (start < end) { // 31
                int sum = nums[i] + nums[start] + nums[end]; // 32
                if (sum < target) { // 33
                    start++; // 34
                } else { // 35
                    end--; // 36
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) { // 37
                    result = sum; // 38
                }
            }
        }
        return result;
    }



    public int threeSumClosest4(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1]; // 39
        Arrays.sort(nums); // 40
        for (int i = 0; i < nums.length - 2; i++) { // 41
            int start = i + 1, end = nums.length - 1; // 42
            while (start < end) { // 43
                int sum = nums[i] + nums[start] + nums[end]; // 44
                if (sum < target) { // 45
                    start++; // 46
                } else { // 47
                    end--; // 48
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) { // 49
                    result = sum; // 50
                }
            }
        }
        return result;
    }

    public int threeSumClosest5(int[] nums, int target) {
        Arrays.sort(nums); // 51
        int minDiff = Integer.MAX_VALUE; // 52
        int result = 0; // 53
        int n = nums.length; // 54

        for (int i = 0; i < n - 2; i++) { // 55
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip same results // 56
            int j = i + 1, k = n - 1; // 57
            while (j < k) { // 58
                int sum = nums[i] + nums[j] + nums[k]; // 59
                int diff = Math.abs(sum - target); // 60

                if(diff == 0) return sum;

                if (diff < minDiff) { // 61
                    minDiff = diff; // 62
                    result = sum; // 63
                }
                if (sum <= target) { // 64
                    j++; // 65
                } else { // 66
                    k--; // 67
                }
            }
        }
        return result;
    }


    public int threeSumClosest6(int[] nums, int target) {
        Arrays.sort(nums); // 68
        int result = nums[0] + nums[1] + nums[nums.length - 1]; // 69

        for (int i = 0; i < nums.length - 2; i++) { // 70
            int start = i + 1, end = nums.length - 1; // 71
            while (start < end) { // 72
                int sum = nums[i] + nums[start] + nums[end]; // 73
                if (sum > target) { // 74
                    end--; // 75
                } else { // 76
                    start++; // 77
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) { // 78
                    result = sum; // 79
                }
            }
        }
        return result;
    }



    public int threeSumClosest7(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1]; // 80
        Arrays.sort(nums); // 81

        for (int i = 0; i < nums.length - 2; i++) { // 82
            int start = i + 1, end = nums.length - 1; // 83
            while (start < end) { // 84
                int sum = nums[i] + nums[start] + nums[end]; // 85
                if (sum < target) { // 86
                    start++; // 87
                } else { // 88
                    end--; // 89
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) { // 90
                    result = sum; // 91
                }
            }
        }
        return result;
    }


    public int threeSumClosest8(int[] nums, int target) {
        Arrays.sort(nums); // 92
        int minDiff = Integer.MAX_VALUE; // 93
        int closestSum = 0; // 94

        for (int i = 0; i < nums.length - 2; i++) { // 95
            int start = i + 1; // 96
            int end = nums.length - 1; // 97

            while (start < end) { // 98
                int sum = nums[i] + nums[start] + nums[end]; // 99

                if (sum == target) { // 100
                    return sum;
                } else if (sum < target) { // 101
                    start++; // 102
                } else { // 103
                    end--; // 104
                }

                int diff = Math.abs(sum - target); // 105
                if (diff < minDiff) { // 106
                    minDiff = diff; // 107
                    closestSum = sum; // 108
                }
            }
        }

        return closestSum;
    }

    public int threeSumClosest9(int[] nums, int target) {
        int diff = Integer.MAX_VALUE, sz = nums.length; // 109
        Arrays.sort(nums); // 110
        for (int i = 0; i < sz && diff != 0; ++i) { // 111
            int lo = i + 1, hi = sz - 1; // 112
            while (lo < hi) { // 113
                int sum = nums[i] + nums[lo] + nums[hi]; // 114
                if (Math.abs(target - sum) < Math.abs(diff)) // 115
                    diff = target - sum; // 116
                if (sum < target) // 117
                    ++lo; // 118
                else // 119
                    --hi; // 120
            }
        }
        return target - diff;
    }

    public int threeSumClosest10(int[] nums, int target) {
        Arrays.sort(nums); // 121
        int closestSum = nums[0] + nums[1] + nums[nums.length-1]; // 122
        for (int i = 0; i < nums.length - 2; i++) { // 123
            int start = i + 1, end = nums.length - 1; // 124
            while (start < end) { // 125
                int sum = nums[i] + nums[start] + nums[end]; // 126
                if (sum > target) { // 127
                    end--; // 128
                } else { // 129
                    start++; // 130
                }
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) { // 131
                    closestSum = sum; // 132
                }
            }
        }
        return closestSum;
    }

    public int threeSumClosest11(int[] nums, int target) {
        Arrays.sort(nums); // 133
        int closest = nums[0] + nums[1] + nums[2]; // 134
        for (int i = 0; i < nums.length - 2; i++) { // 135
            int start = i + 1, end = nums.length - 1; // 136
            while (start < end) { // 137
                int sum = nums[i] + nums[start] + nums[end]; // 138
                if (sum == target) // 139
                    return sum;
                if (Math.abs(sum - target) < Math.abs(closest - target)) // 140
                    closest = sum; // 141
                if (sum > target) // 142
                    end--; // 143
                else // 144
                    start++; // 145
            }
        }
        return closest;
    }


    public int threeSumClosest12(int[] nums, int target) {
        Arrays.sort(nums); // 146
        int closestSum = nums[0] + nums[1] + nums[2]; // 147
        for (int i = 0; i < nums.length - 2; i++) { // 148
            int left = i + 1, right = nums.length - 1; // 149
            while (left < right) { // 150
                int currentSum = nums[i] + nums[left] + nums[right]; // 151
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

    public int threeSumClosest13(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1]; // 158
        Arrays.sort(nums); // 159

        for (int i = 0; i < nums.length - 2; i++) { // 160
            int start = i + 1; // 161
            int end = nums.length - 1; // 162

            while (start < end) { // 163
                int sum = nums[i] + nums[start] + nums[end]; // 164

                if (sum < target) { // 165
                    start++; // 166
                } else { // 167
                    end--; // 168
                }

                if (Math.abs(sum - target) < Math.abs(result - target)) { // 169
                    result = sum; // 170
                }
            }
        }
        return result;
    }

    public int threeSumClosest14(int[] nums, int target) {
        Arrays.sort(nums); // 171
        int closestDiff = Integer.MAX_VALUE; // 172
        int res = 0; // 173
        for (int i = 0; i < nums.length; i++) { // 174
            int start = i + 1, end = nums.length - 1; // 175

            while (start < end) { // 176
                int sum = nums[i] + nums[start] + nums[end]; // 177

                if (sum == target) { // If sum equals to target, return immediately
                    return sum;
                }

                int diff = Math.abs(target - sum); // 178
                if (diff < closestDiff) { // If current diff is less than the closest diff, update the closestDiff and res // 179
                    closestDiff = diff; // 180
                    res = sum; // 181
                }

                if (sum > target) { // 182
                    end--; // 183
                } else { // 184
                    start++; // 185
                }
            }
        }
        return res; // return final closest sum
    }

    public int threeSumClosest15(int[] nums, int target) {
        Arrays.sort(nums); // 186
        int result = nums[0] + nums[1] + nums[nums.length - 1]; // 187
        for(int i = 0; i < nums.length - 2; i++) { // 188
            int start = i + 1, end = nums.length - 1; // 189
            while (start < end) { // 190
                int sum = nums[i] + nums[start] + nums[end]; // 191
                if(sum < target) { // 192
                    start++; // 193
                } else { // 194
                    end--; // 195
                }
                if(Math.abs(sum - target) < Math.abs(result - target)) { // 196
                    result = sum; // 197
                }
            }
        }
        return result;
    }

    public int threeSumClosest16(int[] nums, int target) {
        Arrays.sort(nums); // 198
        int result = nums[0] + nums[1] + nums[nums.length - 1]; // 199
        for (int i = 0; i < nums.length - 2; i++) { // 200
            int start = i + 1, end = nums.length - 1; // 201
            while (start < end) { // 202
                int sum = nums[i] + nums[start] + nums[end]; // 203
                if (sum > target) { // 204
                    end--; // 205
                } else { // 206
                    start++; // 207
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) { // 208
                    result = sum; // 209
                }
            }
        }
        return result;
    }


    public int threeSumClosest17(int[] nums, int target) {
        Arrays.sort(nums); // 210
        int closestSum = nums[0] + nums[1] + nums[2]; // 211
        for (int i = 0; i < nums.length - 2; i++) { // 212
            int start = i + 1, end = nums.length - 1; // 213
            while (start < end) { // 214
                int sum = nums[i] + nums[start] + nums[end]; // 215
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) // 216
                    closestSum = sum; // 217
                if (sum == target) // 218
                    return sum;
                else if (sum < target) // 219
                    start++; // 220
                else // 221
                    end--; // 222
            }
        }
        return closestSum;
    }


    public int threeSumClosest18(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1]; // 223
        Arrays.sort(nums); // 224
        for (int i = 0; i < nums.length - 2; i++) { // 225
            int start = i + 1, end = nums.length - 1; // 226
            while (start < end) { // 227
                int sum = nums[i] + nums[start] + nums[end]; // 228
                if (sum < target) { // 229
                    start++; // 230
                } else { // 231
                    end--; // 232
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) { // 233
                    result = sum; // 234
                }
            }
        }
        return result;
    }


    public int threeSumClosest19(int[] nums, int target) {
        Arrays.sort(nums); // 235
        int closestSum = nums[0] + nums[1] + nums[nums.length - 1]; // 236
        for(int i = 0; i < nums.length - 2; i++) { // 237
            int start = i + 1; // 238
            int end = nums.length - 1; // 239
            while(start < end) { // 240
                int currentSum = nums[i] + nums[start] + nums[end]; // 241
                if(currentSum > target) { // 242
                    end--; // 243
                } else { // 244
                    start++; // 245
                }
                if(Math.abs(currentSum - target) < Math.abs(closestSum - target)) { // 246
                    closestSum = currentSum; // 247
                }
            }
        }
        return closestSum;
    }

    public int threeSumClosest20(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1]; // 248
        Arrays.sort(nums); // 249

        for(int i = 0; i < nums.length - 2; i++) { // 250
            int a_pointer = i + 1; // 251
            int b_pointer = nums.length - 1; // 252

            while(a_pointer < b_pointer) { // 253
                int current_sum = nums[i] + nums[a_pointer] + nums[b_pointer]; // 254

                if(current_sum > target) { // 255
                    b_pointer--; // 256
                } else { // 257
                    a_pointer++; // 258
                }

                if(Math.abs(current_sum - target) < Math.abs(result - target)) { // 259
                    result = current_sum; // 260
                }
            }
        }

        return result;
    }
}

