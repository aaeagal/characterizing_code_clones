
public class Solution {
    public int maxArea1(int[] height) {
        int maxArea = 0; // 1
        int left = 0; // 2
        int right = height.length - 1; // 3

        while (left < right) { // 4
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left)); // 5
            if (height[left] < height[right]) { // 6
                left++; // 7
            } else { // 8
                right--; // 9
            }
        }
        return maxArea;
    }


    public int maxArea2(int[] height) {
        int maxArea = 0, left = 0, right = height.length - 1; // 10
        while (left < right) { // 11
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left)); // 12
            if (height[left] < height[right]) // 13
                left++; // 14
            else // 15
                right--; // 16
        }
        return maxArea;
    }



    public int maxArea3(int[] height) {
        int left = 0; // 17
        int right = height.length - 1; // 18
        int maxArea = 0; // 19
        while(left < right) { // 20
                int h = Math.min(height[left], height[right]); // 21
                int l = right - left; // 22
                int area = h * l; // 23
                if(area > maxArea) // 24
                    maxArea = area; // 25
                if(height[left] < height[right]) // 26
                    left++; // 27
                else // 28
                    right--; // 29
        }
        return maxArea;
    }



    public int maxArea4(int[] height) {
        int max = 0, left = 0, right = height.length - 1; // 30
        while (left < right) { // 31
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left)); // 32
            if (height[left] < height[right]) { // 33
                left++; // 34
            } else { // 35
                right--; // 36
            }
        }
        return max;
    }


    public int maxArea5(int[] height) {
        int maxArea = 0; // 37
        int left = 0; // 38
        int right = height.length - 1; // 39

        while(left < right) { // 40
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left)); // 41
            if(height[left] < height[right]) { // 42
                left++; // 43
            } else { // 44
                right--; // 45
            }
        }

        return maxArea;
    }


    public int maxArea6(int[] height) {
        int maxArea = 0; // 46
        int left = 0; // 47
        int right = height.length - 1; // 48
        while (left < right) { // 49
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left)); // 50
            if (height[left] < height[right]) { // 51
                left++; // 52
            } else { // 53
                right--; // 54
            }
        }
        return maxArea;
    }


    public int maxArea7(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1; // 55

        while (l < r) { // 56
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l)); // 57

            if (height[l] < height[r]) { // 58
                l++; // 59
            } else { // 60
                r--; // 61
            }
        }

        return maxarea;
    }


    public int maxArea8(int[] height) {
        int maxArea = 0; // 62
        int left = 0; // 63
        int right = height.length - 1; // 64

        while (left < right) { // 65
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left)); // 66
            if (height[left] < height[right]) { // 67
                left++; // 68
            } else { // 69
                right--; // 70
            }
        }

        return maxArea;
    }


    public int maxArea9(int[] height) {
        int maxArea = 0; // 71
        int left = 0; // 72
        int right = height.length - 1; // 73

        while (left < right) { // 74
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left)); // 75

            if (height[left] < height[right]) { // 76
                left++; // 77
            } else { // 78
                right--; // 79
            }
        }
        return maxArea;
    }


    public int maxArea10(int[] height) {
        int maxarea = 0; // 80
        int l = 0; // 81
        int r = height.length - 1; // 82

        while (l < r) { // 83
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l)); // 84
            if (height[l] < height[r]) { // 85
                l++; // 86
            } else { // 87
                r--; // 88
            }
        }
        return maxarea;
    }


    public int maxArea11(int[] height) {
        int max = 0; // 89
        int left = 0; // 90
        int right = height.length - 1; // 91

        while (left < right) { // 92
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left)); // 93
            if (height[left] < height[right]) { // 94
                left++; // 95
            } else { // 96
                right--; // 97
            }
        }
        return max;
    }


    public int maxArea12(int[] height) {
        int maxArea = 0; // 98
        int left = 0; // 99
        int right = height.length - 1; // 100

        while(left < right) { // 101
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left)); // 102

            if(height[left] < height[right]) { // 103
                left++; // 104
            } else { // 105
                right--; // 106
            }
        }

        return maxArea;
    }



    public int maxArea13(int[] height) {
        int maxArea = 0, left = 0, right = height.length - 1; // 107
        while (left < right) { // 108
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left)); // 109
            if (height[left] < height[right]) // 110
                left++; // 111
            else // 112
                right--; // 113
        }
        return maxArea;
    }



    public int maxArea14(int[] height) {
        int max = 0; // 114
        int left = 0; // 115
        int right = height.length - 1; // 116

        while (left < right) { // 117
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left)); // 118
            if (height[left] < height[right]) { // 119
                left++; // 120
            } else { // 121
                right--; // 122
            }
        }

        return max;
    }



    public int maxArea15(int[] height) {
        int max = 0; // 123
        int left = 0; // 124
        int right = height.length - 1; // 125
        while (left < right) { // 126
            int h = Math.min(height[left], height[right]); // 127
            int w = right - left; // 128
            max = Math.max(max, h * w); // 129
            if (height[left] < height[right]) { // 130
                left++; // 131
            } else { // 132
                right--; // 133
            }
        }
        return max;
    }



    public int maxArea16(int[] height) {
        int maxArea = 0, left = 0, right = height.length - 1; // 134
        while (left < right) { // 135
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left)); // 136
            if (height[left] < height[right]) { // 137
                left++; // 138
            } else { // 139
                right--; // 140
            }
        }
        return maxArea;
    }


    public int maxArea17(int[] height) {
        int maxArea = 0; // 141
        int left = 0; // 142
        int right = height.length - 1; // 143

        while(left < right) { // 144
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left)); // 145
            if(height[left] < height[right]) { // 146
                left++; // 147
            } else { // 148
                right--; // 149
            }
        }

        return maxArea;
    }


    public int maxArea18(int[] height) {
        int max = 0; // 150
        int left = 0; // 151
        int right = height.length - 1; // 152

        while (left < right) { // 153
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left)); // 154

            if (height[left] < height[right]) { // 155
                left++; // 156
            } else { // 157
                right--; // 158
            }
        }

        return max;
    }


    public int maxArea19(int[] height) {
        int max = 0, left = 0, right = height.length - 1; // 159
        while (left < right) { // 160
            max = Math.max(max, (right - left) * Math.min(height[left], height[right])); // 161
            if (height[left] < height[right]) { // 162
                left++; // 163
            } else { // 164
                right--; // 165
            }
        }
        return max;
    }


    public int maxArea20(int[] height) {
        int maxArea = 0, l = 0, r = height.length - 1; // 166
        while (l < r) { // 167
            maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - l)); // 168
            if (height[l] < height[r]) { // 169
                l++; // 170
            } else { // 171
                r--; // 172
            }
        }
        return maxArea;
    }

}
