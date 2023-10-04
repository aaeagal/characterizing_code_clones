
public class RotatedArray {

    public static int search1(int[] nums, int target) {
        int start = 0; // 1
        int end = nums.length - 1; // 2

        while (start <= end) { // 3
            int mid = start + (end - start) / 2; // 4

            if (nums[mid] == target) { // 5
                return mid;
            } else if (nums[start] <= nums[mid]) { // 6
                if (target >= nums[start] && target < nums[mid]) { // 7
                    end = mid - 1; // 8
                } else { // 9
                    start = mid + 1; // 10
                }
            } else { // 11
                if (target > nums[mid] && target <= nums[end]) { // 12
                    start = mid + 1; // 13
                } else { // 14
                    end = mid - 1; // 15
                }
            }
        }
        return -1;
    }

    public static int search2(int[] nums, int target) {
        int n = nums.length; // 16
        if (n == 0) { // 17
            return -1;
        }
        int left = 0, right = n - 1; // 18
        while (left < right) { // 19
            int mid = (left + right) / 2; // 20
            if (nums[mid] == target) { // 21
                 return mid;
            }
            if (nums[left] <= nums[mid]) { // 22
                if (target >= nums[left] && target < nums[mid]) { // 23
                    right = mid - 1; // 24
                } else { // 25
                    left = mid + 1; // 26
                }
            } else { // 27
                if (target > nums[mid] && target <= nums[right]) { // 28
                    left = mid + 1; // 29
                } else { // 30
                    right = mid - 1; // 31
                }
            }
        }
        if (nums[left] == target) { // 32
            return left;
        }
        return -1;
    }

    public static int findMin3(int[] nums) {
        int left = 0; // 33
        int right = nums.length - 1; // 34

        while (left < right) { // 35
            int mid = left + (right - left) / 2; // 36

            if (nums[mid] > nums[right]) { // 37
                left = mid + 1; // 38
            } else { // 39
                right = mid; // 40
            }
        }

        return nums[left];
    }

    public static int findMin4(int[] nums) {
        int left = 0; // 41
        int right = nums.length - 1; // 42

        while (left < right) { // 43
            int mid = left + (right - left) / 2; // 44

            if (nums[mid] > nums[right]) { // 45
                left = mid + 1; // 46
            } else { // 47
                right = mid; // 48
            }
        }

        return nums[left];
    }

  public static int search5(int[] nums, int target) {
    int left = 0, right = nums.length - 1; // 49
    while (left <= right) { // 50
      int midpoint = left + (right - left) / 2; // 51
      if (nums[midpoint] == target) { // 52
        return midpoint;
      } else if (nums[left] <= nums[midpoint]) { // 53
        if (nums[left] <= target && target < nums[midpoint]) { // 54
          right = midpoint - 1; // 55
        } else { // 56
          left = midpoint + 1; // 57
        }
      } else { // 58
        if (nums[midpoint] < target && target <= nums[right]) { // 59
          left = midpoint + 1; // 60
        } else { // 61
          right = midpoint - 1; // 62
        }
      }
    }
    return -1;
  }


    public static int search6(int[] nums, int target) {
        int left = 0; // 63
        int right = nums.length - 1; // 64

        while (left <= right) { // 65
            int mid = left + (right - left) / 2; // 66

            if (nums[mid] == target) { // 67
                return mid;
            }

            if (nums[left] <= nums[mid]) { // 68
                if (target >= nums[left] && target < nums[mid]) { // 69
                    right = mid - 1; // 70
                } else { // 71
                    left = mid + 1; // 72
                }
            } else { // 73
                if (target > nums[mid] && target <= nums[right]) { // 74
                    left = mid + 1; // 75
                } else { // 76
                    right = mid - 1; // 77
                }
            }
        }

        return -1;
    }



    public static int findMin7(int[] nums) {
        int start = 0, end = nums.length - 1; // 78

        while (start < end) { // 79
            int mid = start + (end - start) / 2; // 80

            if (nums[mid] > nums[end]) { // 81
                start = mid + 1; // 82
            } else { // 83
                end = mid; // 84
            }
        }

        return nums[start];
    }



public int search8(int[] nums, int target) {
    int start = 0; // 85
    int end = nums.length - 1; // 86

    while (start <= end) { // 87
        int mid = (start + end) / 2; // 88
        if (nums[mid] == target) { // 89
            return mid;
        }

        if (nums[start] <= nums[mid]) { // 90
            if (nums[start] <= target && target < nums[mid]) { // 91
                end = mid - 1; // 92
            } else { // 93
                start = mid + 1; // 94
            }
        } else { // 95
            if (nums[mid] < target && target <= nums[end]) { // 96
                start = mid + 1; // 97
            } else { // 98
                end = mid - 1; // 99
            }
        }
    }

    return -1;
}



public int search9(int[] nums, int target) {
    int left = 0, right = nums.length - 1; // 100

    while (left <= right) { // 101
        int mid = left + (right - left) / 2; // 102
        if (nums[mid] == target) // 103
            return mid;

        if (nums[mid] >= nums[left]) { // 104
            if (target >= nums[left] && target < nums[mid]) // 105
                right = mid - 1; // 106
            else // 107
                left = mid + 1; // 108
        }
        else { // 109
            if (target > nums[mid] && target <= nums[right]) // 110
                left = mid + 1; // 111
            else // 112
                right = mid - 1; // 113
        }
    }

    return -1;
}

