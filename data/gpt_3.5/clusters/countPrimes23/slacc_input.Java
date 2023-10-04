
import java.util.Arrays;

public class Interleave {
    public static int countPrimes1(int n) {

        boolean[] isPrime = new boolean[n]; // 1
        Arrays.fill(isPrime, true); // 2

        isPrime[0] = false; // 3
        isPrime[1] = false; // 4

        for (int i = 2; i * i < n; i++) { // 5
            if (isPrime[i]) { // 6
                for (int j = i * i; j < n; j += i) { // 7
                    isPrime[j] = false; // 8
                }
            }
        }

        int count = 0; // 9
        for (boolean prime : isPrime) { // 10
            if (prime) { // 11
                count++; // 12
            }
        }

        return count;
    }

    public static int countPrimes2(int n) {
        boolean[] isPrime = new boolean[n]; // 13
        Arrays.fill(isPrime, true); // 14

        for (int i = 2; i * i < n; i++) { // 15
            if (isPrime[i]) { // 16
                for (int j = i * i; j < n; j += i) { // 17
                    isPrime[j] = false; // 18
                }
            }
        }

        int count = 0; // 19
        for (int i = 2; i < n; i++) { // 20
            if (isPrime[i]) { // 21
                count++; // 22
            }
        }

        return count;
    }

    public static int countPrimes3(int n) {
        boolean[] isPrime = new boolean[n]; // 23
        int count = 0; // 24

        for (int i = 2; i < n; i++) { // 25
            if (!isPrime[i]) { // 26
                count++; // 27

                for (int j = i; j < n; j += i) { // 28
                    isPrime[j] = true; // 29
                }
            }
        }

        return count;
    }


    public static int countPrimes4(int n) {
        boolean[] isPrime = new boolean[n]; // 30
        for (int i = 2; i < n; i++) { // 31
            isPrime[i] = true; // 32
        }

        for (int i = 2; i * i < n; i++) { // 33
            if (!isPrime[i]) { // 34
                continue; // 35
            }
            for (int j = i * i; j < n; j += i) { // 36
                isPrime[j] = false; // 37
            }
        }

        int count = 0; // 38
        for (int i = 2; i < n; i++) { // 39
            if (isPrime[i]) { // 40
                count++; // 41
            }
        }

        return count;
    }


    public static int countPrimes5(int n) {
        boolean[] primes = new boolean[n]; // 42
        int count = 0; // 43

        for(int i = 2; i < n; i++) { // 44
            if(!primes[i]) { // 45
                count++; // 46
                for(int j = i*i; j < n; j += i) { // 47
                    primes[j] = true; // 48
                }
            }
        }

        return count;
    }

    public static int countPrimeNumbers6(int n) {
        boolean[] sieve = new boolean[n+1]; // 49
        int count = 0; // 50

        for (int i = 2; i < n; i++) { // 51
            if (!sieve[i]) { // 52
                count++; // 53
                for (int j = i+i; j < n; j += i) { // 54
                    sieve[j] = true; // 55
                }
            }
        }

        return count;
    }


    public static int countPrimeNumbers7(int n) {
        boolean[] primes = new boolean[n]; // 56
        Arrays.fill(primes, true); // 57
        primes[0] = false; // 58
        primes[1] = false; // 59
        for (int i = 2; i * i < n; i++) { // 60
            if (primes[i]) { // 61
                for (int j = i * i; j < n; j += i) { // 62
                    primes[j] = false; // 63
                }
            }
        }
        int count = 0; // 64
        for (int i = 0; i < n; i++) { // 65
            if (primes[i]) { // 66
                count++; // 67
            }
        }
        return count;
    }


    public static int countPrimeNumbers8(int n) {
        boolean[] isPrime = new boolean[n]; // 68
        for (int i = 2; i < n; i++) { // 69
            isPrime[i] = true; // 70
        }

        for (int i = 2; i * i < n; i++) { // 71
            if (isPrime[i]) { // 72
                for (int j = i * i; j < n; j += i) { // 73
                    isPrime[j] = false; // 74
                }
            }
        }

        int count = 0; // 75
        for (int i = 2; i < n; i++) { // 76
            if (isPrime[i]) { // 77
                count++; // 78
            }
        }
        return count;
    }

  public static int countPrimes9(int n) {
    boolean[] isPrime = new boolean[n]; // 79
    int count = 0; // 80
    for (int i = 2; i < n; i++) { // 81
      isPrime[i] = true; // 82
    }
    for (int i = 2; i * i < n; i++) { // 83
      if (!isPrime[i]) continue; // 84
      for (int j = i * i; j < n; j += i) { // 85
        isPrime[j] = false; // 86
      }
    }
    for (int i = 2; i < n; i++) { // 87
      if (isPrime[i]) count++; // 88
    }
    return count;
  }



    public static int countPrimes10(int n) {
        boolean[] isPrime = new boolean[n]; // 89
        for (int i = 2; i < n; i++) { // 90
            isPrime[i] = true; // 91
        }
        for (int i = 2; i * i < n; i++) { // 92
            if (!isPrime[i]) { // 93
                continue; // 94
            }
            for (int j = i * i; j < n; j += i) { // 95
                isPrime[j] = false; // 96
            }
        }
        int count = 0; // 97
        for (int i = 2; i < n; i++) { // 98
            if (isPrime[i]) { // 99
                count++; // 100
            }
        }
        return count;
    }

