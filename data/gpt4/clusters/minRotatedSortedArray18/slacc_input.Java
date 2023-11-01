public class Solution {

    public int findMin1(int[] nums) {
        if(nums == null || nums.length == 0) // 1
        throw new IllegalArgumentException("Invalid input"); // 2
        int start = 0, end = nums.length - 1; // 3

        while (start < end) { // 4
            int mid = start + (end - start) / 2; // 5

            if (nums[mid] > nums[end]) {  // 6
                start = mid + 1; // 7
            } else {  // 8
                end = mid; // 9
            }
        }
        return nums[start];
    }


    public int findMin2(int[] nums) {
        if (nums.length == 1) { // 10
            return nums[0];
        }

        int left = 0, right = nums.length - 1; // 11

        if (nums[right] > nums[0]) { // 12
            return nums[0];
        }

        while (right >= left) { // 13
            int mid = left + (right - left) / 2; // 14

            if (nums[mid] > nums[mid + 1]) { // 15
                return nums[mid + 1];
            }

            if (nums[mid - 1] > nums[mid]) { // 16
                return nums[mid];
            }

            if (nums[mid] > nums[0]) { // 17
                left = mid + 1; // 18
            } else { // 19
                right = mid - 1; // 20
            }
        }
        return -1;
    }


    public int findMin3(int[] nums) {
        if (nums.length == 1) { // 21
            return nums[0];
        }

        int left = 0, right = nums.length - 1; // 22

        if (nums[right] > nums[0]) { // 23
            return nums[0];
        }

        while (right >= left) { // 24
            int mid = left + (right - left) / 2; // 25

            if (nums[mid] > nums[mid + 1]) { // 26
                return nums[mid + 1];
            }

            if (nums[mid - 1] > nums[mid]) { // 27
                return nums[mid];
            }

            if (nums[mid] > nums[0]) { // 28
                left = mid + 1; // 29
            } else { // 30
                right = mid - 1; // 31
            }
        }
        return -1;
    }


    public int findMin4(int[] nums) {
        if (nums.length == 1) { // 32
            return nums[0];
        }

        int left = 0, right = nums.length - 1; // 33

        if (nums[right] > nums[0]) { // 34
            return nums[0];
        }

        while (right >= left) { // 35
            int mid = left + (right - left) / 2; // 36

            if (nums[mid] > nums[mid + 1]) { // 37
                return nums[mid + 1];
            }

            if (nums[mid - 1] > nums[mid]) { // 38
                return nums[mid];
            }

            if (nums[mid] > nums[0]) { // 39
                left = mid + 1; // 40
            } else { // 41
                right = mid - 1; // 42
            }
        }
        return -1;
    }



    public int findMin5(int[] nums) {
        if (nums == null || nums.length == 0) { // 43
            return -1;
        }

        int left = 0, right = nums.length - 1; // 44

        while (left < right) { // 45
            int mid = left + (right - left) / 2; // 46
            if (nums[mid] > nums[right]) { // 47
                left = mid + 1; // 48
            } else { // 49
                right = mid; // 50
            }
        }
        return nums[left];
    }




    public int findMin6(int[] nums) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0];

        int start = 0, end = nums.length - 1; // 51

        while (start < end) { // 52
            int mid = start + (end - start) / 2; // 53

            if (mid > 0 && nums[mid] < nums[mid - 1]) { // 54
                return nums[mid];
            } else if (nums[start] <= nums[mid] && nums[mid] > nums[end]) { // 55
                start = mid + 1; // 56
            } else { // 57
                end = mid - 1; // 58
            }
        }

        return nums[start];
    }

    public int findMin7(int[] nums) {
        if (nums == null || nums.length == 0) { // 59
            throw new IllegalArgumentException("Invalid input"); // 60
        }

        int start = 0; // 61
        int end = nums.length - 1; // 62

        while (start < end) { // 63
            int mid = start + (end - start) / 2; // 64

            if (nums[mid] > nums[end]) { // 65
                start = mid + 1; // 66
            } else { // 67
                end = mid; // 68
            }
        }

        return nums[start];
    }

    public int findMin8(int[] nums) {
        if (nums.length == 1) { // 69
            return nums[0];
        }

        int left = 0, right = nums.length - 1; // 70

        if (nums[right] > nums[0]) { // 71
            return nums[0];
        }

        while (right >= left) { // 72
            int mid = left + (right - left) / 2; // 73

            if (nums[mid] > nums[mid + 1]) { // 74
                return nums[mid + 1];
            }

            if (nums[mid - 1] > nums[mid]) { // 75
                return nums[mid];
            }

            if (nums[mid] > nums[0]) { // 76
                left = mid + 1; // 77
            } else { // 78
                right = mid - 1; // 79
            }
        }
        return -1;
    }



    public int findMin9(int[] nums) {
        if (nums.length == 1) { // 80
            return nums[0];
        }

        int left = 0, right = nums.length - 1; // 81

        if (nums[right] > nums[0]) { // 82
            return nums[0];
        }

        while (right >= left) { // 83
            int mid = left + (right - left) / 2; // 84

            if (nums[mid] > nums[mid + 1]) { // 85
                return nums[mid + 1];
            }

            if (nums[mid - 1] > nums[mid]) { // 86
                return nums[mid];
            }

            if (nums[mid] > nums[0]) { // 87
                left = mid + 1; // 88
            } else { // 89
                right = mid - 1; // 90
            }
        }
        return -1;
    }


    public int findMin10(int[] nums) {
        if (nums.length == 1) { // 91
            return nums[0];
        }

        int left = 0, right = nums.length - 1; // 92

        if (nums[right] > nums[0]) { // 93
            return nums[0];
        }

        while (right >= left) { // 94
            int mid = left + (right - left) / 2; // 95

            if (nums[mid] > nums[mid + 1]) { // 96
                return nums[mid + 1];
            }

            if (nums[mid - 1] > nums[mid]) { // 97
                return nums[mid];
            }

            if (nums[mid] > nums[0]) { // 98
                left = mid + 1; // 99
            } else { // 100
                right = mid - 1; // 101
            }
        }
        return -1;
    }



    public int findMin11(int[] nums) {
        if (nums.length == 1) { // 102
            return nums[0];
        }

        int left = 0, right = nums.length - 1; // 103

        if (nums[right] > nums[0]) { // 104
            return nums[0];
        }

       while (right >= left) { // 105
            int mid = left + (right - left) / 2; // 106

            if (nums[mid] > nums[mid + 1]) { // 107
                return nums[mid + 1];
            }

            if (nums[mid - 1] > nums[mid]) { // 108
                return nums[mid];
            }

            if (nums[mid] > nums[0]) { // 109
                left = mid + 1; // 110
            } else { // 111
                right = mid - 1; // 112
            }
        }
        return -1;
    }



    public int findMin12(int[] nums) {
        if (nums == null || nums.length == 0) { // 113
            throw new IllegalArgumentException("Invalid input"); // 114
        }
        int left = 0, right = nums.length - 1; // 115
        while (left < right) { // 116
            int mid = left + (right - left) / 2; // 117
            if (nums[mid] > nums[right]) { // 118
                left = mid + 1; // 119
            } else { // 120
                right = mid; // 121
            }
        }
        return nums[left];
    }

    public int findMin13(int[] nums) {
        if (nums.length == 1) { // 122
            return nums[0];
        }
        int left = 0, right = nums.length - 1; // 123
        if (nums[right] > nums[0]) { // 124
            return nums[0];
        }

        while (right >= left) { // 125
            int mid = left + (right - left) / 2; // 126
            if (nums[mid] > nums[mid + 1]) { // 127
                return nums[mid + 1];
            }
            if (nums[mid - 1] > nums[mid]) { // 128
                return nums[mid];
            }
            if (nums[mid] > nums[0]) { // 129
                left = mid + 1; // 130
            } else { // 131
                right = mid - 1; // 132
            }
        }
        return -1;
    }

    public int findMin14(int[] nums) {
        if (nums.length == 1) return nums[0];
        int left = 0; // 133
        int right = nums.length - 1; // 134

        if (nums[right] > nums[0]) return nums[0];

        while (right >= left) { // 135
            int mid = left + (right - left) / 2; // 136

            if (nums[mid] > nums[mid + 1]) return nums[mid + 1];

            if (nums[mid - 1] > nums[mid]) return nums[mid];

            if (nums[mid] > nums[0]) left = mid + 1; // 137
            else right = mid - 1; // 138
        }
        return -1;
    }


    public int findMin15(int[] nums) {
        if (nums.length == 1) { // 139
            return nums[0];
        }
        int left = 0, right = nums.length - 1; // 140
        if(nums[right] > nums[0]) { // 141
            return nums[0];
        }
        while (right >= left) { // 142
            int mid = left + (right - left) / 2; // 143
            if (nums[mid] > nums[mid + 1]) { // 144
                return nums[mid + 1];
            }
            if (nums[mid - 1] > nums[mid]) { // 145
                return nums[mid];
            }
            if (nums[mid] > nums[0]) { // 146
                left = mid + 1; // 147
            } else { // 148
                right = mid - 1; // 149
            }
        }
        return -1;
    }


    public int findMin16(int[] nums) {
        if (nums == null || nums.length == 0) // 150
            return -1;

        int start = 0, end = nums.length - 1; // 151
        while (start < end) { // 152
            int mid = start + (end - start) / 2; // 153
            if (nums[mid] > nums[end]) {  // 154
                start = mid + 1; // 155
            } else { // 156
                end = mid; // 157
            }
        }
        return nums[start];
    }


    public int findMin17(int[] nums) {
        if(nums.length == 1){ // 158
            return nums[0];
        }

        int left = 0, right = nums.length - 1; // 159

        if(nums[right] > nums[0]){ // 160
            return nums[0];
        }

        while(right >= left){ // 161
            int mid = left + (right - left) / 2; // 162

            if(nums[mid] > nums[mid + 1]){ // 163
                return nums[mid + 1];
            }

            if(nums[mid - 1] > nums[mid]){ // 164
                return nums[mid];
            }

            if(nums[mid] > nums[0]){ // 165
                left = mid + 1; // 166
            } else { // 167
                right = mid - 1; // 168
            }
        }
        return -1;
    }

    public int findMin18(int[] nums) {
        if(nums==null || nums.length==0) // 169
            return -1;

        int start=0; // 170
        int end=nums.length-1; // 171
        while(start<=end){ // 172
            if(nums[start]<=nums[end]) // 173
                return nums[start];

            int mid=(start+end)/2; // 174
            if(nums[mid]>=nums[start]){ // 175
                start=mid+1; // 176
            }else{ // 177
                end=mid; // 178
            }
        }
        return -1;
    }



    public int findSmallest19(int[] nums) {
        int left = 0, right = nums.length - 1; // 179
        while (left < right) { // 180
            int midpoint = left + (right - left) / 2; // 181
            if (nums[midpoint] > nums[right]) { // 182
                left = midpoint + 1; // 183
            } else { // 184
                right = midpoint; // 185
            }
        }
        return nums[left];
    }


    public int findMin20(int[] nums) {
        if (nums.length == 1) { // 186
            return nums[0];
        }

        int left = 0, right = nums.length - 1; // 187

        if (nums[right] > nums[0]) { // 188
            return nums[0];
        }

        while (right >= left) { // 189
            int mid = left + (right - left) / 2; // 190

            if (nums[mid] > nums[mid + 1]) { // 191
                return nums[mid + 1];
            }

            if (nums[mid - 1] > nums[mid]) { // 192
                return nums[mid];
            }

            if (nums[mid] > nums[0]) { // 193
                left = mid + 1; // 194
            } else { // 195
                right = mid - 1; // 196
            }
        }
        return -1;
    }

}
