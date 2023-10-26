public class Main {
    public int nthSuperUglyNumber1(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            ugly[i] = Integer.MAX_VALUE;

            for (int j = 0; j < primes.length; j++) {
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]);
            }

            for (int j = 0; j < primes.length; j++) {
                if (ugly[i] == primes[j] * ugly[idx[j]]) {
                    idx[j]++;
                }
            }
        }

        return ugly[n - 1];
    }

    public static int nthSuperUglyNumber2(int n, int[] primes) {
        if (n <= 0 || primes == null || primes.length == 0)
            return 0;
            
        int[] superUglyNumbers = new int[n];
        superUglyNumbers[0] = 1;
        
        int[] indexes = new int[primes.length];
        int[] uglyFactorMultiples = new int[primes.length];
        
        for (int i = 0; i < primes.length; i++) {
            uglyFactorMultiples[i] = primes[i];
        }
        
        for (int i = 1; i < n; i++) {
            int min = uglyFactorMultiples[0];
            for (int j = 1; j < primes.length; j++) {
                if (min > uglyFactorMultiples[j]) {
                    min = uglyFactorMultiples[j];
                }
            }
            
            superUglyNumbers[i] = min;
            
            for (int j = 0; j < primes.length; j++) {
                if (min == uglyFactorMultiples[j]) {
                    indexes[j]++;
                    uglyFactorMultiples[j] = superUglyNumbers[indexes[j]]*primes[j];
                }
            }
        }
        return superUglyNumbers[n - 1];
    }

    public int nthSuperUglyNumber3(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            ugly[i] = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]);
            }

            for (int j = 0; j < primes.length; j++) {
                if (ugly[i] == primes[j] * ugly[idx[j]]) {
                    idx[j]++;
                }
            }
        }

        return ugly[n - 1];
    }

    public int nthSuperUglyNumber4(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] index = new int[primes.length];
        int[] val = new int[primes.length];
        Arrays.fill(val, 1);
        
        int next = 1;
        for(int i = 0; i < n; i++) {
            ugly[i] = next;
            
            next = Integer.MAX_VALUE;
            for(int j = 0; j < primes.length; j++) {
                //skip duplicate and avoid overflow
                if(val[j] == ugly[i]) val[j] = ugly[index[j]++] * primes[j];
                //find next ugly number
                next = Math.min(next, val[j]);
            }
        }
        
        return ugly[n - 1];
    }



    public int nthSuperUglyNumber5(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];
            
        ugly[0] = 1;
        for (int i = 1; i < n; i++){
            ugly[i] = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++)
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]);
                
            for (int j = 0; j < primes.length; j++)
                if (ugly[i] == primes[j] * ugly[idx[j]]) 
                    idx[j]++;
        }
            
        return ugly[n - 1];
    }


    public int nthSuperUglyNumber6(int n, int[] primes) {
        PriorityQueue<long[]> queue = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        for (int prime : primes) {
            queue.add(new long[]{prime, prime, 0});
        }
        int[] ugly = new int[n];
        ugly[0] = 1;
        for (int i = 1; i < n; ) {
            long[] peek = queue.peek();
            long nextUgly = peek[0];
            if (ugly[i - 1] != nextUgly) {
                ugly[i++] = (int) nextUgly;
            }
            peek[0] = ugly[++peek[2]] * peek[1];
            queue.add(queue.poll());
        }
        return ugly[n - 1];
    }


    public int nthSuperUglyNumber7(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];
    
        ugly[0] = 1; 

        for(int i = 1; i < n; i++){
            ugly[i] = Integer.MAX_VALUE;
    
            for(int j = 0; j < primes.length; j++){
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]);
            }
    
            for(int j = 0; j < primes.length; j++){
                if (ugly[i] == primes[j] * ugly[idx[j]]) idx[j]++;
            }
        }
        return ugly[n - 1];
    }



    public int nthSuperUglyNumber8(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] index = new int[primes.length];

        ugly[0] = 1; 

        for(int i = 1; i < n; i++){
            ugly[i] = Integer.MAX_VALUE;

            for(int j = 0; j < primes.length; j++)
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[index[j]]);

            for(int j = 0; j < primes.length; j++)
                if (primes[j] * ugly[index[j]] == ugly[i]) index[j]++;
        }

        return ugly[n - 1];
    }



import java.util.PriorityQueue;

public class Main {
    public static int nthSuperUglyNumber9(int n, int[] primes) {
        int[] ugly = new int[n];
        PriorityQueue<Num> pq = new PriorityQueue<>();
        for (int i = 0; i < primes.length; i++) {
            pq.add(new Num(primes[i], 1, primes[i]));
        }
        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            ugly[i] = pq.peek().val;
            while (pq.peek().val == ugly[i]) {
                Num nxt = pq.poll();
                pq.add(new Num(nxt.p * ugly[nxt.idx], nxt.idx + 1, nxt.p));
            }
        }

