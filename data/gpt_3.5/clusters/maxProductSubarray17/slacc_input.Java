
public class Solution {
    public int maxProduct1(int[] nums) {
        int maxProduct = nums[0]; // 1
        int maxSoFar = nums[0]; // 2
        int minSoFar = nums[0]; // 3

        for (int i = 1; i < nums.length; i++) { // 4
            if (nums[i] < 0) { // 5
                int temp = maxSoFar; // 6
                maxSoFar = minSoFar; // 7
                minSoFar = temp; // 8
            }

            maxSoFar = Math.max(nums[i], maxSoFar * nums[i]); // 9
            minSoFar = Math.min(nums[i], minSoFar * nums[i]); // 10

            maxProduct = Math.max(maxProduct, maxSoFar); // 11
        }

        return maxProduct;
    }

    public int maxProduct2(int[] nums) {
        int max = nums[0], min = nums[0], result = nums[0]; // 12

        for(int i=1; i<nums.length; i++){ // 13
            if(nums[i] < 0){ // 14
                int temp = max; // 15
                max = min; // 16
                min = temp; // 17
            }

            max = Math.max(nums[i], max*nums[i]); // 18
            min = Math.min(nums[i], min*nums[i]); // 19

            result = Math.max(result, max); // 20
        }

        return result;
    }

    public static int maxProduct3(int[] nums) {
        int maxProduct = nums[0]; // 21
        int minProduct = nums[0]; // 22
        int result = nums[0]; // 23

        for (int i = 1; i < nums.length; i++) { // 24
            if (nums[i] < 0) { // 25
                int temp = maxProduct; // 26
                maxProduct = minProduct; // 27
                minProduct = temp; // 28
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]); // 29
            minProduct = Math.min(nums[i], minProduct * nums[i]); // 30

            result = Math.max(result, maxProduct); // 31
        }

