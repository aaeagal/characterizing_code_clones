
public class PrimeNumbersCounter {
    public static int countPrimeNumbers(int n) {
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
}

public class PrimeNumbersCounter {
    public static int countPrimeNumbers(int n) {
        if (n <= 2) {
            return 0;
        }
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
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
}

public class PrimeNumbers {
    
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

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
    
}

public class PrimeCount {
    public int countPrimes(int n) {
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
}

public class PrimeNumbersCount {
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
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
}

public class PrimeNumbers {

    public static int countPrimeNumbers(int n) {
        boolean[] isComposite = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
                for (int j = i + i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Number of prime numbers less than " + n + ": " + countPrimeNumbers(n));
    }
}


public class PrimeNumbersCount {
    public static int countPrimeNumbers(int n) {
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);

        for (int i = 2; i * i < n; i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;
            }
        }

        return count;
    }
}

public class PrimeNumberCounter {
    public static int countPrimeNumbers(int n) {
        boolean[] primes = new boolean[n];
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            primes[i] = true;
        }
        
        for (int p = 2; p * p < n; p++) {
            if (primes[p]) {
                for (int i = p * p; i < n; i += p) {
                    primes[i] = false;
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
}

public class PrimeNumberCount {
    public static int countPrimeNumbers(int n) {
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

    public static void main(String[] args) {
        int n = 50;
        System.out.println("Number of prime numbers less than " + n + ": " + countPrimeNumbers(n));
    }
}

public class PrimeCount {

    public static int countPrimes(int n) {
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
    
    public static void main(String[] args) {
        int n = 30;
        System.out.println(countPrimes(n));
    }
}

public class PrimeNumbers {
  
  public static int countPrimes(int n) {
    boolean[] isPrime = new boolean[n];
    for (int i = 2; i < n; i++) {
        isPrime[i] = true;
    }
  
    for (int i = 2; i * i < n; i++) {
        if (!isPrime[i]) continue;
        for (int j = i * i; j < n; j += i) {
            isPrime[j] = false;
        }
    }
  
    int count = 0;
    for (int i = 2; i < n; i++) {
        if (isPrime[i]) count++;
    }
  
    return count;
  }
  
  public static void main(String[] args) {
    int n = 100;
    int count = countPrimes(n);
    System.out.println("Number of primes less than " + n + ": " + count);
  }
}

public class PrimeNumbers {
    public static int countPrimeNumbers(int n) {
        if (n <= 1) {
            return 0;
        }

        boolean[] isComposite = new boolean[n];
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    isComposite[i * j] = true;
                }
            }
        }
        
        return count;
    }
}

public class PrimeCount {
    public static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.println("Count of primes less than " + n + ": " + countPrimes(n));
    }
}

public class PrimeNumbers {
    public static int countPrimeNumbers(int n) {
        boolean[] primes = new boolean[n];
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (!primes[i]) {
                count++;
                for (int j = i + i; j < n; j += i) {
                    primes[j] = true;
                }
            }
        }
        
        return count;
    }
}

public class PrimeNumberCount {
    public static int countPrimeNumbers(int n) {
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);

        primes[0] = primes[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean prime : primes) {
            if (prime) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Count of prime numbers less than " + n + " is: " + countPrimeNumbers(n));
    }
}
public class PrimeNumbersCount {
    
    public static int countPrimes(int n) {
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
    
    public static void main(String[] args) {
        int n = 20;
        int count = countPrimes(n);
        System.out.println("Number of prime numbers less than " + n + ": " + count);
    }
}

public class PrimeCount {
    
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
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
    
    public static void main(String[] args) {
        int n = 30;
        int primeCount = countPrimes(n);
        System.out.println("Number of primes less than " + n + ": " + primeCount);
    }
}

public class PrimeNumbers {
    public static int countPrimeNumbers(int n) {
        int count = 0;
        boolean[] isPrime = new boolean[n];
        
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Number of prime numbers less than " + n + ": " + countPrimeNumbers(n));
    }
}

public class PrimeNumbersCounter {
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        
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

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Number of prime numbers less than " + n + ": " + countPrimes(n));
    }
}

public class PrimeCount {
    public static int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        
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
}
