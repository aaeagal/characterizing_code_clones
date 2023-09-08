
public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;

        PriorityQueue<UglyNumber> pq = new PriorityQueue<>();
        for (int prime : primes) {
            pq.add(new UglyNumber(prime, prime, 1));
        }

        for (int i = 1; i < n; i++) {
            uglyNumbers[i] = pq.peek().value;
            while (pq.peek().value == uglyNumbers[i]) {
                UglyNumber next = pq.poll();
                pq.add(new UglyNumber(next.prime, next.factor * uglyNumbers[next.idx], next.idx + 1));
            }
        }

        return uglyNumbers[n - 1];
    }

    class UglyNumber implements Comparable<UglyNumber> {
        int prime;
        int value;
        int idx;
        int factor;

        UglyNumber(int prime, int value, int idx) {
            this.prime = prime;
            this.value = value;
            this.idx = idx;
            this.factor = value / prime;
        }

        public int compareTo(UglyNumber other) {
            return this.value - other.value;
        }
    }
}

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] indexes = new int[primes.length];
        int[] ugly = new int[n];
        ugly[0] = 1;
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, primes[j] * ugly[indexes[j]]);
            }
            ugly[i] = min;
            for (int j = 0; j < primes.length; j++) {
                if (min == primes[j] * ugly[indexes[j]]) {
                    indexes[j]++;
                }
            }
        }
        return ugly[n - 1];
    }
}

public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int[] indexes = new int[primes.length];

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, primes[j] * ugly[indexes[j]]);
            }
            ugly[i] = min;
            for (int j = 0; j < primes.length; j++) {
                if (primes[j] * ugly[indexes[j]] == min) {
                    indexes[j]++;
                }
            }
        }
        return ugly[n - 1];
    }

    public static void main(String[] args) {
        int[] primes = {2, 3, 5};
        int n = 12;
        System.out.println(nthSuperUglyNumber(n, primes));
    }
}


public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;
        int[] dp = new int[n];
        dp[0] = 1;
        int[] indices = new int[k];

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < k; j++) {
                min = Math.min(min, primes[j] * dp[indices[j]]);
            }

            dp[i] = min;

            for (int j = 0; j < k; j++) {
                if (min == primes[j] * dp[indices[j]]) {
                    indices[j]++;
                }
            }
        }

        return dp[n - 1];
    }
}

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n];
        dp[0] = 1;
        int[] indexes = new int[primes.length];
        Arrays.fill(indexes, 0);

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, dp[indexes[j]] * primes[j]);
            }

            dp[i] = min;

            for (int j = 0; j < primes.length; j++) {
                if (min == dp[indexes[j]] * primes[j]) {
                    indexes[j]++;
                }
            }
        }

        return dp[n - 1];
    }
}


public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int[] primeIndexes = new int[primes.length];
        int[] primeMultiples = new int[primes.length];
        
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            
            for (int j = 0; j < primes.length; j++) {
                int multiple = uglyNumbers[primeIndexes[j]] * primes[j];
                primeMultiples[j] = multiple;
                min = Math.min(min, multiple);
            }
            
            uglyNumbers[i] = min;
            
            for (int j = 0; j < primes.length; j++) {
                if (primeMultiples[j] == min) {
                    primeIndexes[j]++;
                }
            }
        }
        
        return uglyNumbers[n - 1];
    }
    
    public static void main(String[] args) {
        int n = 12;
        int[] primes = {2, 7, 13, 19};
        System.out.println(nthSuperUglyNumber(n, primes));
    }
}

public class SuperUglyNumber {

    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        Arrays.fill(ugly, Integer.MAX_VALUE);
        ugly[0] = 1;
        
        int[] indexes = new int[primes.length];
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < primes.length; j++) {
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[indexes[j]]);
            }
            for (int j = 0; j < primes.length; j++) {
                if (ugly[i] == primes[j] * ugly[indexes[j]]) {
                    indexes[j]++;
                }
            }
        }
        
        return ugly[n - 1];
    }
    
    public static void main(String[] args) {
        int n = 12;
        int[] primes = {2, 7, 13, 19};
        int result = nthSuperUglyNumber(n, primes);
        System.out.println(result);
    }
}


