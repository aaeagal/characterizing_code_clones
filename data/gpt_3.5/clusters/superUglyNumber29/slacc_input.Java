

import java.util.*;

public class Interleave{
    public static int nthSuperUglyNumber1(int n, int[] primes) {
        int[] dp = new int[n]; // 1
        dp[0] = 1; // 2
        int[] indices = new int[primes.length]; // 3

        for (int i = 1; i < n; i++) { // 4
            int min = Integer.MAX_VALUE; // 5
            for (int j = 0; j < primes.length; j++) { // 6
                min = Math.min(min, primes[j] * dp[indices[j]]); // 7
            }

            dp[i] = min; // 8

            for (int j = 0; j < primes.length; j++) { // 9
                if (min == primes[j] * dp[indices[j]]) { // 10
                    indices[j]++; // 11
                }
            }
        }

        return dp[n-1];
    }

    public static int nthSuperUglyNumber2(int n, int[] primes) {
        int[] ugly = new int[n]; // 12
        int[] indexes = new int[primes.length]; // 13
        int[] factors = new int[primes.length]; // 14
        ugly[0] = 1; // 15

        for (int i = 1; i < n; i++) { // 16
            int min = Integer.MAX_VALUE; // 17
            for (int j = 0; j < primes.length; j++) { // 18
                factors[j] = primes[j] * ugly[indexes[j]]; // 19
                min = Math.min(min, factors[j]); // 20
            }
            ugly[i] = min; // 21

            for (int j = 0; j < primes.length; j++) { // 22
                if (factors[j] == min) { // 23
                    indexes[j]++; // 24
                }
            }
        }

        return ugly[n - 1];
    }


    public int nthSuperUglyNumber3(int n, int[] primes) {
        int[] ugly = new int[n]; // 25
        int[] idx = new int[primes.length]; // 26
        int[] vals = new int[primes.length]; // 27
        Arrays.fill(vals, 1); // 28

        ugly[0] = 1; // 29

        for (int i = 1; i < n; i++) { // 30
            int min = Integer.MAX_VALUE; // 31

            for (int j = 0; j < primes.length; j++) { // 32
                if (vals[j] == ugly[i - 1]) { // 33
                    vals[j] = primes[j] * ugly[idx[j]]; // 34
                    idx[j]++; // 35
                }

                min = Math.min(min, vals[j]); // 36
            }

            ugly[i] = min; // 37
        }

        return ugly[n - 1];
    }

    public static int nthSuperUglyNumber4(int n, int[] primes) {
        int[] ugly = new int[n]; // 38
        int[] index = new int[primes.length]; // 39
        int[] nums = new int[primes.length]; // 40
        Arrays.fill(nums, 1); // 41

        ugly[0] = 1; // 42
        for (int i = 1; i < n; i++) { // 43
            int min = Integer.MAX_VALUE; // 44
            for (int j = 0; j < primes.length; j++) { // 45
                min = Math.min(min, nums[j]); // 46
            }
            ugly[i] = min; // 47

            for (int j = 0; j < primes.length; j++) { // 48
                if (min == nums[j]) { // 49
                    nums[j] = ugly[++index[j]] * primes[j]; // 50
                }
            }
        }

        return ugly[n - 1];
    }


    public static int nthSuperUglyNumber5(int n, int[] primes) {
        int[] ugly = new int[n]; // 51
        int[] idx = new int[primes.length]; // 52
        int[] val = new int[primes.length]; // 53
        ugly[0] = 1; // 54

        for (int i = 1; i < n; i++) { // 55
            int min = Integer.MAX_VALUE; // 56
            for (int j = 0; j < primes.length; j++) { // 57
                val[j] = primes[j] * ugly[idx[j]]; // 58
                min = Math.min(min, val[j]); // 59
            }

            ugly[i] = min; // 60

            for (int j = 0; j < primes.length; j++) { // 61
                if (val[j] == min) { // 62
                    idx[j]++; // 63
                }
            }
        }

        return ugly[n - 1];
    }

