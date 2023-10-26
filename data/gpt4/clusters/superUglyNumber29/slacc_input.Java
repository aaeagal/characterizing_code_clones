public class Main {
    public int nthSuperUglyNumber1(int n, int[] primes) {
        int[] ugly = new int[n]; // 1
        int[] idx = new int[primes.length]; // 2

        ugly[0] = 1; // 3

        for (int i = 1; i < n; i++) { // 4
            ugly[i] = Integer.MAX_VALUE; // 5

            for (int j = 0; j < primes.length; j++) { // 6
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]); // 7
            }

            for (int j = 0; j < primes.length; j++) { // 8
                if (ugly[i] == primes[j] * ugly[idx[j]]) { // 9
                    idx[j]++; // 10
                }
            }
        }

        return ugly[n - 1];
    }

    public static int nthSuperUglyNumber2(int n, int[] primes) {
        if (n <= 0 || primes == null || primes.length == 0) // 11
            return 0;

        int[] superUglyNumbers = new int[n]; // 12
        superUglyNumbers[0] = 1; // 13

        int[] indexes = new int[primes.length]; // 14
        int[] uglyFactorMultiples = new int[primes.length]; // 15

        for (int i = 0; i < primes.length; i++) { // 16
            uglyFactorMultiples[i] = primes[i]; // 17
        }

        for (int i = 1; i < n; i++) { // 18
            int min = uglyFactorMultiples[0]; // 19
            for (int j = 1; j < primes.length; j++) { // 20
                if (min > uglyFactorMultiples[j]) { // 21
                    min = uglyFactorMultiples[j]; // 22
                }
            }

            superUglyNumbers[i] = min; // 23

            for (int j = 0; j < primes.length; j++) { // 24
                if (min == uglyFactorMultiples[j]) { // 25
                    indexes[j]++; // 26
                    uglyFactorMultiples[j] = superUglyNumbers[indexes[j]]*primes[j]; // 27
                }
            }
        }
        return superUglyNumbers[n - 1];
    }

    public int nthSuperUglyNumber3(int n, int[] primes) {
        int[] ugly = new int[n]; // 28
        int[] idx = new int[primes.length]; // 29

        ugly[0] = 1; // 30

        for (int i = 1; i < n; i++) { // 31
            ugly[i] = Integer.MAX_VALUE; // 32
            for (int j = 0; j < primes.length; j++) { // 33
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]); // 34
            }

            for (int j = 0; j < primes.length; j++) { // 35
                if (ugly[i] == primes[j] * ugly[idx[j]]) { // 36
                    idx[j]++; // 37
                }
            }
        }

        return ugly[n - 1];
    }

    public int nthSuperUglyNumber4(int n, int[] primes) {
        int[] ugly = new int[n]; // 38
        int[] index = new int[primes.length]; // 39
        int[] val = new int[primes.length]; // 40
        Arrays.fill(val, 1); // 41

        int next = 1; // 42
        for(int i = 0; i < n; i++) { // 43
            ugly[i] = next; // 44

            next = Integer.MAX_VALUE; // 45
            for(int j = 0; j < primes.length; j++) { // 46
                //skip duplicate and avoid overflow // 47
                if(val[j] == ugly[i]) val[j] = ugly[index[j]++] * primes[j]; // 48
                //find next ugly number // 49
                next = Math.min(next, val[j]); // 50
            }
        }

        return ugly[n - 1];
    }



    public int nthSuperUglyNumber5(int n, int[] primes) {
        int[] ugly = new int[n]; // 51
        int[] idx = new int[primes.length]; // 52

        ugly[0] = 1; // 53
        for (int i = 1; i < n; i++){ // 54
            ugly[i] = Integer.MAX_VALUE; // 55
            for (int j = 0; j < primes.length; j++) // 56
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]); // 57

            for (int j = 0; j < primes.length; j++) // 58
                if (ugly[i] == primes[j] * ugly[idx[j]]) // 59
                    idx[j]++; // 60
        }

        return ugly[n - 1];
    }


    public int nthSuperUglyNumber6(int n, int[] primes) {
        PriorityQueue<long[]> queue = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0])); // 61
        for (int prime : primes) { // 62
            queue.add(new long[]{prime, prime, 0}); // 63
        }
        int[] ugly = new int[n]; // 64
        ugly[0] = 1; // 65
        for (int i = 1; i < n; ) { // 66
            long[] peek = queue.peek(); // 67
            long nextUgly = peek[0]; // 68
            if (ugly[i - 1] != nextUgly) { // 69
                ugly[i++] = (int) nextUgly; // 70
            }
            peek[0] = ugly[++peek[2]] * peek[1]; // 71
            queue.add(queue.poll()); // 72
        }
        return ugly[n - 1];
    }


    public int nthSuperUglyNumber7(int n, int[] primes) {
        int[] ugly = new int[n]; // 73
        int[] idx = new int[primes.length]; // 74

        ugly[0] = 1; // 75

        for(int i = 1; i < n; i++){ // 76
            ugly[i] = Integer.MAX_VALUE; // 77

            for(int j = 0; j < primes.length; j++){ // 78
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]); // 79
            }

            for(int j = 0; j < primes.length; j++){ // 80
                if (ugly[i] == primes[j] * ugly[idx[j]]) idx[j]++; // 81
            }
        }
        return ugly[n - 1];
    }



    public int nthSuperUglyNumber8(int n, int[] primes) {
        int[] ugly = new int[n]; // 82
        int[] index = new int[primes.length]; // 83

        ugly[0] = 1; // 84

        for(int i = 1; i < n; i++){ // 85
            ugly[i] = Integer.MAX_VALUE; // 86

            for(int j = 0; j < primes.length; j++) // 87
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[index[j]]); // 88

            for(int j = 0; j < primes.length; j++) // 89
                if (primes[j] * ugly[index[j]] == ugly[i]) index[j]++; // 90
        }

        return ugly[n - 1];
    }