public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n];
        dp[0] = 1;
        int[] idx = new int[primes.length];
        
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
            
            for (int j = 0; j < primes.length; j++) {
                dp[i] = Math.min(dp[i], primes[j] * dp[idx[j]]);
            }
            
            for (int j = 0; j < primes.length; j++) {
                if (dp[i] == primes[j] * dp[idx[j]]) {
                    idx[j]++;
                }
            }
        }
        
        return dp[n - 1];
    }
    
    public static void main(String[] args) {
        int n = 12;
        int[] primes = {2, 7, 13, 19};
        
        int nthUglyNumber = nthSuperUglyNumber(n, primes);
        System.out.println("The " + n + "th super ugly number is: " + nthUglyNumber);
    }
}

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];
        int[] val = new int[primes.length];
        Arrays.fill(val, 1);

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                if (val[j] == ugly[i]) {
                    val[j] = primes[j] * ugly[idx[j]++];
                }
                min = Math.min(min, val[j]);
            }
            ugly[i] = min;
        }

        return ugly[n - 1];
    }
}

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];
        int[] val = new int[primes.length];
        Arrays.fill(val, 1);

        int next = 1;
        for (int i = 0; i < n; i++) {
            ugly[i] = next;

            next = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                if (val[j] == ugly[i]) {
                    val[j] = ugly[idx[j]++] * primes[j];
                }
                next = Math.min(next, val[j]);
            }
        }

        return ugly[n - 1];
    }
}


public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] index = new int[primes.length];
        int[] factors = new int[primes.length];
        
        ugly[0] = 1;
        
        for (int i = 1; i < n; i++) {
            int min = findMin(factors);
            ugly[i] = min;
            
            for (int j = 0; j < primes.length; j++) {
                if (min == factors[j]) {
                    factors[j] = primes[j] * ugly[++index[j]];
                }
            }
        }
        
        return ugly[n-1];
    }
    
    private static int findMin(int[] factors) {
        int min = factors[0];
        
        for (int i = 1; i < factors.length; i++) {
            min = Math.min(min, factors[i]);
        }
        
        return min;
    }
    
    public static void main(String[] args) {
        int[] primes = {2, 7, 13, 19};
        int n = 12;
        
        int result = nthSuperUglyNumber(n, primes);
        
        System.out.println("The " + n + "th super ugly number is: " + result);
    }
}

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] index = new int[primes.length];
        int[] uglyNums = new int[primes.length];

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < primes.length; j++) {
                uglyNums[j] = primes[j] * ugly[index[j]];

                if (uglyNums[j] < min) {
                    min = uglyNums[j];
                }
            }

            ugly[i] = min;

            for (int j = 0; j < primes.length; j++) {
                if (uglyNums[j] == min) {
                    index[j]++;
                }
            }
        }

        return ugly[n - 1];
    }
}


public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        
        PriorityQueue<UglyNumber> pq = new PriorityQueue<>();
        for (int prime : primes) {
            pq.offer(new UglyNumber(prime, 1, prime));
        }
        
        for (int i = 1; i < n; i++) {
            ugly[i] = pq.peek().val;
            while (pq.peek().val == ugly[i]) {
                UglyNumber next = pq.poll();
                pq.offer(new UglyNumber(next.prime, next.index + 1, next.prime * ugly[next.index]));
            }
        }
        
        return ugly[n-1];
    }
    
    private class UglyNumber implements Comparable<UglyNumber> {
        int prime;
        int index;
        int val;
        
        public UglyNumber(int prime, int index, int val) {
            this.prime = prime;
            this.index = index;
            this.val = val;
        }
        
        public int compareTo(UglyNumber other) {
            return this.val - other.val;
        }
    }
}