    public static int search10(int[] nums, int target) {
        int left = 0; // 114
        int right = nums.length - 1; // 115

        while (left <= right) { // 116
            int mid = left + (right - left) / 2; // 117

            if (nums[mid] == target) { // 118
                return mid;
            }

            if (nums[left] <= nums[mid]) { // 119
                if (target >= nums[left] && target < nums[mid]) { // 120
                    right = mid - 1; // 121
                } else { // 122
                    left = mid + 1; // 123
                }
            } else { // 124
                if (target > nums[mid] && target <= nums[right]) { // 125
                    left = mid + 1; // 126
                } else { // 127
                    right = mid - 1; // 128
                }
            }
        }
        return -1;
    }

    public static int findMin11(int[] nums) {
        int start = 0; // 129
        int end = nums.length - 1; // 130

        while (start < end) { // 131
            int mid = start + (end - start) / 2; // 132

            if (nums[mid] > nums[end]) { // 133
                start = mid + 1; // 134
            } else { // 135
                end = mid; // 136
            }
        }

        return nums[start];
    }


    public static int search12(int[] nums, int target) {
        int left = 0; // 137
        int right = nums.length - 1; // 138

        while(left <= right){ // 139
            int mid = left + (right - left) / 2; // 140

            if(nums[mid] == target) { // 141
                return mid;
            }
            if(nums[mid] >= nums[left]){ // 142
                if(target >= nums[left] && target < nums[mid]){ // 143
                    right = mid - 1; // 144
                }else{ // 145
                    left = mid + 1; // 146
                }
            }else{ // 147
                if(target <= nums[right] && target > nums[mid]){ // 148
                    left = mid + 1; // 149
                }else{ // 150
                    right = mid - 1; // 151
                }
            }
        }

        return -1;
    }


   public static int findMin13(int[] nums) {
      int low = 0; // 152
      int high = nums.length - 1; // 153
      while (low < high) { // 154
         int mid = low + (high - low) / 2; // 155
         if (nums[mid] > nums[high]) { // 156
            low = mid + 1; // 157
         } else if (nums[mid] < nums[high]) { // 158
            high = mid; // 159
         } else { // 160
            high--; // 161
         }
      }
      return nums[low];
   }


    public int search14(int[] nums, int target) {
        int l = 0; // 162
        int r = nums.length - 1; // 163

        while (l <= r) { // 164
            int mid = l + (r - l) / 2; // 165

            if (nums[mid] == target) { // 166
                return mid;
            }
            else if (nums[mid] >= nums[l]) { // 167
                if (target >= nums[l] && target < nums[mid]) { // 168
                    r = mid - 1; // 169
                }
                else { // 170
                    l = mid + 1; // 171
                }
            }
            else { // 172
                if (target > nums[mid] && target <= nums[r]) { // 173
                    l = mid + 1; // 174
                }
                else { // 175
                    r = mid - 1; // 176
                }
            }
        }

        return -1;
    }

    public static int search15(int[] nums, int target) {
        int left = 0; // 177
        int right = nums.length - 1; // 178

        while (left <= right) { // 179
            int mid = left + (right - left) / 2; // 180

            if (nums[mid] == target) { // 181
                return mid;
            }

            if (nums[mid] >= nums[left]) { // 182
                if (target >= nums[left] && target < nums[mid]) { // 183
                    right = mid - 1; // 184
                } else { // 185
                    left = mid + 1; // 186
                }
            } else { // 187
                if (target > nums[mid] && target <= nums[right]) { // 188
                    left = mid + 1; // 189
                } else { // 190
                    right = mid - 1; // 191
                }
            }
        }

        return -1;
    }

    public static int search16(int[] nums, int target) {
        int left = 0, right = nums.length - 1; // 192
        while (left <= right) { // 193
            int mid = left + (right - left) / 2; // 194
            if (nums[mid] == target) // 195
                return mid;
            if (nums[left] <= nums[mid]) { // 196
                if (target >= nums[left] && target < nums[mid]) // 197
                    right = mid - 1; // 198
                else // 199
                    left = mid + 1; // 200
            } else { // 201
                if (target > nums[mid] && target <= nums[right]) // 202
                    left = mid + 1; // 203
                else // 204
                    right = mid - 1; // 205
            }
        }
        return -1;
    }

    public static int findMin17(int[] nums) {
        int left = 0; // 206
        int right = nums.length - 1; // 207

        while (left < right) { // 208
            int mid = left + (right - left) / 2; // 209
            if (nums[mid] > nums[right]) { // 210
                left = mid + 1; // 211
            } else { // 212
                right = mid; // 213
            }
        }
        return nums[left];
    }

    public int search18(int[] nums, int target) {
        int n = nums.length; // 214
        int left = 0; // 215
        int right = n - 1; // 216

        while (left <= right) { // 217
            int mid = left + (right - left) / 2; // 218

            if (nums[mid] == target) { // 219
                return mid;
            }

            if (nums[mid] >= nums[left]) { // 220
                if (target >= nums[left] && target < nums[mid]) { // 221
                    right = mid - 1; // 222
                } else { // 223
                    left = mid + 1; // 224
                }
            } else { // 225
                if (target > nums[mid] && target <= nums[right]) { // 226
                    left = mid + 1; // 227
                } else { // 228
                    right = mid - 1; // 229
                }
            }
        }

        return -1;
    }


    public static int search19(int[] nums, int target) {
        int left = 0; // 230
        int right = nums.length - 1; // 231

        while (left <= right) { // 232
            int mid = left + (right - left) / 2; // 233

            if (nums[mid] == target) // 234
                return mid;

            if (nums[left] <= nums[mid]) { // 235
                if (nums[left] <= target && target < nums[mid]) // 236
                    right = mid - 1; // 237
                else // 238
                    left = mid + 1; // 239
            }
            else { // 240
                if (nums[mid] < target && target <= nums[right]) // 241
                    left = mid + 1; // 242
                else // 243
                    right = mid - 1; // 244
            }
        }

        return -1;
    }
}


