import java.util.Arrays;

public class PrimeCounter {
    public int countPrimes1(int n) {
        if (n < 3) return 0;

        boolean[] primes = new boolean[n]; // 1
        Arrays.fill(primes, true); // 2

        primes[0] = primes[1] = false; // 3

        for (int i = 2; i * i < n; i++) { // 4
            if (!primes[i]) continue; // 5
            for (int j = i * i; j < n; j += i) { // 6
                primes[j] = false; // 7
            }
        }

        int count = 0; // 8
        for (boolean prime : primes) { // 9
            if (prime) count++; // 10
        }

        return count;
    }

    public static int countPrimes2(int n) {
        if (n <= 2) // 11
            return 0;

        boolean[] isParity = new boolean[n]; // 12
        int count = 1; // 13
        for (int i = 3; i < n; i += 2) { // 14
            if (isParity[i]) // 15
                continue; // 16

            count++; // 17
            if (i > Math.sqrt(n)) // 18
                continue; // 19

            for (int j = i * i; j < n; j += 2 * i) // 20
                isParity[j] = true; // 21
        }

        return count;
    }

    public int countPrimes3(int n) {
        boolean[] isNotPrime = new boolean[n]; // 22
        int count = 0; // 23
        for (int i = 2; i < n; i++) { // 24
            if (isNotPrime[i] == false) { // 25
                count++; // 26
                for (int j = 2; i*j < n; j++) { // 27
                    isNotPrime[i*j] = true; // 28
                }
            }
        }
        return count;
    }

    public static int countPrimes4(int n) {
        if(n<=2) // 29
            return 0;
        boolean[] primes = new boolean[n+1]; // 30
        for(int p = 2; p*p <=n; p++){ // 31
            if(primes[p] == false){ // 32
                for(int i = p*p; i <= n; i += p) // 33
                    primes[i] = true; // 34
            }
        }
        int countPrimes = 0; // 35
        for(int i=2; i<n; i++){ // 36
            if(primes[i] == false) // 37
                countPrimes++; // 38
        }
        return countPrimes;
    }
}


public class PrimeNumbers {

    private static final int MAX = 5000001; // 39
    private static int[] primes; // 40

    static { // 41
        primes = new int[MAX]; // 42
        sieve(); // 43
    }

    private static void sieve() { // 44
        primes[0] = primes[1] = 0; // 45
        for (int i = 2; i < MAX; i++) { // 46
            primes[i] = 1; // 47
        }
        for (int i = 2; i * i < MAX; i++) { // 48
            if (primes[i] == 1) { // 49
                for (int j = i * i; j < MAX; j += i) { // 50
                    primes[j] = 0; // 51
                }
            }
        }
        for (int i = 2; i < MAX; i++) { // 52
            primes[i] += primes[i-1]; // 53
        }
    }