        return ugly[n - 1];
    }

    private static class Num implements Comparable<Num> {
        int val;
        int idx;
        int p;

        public Num(int val, int idx, int p) {
            this.val = val;
            this.idx = idx;
            this.p = p;
        }

        @Override
        public int compareTo(Num that) {
            return this.val - that.val;
        }
    }

    public static void main(String[] args) {
        int[] primes = {2, 7, 13, 19};
        int n = 12;
        System.out.println(nthSuperUglyNumber(n, primes));  // Output: 32
    }
}


    public int nthSuperUglyNumber10(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] indices = new int[primes.length];
        
        ugly[0] = 1;
        
        for(int i = 1; i < n; i++){
            ugly[i] = Integer.MAX_VALUE;
            
            for(int j = 0; j < primes.length; j++){
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[indices[j]]);
            }
            
            for(int j = 0; j < primes.length; j++){
                if(primes[j] * ugly[indices[j]] == ugly[i]){
                    indices[j]++;
                }
            }
        }
        
        return ugly[n - 1];
    }

    public int nthSuperUglyNumber11(int n, int[] primes) {
        PriorityQueue<Long> queue = new PriorityQueue<>();  
        HashSet<Long> set = new HashSet<>();
        List<Long> result = new ArrayList<>();
        for (int i = 0; i < primes.length; i++) {
            queue.add((long) primes[i]);
            set.add((long) primes[i]);
        }
        Long currUgly = 1L;
        for (int i = 1; i < n; i++) {
            currUgly = queue.poll();
            for (int j = 0; j < primes.length; j++) {
                if (!set.contains(currUgly * primes[j])) {
                    queue.add(currUgly * primes[j]);
                    set.add(currUgly * primes[j]);
                }
            }
        }
        return currUgly.intValue();
    }

    public int nthSuperUglyNumber12(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] index = new int[primes.length];
        ugly[0] = 1;
        
        for (int i = 1; i < n; i++) {
            ugly[i] = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[index[j]]);
            }
            
            for (int j = 0; j < primes.length; j++) {
                while (primes[j] * ugly[index[j]] <= ugly[i]) {
                    index[j]++;
                }
            }
        }
        return ugly[n - 1];
    }

    public int nthSuperUglyNumber13(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] index = new int[primes.length];
        
        ugly[0] = 1;

        for(int i=1; i<n; i++){
            ugly[i] = Integer.MAX_VALUE;
            for(int j=0; j<primes.length; j++){
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[index[j]]);
            }
            
            for(int j=0; j<primes.length; j++){
                if(ugly[i] == primes[j] * ugly[index[j]]){
                    index[j]++;
                }
            }
        }

        return ugly[n-1];
    }

    public int nthSuperUglyNumber14(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] index = new int[primes.length];

        ugly[0] = 1;

        for(int i = 1; i < n; i++){
            ugly[i] = Integer.MAX_VALUE;

            for(int j = 0; j < primes.length; j++){
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[index[j]]);
            }

            for(int j = 0; j < primes.length; j++){
                if(ugly[i] == primes[j] * ugly[index[j]]){
                    index[j]++;
                }
            } 
        }
        return ugly[n-1];
    }



    public int nthSuperUglyNumber15(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];

        ugly[0] = 1;
        for (int i = 1; i < n; i++) {
            // Find next ugly number
            ugly[i] = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++)
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]);
            
            // Increment the index accordingly
            for (int j = 0; j < primes.length; j++) {
                if (ugly[i] == primes[j] * ugly[idx[j]])
                    idx[j]++;
            }
        }

        return ugly[n - 1];
    }


    public int nthSuperUglyNumber16(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] indexes = new int[primes.length];

        ugly[0] = 1; // 1 is a super ugly number

        for (int i = 1; i < n; i++) {
            // Find next super ugly number
            ugly[i] = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[indexes[j]]);
            }

            // Update indexes
            for (int j = 0; j < indexes.length; j++) {
                if (ugly[i] == primes[j] * ugly[indexes[j]]) {
                    indexes[j]++;
                }
            }
        }
        return ugly[n - 1];
    }


    public int nthSuperUglyNumber17(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];

        ugly[0]=1;
        for(int i=1; i<n; i++){
            ugly[i] = Integer.MAX_VALUE;
            for(int j=0; j<primes.length; j++){
                ugly[i] = Math.min(ugly[i],primes[j] * ugly[idx[j]]);
            }
            
            for(int j=0; j<primes.length; j++){
                while (primes[j] * ugly[idx[j]] <= ugly[i]) {
                    idx[j]++;
                }
            }
        }

        return ugly[n-1];
    }

    public int nthSuperUglyNumber18(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] index = new int[primes.length];
        int[] val = new int[primes.length];
        Arrays.fill(val, 1);
        
        int next = 1;
        for(int i = 0; i < n; i++) {
            ugly[i] = next;
            
            next = Integer.MAX_VALUE;
            for(int j = 0; j < primes.length; j++) {
                //skip duplicates
                if(val[j] == ugly[i]) val[j] = ugly[index[j]++] * primes[j];
                //find next ugly number
                next = Math.min(next, val[j]);
            }
        }
        
        return ugly[n - 1];
    }

    public int nthSuperUglyNumber19(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];

        ugly[0] = 1;
        for (int i = 1; i < n; i++) {
            //find next
            ugly[i] = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++)
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]);
            
            //skip duplicate
            for (int j = 0; j < primes.length; j++) {
                while (primes[j] * ugly[idx[j]] == ugly[i]) idx[j]++;
            }
        }

        return ugly[n - 1];
    }

    public int nthSuperUglyNumber20(int n, int[] primes) {    
        PriorityQueue<long[]> pq = new PriorityQueue<>((a,b) -> Long.compare(a[0], b[0]));
        int[] ugly = new int[n];
        ugly[0] = 1;

        for (int i = 0; i < primes.length; i++) {
            pq.offer(new long[]{primes[i], i, 0});
        }

        for (int j = 1; j < n; j++) {
            ugly[j] = (int) pq.peek()[0];
            while (pq.peek()[0] == ugly[j]) {
                long[] next = pq.poll();
                pq.offer(new long[]{ugly[(int)next[2]] * primes[(int)next[1]], next[1], next[2] + 1});
            }
        }

        return ugly[n - 1];
    }
}

