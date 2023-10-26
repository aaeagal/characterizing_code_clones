import java.util.Arrays;

public class PrimeCounter {
    public int countPrimes1(int n) {
        if (n < 3) return 0;
        
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);

        primes[0] = primes[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (!primes[i]) continue;
            for (int j = i * i; j < n; j += i) {
                primes[j] = false;
            }
        }

        int count = 0;
        for (boolean prime : primes) {
            if (prime) count++;
        }

        return count;
    }

    public static int countPrimes2(int n) {
        if (n <= 2)
            return 0;

        boolean[] isParity = new boolean[n];
        int count = 1;
        for (int i = 3; i < n; i += 2) {
            if (isParity[i])
                continue;

            count++;
            if (i > Math.sqrt(n))
                continue;

            for (int j = i * i; j < n; j += 2 * i)
                isParity[j] = true;
        }

        return count;
    }

    public int countPrimes3(int n) {
        boolean[] isNotPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isNotPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    isNotPrime[i*j] = true;
                }
            }
        }
        return count;
    }

    public static int countPrimes4(int n) {
        if(n<=2) 
            return 0;
        boolean[] primes = new boolean[n+1];
        for(int p = 2; p*p <=n; p++){
            if(primes[p] == false){
                for(int i = p*p; i <= n; i += p)
                    primes[i] = true;
            }
        }
        int countPrimes = 0;
        for(int i=2; i<n; i++){
            if(primes[i] == false)
                countPrimes++;
        }
        return countPrimes;
    }
}


public class PrimeNumbers {
    
    private static final int MAX = 5000001;
    private static int[] primes;
    
    static {
        primes = new int[MAX];
        sieve();
    }

    private static void sieve() {
        primes[0] = primes[1] = 0;
        for (int i = 2; i < MAX; i++) {
            primes[i] = 1;
        }
        for (int i = 2; i * i < MAX; i++) {
            if (primes[i] == 1) {
                for (int j = i * i; j < MAX; j += i) {
                    primes[j] = 0;
                }
            }
        }
        for (int i = 2; i < MAX; i++) {
            primes[i] += primes[i-1];
        }
    }