public int nthSuperUglyNumber(int n, int[] primes) {
    int[] ugly = new int[n];
    int[] index = new int[primes.length];
    int[] next = new int[primes.length];
    Arrays.fill(index, 1);
    ugly[0] = 1;
    
    for (int i = 1; i < n; i++) {
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < primes.length; j++) {
            next[j] = ugly[index[j]] * primes[j];
            min = Math.min(min, next[j]);
        }
        ugly[i] = min;
        
        for (int j = 0; j < primes.length; j++) {
            if (min == next[j]) {
                index[j]++;
            }
        }
    }
    
    return ugly[n - 1];
}

public int nthSuperUglyNumber(int n, int[] primes) {
    int[] ugly = new int[n];
    int[] idx = new int[primes.length];
    int[] val = new int[primes.length];
    Arrays.fill(val, 1);
    
    int next = 1;
    for (int i = 0; i < n; i++) {
        ugly[i] = next;
        
        next = Integer.MAX_VALUE;
        for (int j = 0; j < primes.length; j++) {
            if (val[j] == ugly[i]) {
                val[j] = primes[j] * ugly[idx[j]++];
            }
            next = Math.min(next, val[j]);
        }
    }
    
    return ugly[n - 1];
}

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n];
        int[] indices = new int[primes.length];
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, primes[j] * dp[indices[j]]);
            }

            dp[i] = min;

            for (int j = 0; j < primes.length; j++) {
                if (min == primes[j] * dp[indices[j]]) {
                    indices[j]++;
                }
            }
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        int n = 12;
        int[] primes = {2, 7, 13, 19};

        SuperUglyNumber solution = new SuperUglyNumber();
        int result = solution.nthSuperUglyNumber(n, primes);

        System.out.println(result);
    }
}

public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] nums = new int[n];
        nums[0] = 1;

        int[] indexes = new int[primes.length];

        Queue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < primes.length; i++) {
            pq.offer(primes[i]);
        }

        for (int i = 1; i < n; i++) {
            nums[i] = pq.peek();
            while (pq.peek() == nums[i]) {
                pq.poll();
            }
            for (int j = 0; j < primes.length; j++) {
                pq.offer(nums[i] * primes[j]);
            }
        }

        return nums[n - 1];
    }

    public static void main(String[] args) {
        int n = 12;
        int[] primes = {2, 7, 13, 19};

        System.out.println(nthSuperUglyNumber(n, primes));
    }
}

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] result = new int[n];
        result[0] = 1;
        int[] indexes = new int[primes.length];

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            
            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, primes[j] * result[indexes[j]]);
            }

            result[i] = min;

            for (int j = 0; j < primes.length; j++) {
                if (min == primes[j] * result[indexes[j]]) {
                    indexes[j]++;
                }
            }
        }

        return result[n - 1];
    }
}

public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] ptr = new int[primes.length];

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, primes[j] * ugly[ptr[j]]);
            }
            ugly[i] = min;

            for (int j = 0; j < primes.length; j++) {
                if (min == primes[j] * ugly[ptr[j]]) {
                    ptr[j]++;
                }
            }
        }

        return ugly[n - 1];
    }

    public static void main(String[] args) {
        int n = 12;
        int[] primes = {2, 7, 13, 19};
        System.out.println(nthSuperUglyNumber(n, primes));
    }
}

public class SuperUglyNumber {

    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n];
        dp[0] = 1;
        int[] indexes = new int[primes.length];
        
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                int num = dp[indexes[j]] * primes[j];
                min = Math.min(min, num);
            }
            dp[i] = min;
            
            for (int j = 0; j < indexes.length; j++) {
                if (dp[indexes[j]] * primes[j] == min) {
                    indexes[j]++;
                }
            }
        }
        
        return dp[n - 1];
    }
    
    public static void main(String[] args) {
        int n = 12;
        int[] primes = {2, 7, 13, 19};
        
        int nthSuperUgly = nthSuperUglyNumber(n, primes);
        System.out.println("The " + n + "th super ugly number is: " + nthSuperUgly);
    }
}
