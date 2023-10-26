

import java.util.*;

public class Interleave{
    public static int nthSuperUglyNumber1(int n, int[] primes) {
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

    public static int nthSuperUglyNumber2(int n, int[] primes) {
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


    public int nthSuperUglyNumber3(int n, int[] primes) {
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

    public static int nthSuperUglyNumber4(int n, int[] primes) {
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

    
    public static int nthSuperUglyNumber5(int n, int[] primes) {
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

    public int nthSuperUglyNumber6(int n, int[] primes) {
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




    public static int nthSuperUglyNumber7(int n, int[] primes) {
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

    public int nthSuperUglyNumber8(int n, int[] primes) {
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

    public int nthSuperUglyNumber9(int n, int[] primes) {
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

    public int nthSuperUglyNumber10(int n, int[] primes) {
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


    public int nthSuperUglyNumber11(int n, int[] primes) {
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

    public static int nthSuperUglyNumber12(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];
        int[] vals = new int[primes.length];

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            Arrays.fill(vals, Integer.MAX_VALUE);

            for (int j = 0; j < primes.length; j++) {
                vals[j] = ugly[idx[j]] * primes[j];
            }

            int min = min12(vals);
            ugly[i] = min;

            for (int j = 0; j < primes.length; j++) {
                if (min == vals[j])
                    idx[j]++;
            }
        }

        return ugly[n - 1];
    }

    public static int min12(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int value : array) {
            if (value < min)
                min = value;
        }

        return min;
    }

    public int nthSuperUglyNumber13(int n, int[] primes) {
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


    public static int nthSuperUglyNumber14(int n, int[] primes) {
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


    public static int nthSuperUglyNumber15(int n, int[] primes) {
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

}


