

import java.util.*;

public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n];
        dp[0] = 1;
        int[] indices = new int[primes.length];
        
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
        
        return dp[n-1];
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
        int[] indexes = new int[primes.length];
        int[] factors = new int[primes.length];
        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                factors[j] = primes[j] * ugly[indexes[j]];
                min = Math.min(min, factors[j]);
            }
            ugly[i] = min;

            for (int j = 0; j < primes.length; j++) {
                if (factors[j] == min) {
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
        System.out.println("The " + n + "th super ugly number: " + result);
    }
}


import java.util.*;

public class SuperUglyNumber {

    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];
        int[] vals = new int[primes.length];
        Arrays.fill(vals, 1);

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < primes.length; j++) {
                if (vals[j] == ugly[i - 1]) {
                    vals[j] = primes[j] * ugly[idx[j]];
                    idx[j]++;
                }

                min = Math.min(min, vals[j]);
            }

            ugly[i] = min;
        }

        return ugly[n - 1];
    }
}



import java.util.*;

public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] index = new int[primes.length];
        int[] nums = new int[primes.length];
        Arrays.fill(nums, 1);

        ugly[0] = 1;
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, nums[j]);
            }
            ugly[i] = min;

            for (int j = 0; j < primes.length; j++) {
                if (min == nums[j]) {
                    nums[j] = ugly[++index[j]] * primes[j];
                }
            }
        }

        return ugly[n - 1];
    }
}



import java.util.PriorityQueue;

public class SuperUglyNumber {
    
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];
        int[] val = new int[primes.length];
        ugly[0] = 1;
        
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                val[j] = primes[j] * ugly[idx[j]];
                min = Math.min(min, val[j]);
            }
            
            ugly[i] = min;
            
            for (int j = 0; j < primes.length; j++) {
                if (val[j] == min) {
                    idx[j]++;
                }
            }
        }
        
        return ugly[n - 1];
    }

    public static void main(String[] args) {
        int n = 10;
        int[] primes = {2, 3, 5};
        int result = nthSuperUglyNumber(n, primes);
        System.out.println("The " + n + "th super ugly number is: " + result);
    }
}



import java.util.PriorityQueue;

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int[] indexes = new int[primes.length];
        PriorityQueue<UglyNumber> pq = new PriorityQueue<>();
        
        for (int i = 0; i < primes.length; i++) {
            pq.offer(new UglyNumber(primes[i], primes[i], i));
        }
        
        for (int i = 1; i < n; i++) {
            ugly[i] = pq.peek().val;
            
            while (pq.peek().val == ugly[i]) {
                UglyNumber curr = pq.poll();
                indexes[curr.primeIndex]++;
                pq.offer(new UglyNumber(curr.num * primes[curr.primeIndex], curr.num, curr.primeIndex));
            }
        }
        
        return ugly[n - 1];
    }
    
    class UglyNumber implements Comparable<UglyNumber> {
        int val;
        int num;
        int primeIndex;
        
        public UglyNumber(int val, int num, int primeIndex) {
            this.val = val;
            this.num = num;
            this.primeIndex = primeIndex;
        }
        
        public int compareTo(UglyNumber other) {
            return this.val - other.val;
        }
    }
}




import java.util.*;

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] uglyNums = new int[n];
        uglyNums[0] = 1;
        
        int[] primeIndices = new int[primes.length];
        
        for (int i = 1; i < n; i++) {
            int[] nextNums = new int[primes.length];
            int minNextNum = Integer.MAX_VALUE;
            
            for (int j = 0; j < primes.length; j++) {
                nextNums[j] = uglyNums[primeIndices[j]] * primes[j];
                minNextNum = Math.min(minNextNum, nextNums[j]);
            }
            
            uglyNums[i] = minNextNum;
            
            for (int j = 0; j < primes.length; j++) {
                if (nextNums[j] == minNextNum) {
                    primeIndices[j]++;
                }
            }
        }
        
        return uglyNums[n - 1];
    }
}



