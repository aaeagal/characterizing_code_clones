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