    public static int countPrimeNumbers11(int n) {
        int count = 0; // 101
        boolean[] primes = new boolean[n]; // 102
        for (int i = 0; i < n; i++) { // 103
            primes[i] = true; // 104
        }
        primes[0] = false; // 105
        for (int i = 2; i * i < n; i++) { // 106
            if (primes[i]) { // 107
                for (int j = i * i; j < n; j += i) { // 108
                    primes[j] = false; // 109
                }
            }
        }
        for (int i = 2; i < n; i++) { // 110
            if (primes[i]) { // 111
                count++; // 112
            }
        }
        return count;
    }

  public static int countPrimeNumbers12(int n) {
    boolean[] isPrime = new boolean[n]; // 113
    Arrays.fill(isPrime, true); // 114

    isPrime[0] = false; // 115
    isPrime[1] = false; // 116

    for (int i = 2; i * i < n; i++) { // 117
      if (isPrime[i]) { // 118
        for (int j = i * i; j < n; j += i) { // 119
          isPrime[j] = false; // 120
        }
      }
    }

    int count = 0; // 121
    for (boolean prime : isPrime) { // 122
      if (prime) { // 123
        count++; // 124
      }
    }

    return count;
  }


    public static int countPrimeNumbers13(int n) {
        if (n < 2) { // 125
            return 0;
        }

        boolean[] prime = new boolean[n]; // 126
        int count = 0; // 127

        for (int i = 2; i < n; i++) { // 128
            if (!prime[i]) { // 129
                count++; // 130

                for (int j = i * i; j < n; j += i) { // 131
                    prime[j] = true; // 132
                }
            }
        }

        return count;
    }

    public static int countPrimes15(int n) {
        boolean[] isPrime = new boolean[n]; // 133
        int count = 0; // 134

        for (int i = 2; i < n; i++) { // 135
            isPrime[i] = true; // 136
        }

        for (int i = 2; i * i < n; i++) { // 137
            if (!isPrime[i]) { // 138
                continue; // 139
            }
            for (int j = i * i; j < n; j += i) { // 140
                isPrime[j] = false; // 141
            }
        }

        for (int i = 2; i < n; i++) { // 142
            if (isPrime[i]) { // 143
                count++; // 144
            }
        }

        return count;
    }

    public static int countPrimeNumbers16(int n) {
        if (n <= 2) { // 145
            return 0;
        }

        boolean[] prime = new boolean[n]; // 146
        for (int i = 2; i < n; i++) { // 147
            prime[i] = true; // 148
        }

        for (int p = 2; p * p < n; p++) { // 149
            if (prime[p]) { // 150
                for (int i = p * p; i < n; i += p) { // 151
                    prime[i] = false; // 152
                }
            }
        }

        int count = 0; // 153
        for (int i = 2; i < n; i++) { // 154
            if (prime[i]) { // 155
                count++; // 156
            }
        }

        return count;
    }

    public static int countPrimes17(int n) {
        if (n <= 2) // 157
            return 0;

        boolean[] isPrime = new boolean[n]; // 158
        Arrays.fill(isPrime, true); // 159
        isPrime[0] = false; // 160
        isPrime[1] = false; // 161

        for (int i = 2; i * i < n; i++) { // 162
            if (isPrime[i]) { // 163
                for (int j = i * i; j < n; j += i) // 164
                    isPrime[j] = false; // 165
            }
        }

        int count = 0; // 166
        for (int i = 0; i < n; i++) { // 167
            if (isPrime[i]) // 168
                count++; // 169
        }

        return count;
    }

    public static int countPrimes18(int n) {
        if (n <= 2) { // 170
            return 0;
        }

        boolean[] isComposite = new boolean[n]; // 171
        int count = 0; // 172
        for (int i = 2; i < n; i++) { // 173
            if (!isComposite[i]) { // 174
                count++; // 175
                for (int j = 2; i*j < n; j++) { // 176
                    isComposite[i*j] = true; // 177
                }
            }
        }
        return count;
    }

    public static int countPrimes19(int n) {
        boolean[] isPrime = new boolean[n]; // 178
        Arrays.fill(isPrime, true); // 179

        for (int i = 2; i * i < n; i++) { // 180
            if (isPrime[i]) { // 181
                for (int j = i * i; j < n; j += i) { // 182
                    isPrime[j] = false; // 183
                }
            }
        }

        int count = 0; // 184
        for (int i = 2; i < n; i++) { // 185
            if (isPrime[i]) { // 186
                count++; // 187
            }
        }

        return count;
    }

    public static int countPrimeNumbers20(int n) {
        if (n < 2) { // 188
            return 0;
        }

        boolean[] isComposite = new boolean[n]; // 189

        for (int i = 2; i * i < n; i++) { // 190
            if (!isComposite[i]) { // 191
                for (int j = i * i; j < n; j += i) { // 192
                    isComposite[j] = true; // 193
                }
            }
        }

        int count = 0; // 194

        for (int i = 2; i < n; i++) { // 195
            if (!isComposite[i]) { // 196
                count++; // 197
            }
        }

        return count;
    }
}