import java.util.*;
public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        PriorityQueue<Num> pq = new PriorityQueue<Num>();
        for (int i = 0; i < primes.length; i++) pq.add(new Num(primes[i], 1, primes[i]));
        for (int i = 1; i < n; i++) {
            ugly[i] = pq.peek().val;

            while (pq.peek().val == ugly[i]) {
                Num nxt = pq.poll();
                pq.add(new Num(nxt.p * ugly[nxt.idx], nxt.idx + 1, nxt.p));
            }
        }
        return ugly[n - 1];
    }

    private class Num implements Comparable<Num> {
        int val;
        int idx;
        int p;

        public Num(int val, int idx, int p) {
            this.val = val;
            this.idx = idx;
            this.p = p;
        }

        public int compareTo(Num other) {
            return this.val - other.val;
        }
    }
}


import java.util.*;

public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] index = new int[primes.length];
        ugly[0] = 1;
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, primes[j] * ugly[index[j]]);
            }
            ugly[i] = min;
            for (int j = 0; j < primes.length; j++) {
                if (min == primes[j] * ugly[index[j]]) {
                    index[j]++;
                }
            }
        }
        return ugly[n - 1];
    }

     public static void main(String []args){
         int n = 12;
         int[] primes = {2, 7, 13, 19};
         System.out.println(nthSuperUglyNumber(n, primes));
     }
}


```java
import java.util.PriorityQueue;

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int[] indexes = new int[primes.length];
        int[] nextMultiples = new int[primes.length];
        int nextUgly = 1;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < primes.length; i++) {
            pq.offer(primes[i]);
            nextMultiples[i] = primes[i];
        }

        for (int i = 1; i < n; i++) {
            nextUgly = pq.poll();
            ugly[i] = nextUgly;

            for (int j = 0; j < primes.length; j++) {
                if (nextMultiples[j] == nextUgly) {
                    pq.offer(ugly[indexes[j]] * primes[j]);
                    indexes[j] += 1;
                    nextMultiples[j] = ugly[indexes[j]] * primes[j];
                }
            }
        }

        return nextUgly;
    }
}
```



import java.util.Arrays;

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];
        int[] factors = new int[primes.length];

        Arrays.fill(factors, 1);

        for (int i = 1; i < n; i++) {
            ugly[i] = Integer.MAX_VALUE;

            for (int j = 0; j < primes.length; j++) {
                if (factors[j] == ugly[i]) factors[j] = primes[j] * ugly[idx[j]++];
                ugly[i] = Math.min(ugly[i], factors[j]);
            }
        }

        return ugly[n - 1];
    }
}


import java.util.*;

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] index = new int[primes.length];
        int[] nextMultiple = new int[primes.length];

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < primes.length; j++) {
                int multiple = primes[j] * ugly[index[j]];
                nextMultiple[j] = multiple;

                min = Math.min(min, multiple);
            }

            ugly[i] = min;

            for (int j = 0; j < primes.length; j++) {
                if (nextMultiple[j] == min) {
                    index[j]++;
                }
            }
        }

        return ugly[n - 1];
    }

    public static void main(String[] args) {
        int n = 12;
        int[] primes = {2, 7, 13, 19};
        SuperUglyNumber solution = new SuperUglyNumber();
        int result = solution.nthSuperUglyNumber(n, primes);
        System.out.println(result);
    }
}



import java.util.PriorityQueue;

public class SuperUglyNumber {
   public int nthSuperUglyNumber(int n, int[] primes) {
      int[] superUgly = new int[n];
      superUgly[0] = 1;

      PriorityQueue<UglyNumber> pq = new PriorityQueue<UglyNumber>();

      for (int prime : primes) {
         pq.add(new UglyNumber(prime, 1, prime));
      }

      for (int i = 1; i < n; i++) {
         superUgly[i] = pq.peek().value;
         while (pq.peek().value == superUgly[i]) {
            UglyNumber next = pq.poll();
            pq.add(new UglyNumber(next.prime, next.index + 1, next.prime * superUgly[next.index]));
         }
      }

      return superUgly[n - 1];
   }

   private class UglyNumber implements Comparable<UglyNumber> {
      int prime;
      int index;
      int value;

      UglyNumber(int prime, int index, int value) {
         this.prime = prime;
         this.index = index;
         this.value = value;
      }

      @Override
      public int compareTo(UglyNumber other) {
         return this.value - other.value;
      }
   }
}