    public int countPrimes5(int n) {
        return primes[n-1];
    }
}

    public static int countPrimes6(int n) {
        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n]; // 54
        Arrays.fill(isPrime, true); // 55

        for (int i = 2; i * i < n; i++) { // 56
            if (isPrime[i]) { // 57
                for (int multiples = i * i; multiples <n; multiples += i) { // 58
                    isPrime[multiples] = false; // 59
                }
            }
        }

        int count = 0; // 60
        for (int i = 2; i < n; i++) { // 61
            if (isPrime[i]) { // 62
                count++; // 63
            }
        }

        return count;
    }

        public static int countPrimes7(int n) {
            if (n <= 2) { // 64
                return 0;
            }
            boolean[] primes = new boolean[n]; // 65
            Arrays.fill(primes, true); // 66
            primes[0] = primes[1] = false; // 67
            for (int i = 2; i * i < n; i++) { // 68
                if (primes[i]) { // 69
                    for (int j = i * i; j < n; j += i) { // 70
                        primes[j] = false; // 71
                    }
                }
            }
            int numOfPrimes = 0; // 72
            for (boolean prime : primes) { // 73
                numOfPrimes += prime ? 1 : 0; // 74
            }
            return numOfPrimes;
        }

    public static int countPrimes8(int n) {
        if (n <= 2) { // 75
            return 0;
        }
        boolean[] primes = new boolean[n]; // 76
        Arrays.fill(primes, true); // 77
        primes[0] = primes[1] = false; // 78
        for (int i = 2; i * i < n; i++) { // 79
            if (primes[i]) { // 80
                for (int j = i * i; j < n; j += i) { // 81
                    primes[j] = false; // 82
                }
            }
        }
        int count = 0; // 83
        for (boolean prime : primes) { // 84
            if (prime) { // 85
                count++; // 86
            }
        }
        return count;
    }



    public int countPrimes9(int n) {
        boolean[] notPrime = new boolean[n]; // 87
        int count = 0; // 88
        for (int i = 2; i < n; i++) { // 89
            if (notPrime[i] == false) { // 90
                count++; // 91
                for (int j = 2; j*i < n; j++) { // 92
                    notPrime[i*j] = true; // 93
                }
            }
        }

        return count;
    }


    public class PrimeNumbers {

        private static final int MAX_N = 5000000; // 94
        private static boolean[] isPrime = new boolean[MAX_N+1]; // 95

        static { // 96
            sieve(); // 97
        }

        private static void sieve() { // 98
            isPrime[0] = false; // 99
            isPrime[1] = false; // 100
            for (int i = 2; i < isPrime.length; i++) // 101
                isPrime[i] = true; // 102

            for (int i = 2; i * i <= MAX_N; i++) { // 103
                if (isPrime[i]) { // 104
                    for (int j = i * i; j <= MAX_N; j += i) // 105
                        isPrime[j] = false; // 106
                }
            }
        }

        public static int countPrimes10(int n) {
            int res = 0; // 107
            for (int i = 2; i < n; i++) // 108
                if (isPrime[i]) // 109
                    res++; // 110
            return res;
        }
    }



    public int countPrimes11(int n) {
        if (n < 2) // 111
            return 0;
        boolean[] primes = new boolean[n ]; // 112
        primes[0] = primes[1] = false; // 113
        for (int i = 2; i < n; i++) // 114
            primes[i] = true; // 115
        for (int i = 2; i * i < n; i++) // 116
            if (primes[i]) // 117
                for (int j = i * i; j < n; j += i) // 118
                    primes[j] = false; // 119
        int count = 0; // 120
        for (int i = 2; i < n; i++) // 121
            if (primes[i]) // 122
                count++; // 123
        return count;
    }

    public static int primes12(int n) {
        boolean prime[] = new boolean[n+1]; // 124
        for(int i = 0; i <= n; i++) { // 125
            prime[i] = true; // 126
        }

        for(int p = 2; p * p <= n; p++) { // 127
            if(prime[p]) { // 128
                for(int i = p * p; i <= n; i += p) { // 129
                    prime[i] = false; // 130
                }
            }
        }

        int primeCount = 0; // 131
        for(int i = 2; i < n; i++) { // 132
            if(prime[i]) { // 133
                primeCount++; // 134
            }
        }

        return primeCount;
    }



public class NumberOfPrimes {
    private static final int MAX = 5000001; // 135
    private static boolean[] primeFlag = new boolean[MAX]; // 136
    private static int[] countPrimes = new int[MAX]; // 137

    static { // 138
        calculatePrimes(); // 139
    }

    private static void calculatePrimes13() { // 140
        for (int i = 2; i < MAX; i++) { // 141
            primeFlag[i] = true; // 142
        }
        for (int i = 2; i * i < MAX; i++) { // 143
            if (primeFlag[i]) { // 144
                for (int j = i * i; j < MAX; j += i) { // 145
                    primeFlag[j] = false; // 146
                }
            }
        }
        for (int i = 2; i < MAX; i++) { // 147
            countPrimes[i] = countPrimes[i - 1]; // 148
            if (primeFlag[i]) { // 149
                countPrimes[i]++; // 150
            }
        }
    }

    public static int countNumberOfPrimes(int n) {
        return countPrimes[n - 1];
    }
}


public class Main {
    private static boolean[] sieve(int n) { // 151
        boolean[] prime = new boolean[n+1]; // 152
        prime[1] = false; // 153
        for (int i = 2; i <= n; i++){ // 154
            prime[i] = true; // 155
        }
        for (int p = 2; p * p <= n; p++){ // 156
            if (prime[p]){ // 157
                for (int i = p * p; i <= n; i += p){ // 158
                    prime[i] = false; // 159
                }
            }
        }
        return prime;
    }

    public static int primeCount14(int n) {
        boolean[] primes = sieve(n); // 160
        int primeCount = 0; // 161
        for (int i = 0; i < n; i++) { // 162
            if (primes[i]) { // 163
                primeCount++; // 164
            }
        }
        return primeCount;
    }

    public static void main(String[] args) {
        System.out.println(primeCount(5 * 1000000)); // 165
    }
}



public class Main {

    static final int MAX = 5000001; // 166
    static boolean prime[] = new boolean[MAX]; // 167
    static int prefix_sum[] = new int[MAX]; // 168

