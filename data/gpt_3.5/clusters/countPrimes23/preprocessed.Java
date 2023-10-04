
import java.util.Arrays;

public class Interleave {
    public static int countPrimes1(int n) {

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) {
                count++;
            }
        }
        
        return count;
    }

    public static int countPrimes2(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }

    public static int countPrimes3(int n) {
        boolean[] isPrime = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!isPrime[i]) {
                count++;

                for (int j = i; j < n; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        return count;
    }


    public static int countPrimes4(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }

    
    public static int countPrimes5(int n) {
        boolean[] primes = new boolean[n];
        int count = 0;
        
        for(int i = 2; i < n; i++) {
            if(!primes[i]) {
                count++;
                for(int j = i*i; j < n; j += i) {
                    primes[j] = true;
                }
            }
        }
        
        return count;
    }

    public static int countPrimeNumbers6(int n) {
        boolean[] sieve = new boolean[n+1];
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (!sieve[i]) {
                count++;
                for (int j = i+i; j < n; j += i) {
                    sieve[j] = true;
                }
            }
        }
        
        return count;
    }
    

    public static int countPrimeNumbers7(int n) {
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i * i < n; i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (primes[i]) {
                count++;
            }
        }
        return count;
    }


    public static int countPrimeNumbers8(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }

  public static int countPrimes9(int n) {
    boolean[] isPrime = new boolean[n];
    int count = 0;
    for (int i = 2; i < n; i++) {
      isPrime[i] = true;
    }
    for (int i = 2; i * i < n; i++) {
      if (!isPrime[i]) continue;
      for (int j = i * i; j < n; j += i) {
        isPrime[j] = false;
      }
    }
    for (int i = 2; i < n; i++) {
      if (isPrime[i]) count++;
    }
    return count;
  }
  


    public static int countPrimes10(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }

    public static int countPrimeNumbers11(int n) {
        int count = 0;
        boolean[] primes = new boolean[n];
        for (int i = 0; i < n; i++) {
            primes[i] = true;
        }
        primes[0] = false;
        for (int i = 2; i * i < n; i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;
            }
        }
        return count;
    }
  
  public static int countPrimeNumbers12(int n) {
    boolean[] isPrime = new boolean[n];
    Arrays.fill(isPrime, true);
    
    isPrime[0] = false;
    isPrime[1] = false;
    
    for (int i = 2; i * i < n; i++) {
      if (isPrime[i]) {
        for (int j = i * i; j < n; j += i) {
          isPrime[j] = false;
        }
      }
    }
    
    int count = 0;
    for (boolean prime : isPrime) {
      if (prime) {
        count++;
      }
    }
    
    return count;
  }

    
    public static int countPrimeNumbers13(int n) {
        if (n < 2) {
            return 0;
        }
        
        boolean[] prime = new boolean[n];
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (!prime[i]) {
                count++;
                
                for (int j = i * i; j < n; j += i) {
                    prime[j] = true;
                }
            }
        }
        
        return count;
    }

    public static int countPrimes15(int n) {
        boolean[] isPrime = new boolean[n];
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }

    public static int countPrimeNumbers16(int n) {
        if (n <= 2) {
            return 0;
        }
        
        boolean[] prime = new boolean[n];
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p < n; p++) {
            if (prime[p]) {
                for (int i = p * p; i < n; i += p) {
                    prime[i] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;
            }
        }
        
        return count;
    }

    public static int countPrimes17(int n) {
        if (n <= 2)
            return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i)
                    isPrime[j] = false;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime[i])
                count++;
        }

        return count;
    }

    public static int countPrimes18(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isComposite = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    isComposite[i*j] = true;
                }
            }
        }
        return count;
    }

    public static int countPrimes19(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
    
    public static int countPrimeNumbers20(int n) {
        if (n < 2) {
            return 0;
        }
        
        boolean[] isComposite = new boolean[n];
        
        for (int i = 2; i * i < n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
            }
        }
        
        return count;
    }
}