    public int nthSuperUglyNumber6(int n, int[] primes) {
        int[] uglyNums = new int[n]; // 64
        uglyNums[0] = 1; // 65

        int[] primeIndices = new int[primes.length]; // 66

        for (int i = 1; i < n; i++) { // 67
            int[] nextNums = new int[primes.length]; // 68
            int minNextNum = Integer.MAX_VALUE; // 69

            for (int j = 0; j < primes.length; j++) { // 70
                nextNums[j] = uglyNums[primeIndices[j]] * primes[j]; // 71
                minNextNum = Math.min(minNextNum, nextNums[j]); // 72
            }

            uglyNums[i] = minNextNum; // 73

            for (int j = 0; j < primes.length; j++) { // 74
                if (nextNums[j] == minNextNum) { // 75
                    primeIndices[j]++; // 76
                }
            }
        }

        return uglyNums[n - 1];
    }




    public static int nthSuperUglyNumber7(int n, int[] primes) {
        int[] ugly = new int[n]; // 77
        int[] index = new int[primes.length]; // 78
        ugly[0] = 1; // 79
        for (int i = 1; i < n; i++) { // 80
            int min = Integer.MAX_VALUE; // 81
            for (int j = 0; j < primes.length; j++) { // 82
                min = Math.min(min, primes[j] * ugly[index[j]]); // 83
            }
            ugly[i] = min; // 84
            for (int j = 0; j < primes.length; j++) { // 85
                if (min == primes[j] * ugly[index[j]]) { // 86
                    index[j]++; // 87
                }
            }
        }
        return ugly[n - 1];
    }

    public int nthSuperUglyNumber8(int n, int[] primes) {
        int[] ugly = new int[n]; // 88
        ugly[0] = 1; // 89
        int[] indexes = new int[primes.length]; // 90
        int[] nextMultiples = new int[primes.length]; // 91
        int nextUgly = 1; // 92

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 93
        for (int i = 0; i < primes.length; i++) { // 94
            pq.offer(primes[i]); // 95
            nextMultiples[i] = primes[i]; // 96
        }

        for (int i = 1; i < n; i++) { // 97
            nextUgly = pq.poll(); // 98
            ugly[i] = nextUgly; // 99

            for (int j = 0; j < primes.length; j++) { // 100
                if (nextMultiples[j] == nextUgly) { // 101
                    pq.offer(ugly[indexes[j]] * primes[j]); // 102
                    indexes[j] += 1; // 103
                    nextMultiples[j] = ugly[indexes[j]] * primes[j]; // 104
                }
            }
        }

        return nextUgly;
    }

    public int nthSuperUglyNumber8(int n, int[] primes) {
        int[] ugly = new int[n]; // 105
        int[] idx = new int[primes.length]; // 106
        int[] factors = new int[primes.length]; // 107

        Arrays.fill(factors, 1); // 108

        for (int i = 1; i < n; i++) { // 109
            ugly[i] = Integer.MAX_VALUE; // 110

            for (int j = 0; j < primes.length; j++) { // 111
                if (factors[j] == ugly[i]) factors[j] = primes[j] * ugly[idx[j]++]; // 112
                ugly[i] = Math.min(ugly[i], factors[j]); // 113
            }
        }

        return ugly[n - 1];
    }

    public int nthSuperUglyNumber9(int n, int[] primes) {
        int[] ugly = new int[n]; // 114
        int[] index = new int[primes.length]; // 115
        int[] nextMultiple = new int[primes.length]; // 116

        ugly[0] = 1; // 117

        for (int i = 1; i < n; i++) { // 118
            int min = Integer.MAX_VALUE; // 119

            for (int j = 0; j < primes.length; j++) { // 120
                int multiple = primes[j] * ugly[index[j]]; // 121
                nextMultiple[j] = multiple; // 122

                min = Math.min(min, multiple); // 123
            }

            ugly[i] = min; // 124

            for (int j = 0; j < primes.length; j++) { // 125
                if (nextMultiple[j] == min) { // 126
                    index[j]++; // 127
                }
            }
        }

        return ugly[n - 1];
    }