    static void SieveOfEratosthenes() { // 169
        for(int i=0;i<MAX;++i) // 170
            prime[i]=true; // 171

        for (int p=2; p*p<=MAX; p++) { // 172
            if (prime[p]) { // 173
                for (int i=p*p; i<=MAX; i += p) // 174
                    prime[i] = false; // 175
            }
        }

        prefix_sum[0] = prefix_sum[1] = 0; // 176
        for (int p=2; p<MAX; p++) { // 177
            prefix_sum[p] = prefix_sum[p-1]; // 178
            if (prime[p]) { // 179
                prefix_sum[p]++; // 180
            }
        }
    }

    static int numberOfPrimes(int n) { // 181
        return prefix_sum[n];
    }

    public static void main(String args[]) {
        SieveOfEratosthenes15(); // 182
        System.out.print(numberOfPrimes(10)); // expects 4 // 183
        System.out.print(numberOfPrimes(100)); // expects 25 // 184
    }
}


public class PrimeCounter {

    private static final int MAX_N = 5000000; // 185
    private static int[] primeCount = new int[MAX_N + 1]; // 186

    static { // 187
        primeCount[0] = primeCount[1] = 0; // 188
        boolean[] sieve = new boolean[MAX_N + 1]; // 189
        for (int i = 2; i <= MAX_N; i++) { // 190
            primeCount[i] = primeCount[i - 1]; // 191
            if (!sieve[i]) { // 192
                primeCount[i]++; // 193
                if ((long) i * i <= MAX_N) { // 194
                    for (int j = i * i; j <= MAX_N; j += i) { // 195
                        sieve[j] = true; // 196
                    }
                }
            }
        }
    }

    public static int primeCounter(int n) {
        if (n < 0 || n > MAX_N) { // 197
            throw new IllegalArgumentException(String.format("Input should be between 0 and %d", MAX_N)); // 198
        }
        return primeCount16[n - 1];
    }
}

    public static int countPrimes17(int n) {
        if(n <= 2) return 0;

        boolean[] isPrime = new boolean[n]; // 199
        Arrays.fill(isPrime, true); // 200
        isPrime[0] = false; // 201
        isPrime[1] = false; // 202
        int count = 0; // 203

        for (int i = 2; i < n; i++) { // 204
            if (isPrime[i]) { // 205
                count++; // 206
                for (int j = 2; i * j < n; j++) { // 207
                    isPrime[i * j] = false; // 208
                }
            }
        }

        return count;
    }
}




public class Main {
    private static final int SIZE = 5 * 1000000; // 209
    private static boolean[] primes = new boolean[SIZE]; // 210

    public static void constructPrimeSieve() {
        for (int i = 0; i < SIZE; i++) { // 211
            primes[i] = true; // 212
        }
        primes[0] = primes[1] = false; // 213
        for (int p = 2; p * p < SIZE; p++) { // 214
            if (primes[p]) { // 215
                for (int i = p*p; i < SIZE; i += p) { // 216
                    primes[i] = false; // 217
                }
            }
        }
    }

    public static int countPrimes18(int n) {
        constructPrimeSieve(); // 218
        int count = 0; // 219
        for (int i = 0; i < n; i++) { // 220
            if (primes[i]) { // 221
                count++; // 222
            }
        }
        return count;
    }

    public static void main(String[] args) {
         System.out.println(countPrimes(100)); // 223
    }
}



import java.util.Arrays;

public class PrimeNumbers {
    public int countPrimes19(int n) {
        if(n < 3) // 224
            return 0;

        boolean[] primes = new boolean[n]; // 225
        Arrays.fill(primes, true); // 226
        primes[0] = primes[1] = false; // 227

        for (int i = 2; i * i < n; i++) { // 228
            if (!primes[i]) // 229
                continue; // 230

            for (int j = i * i; j < n; j += i) { // 231
                primes[j] = false; // 232
            }
        }

        int count = 0; // 233
        for (boolean prime : primes) // 234
            if (prime) // 235
                count++; // 236

        return count;
    }
}


public class PrimeNumbers {

    private static final int MAX = 5 * 1000000; // 237
    private static int[] primes = new int[MAX]; // 238

    static { // 239
        boolean[] isPrime = new boolean[MAX]; // 240
        for (int i = 2; i < MAX; i++) { // 241
            isPrime[i] = true; // 242
        }

        for (int i = 2; i * i < MAX; i++) { // 243
            if (isPrime[i]) { // 244
                for (int j = i * i; j < MAX; j += i) { // 245
                    isPrime[j] = false; // 246
                }
            }
        }

        int numPrimes = 0; // 247
        for (int i = 2; i < MAX; i++) { // 248
            primes[i] = primes[i - 1]; // 249
            if (isPrime[i]) { // 250
                primes[i]++; // 251
            }
        }
    }

    public static int numPrimes20(int n) {
        if (n < 0 || n > MAX) { // 252
            throw new IllegalArgumentException("Number must be between 0 and 5000000"); // 253
        }
        return primes[n - 1];
    }
}