    public int countPrimes5(int n) {
        return primes[n-1];
    }
}

    public static int countPrimes6(int n) {
        if (n <= 2) return 0;
       
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int multiples = i * i; multiples <n; multiples += i) {
                    isPrime[multiples] = false;
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

        public static int countPrimes7(int n) {
            if (n <= 2) {
                return 0;
            }
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
            int numOfPrimes = 0;
            for (boolean prime : primes) {
                numOfPrimes += prime ? 1 : 0;
            }
            return numOfPrimes;
        }

    public static int countPrimes8(int n) {
        if (n <= 2) {
            return 0;
        }
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
    


    public int countPrimes9(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; j*i < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        
        return count;
    }


    public class PrimeNumbers {

        private static final int MAX_N = 5000000;
        private static boolean[] isPrime = new boolean[MAX_N+1];

        static {
            sieve();
        }

        private static void sieve() {
            isPrime[0] = false;
            isPrime[1] = false;
            for (int i = 2; i < isPrime.length; i++)
                isPrime[i] = true;

            for (int i = 2; i * i <= MAX_N; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= MAX_N; j += i)
                        isPrime[j] = false;
                }
            }
        }

        public static int countPrimes10(int n) {
            int res = 0;
            for (int i = 2; i < n; i++)
                if (isPrime[i])
                    res++;
            return res;
        }
    }



    public int countPrimes11(int n) {
        if (n < 2)
            return 0;
        boolean[] primes = new boolean[n ];
        primes[0] = primes[1] = false;
        for (int i = 2; i < n; i++)
            primes[i] = true;
        for (int i = 2; i * i < n; i++)
            if (primes[i])
                for (int j = i * i; j < n; j += i)
                    primes[j] = false;
        int count = 0;
        for (int i = 2; i < n; i++)
            if (primes[i])
                count++;
        return count;
    }

    public static int primes12(int n) {
        boolean prime[] = new boolean[n+1];
        for(int i = 0; i <= n; i++) {
            prime[i] = true;
        }

        for(int p = 2; p * p <= n; p++) {
            if(prime[p]) {
                for(int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        int primeCount = 0;
        for(int i = 2; i < n; i++) {
            if(prime[i]) {
                primeCount++;
            }
        }

        return primeCount;
    }



public class NumberOfPrimes {
    private static final int MAX = 5000001;
    private static boolean[] primeFlag = new boolean[MAX];
    private static int[] countPrimes = new int[MAX];

    static {
        calculatePrimes();
    }

    private static void calculatePrimes13() {
        for (int i = 2; i < MAX; i++) {
            primeFlag[i] = true;
        }
        for (int i = 2; i * i < MAX; i++) {
            if (primeFlag[i]) {
                for (int j = i * i; j < MAX; j += i) {
                    primeFlag[j] = false;
                }
            }
        }
        for (int i = 2; i < MAX; i++) {
            countPrimes[i] = countPrimes[i - 1];
            if (primeFlag[i]) {
                countPrimes[i]++;
            }
        }
    }

    public static int countNumberOfPrimes(int n) {
        return countPrimes[n - 1];
    }
}


public class Main {
    private static boolean[] sieve(int n) {
        boolean[] prime = new boolean[n+1];
        prime[1] = false;
        for (int i = 2; i <= n; i++){
            prime[i] = true;
        }
        for (int p = 2; p * p <= n; p++){
            if (prime[p]){
                for (int i = p * p; i <= n; i += p){
                    prime[i] = false;
                }
            }
        }
        return prime;
    }

    public static int primeCount14(int n) {
        boolean[] primes = sieve(n);
        int primeCount = 0;
        for (int i = 0; i < n; i++) {
            if (primes[i]) {
                primeCount++;
            }
        }
        return primeCount;
    }

    public static void main(String[] args) {
        System.out.println(primeCount(5 * 1000000));
    }
}



public class Main {

    static final int MAX = 5000001;
    static boolean prime[] = new boolean[MAX];
    static int prefix_sum[] = new int[MAX];

    static void SieveOfEratosthenes() {
        for(int i=0;i<MAX;++i)
            prime[i]=true;

        for (int p=2; p*p<=MAX; p++) {
            if (prime[p]) {
                for (int i=p*p; i<=MAX; i += p)
                    prime[i] = false;
            }
        }
        
        prefix_sum[0] = prefix_sum[1] = 0;
        for (int p=2; p<MAX; p++) {
            prefix_sum[p] = prefix_sum[p-1];
            if (prime[p]) {
                prefix_sum[p]++;
            }
        }
    }

    static int numberOfPrimes(int n) {
        return prefix_sum[n];
    }
    
    public static void main(String args[]) {
        SieveOfEratosthenes15();
        System.out.print(numberOfPrimes(10)); // expects 4
        System.out.print(numberOfPrimes(100)); // expects 25
    }
}


public class PrimeCounter {

    private static final int MAX_N = 5000000;
    private static int[] primeCount = new int[MAX_N + 1];

    static {
        primeCount[0] = primeCount[1] = 0;
        boolean[] sieve = new boolean[MAX_N + 1];
        for (int i = 2; i <= MAX_N; i++) {
            primeCount[i] = primeCount[i - 1];
            if (!sieve[i]) {
                primeCount[i]++;
                if ((long) i * i <= MAX_N) {
                    for (int j = i * i; j <= MAX_N; j += i) {
                        sieve[j] = true;
                    }
                }
            }
        }
    }

    public static int primeCounter(int n) {
        if (n < 0 || n > MAX_N) {
            throw new IllegalArgumentException(String.format("Input should be between 0 and %d", MAX_N));
        }
        return primeCount16[n - 1];
    }
}

    public static int countPrimes17(int n) {
        if(n <= 2) return 0;
        
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    isPrime[i * j] = false;
                }
            }
        }

        return count;
    }
}




public class Main {
    private static final int SIZE = 5 * 1000000;
    private static boolean[] primes = new boolean[SIZE];

    public static void constructPrimeSieve() {
        for (int i = 0; i < SIZE; i++) {
            primes[i] = true;
        }
        primes[0] = primes[1] = false;
        for (int p = 2; p * p < SIZE; p++) {
            if (primes[p]) {
                for (int i = p*p; i < SIZE; i += p) {
                    primes[i] = false;
                }
            }
        }
    }

    public static int countPrimes18(int n) {
        constructPrimeSieve();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (primes[i]) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
         System.out.println(countPrimes(100));  
    }
}



import java.util.Arrays;

public class PrimeNumbers {
    public int countPrimes19(int n) {
        if(n < 3)
            return 0;

        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (!primes[i]) 
                continue;
            
            for (int j = i * i; j < n; j += i) {
                primes[j] = false;
            }
        }

        int count = 0;
        for (boolean prime : primes) 
            if (prime) 
                count++;

        return count;
    }
}


public class PrimeNumbers {

    private static final int MAX = 5 * 1000000;
    private static int[] primes = new int[MAX];
  
    static {
        boolean[] isPrime = new boolean[MAX];
        for (int i = 2; i < MAX; i++) {
            isPrime[i] = true;
        }
      
        for (int i = 2; i * i < MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
      
        int numPrimes = 0;
        for (int i = 2; i < MAX; i++) {
            primes[i] = primes[i - 1];
            if (isPrime[i]) {
                primes[i]++;
            }
        }
    }

    public static int numPrimes20(int n) {
        if (n < 0 || n > MAX) {
            throw new IllegalArgumentException("Number must be between 0 and 5000000");
        }
        return primes[n - 1];
    }
}

