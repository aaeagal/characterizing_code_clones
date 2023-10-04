
public class ContainerWithMostWater {
   public int maxArea1(int[] height) {
        int maxArea = 0; // 1
        int left = 0; // 2
        int right = height.length - 1; // 3

        while (left < right) { // 4
            int currentArea = (right - left) * Math.min(height[left], height[right]); // 5
            maxArea = Math.max(maxArea, currentArea); // 6

            if (height[left] < height[right]) { // 7
                left++; // 8
            } else { // 9
                right--; // 10
            }
        }

        return maxArea;
    }


    public int maxArea2(int[] height) {
        int maxArea = 0; // 11
        int left = 0; // 12
        int right = height.length - 1; // 13

        while(left < right){ // 14
            int currentArea = Math.min(height[left], height[right]) * (right - left); // 15

            if(currentArea > maxArea){ // 16
                maxArea = currentArea; // 17
            }

            if(height[left] < height[right]){ // 18
                left++; // 19
            } else { // 20
                right--; // 21
            }
        }

        return maxArea;
    }





    public static int maxArea3(int[] height) {
        int left = 0; // 22
        int right = height.length - 1; // 23
        int maxArea = 0; // 24

        while (left < right) { // 25
            int area = (right - left) * Math.min(height[left], height[right]); // 26

            maxArea = Math.max(maxArea, area); // 27

            if (height[left] < height[right]) { // 28
                left++; // 29
            } else { // 30
                right--; // 31
            }
        }

        return maxArea;
    }


    public static int maxArea4(int[] height) {
        int maxArea = 0; // 32
        int left = 0; // 33
        int right = height.length - 1; // 34

        while (left < right) { // 35
            int min = Math.min(height[left], height[right]); // 36
            int area = (right - left) * min; // 37
            maxArea = Math.max(maxArea, area); // 38

            if (height[left] < height[right]) { // 39
                left++; // 40
            } else { // 41
                right--; // 42
            }
        }

        return maxArea;
    }



    public static int maxArea5(int[] height) {
        int maxArea = 0; // 43
        int left = 0; // 44
        int right = height.length - 1; // 45

        while (left < right) { // 46
            int currArea = Math.min(height[left], height[right]) * (right - left); // 47
            maxArea = Math.max(maxArea, currArea); // 48

            if (height[left] < height[right]) { // 49
                left++; // 50
            } else { // 51
                right--; // 52
            }
        }

        return maxArea;
    }

    public static int maxArea6(int[] height) {
        int left = 0; // 53
        int right = height.length - 1; // 54
        int maxArea = 0; // 55

        while (left < right) { // 56
            int currentArea = Math.min(height[left], height[right]) * (right - left); // 57
            maxArea = Math.max(maxArea, currentArea); // 58

            if (height[left] < height[right]) { // 59
                left++; // 60
            } else { // 61
                right--; // 62
            }
        }

        return maxArea;
    }


    public static int maxArea7(int[] height) {
        int maxArea = 0; // 63
        int left = 0; // 64
        int right = height.length - 1; // 65

        while (left < right) { // 66
            int minHeight = Math.min(height[left], height[right]); // 67
            int width = right - left; // 68
            int area = minHeight * width; // 69

            if (area > maxArea) { // 70
                maxArea = area; // 71
            }

            if (height[left] < height[right]) { // 72
                left++; // 73
            } else { // 74
                right--; // 75
            }
        }

        return maxArea;
    }


    public static int maxArea8(int[] height) {
        int maxArea = 0; // 76
        int left = 0; // 77
        int right = height.length - 1; // 78

        while (left < right) { // 79
            int area = Math.min(height[left], height[right]) * (right - left); // 80
            maxArea = Math.max(maxArea, area); // 81

            if (height[left] < height[right]) { // 82
                left++; // 83
            } else { // 84
                right--; // 85
            }
        }

        return maxArea;
    }



    public static int maxArea9(int[] height) {
        int maxArea = 0; // 86
        int left = 0; // 87
        int right = height.length - 1; // 88

        while (left < right) { // 89
            int area = Math.min(height[left], height[right]) * (right - left); // 90
            maxArea = Math.max(maxArea, area); // 91

            if (height[left] < height[right]) { // 92
                left++; // 93
            } else { // 94
                right--; // 95
            }
        }

        return maxArea;
    }



    public static int maxArea10(int[] height) {
        int maxArea = 0; // 96
        int left = 0; // 97
        int right = height.length - 1; // 98

        while (left < right) { // 99
            int minHeight = Math.min(height[left], height[right]); // 100
            int currentArea = (right - left) * minHeight; // 101

            if (currentArea > maxArea) { // 102
                maxArea = currentArea; // 103
            }

            if (height[left] < height[right]) { // 104
                left++; // 105
            } else { // 106
                right--; // 107
            }
        }

        return maxArea;
    }