import java.util.PriorityQueue;

public class Main {
    public static int nthSuperUglyNumber9(int n, int[] primes) {
        int[] ugly = new int[n]; // 91
        PriorityQueue<Num> pq = new PriorityQueue<>(); // 92
        for (int i = 0; i < primes.length; i++) { // 93
            pq.add(new Num(primes[i], 1, primes[i])); // 94
        }
        ugly[0] = 1; // 95

        for (int i = 1; i < n; i++) { // 96
            ugly[i] = pq.peek().val; // 97
            while (pq.peek().val == ugly[i]) { // 98
                Num nxt = pq.poll(); // 99
                pq.add(new Num(nxt.p * ugly[nxt.idx], nxt.idx + 1, nxt.p)); // 100
            }
        }

        return ugly[n - 1];
    }

    private static class Num implements Comparable<Num> {
        int val; // 101
        int idx; // 102
        int p; // 103

        public Num(int val, int idx, int p) {
            this.val = val; // 104
            this.idx = idx; // 105
            this.p = p; // 106
        }

        @Override // 107
        public int compareTo(Num that) {
            return this.val - that.val;
        }
    }

    public static void main(String[] args) {
        int[] primes = {2, 7, 13, 19}; // 108
        int n = 12; // 109
        System.out.println(nthSuperUglyNumber(n, primes));  // Output: 32 // 110
    }
}


    public int nthSuperUglyNumber10(int n, int[] primes) {
        int[] ugly = new int[n]; // 111
        int[] indices = new int[primes.length]; // 112

        ugly[0] = 1; // 113

        for(int i = 1; i < n; i++){ // 114
            ugly[i] = Integer.MAX_VALUE; // 115

            for(int j = 0; j < primes.length; j++){ // 116
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[indices[j]]); // 117
            }

            for(int j = 0; j < primes.length; j++){ // 118
                if(primes[j] * ugly[indices[j]] == ugly[i]){ // 119
                    indices[j]++; // 120
                }
            }
        }

        return ugly[n - 1];
    }

    public int nthSuperUglyNumber11(int n, int[] primes) {
        PriorityQueue<Long> queue = new PriorityQueue<>(); // 121
        HashSet<Long> set = new HashSet<>(); // 122
        List<Long> result = new ArrayList<>(); // 123
        for (int i = 0; i < primes.length; i++) { // 124
            queue.add((long) primes[i]); // 125
            set.add((long) primes[i]); // 126
        }
        Long currUgly = 1L; // 127
        for (int i = 1; i < n; i++) { // 128
            currUgly = queue.poll(); // 129
            for (int j = 0; j < primes.length; j++) { // 130
                if (!set.contains(currUgly * primes[j])) { // 131
                    queue.add(currUgly * primes[j]); // 132
                    set.add(currUgly * primes[j]); // 133
                }
            }
        }
        return currUgly.intValue();
    }

    public int nthSuperUglyNumber12(int n, int[] primes) {
        int[] ugly = new int[n]; // 134
        int[] index = new int[primes.length]; // 135
        ugly[0] = 1; // 136

        for (int i = 1; i < n; i++) { // 137
            ugly[i] = Integer.MAX_VALUE; // 138
            for (int j = 0; j < primes.length; j++) { // 139
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[index[j]]); // 140
            }

            for (int j = 0; j < primes.length; j++) { // 141
                while (primes[j] * ugly[index[j]] <= ugly[i]) { // 142
                    index[j]++; // 143
                }
            }
        }
        return ugly[n - 1];
    }

    public int nthSuperUglyNumber13(int n, int[] primes) {
        int[] ugly = new int[n]; // 144
        int[] index = new int[primes.length]; // 145

        ugly[0] = 1; // 146

        for(int i=1; i<n; i++){ // 147
            ugly[i] = Integer.MAX_VALUE; // 148
            for(int j=0; j<primes.length; j++){ // 149
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[index[j]]); // 150
            }

            for(int j=0; j<primes.length; j++){ // 151
                if(ugly[i] == primes[j] * ugly[index[j]]){ // 152
                    index[j]++; // 153
                }
            }
        }

        return ugly[n-1];
    }

    public int nthSuperUglyNumber14(int n, int[] primes) {
        int[] ugly = new int[n]; // 154
        int[] index = new int[primes.length]; // 155

        ugly[0] = 1; // 156

        for(int i = 1; i < n; i++){ // 157
            ugly[i] = Integer.MAX_VALUE; // 158

            for(int j = 0; j < primes.length; j++){ // 159
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[index[j]]); // 160
            }

            for(int j = 0; j < primes.length; j++){ // 161
                if(ugly[i] == primes[j] * ugly[index[j]]){ // 162
                    index[j]++; // 163
                }
            }
        }
        return ugly[n-1];
    }



    public int nthSuperUglyNumber15(int n, int[] primes) {
        int[] ugly = new int[n]; // 164
        int[] idx = new int[primes.length]; // 165

        ugly[0] = 1; // 166
        for (int i = 1; i < n; i++) { // 167
            // Find next ugly number // 168
            ugly[i] = Integer.MAX_VALUE; // 169
            for (int j = 0; j < primes.length; j++) // 170
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]); // 171

            // Increment the index accordingly // 172
            for (int j = 0; j < primes.length; j++) { // 173
                if (ugly[i] == primes[j] * ugly[idx[j]]) // 174
                    idx[j]++; // 175
            }
        }

        return ugly[n - 1];
    }


    public int nthSuperUglyNumber16(int n, int[] primes) {
        int[] ugly = new int[n]; // 176
        int[] indexes = new int[primes.length]; // 177

        ugly[0] = 1; // 1 is a super ugly number // 178

        for (int i = 1; i < n; i++) { // 179
            // Find next super ugly number // 180
            ugly[i] = Integer.MAX_VALUE; // 181
            for (int j = 0; j < primes.length; j++) { // 182
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[indexes[j]]); // 183
            }

            // Update indexes // 184
            for (int j = 0; j < indexes.length; j++) { // 185
                if (ugly[i] == primes[j] * ugly[indexes[j]]) { // 186
                    indexes[j]++; // 187
                }
            }
        }
        return ugly[n - 1];
    }


    public int nthSuperUglyNumber17(int n, int[] primes) {
        int[] ugly = new int[n]; // 188
        int[] idx = new int[primes.length]; // 189

        ugly[0]=1; // 190
        for(int i=1; i<n; i++){ // 191
            ugly[i] = Integer.MAX_VALUE; // 192
            for(int j=0; j<primes.length; j++){ // 193
                ugly[i] = Math.min(ugly[i],primes[j] * ugly[idx[j]]); // 194
            }

            for(int j=0; j<primes.length; j++){ // 195
                while (primes[j] * ugly[idx[j]] <= ugly[i]) { // 196
                    idx[j]++; // 197
                }
            }
        }

        return ugly[n-1];
    }

    public int nthSuperUglyNumber18(int n, int[] primes) {
        int[] ugly = new int[n]; // 198
        int[] index = new int[primes.length]; // 199
        int[] val = new int[primes.length]; // 200
        Arrays.fill(val, 1); // 201

        int next = 1; // 202
        for(int i = 0; i < n; i++) { // 203
            ugly[i] = next; // 204

            next = Integer.MAX_VALUE; // 205
            for(int j = 0; j < primes.length; j++) { // 206
                //skip duplicates // 207
                if(val[j] == ugly[i]) val[j] = ugly[index[j]++] * primes[j]; // 208
                //find next ugly number // 209
                next = Math.min(next, val[j]); // 210
            }
        }

        return ugly[n - 1];
    }

    public int nthSuperUglyNumber19(int n, int[] primes) {
        int[] ugly = new int[n]; // 211
        int[] idx = new int[primes.length]; // 212

        ugly[0] = 1; // 213
        for (int i = 1; i < n; i++) { // 214
            //find next // 215
            ugly[i] = Integer.MAX_VALUE; // 216
            for (int j = 0; j < primes.length; j++) // 217
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]); // 218

            //skip duplicate // 219
            for (int j = 0; j < primes.length; j++) { // 220
                while (primes[j] * ugly[idx[j]] == ugly[i]) idx[j]++; // 221
            }
        }

        return ugly[n - 1];
    }

    public int nthSuperUglyNumber20(int n, int[] primes) {
        PriorityQueue<long[]> pq = new PriorityQueue<>((a,b) -> Long.compare(a[0], b[0])); // 222
        int[] ugly = new int[n]; // 223
        ugly[0] = 1; // 224

        for (int i = 0; i < primes.length; i++) { // 225
            pq.offer(new long[]{primes[i], i, 0}); // 226
        }

        for (int j = 1; j < n; j++) { // 227
            ugly[j] = (int) pq.peek()[0]; // 228
            while (pq.peek()[0] == ugly[j]) { // 229
                long[] next = pq.poll(); // 230
                pq.offer(new long[]{ugly[(int)next[2]] * primes[(int)next[1]], next[1], next[2] + 1}); // 231
            }
        }

        return ugly[n - 1];
    }
}

