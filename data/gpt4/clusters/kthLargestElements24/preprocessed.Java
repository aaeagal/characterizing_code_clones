import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest1(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num: nums) {
            queue.add(num);
            if(queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }

    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        
        for(int num: nums){
            queue.add(num);
            
            if(queue.size()>k){
                queue.poll();
            }
        }
        
        return queue.peek();
    }

    public static int findKthLargest3(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int val: nums) {
            pq.offer(val);

            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }


    public int findKthLargest4(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int num: nums){
            queue.add(num);

            if(queue.size()>k)
                queue.poll();
        }

        return queue.poll();
    }

    public int findKthLargest5(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for(int i: nums){
            queue.add(i);
            if(queue.size()>k)
                queue.poll();
        }
        return queue.peek();
    }


    public static int findKthLargest6(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k); // java's priority queue is a min heap
        for(int i: nums){
            q.offer(i); 
            if(q.size() > k){
                q.poll();
            }
        }
        return q.peek();
    }

    public int findKthLargest7(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for(int i: nums){
            q.offer(i);
 
            if(q.size()>k){
                q.poll();
            }
        }
 
        return q.peek();
    }

    public static int findKthLargest8(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int val : nums) {
            pq.offer(val);
            
            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static int findKthLargest9(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for(int val : nums) {
            pq.offer(val);
            
            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }


    public int findKthLargest10(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
  
        for(int num: nums){
            queue.add(num);
      
            if(queue.size()>k){
                queue.poll();
            }
        }
    
        return queue.peek();
    }

    public int findKthLargest11(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for(int i: nums){
            queue.offer(i);
        
            if(queue.size()>k){
                queue.poll();
            }
        }
   
        return queue.peek();
    }

    public int findKthLargest12(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int num : nums) {
            queue.offer(num);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.peek();
    }

    public int kthLargest13(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int num: nums) {
            queue.add(num);
            
            if(queue.size()>k) {
                queue.poll();
            }
        }
        return queue.poll();
    }

    public int findKthLargest14(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        
        for(int num : nums){
            queue.add(num);
            
            if(queue.size() > k){
                queue.poll();
            }
        }
        
        return queue.poll();
    }

    public int findKthLargest15(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for(int i: nums){
            q.offer(i);

            if(q.size()>k){
                q.poll();
            }
        }

        return q.peek();
    }

    public int findKthLargest16(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums) {
            minHeap.add(num);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }

    public int findKthLargest17(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for(int i: nums){
            q.offer(i);
            
            if(q.size()>k){
                q.poll();
            }
        }
        
        return q.peek();
    }

    public static int findKthLargest18(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int num : nums) {
            queue.add(num);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.poll();
    }


    public int findKthLargest19(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(int num: nums){
            queue.add(num);
            
            if(queue.size()>k){
                queue.poll();
            }
        }
        
        return queue.poll();
    }

    public int findKthLargest20(int[] nums, int k) {
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