    public static int maxArea11(int[] height) {
        int maxArea = 0; // 108
        int left = 0; // 109
        int right = height.length - 1; // 110

        while (left < right) { // 111
            int area = Math.min(height[left], height[right]) * (right - left); // 112
            maxArea = Math.max(maxArea, area); // 113

            if (height[left] < height[right]) { // 114
                left++; // 115
            } else { // 116
                right--; // 117
            }
        }

        return maxArea;
    }




    public static int maxArea12(int[] height) {
        int maxArea = 0; // 118
        int left = 0; // 119
        int right = height.length - 1; // 120

        while (left < right) { // 121
            int area = Math.min(height[left], height[right]) * (right - left); // 122
            maxArea = Math.max(maxArea, area); // 123

            if (height[left] < height[right]) { // 124
                left++; // 125
            } else { // 126
                right--; // 127
            }
        }

        return maxArea;
    }

    public static int maxArea13(int[] height) {
        int maxArea = 0; // 128
        int left = 0; // 129
        int right = height.length - 1; // 130

        while (left < right) { // 131
            int minHeight = Math.min(height[left], height[right]); // 132
            int width = right - left; // 133
            int area = minHeight * width; // 134

            maxArea = Math.max(maxArea, area); // 135

            if (height[left] < height[right]) { // 136
                left++; // 137
            } else { // 138
                right--; // 139
            }
        }

        return maxArea;
    }


    public static int maxArea14(int[] height) {
        int maxArea = 0; // 140
        int i = 0; // 141
        int j = height.length - 1; // 142

        while (i < j) { // 143
            int h = Math.min(height[i], height[j]); // 144
            int w = j - i; // 145
            int area = h * w; // 146

            maxArea = Math.max(maxArea, area); // 147

            if (height[i] < height[j]) { // 148
                i++; // 149
            } else { // 150
                j--; // 151
            }
        }

        return maxArea;
    }



    public int maxArea15(int[] height) {
        int maxArea = 0; // 152
        int left = 0; // 153
        int right = height.length - 1; // 154

        while (left < right) { // 155
            int area = Math.min(height[left], height[right]) * (right - left); // 156
            maxArea = Math.max(maxArea, area); // 157

            if (height[left] < height[right]) { // 158
                left++; // 159
            } else { // 160
                right--; // 161
            }
        }

        return maxArea;
    }

    public static int maxArea16(int[] height) {
        int left = 0; // 162
        int right = height.length - 1; // 163
        int maxWater = 0; // 164

        while (left < right) { // 165
            int width = right - left; // 166

            int currHeight = Math.min(height[left], height[right]); // 167

            int currArea = width * currHeight; // 168

            maxWater = Math.max(maxWater, currArea); // 169

            if (height[left] < height[right]) { // 170
                left++; // 171
            } else { // 172
                right--; // 173
            }
        }

        return maxWater;
    }



    public static int maxArea17(int[] height) {
        int maxWater = 0; // 174
        int left = 0; // 175
        int right = height.length - 1; // 176

        while (left < right) { // 177
            int currentWater = Math.min(height[left], height[right]) * (right - left); // 178
            maxWater = Math.max(maxWater, currentWater); // 179

            if (height[left] < height[right]) { // 180
                left++; // 181
            } else { // 182
                right--; // 183
            }
        }

        return maxWater;
    }



    public int maxArea18(int[] height) {
        int maxArea = 0; // 184
        int left = 0; // 185
        int right = height.length - 1; // 186

        while (left < right) { // 187
            int currentArea = Math.min(height[left], height[right]) * (right - left); // 188
            maxArea = Math.max(maxArea, currentArea); // 189

            if (height[left] < height[right]) // 190
                left++; // 191
            else // 192
                right--; // 193
        }

        return maxArea;
    }



    public static int maxArea19(int[] height) {
        int maxArea = 0; // 194
        int left = 0; // 195
        int right = height.length - 1; // 196

        while (left < right) { // 197
            int area = Math.min(height[left], height[right]) * (right - left); // 198
            maxArea = Math.max(maxArea, area); // 199

            if (height[left] < height[right]) // 200
                left++; // 201
            else // 202
                right--; // 203
        }

        return maxArea;
    }




    public static int maxArea20(int[] height) {
        int maxArea = 0; // 204
        int left = 0; // 205
        int right = height.length - 1; // 206

        while (left < right) { // 207
            int currentArea = Math.min(height[left], height[right]) * (right - left); // 208
            maxArea = Math.max(maxArea, currentArea); // 209

            if (height[left] < height[right]) { // 210
                left++; // 211
            } else { // 212
                right--; // 213
            }
        }

        return maxArea;
    }


}