        return result;
    }

    public static int maxProduct4(int[] nums) {
        int maxProduct = Integer.MIN_VALUE; // 32
        int currentProduct = 1; // 33
        for (int i = 0; i < nums.length; i++) { // 34
            currentProduct *= nums[i]; // 35
            maxProduct = Math.max(maxProduct, currentProduct); // 36
            if (currentProduct == 0) { // 37
                currentProduct = 1; // 38
            }
        }
        currentProduct = 1; // 39
        for (int i = nums.length - 1; i >= 0; i--) { // 40
            currentProduct *= nums[i]; // 41
            maxProduct = Math.max(maxProduct, currentProduct); // 42
            if (currentProduct == 0) { // 43
                currentProduct = 1; // 44
            }
        }
        return maxProduct;
    }



    public int maxProduct5(int[] nums) {
        if (nums == null || nums.length == 0) { // 45
            return 0;
        }

        int maxProduct = nums[0]; // 46
        int currentMax = nums[0]; // 47
        int currentMin = nums[0]; // 48

        for (int i = 1; i < nums.length; i++) { // 49
            int temp = currentMax; // 50
            currentMax = Math.max(Math.max(nums[i] * currentMax, nums[i] * currentMin), nums[i]); // 51
            currentMin = Math.min(Math.min(nums[i] * temp, nums[i] * currentMin), nums[i]); // 52
            maxProduct = Math.max(maxProduct, currentMax); // 53
        }

        return maxProduct;
    }

    public static int maxProduct6(int[] nums) {
        int maxProduct = nums[0]; // 54
        int currentMax = nums[0]; // 55
        int currentMin = nums[0]; // 56

        for(int i = 1; i < nums.length; i++) { // 57
            if(nums[i] < 0) { // 58
                int temp = currentMax; // 59
                currentMax = currentMin; // 60
                currentMin = temp; // 61
            }

            currentMax = Math.max(nums[i], currentMax * nums[i]); // 62
            currentMin = Math.min(nums[i], currentMin * nums[i]); // 63

            maxProduct = Math.max(maxProduct, currentMax); // 64
        }

        return maxProduct;
    }

    public static int maxProduct7(int[] nums) {
        int n = nums.length; // 65
        int maxProd = nums[0]; // 66
        int minProd = nums[0]; // 67
        int ans = nums[0]; // 68

        for (int i = 1; i < n; i++) { // 69
            if (nums[i] < 0) { // 70
                int temp = maxProd; // 71
                maxProd = minProd; // 72
                minProd = temp; // 73
            }
            maxProd = Math.max(nums[i], maxProd * nums[i]); // 74
            minProd = Math.min(nums[i], minProd * nums[i]); // 75
            ans = Math.max(ans, maxProd); // 76
        }

        return ans;
    }


    public static int maxProduct8(int[] nums) {
        int maxProduct = nums[0]; // 77
        int currentMax = nums[0]; // 78
        int currentMin = nums[0]; // 79

        for (int i = 1; i < nums.length; i++) { // 80
            if (nums[i] < 0) { // 81
                int temp = currentMax; // 82
                currentMax = currentMin; // 83
                currentMin = temp; // 84
            }

            currentMax = Math.max(nums[i], nums[i] * currentMax); // 85
            currentMin = Math.min(nums[i], nums[i] * currentMin); // 86

            maxProduct = Math.max(maxProduct, currentMax); // 87
        }

        return maxProduct;
    }


   public static int findLargestProduct9(int[] nums) {
      int n = nums.length; // 88

      int maxProduct = Integer.MIN_VALUE; // 89
      int currentProduct = 1; // 90

      for(int i = 0; i < n; i++) { // 91
         currentProduct = currentProduct * nums[i]; // 92

         if(currentProduct > maxProduct) { // 93
            maxProduct = currentProduct; // 94
         }

         if(nums[i] == 0) { // 95
            currentProduct = 1; // 96
         }
      }

      currentProduct = 1; // 97

      for(int i = n-1; i >= 0; i--) { // 98
         currentProduct = currentProduct * nums[i]; // 99

         if(currentProduct > maxProduct) { // 100
            maxProduct = currentProduct; // 101
         }

         if(nums[i] == 0) { // 102
            currentProduct = 1; // 103
         }
      }

      return maxProduct;
   }

    public static int maxProduct10(int[] nums) {
        int maxProduct = nums[0]; // 104
        int currMax = nums[0]; // 105
        int currMin = nums[0]; // 106

        for (int i = 1; i < nums.length; i++) { // 107
            if (nums[i] < 0) { // 108
                int temp = currMax; // 109
                currMax = currMin; // 110
                currMin = temp; // 111
            }

            currMax = Math.max(nums[i], currMax * nums[i]); // 112
            currMin = Math.min(nums[i], currMin * nums[i]); // 113

            maxProduct = Math.max(maxProduct, currMax); // 114
        }

        return maxProduct;
    }


    public int maxProduct11(int[] nums) {
        if (nums == null || nums.length == 0) { // 115
            return 0;
        }
        int maxProduct = nums[0]; // 116
        int minProduct = nums[0]; // 117
        int result = nums[0]; // 118
        for (int i = 1; i < nums.length; i++) { // 119
            int tempMax = Math.max(nums[i], Math.max(maxProduct * nums[i], minProduct * nums[i])); // 120
            minProduct = Math.min(nums[i], Math.min(maxProduct * nums[i], minProduct * nums[i])); // 121
            maxProduct = tempMax; // 122
            result = Math.max(result, maxProduct); // 123
        }
        return result;
    }

    public int maxProduct12(int[] nums) {
        int maxProduct = Integer.MIN_VALUE; // 124
        int currentMaxProduct = 1; // 125
        int currentMinProduct = 1; // 126

        for(int num : nums) { // 127
            if(num < 0) { // 128
                int temp = currentMaxProduct; // 129
                currentMaxProduct = currentMinProduct; // 130
                currentMinProduct = temp; // 131
            }

            currentMaxProduct = Math.max(currentMaxProduct * num, num); // 132
            currentMinProduct = Math.min(currentMinProduct * num, num); // 133

            maxProduct = Math.max(currentMaxProduct, maxProduct); // 134
        }

        return maxProduct;
    }

    public int maxProduct13(int[] nums) {
        if (nums == null || nums.length == 0) // 135
            return 0;

        int maxProduct = nums[0]; // 136
        int maxEndingHere = nums[0]; // 137
        int minEndingHere = nums[0]; // 138

        for (int i = 1; i < nums.length; i++) { // 139
            int tempMax = Math.max(nums[i], Math.max(nums[i] * maxEndingHere, nums[i] * minEndingHere)); // 140
            int tempMin = Math.min(nums[i], Math.min(nums[i] * maxEndingHere, nums[i] * minEndingHere)); // 141

            maxEndingHere = tempMax; // 142
            minEndingHere = tempMin; // 143

            maxProduct = Math.max(maxProduct, maxEndingHere); // 144
        }

        return maxProduct;
    }


    public static int maxProduct14(int[] nums) {
        int maxProduct = nums[0]; // 145
        int currentMax = nums[0]; // 146
        int currentMin = nums[0]; // 147

        for (int i = 1; i < nums.length; i++) { // 148
            if (nums[i] < 0) { // 149
                int temp = currentMax; // 150
                currentMax = currentMin; // 151
                currentMin = temp; // 152
            }

            currentMax = Math.max(nums[i], currentMax * nums[i]); // 153
            currentMin = Math.min(nums[i], currentMin * nums[i]); // 154

            maxProduct = Math.max(maxProduct, currentMax); // 155
        }

        return maxProduct;
    }


    public int maxProduct15(int[] nums) {
        int maxProd = Integer.MIN_VALUE; // 156
        int currProd = 1; // 157
        for(int i=0;i<nums.length;i++) { // 158
            currProd *= nums[i]; // 159
            maxProd = Math.max(maxProd, currProd); // 160
            if(currProd == 0) { // 161
                currProd = 1; // 162
            }
        }
        currProd = 1; // 163
        for(int i=nums.length-1;i>=0;i--) { // 164
            currProd *= nums[i]; // 165
            maxProd = Math.max(maxProd, currProd); // 166
            if(currProd == 0) { // 167
                currProd = 1; // 168
            }
        }
        return maxProd;
    }


    public static int maxProduct16(int[] nums) {
        int max = nums[0]; // 169
        int min = nums[0]; // 170
        int result = nums[0]; // 171

        for (int i = 1; i < nums.length; i++) { // 172
            if (nums[i] < 0) { // 173
                int temp = max; // 174
                max = min; // 175
                min = temp; // 176
            }

            max = Math.max(nums[i], max * nums[i]); // 177
            min = Math.min(nums[i], min * nums[i]); // 178

            result = Math.max(result, max); // 179
        }

        return result;
    }


    public int maxProduct17(int[] nums) {
        int maxProduct = nums[0]; // 180
        int currentMax = nums[0]; // 181
        int currentMin = nums[0]; // 182

        for (int i = 1; i < nums.length; i++) { // 183
            if (nums[i] < 0) { // 184
                int temp = currentMax; // 185
                currentMax = currentMin; // 186
                currentMin = temp; // 187
            }

            currentMax = Math.max(nums[i], currentMax * nums[i]); // 188
            currentMin = Math.min(nums[i], currentMin * nums[i]); // 189

            maxProduct = Math.max(maxProduct, currentMax); // 190
        }

        return maxProduct;
    }


    public static int maxProduct18(int[] nums) {
        int maxProduct = nums[0]; // 191
        int currentMax = nums[0]; // 192
        int currentMin = nums[0]; // 193

        for (int i = 1; i < nums.length; i++) { // 194
            int temp = currentMax; // 195
            currentMax = Math.max(Math.max(nums[i], currentMax * nums[i]), currentMin * nums[i]); // 196
            currentMin = Math.min(Math.min(nums[i], temp * nums[i]), currentMin * nums[i]); // 197
            maxProduct = Math.max(maxProduct, currentMax); // 198
        }

        return maxProduct;
    }


    public int maxProduct19(int[] nums) {
        int maxProduct = nums[0]; // 199
        int currMax = nums[0]; // 200
        int currMin = nums[0]; // 201

        for(int i=1; i<nums.length; i++) { // 202
            int temp = currMax; // 203
            currMax = Math.max(Math.max(nums[i], currMax*nums[i]), currMin*nums[i]); // 204
            currMin = Math.min(Math.min(nums[i], currMin*nums[i]), temp*nums[i]); // 205
            maxProduct = Math.max(currMax, maxProduct); // 206
        }

        return maxProduct;
    }


   public int maxProduct20(int[] nums) {
        int maxProduct = nums[0]; // 207
        int currentMax = nums[0]; // 208
        int currentMin = nums[0]; // 209

        for(int i = 1; i < nums.length; i++) { // 210
            if(nums[i] < 0) { // 211
                int temp = currentMax; // 212
                currentMax = currentMin; // 213
                currentMin = temp; // 214
            }

            currentMax = Math.max(nums[i], currentMax * nums[i]); // 215
            currentMin = Math.min(nums[i], currentMin * nums[i]); // 216

            maxProduct = Math.max(maxProduct, currentMax); // 217
        }

        return maxProduct;
    }
}

