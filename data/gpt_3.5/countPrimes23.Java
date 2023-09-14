
import java.util.Arrays;

public class PrimeCounter {
    public static int countPrimes(int n) {
        // Declare an array to track prime numbers
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        
        // Set 0 and 1 as non-prime
        isPrime[0] = false;
        isPrime[1] = false;
        
        // Iterate through numbers and mark non-prime numbers
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // Count the number of prime numbers
        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) {
                count++;
            }
        }
        
        return count;
    }
}


import java.util.*;

public class PrimeNumbers {

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
        int n = 30;
        System.out.println("Number of prime numbers less than " + n + " is: " + countPrimes(n));
    }
}



public class PrimeNumbers {

    public static int countPrimes(int n) {
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

    public static void main(String[] args) {
        int n = 100;
        int numPrimes = countPrimes(n);
        System.out.println("Number of primes less than " + n + ": " + numPrimes);
    }
}



public class PrimeNumbers {

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
}



public class PrimeNumbers {
    
    public static int countPrimes(int n) {
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
    
}



public class PrimeNumbers {

    public static int countPrimeNumbers(int n) {
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
    
    public static void main(String[] args) {
        int n = 20;
        int count = countPrimeNumbers(n);
        System.out.println("Number of prime numbers less than " + n + ": " + count);
    }

}


import java.util.*;

public class CountPrimeNumbers {

    public static int countPrimeNumbers(int n) {
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 0 || n > 5 * 1000000) {
            System.out.println("Invalid input");
        } else {
            System.out.println(countPrimeNumbers(n));
        }
    }
}



public class PrimeNumbers {
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



public class PrimeNumbers {
  public static int countPrimes(int n) {
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
  
  public static void main(String[] args) {
    int n = 20;
    System.out.println("Number of prime numbers less than " + n + " is: " + countPrimes(n));
  }
}



public class CountPrimes {

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
        int n = 10;
        System.out.println(countPrimes(n)); // Output: 4
    }
}



public class PrimeNumberCounter {
    public static int countPrimeNumbers(int n) {
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
}


import java.util.Arrays;

public class PrimeNumbers {
  
  public static int countPrimeNumbers(int n) {
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
  
  public static void main(String[] args) {
    int n = 20;
    int result = countPrimeNumbers(n);
    System.out.println("Number of prime numbers less than " + n + ": " + result);
  }
}



public class PrimeNumbersCount {
    
    public static int countPrimeNumbers(int n) {
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
    
    public static void main(String[] args) {
        int n = 20;
        int primeCount = countPrimeNumbers(n);
        System.out.println("Number of prime numbers less than " + n + ": " + primeCount);
    }
}




public class PrimeNumbers {
    public static int countPrimeNumbers(int n) {
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}




public class PrimeNumbers {
    public static int countPrimes(int n) {
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



public class PrimeNumbers {

    public static int countPrimeNumbers(int n) {
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

    public static void main(String[] args) {
        int n = 30;
        int count = countPrimeNumbers(n);
        System.out.println("Number of prime numbers less than " + n + ": " + count);
    }
}



import java.util.Arrays;

public class PrimeNumbers {

    public static int countPrimes(int n) {
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

    public static void main(String[] args) {
        int n = 100;
        int count = countPrimes(n);
        System.out.println("The number of prime numbers less than " + n + " is: " + count);
    }
}


public class PrimeNumbers {
    public static int countPrimes(int n) {
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
}


import java.util.Arrays;

public class PrimeCount {
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
}


public class PrimeNumbers {
    
    public static int countPrimeNumbers(int n) {
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
    
    public static void main(String[] args) {
        int n = 100;
        int count = countPrimeNumbers(n);
        System.out.println("Number of prime numbers less than " + n + ": " + count);
    }
}

