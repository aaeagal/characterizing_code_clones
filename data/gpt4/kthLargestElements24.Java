
import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num: nums) {
            queue.add(num);
            if(queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }
}



import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        
        for(int num: nums){
            queue.add(num);
            
            if(queue.size()>k){
                queue.poll();
            }
        }
        
        return queue.peek();
    }
}




import java.util.PriorityQueue;

public class Main {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int val: nums) {
            pq.offer(val);

            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int result = findKthLargest(nums, k);
        System.out.println(result);
    }
}



import java.util.PriorityQueue;

public class Solution {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int num: nums){
            queue.add(num);

            if(queue.size()>k)
                queue.poll();
        }

        return queue.poll();
    }
}



import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for(int i: nums){
            queue.add(i);
            if(queue.size()>k)
                queue.poll();
        }
        return queue.peek();
    }
}


import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));

    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k); // java's priority queue is a min heap
        for(int i: nums){
            q.offer(i); 
            if(q.size() > k){
                q.poll();
            }
        }
        return q.peek();
    }
}
   


import java.util.PriorityQueue;

public class Solution {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for(int i: nums){
            q.offer(i);
 
            if(q.size()>k){
                q.poll();
            }
        }
 
        return q.peek();
    }
}



import java.util.PriorityQueue;

public class Main {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int val : nums) {
            pq.offer(val);
            
            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }
}



import java.util.PriorityQueue;

public class Main {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for(int val : nums) {
            pq.offer(val);
            
            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String args[]) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums, k)); //output 5
    }
}



import java.util.PriorityQueue;

public class Main {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
  
        for(int num: nums){
            queue.add(num);
      
            if(queue.size()>k){
                queue.poll();
            }
        }
    
        return queue.peek();
    }
}



import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for(int i: nums){
            queue.offer(i);
        
            if(queue.size()>k){
                queue.poll();
            }
        }
   
        return queue.peek();
    }
}


import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int num : nums) {
            queue.offer(num);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.peek();
    }
}


import java.util.PriorityQueue;

public class KthLargestElement {
    public int kthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int num: nums) {
            queue.add(num);
            
            if(queue.size()>k) {
                queue.poll();
            }
        }
        return queue.poll();
    }
}


import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        
        for(int num : nums){
            queue.add(num);
            
            if(queue.size() > k){
                queue.poll();
            }
        }
        
        return queue.poll();
    }
}


import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for(int i: nums){
            q.offer(i);

            if(q.size()>k){
                q.poll();
            }
        }

        return q.peek();
    }
}


import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums) {
            minHeap.add(num);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}



import java.util.PriorityQueue;

public class KthLargestNum {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for(int i: nums){
            q.offer(i);
            
            if(q.size()>k){
                q.poll();
            }
        }
        
        return q.peek();
    }
}



import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int num : nums) {
            queue.add(num);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.poll();
    }
}


import java.util.PriorityQueue;

public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
    for(int num: nums){
        queue.add(num);
        
        if(queue.size()>k){
            queue.poll();
        }
    }
    
    return queue.poll();
}


import java.util.PriorityQueue;

public class Solution
{
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num: nums){
            queue.add(num);
            if(queue.size()>k){
                queue.poll();
            }
        }
        return queue.peek();
    }
}

