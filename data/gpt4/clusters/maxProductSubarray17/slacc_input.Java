public class Solution {
    public int maxProduct1(int[] nums) {
        if (nums.length == 0) { // 1
            return 0;
        }
        int max = nums[0]; // 2
        int min = nums[0]; // 3
        int result = nums[0]; // 4
        for (int i = 1; i < nums.length; i++) { // 5
            int temp = max; // 6
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]); // 7
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]); // 8
            if (max > result) { // 9
                result = max; // 10
            }
        }
        return result;
    }


    public int maxProduct2(int[] nums) {
        if (nums.length == 0) // 11
            return 0;

        int maxProduct = nums[0]; // 12
        int minProduct = nums[0]; // 13
        int result = maxProduct; // 14

        for (int i = 1; i < nums.length; i++) { // 15
            int tempMax = Math.max(nums[i] * maxProduct, Math.max(nums[i] * minProduct, nums[i])); // 16
            minProduct = Math.min(nums[i] * maxProduct, Math.min(nums[i] * minProduct, nums[i])); // 17

            maxProduct = tempMax; // 18

            result = Math.max(maxProduct, result); // 19
        }

        return result;
    }


    public int maxProduct3(int[] nums) {
        int maxSoFar = nums[0]; // 20
        int minSoFar = nums[0]; // 21
        int result = maxSoFar; // 22

        for (int i = 1; i < nums.length; i++) { // 23
            int curr = nums[i]; // 24
            int tmpMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr)); // 25
            minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr)); // 26

            maxSoFar = tmpMax; // 27

            result = Math.max(maxSoFar, result); // 28
        }

        return result;
    }



    public int maxProduct4(int[] nums) {
        if (nums.length == 0) { // 29
            return 0;
        }

        int maxSoFar = nums[0]; // 30
        int minSoFar = nums[0]; // 31
        int result = maxSoFar; // 32

        for (int i = 1; i < nums.length; i++) { // 33
            int curr = nums[i]; // 34
            int tempMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr)); // 35
            minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr)); // 36

            maxSoFar = tempMax; // 37

            result = Math.max(result, maxSoFar); // 38
        }

        return result;
    }

    public int maxProduct5(int[] nums) {
        if (nums == null || nums.length == 0) { // 39
            return 0;
        }

        int maxSoFar = nums[0]; // 40
        int minSoFar = nums[0]; // 41
        int maxProduct = nums[0]; // 42

        for (int i = 1; i < nums.length; i++) { // 43
            int temp = maxSoFar; // 44
            maxSoFar = Math.max(Math.max(maxSoFar * nums[i], minSoFar * nums[i]), nums[i]); // 45
            minSoFar = Math.min(Math.min(temp * nums[i], minSoFar * nums[i]), nums[i]); // 46

            maxProduct = Math.max(maxProduct, maxSoFar); // 47
        }

        return maxProduct;
    }

    public int maxProduct6(int[] nums) {
        if (nums.length == 0) return 0;
        int max_so_far = nums[0]; // 48
        int min_so_far = nums[0]; // 49
        int result = max_so_far; // 50

        for (int i = 1; i < nums.length; i++) { // 51
            int curr_max = Math.max(nums[i] * max_so_far, Math.max(nums[i] * min_so_far, nums[i])); // 52
            int curr_min = Math.min(nums[i] * max_so_far, Math.min(nums[i] * min_so_far, nums[i])); // 53

            max_so_far = curr_max; // 54
            min_so_far = curr_min; // 55

            result = Math.max(result, max_so_far); // 56
        }

        return result;
    }

    public int maxProduct7(int[] nums) {
        if (nums.length == 0) { // 57
            return 0;
        }

        int max = nums[0]; // 58
        int min = nums[0]; // 59
        int result = max; // 60

        for (int i = 1; i < nums.length; i++) { // 61
            int temp_max = Math.max(nums[i] * max, Math.max(nums[i] * min, nums[i])); // 62
            min = Math.min(nums[i] * max, Math.min(nums[i] * min, nums[i])); // 63

            max = temp_max; // 64

            if (max > result) { // 65
                result = max; // 66
            }
        }

        return result;
    }


    public int maxProduct8(int[] nums) {
        if (nums == null || nums.length == 0) { // 67
            return 0;
        }

        int max = nums[0], min = nums[0], result = nums[0]; // 68
        for (int i = 1; i < nums.length; i++) { // 69
            int temp = max; // 70
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]); // 71
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]); // 72
            if (max > result) { // 73
                result = max; // 74
            }
        }
        return result;
    }


    public int maxProduct9(int[] nums) {
        int max = nums[0], min = nums[0], result = nums[0]; // 75
        for(int i = 1; i < nums.length; i++){ // 76
            int temp_max = Math.max(nums[i]*max, Math.max(nums[i]*min, nums[i])); // 77
            min = Math.min(nums[i]*max, Math.min(nums[i]*min, nums[i])); // 78
            max = temp_max; // 79
            result = Math.max(max, result); // 80
        }
        return result;
    }



    public int maxProduct10(int[] nums) {
        int max_product = nums[0]; // 81
        int min_temp = nums[0]; // 82
        int max_temp = nums[0]; // 83

        for (int i = 1; i < nums.length; i++) { // 84
            if (nums[i] < 0) { // 85
                int temp = max_temp; // 86
                max_temp = min_temp; // 87
                min_temp = temp; // 88
            }

            max_temp = Math.max(nums[i], max_temp * nums[i]); // 89
            min_temp = Math.min(nums[i], min_temp * nums[i]); // 90

            max_product = Math.max(max_product, max_temp); // 91
        }

        return max_product;
    }


    public int maxProduct11(int[] nums) {
        if (nums.length == 0) return 0;
        int max = nums[0]; // 92
        int min = nums[0]; // 93
        int result = max; // 94
        for (int i = 1; i < nums.length; i++) { // 95
            int temp = max; // 96
            max = Math.max(nums[i], Math.max(max * nums[i], min * nums[i])); // 97
            min = Math.min(nums[i], Math.min(temp * nums[i], min * nums[i])); // 98
            if (max > result) { // 99
                result = max; // 100
            }
        }
        return result;
    }

    public int maxProduct12(int[] nums) {
        if (nums.length == 0) { // 101
            return 0;
        }

        int maxSoFar = nums[0]; // 102
        int minSoFar = nums[0]; // 103
        int result = maxSoFar; // 104

        for (int i = 1; i < nums.length; i++) { // 105
            int curr = nums[i]; // 106
            int tempMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr)); // 107
            minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr)); // 108

            maxSoFar = tempMax; // 109

            result = Math.max(maxSoFar, result); // 110
        }

        return result;
    }

    public int maxProduct13(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxProduct = nums[0], minProduct = nums[0], result = nums[0]; // 111

        for (int i = 1; i < nums.length; i++) { // 112
            int tempMax = Math.max(nums[i] * maxProduct, Math.max(nums[i] * minProduct, nums[i])); // 113
            minProduct = Math.min(nums[i] * maxProduct, Math.min(nums[i] * minProduct, nums[i])); // 114

            maxProduct = tempMax; // 115

            result = Math.max(result, maxProduct); // 116
        }

        return result;
    }

    public int maxProduct14(int[] nums) {
        if (nums.length == 0) { // 117
            return 0;
        }

        int maxProduct = nums[0]; // 118
        int minProduct = nums[0]; // 119
        int result = maxProduct; // 120

        for (int i = 1; i < nums.length; i++) { // 121
            int temp_max = Math.max(nums[i] * maxProduct, Math.max(nums[i] * minProduct, nums[i])); // 122
            minProduct = Math.min(nums[i] * maxProduct, Math.min(nums[i] * minProduct, nums[i])); // 123

            maxProduct = temp_max; // 124

            result = Math.max(result, maxProduct); // 125
        }

        return result;
    }

    public int maxProduct15(int[] nums) {
        int max = nums[0]; // 126
        int min = nums[0]; // 127
        int result = nums[0]; // 128
        for(int i = 1; i < nums.length; i++){ // 129
            int temp = max; // 130
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]); // 131
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]); // 132
            if(max > result){ // 133
                result = max; // 134
            }
        }
        return result;
    }

    public int maxProduct16(int[] nums) {
        if (nums.length == 0) { // 135
            return 0;
        }

        int maxProduct = nums[0]; // 136
        int minProduct = nums[0]; // 137
        int result = maxProduct; // 138

        for (int i = 1; i < nums.length; i++) { // 139
            int temp = maxProduct; // 140
            maxProduct = Math.max(nums[i] * maxProduct, Math.max(nums[i] * minProduct, nums[i])); // 141
            minProduct = Math.min(nums[i] * temp, Math.min(nums[i] * minProduct, nums[i])); // 142
            if (maxProduct > result) { // 143
                result = maxProduct; // 144
            }
        }
        return result;
    }


    public int maxProduct17(int[] nums) {
        if (nums.length == 0) return 0;

        int max_so_far = nums[0]; // 145
        int min_so_far = nums[0]; // 146
        int result = max_so_far; // 147

        for(int i=1; i<nums.length; i++){ // 148
            int curr = nums[i]; // 149
            int temp_max = Math.max(curr, Math.max(max_so_far * curr, min_so_far * curr)); // 150
            min_so_far = Math.min(curr, Math.min(max_so_far * curr, min_so_far * curr)); // 151

            max_so_far = temp_max; // 152

            result = Math.max(max_so_far, result); // 153
        }

        return result;
    }



    public int maxProduct18(int[] nums) {
        if (nums == null || nums.length == 0) { // 154
            throw new IllegalArgumentException("Array must not be empty."); // 155
        }

        int maxProduct = nums[0]; // 156
        int minProduct = nums[0]; // 157
        int result = maxProduct; // 158

        for(int i = 1; i < nums.length; i++) { // 159

            int tempMax = Math.max(nums[i]*maxProduct, Math.max(nums[i]*minProduct, nums[i])); // 160
            minProduct = Math.min(nums[i]*maxProduct, Math.min(nums[i]*minProduct, nums[i])); // 161

            maxProduct = tempMax; // 162

            result = Math.max(result, maxProduct); // 163
        }

        return result;
    }



    public int maxProduct19(int[] nums) {
        if (nums.length == 0) { // 164
            return 0;
        }

        int max = nums[0]; // 165
        int min = nums[0]; // 166
        int result = max; // 167

        for (int i = 1; i < nums.length; i++) { // 168
            int temp_max = Math.max(nums[i] * max, Math.max(nums[i] * min, nums[i])); // 169
            min = Math.min(nums[i] * max, Math.min(nums[i] * min, nums[i])); // 170

            max = temp_max; // 171

            result = Math.max(result, max); // 172
        }

        return result;
    }


    public int maxProduct20(int[] nums) {
        if (nums == null || nums.length == 0) { // 173
            return 0;
        }

        int max = nums[0], min = nums[0], result = nums[0]; // 174

        for (int i = 1; i < nums.length; i++) { // 175
            int tmp = max; // 176
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]); // 177
            min = Math.min(Math.min(tmp * nums[i], min * nums[i]), nums[i]); // 178
            if (max > result) { // 179
                result = max; // 180
            }
        }

        return result;
    }
}