    public int nthSuperUglyNumber11(int n, int[] primes) {
        int[] uglyNumbers = new int[n]; // 128
        uglyNumbers[0] = 1; // 129
        int[] primeIndices = new int[primes.length]; // 130
        Arrays.fill(primeIndices, 0); // 131

        for (int i = 1; i < n; i++) { // 132
            int min = Integer.MAX_VALUE; // 133
            for (int j = 0; j < primes.length; j++) { // 134
                min = Math.min(min, uglyNumbers[primeIndices[j]] * primes[j]); // 135
            }

            uglyNumbers[i] = min; // 136

            for (int j = 0; j < primes.length; j++) { // 137
                if (uglyNumbers[primeIndices[j]] * primes[j] == min) { // 138
                    primeIndices[j]++; // 139
                }
            }
        }

        return uglyNumbers[n - 1];
    }

    public static int nthSuperUglyNumber12(int n, int[] primes) {
        int[] ugly = new int[n]; // 140
        int[] idx = new int[primes.length]; // 141
        int[] vals = new int[primes.length]; // 142

        ugly[0] = 1; // 143

        for (int i = 1; i < n; i++) { // 144
            Arrays.fill(vals, Integer.MAX_VALUE); // 145

            for (int j = 0; j < primes.length; j++) { // 146
                vals[j] = ugly[idx[j]] * primes[j]; // 147
            }

            int min = min12(vals); // 148
            ugly[i] = min; // 149

            for (int j = 0; j < primes.length; j++) { // 150
                if (min == vals[j]) // 151
                    idx[j]++; // 152
            }
        }

        return ugly[n - 1];
    }

    public static int min12(int[] array) {
        int min = Integer.MAX_VALUE; // 153

        for (int value : array) { // 154
            if (value < min) // 155
                min = value; // 156
        }

        return min;
    }

    public int nthSuperUglyNumber13(int n, int[] primes) {
        int[] uglyNumbers = new int[n]; // 157
        uglyNumbers[0] = 1; // 158

        int[] primeIndices = new int[primes.length]; // 159

        for (int i = 1; i < n; i++) { // 160
            int min = Integer.MAX_VALUE; // 161

            for (int j = 0; j < primes.length; j++) { // 162
                min = Math.min(min, primes[j] * uglyNumbers[primeIndices[j]]); // 163
            }

            for (int j = 0; j < primes.length; j++) { // 164
                if (primes[j] * uglyNumbers[primeIndices[j]] == min) { // 165
                    primeIndices[j]++; // 166
                }
            }

            uglyNumbers[i] = min; // 167
        }

        return uglyNumbers[n - 1];
    }


    public static int nthSuperUglyNumber14(int n, int[] primes) {
        int[] ugly = new int[n]; // 168
        int[] idx = new int[primes.length]; // 169
        int[] vals = new int[primes.length]; // 170
        Arrays.fill(vals, 1); // 171

        int next = 1; // 172
        for (int i = 0; i < n; i++) { // 173
            ugly[i] = next; // 174

            next = Integer.MAX_VALUE; // 175
            for (int j = 0; j < primes.length; j++) { // 176
                if (vals[j] == next) { // 177
                    idx[j]++; // 178
                    vals[j] = ugly[idx[j]] * primes[j]; // 179
                }
                next = Math.min(next, vals[j]); // 180
            }
        }

        return ugly[n - 1];
    }


    public static int nthSuperUglyNumber15(int n, int[] primes) {
        int[] uglyNumbers = new int[n]; // 181
        uglyNumbers[0] = 1; // 182

        int[] primeIndices = new int[primes.length]; // 183

        Arrays.fill(primeIndices, 0); // 184

        for (int i = 1; i < n; i++) { // 185
            int min = Integer.MAX_VALUE; // 186

            for (int j = 0; j < primes.length; j++) { // 187
                if (uglyNumbers[primeIndices[j]] * primes[j] < min) { // 188
                    min = uglyNumbers[primeIndices[j]] * primes[j]; // 189
                }
            }

            uglyNumbers[i] = min; // 190

            for (int j = 0; j < primes.length; j++) { // 191
                if (uglyNumbers[primeIndices[j]] * primes[j] == min) { // 192
                    primeIndices[j] += 1; // 193
                }
            }
        }

        return uglyNumbers[n - 1];
    }

}


