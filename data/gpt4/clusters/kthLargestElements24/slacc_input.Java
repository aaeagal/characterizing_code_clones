import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest1(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(); // 1
        for(int num: nums) { // 2
            queue.add(num); // 3
            if(queue.size() > k) { // 4
                queue.poll(); // 5
            }
        }
        return queue.peek();
    }

    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(); // 6

        for(int num: nums){ // 7
            queue.add(num); // 8

            if(queue.size()>k){ // 9
                queue.poll(); // 10
            }
        }

        return queue.peek();
    }

    public static int findKthLargest3(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // 11

        for(int val: nums) { // 12
            pq.offer(val); // 13

            if(pq.size() > k) { // 14
                pq.poll(); // 15
            }
        }
        return pq.peek();
    }


    public int findKthLargest4(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(); // 16

        for(int num: nums){ // 17
            queue.add(num); // 18

            if(queue.size()>k) // 19
                queue.poll(); // 20
        }

        return queue.poll();
    }

    public int findKthLargest5(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(); // 21

        for(int i: nums){ // 22
            queue.add(i); // 23
            if(queue.size()>k) // 24
                queue.poll(); // 25
        }
        return queue.peek();
    }


    public static int findKthLargest6(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k); // java's priority queue is a min heap // 26
        for(int i: nums){ // 27
            q.offer(i); // 28
            if(q.size() > k){ // 29
                q.poll(); // 30
            }
        }
        return q.peek();
    }

    public int findKthLargest7(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k); // 31
        for(int i: nums){ // 32
            q.offer(i); // 33

            if(q.size()>k){ // 34
                q.poll(); // 35
            }
        }

        return q.peek();
    }

    public static int findKthLargest8(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 36

        for(int val : nums) { // 37
            pq.offer(val); // 38

            if(pq.size() > k) { // 39
                pq.poll(); // 40
            }
        }
        return pq.peek();
    }

    public static int findKthLargest9(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k); // 41
        for(int val : nums) { // 42
            pq.offer(val); // 43

            if(pq.size() > k) { // 44
                pq.poll(); // 45
            }
        }
        return pq.peek();
    }


    public int findKthLargest10(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(); // 46

        for(int num: nums){ // 47
            queue.add(num); // 48

            if(queue.size()>k){ // 49
                queue.poll(); // 50
            }
        }

        return queue.peek();
    }

    public int findKthLargest11(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k); // 51
        for(int i: nums){ // 52
            queue.offer(i); // 53

            if(queue.size()>k){ // 54
                queue.poll(); // 55
            }
        }

        return queue.peek();
    }

    public int findKthLargest12(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(); // 56

        for (int num : nums) { // 57
            queue.offer(num); // 58

            if (queue.size() > k) { // 59
                queue.poll(); // 60
            }
        }

        return queue.peek();
    }

    public int kthLargest13(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(); // 61

        for(int num: nums) { // 62
            queue.add(num); // 63

            if(queue.size()>k) { // 64
                queue.poll(); // 65
            }
        }
        return queue.poll();
    }

    public int findKthLargest14(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(); // 66

        for(int num : nums){ // 67
            queue.add(num); // 68

            if(queue.size() > k){ // 69
                queue.poll(); // 70
            }
        }

        return queue.poll();
    }

    public int findKthLargest15(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k); // 71
        for(int i: nums){ // 72
            q.offer(i); // 73

            if(q.size()>k){ // 74
                q.poll(); // 75
            }
        }

        return q.peek();
    }

    public int findKthLargest16(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 76
        for(int num : nums) { // 77
            minHeap.add(num); // 78
            if(minHeap.size() > k) { // 79
                minHeap.poll(); // 80
            }
        }

        return minHeap.peek();
    }

    public int findKthLargest17(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k); // 81
        for(int i: nums){ // 82
            q.offer(i); // 83

            if(q.size()>k){ // 84
                q.poll(); // 85
            }
        }

        return q.peek();
    }

    public static int findKthLargest18(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(); // 86

        for (int num : nums) { // 87
            queue.add(num); // 88

            if (queue.size() > k) { // 89
                queue.poll(); // 90
            }
        }

        return queue.poll();
    }


    public int findKthLargest19(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(); // 91
        for(int num: nums){ // 92
            queue.add(num); // 93

            if(queue.size()>k){ // 94
                queue.poll(); // 95
            }
        }

        return queue.poll();
    }

    public int findKthLargest20(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(); // 96
        for(int num: nums){ // 97
            queue.add(num); // 98
            if(queue.size()>k){ // 99
                queue.poll(); // 100
            }
        }
        return queue.peek();
    }
}