import java.util.*;

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int[] primeIndices = new int[primes.length];
        Arrays.fill(primeIndices, 0);
        
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, uglyNumbers[primeIndices[j]] * primes[j]);
            }
            
            uglyNumbers[i] = min;
            
            for (int j = 0; j < primes.length; j++) {
                if (uglyNumbers[primeIndices[j]] * primes[j] == min) {
                    primeIndices[j]++;
                }
            }
        }
        
        return uglyNumbers[n - 1];
    }
}


import java.util.*;

public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];
        int[] vals = new int[primes.length];

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            Arrays.fill(vals, Integer.MAX_VALUE);

            for (int j = 0; j < primes.length; j++) {
                vals[j] = ugly[idx[j]] * primes[j];
            }

            int min = min(vals);
            ugly[i] = min;

            for (int j = 0; j < primes.length; j++) {
                if (min == vals[j])
                    idx[j]++;
            }
        }

        return ugly[n - 1];
    }

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int value : array) {
            if (value < min)
                min = value;
        }

        return min;
    }
}


public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        
        int[] primeIndices = new int[primes.length];
        
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            
            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, primes[j] * uglyNumbers[primeIndices[j]]);
            }
            
            for (int j = 0; j < primes.length; j++) {
                if (primes[j] * uglyNumbers[primeIndices[j]] == min) {
                    primeIndices[j]++;
                }
            }
            
            uglyNumbers[i] = min;
        }
        
        return uglyNumbers[n - 1];
    }
}


import java.util.*;

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        Queue<UglyNumber> pq = new PriorityQueue<>();
        
        for (int prime : primes) {
            pq.offer(new UglyNumber(prime, prime, 1)); // initialize with prime
        }
        
        for (int i = 1; i < n; i++) {
            ugly[i] = pq.peek().num;
            
            while (pq.peek().num == ugly[i]) {
                UglyNumber next = pq.poll();
                pq.offer(new UglyNumber(next.prime * ugly[next.index], next.prime, next.index + 1));
            }
        }
        
        return ugly[n - 1];
    }
    
    class UglyNumber implements Comparable<UglyNumber> {
        int num;
        int prime;
        int index;
        
        public UglyNumber(int num, int prime, int index) {
            this.num = num;
            this.prime = prime;
            this.index = index;
        }
        
        public int compareTo(UglyNumber other) {
            return this.num - other.num;
        }
    }
}



import java.util.PriorityQueue;

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
                UglyNumber un = pq.poll();
                pq.offer(new UglyNumber(un.prime, un.index + 1, un.prime * ugly[un.index]));
            }
        }

        return ugly[n - 1];
    }

    class UglyNumber implements Comparable<UglyNumber> {
        int prime;
        int index;
        int val;

        public UglyNumber(int prime, int index, int val) {
            this.prime = prime;
            this.index = index;
            this.val = val;
        }

        @Override
        public int compareTo(UglyNumber other) {
            return this.val - other.val;
        }
    }
}



import java.util.*;

public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];
        int[] vals = new int[primes.length];
        Arrays.fill(vals, 1);

        int next = 1;
        for (int i = 0; i < n; i++) {
            ugly[i] = next;

            next = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                if (vals[j] == next) {
                    idx[j]++;
                    vals[j] = ugly[idx[j]] * primes[j];
                }
                next = Math.min(next, vals[j]);
            }
        }

        return ugly[n - 1];
    }

    public static void main(String[] args) {
        int n = 12;
        int[] primes = new int[]{2, 7, 13, 19};
        System.out.println(nthSuperUglyNumber(n, primes));
    }
}



import java.util.Arrays;

public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;

        int[] primeIndices = new int[primes.length];

        Arrays.fill(primeIndices, 0);

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < primes.length; j++) {
                if (uglyNumbers[primeIndices[j]] * primes[j] < min) {
                    min = uglyNumbers[primeIndices[j]] * primes[j];
                }
            }

            uglyNumbers[i] = min;

            for (int j = 0; j < primes.length; j++) {
                if (uglyNumbers[primeIndices[j]] * primes[j] == min) {
                    primeIndices[j] += 1;
                }
            }
        }

        return uglyNumbers[n - 1];
    }

    public static void main(String[] args) {
        int[] primes = {2, 7, 13, 19};
        int n = 12;

        System.out.println(nthSuperUglyNumber(n, primes));
    }
}


