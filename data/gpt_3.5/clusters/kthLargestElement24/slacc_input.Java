

public class Interleave {
    public static int findKthLargest1(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 1
        for (int num : nums) { // 2
            pq.offer(num); // 3
            if (pq.size() > k) { // 4
                pq.poll(); // 5
            }
        }
        return pq.peek();
    }


    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 6

        for (int num : nums) { // 7
            pq.add(num); // 8

            if (pq.size() > k) { // 9
                pq.poll(); // 10
            }
        }

        return pq.peek();
    }

    public static int findKthLargest3(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 11
        for (int num : nums) { // 12
            pq.offer(num); // 13
            if (pq.size() > k) { // 14
                pq.poll(); // 15
            }
        }
        return pq.peek();
    }

    public static int findKthLargest4(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 16

        for (int num : nums) { // 17
            minHeap.add(num); // 18

            if (minHeap.size() > k) { // 19
                minHeap.poll(); // 20
            }
        }

        return minHeap.poll();
    }

    public int findKthLargest5(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(); // 21
        for (int num : nums) { // 22
            heap.offer(num); // 23
            if (heap.size() > k) { // 24
                heap.poll(); // 25
            }
        }
        return heap.poll();
    }

    public int findKthLargest6(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>(); // 26

        for (int num : nums) { // 27
            pq.offer(num); // 28

            if (pq.size() > k) { // 29
                pq.poll(); // 30
            }
        }

        return pq.peek();
    }

    public static int findKthLargest7(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 31

        for (int num : nums) { // 32
            pq.offer(num); // 33

            if (pq.size() > k) { // 34
                pq.poll(); // 35
            }
        }

        return pq.peek();
    }

    public int findKthLargest8(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k + 1, Comparator.reverseOrder()); // 36
        for (int num : nums) { // 37
            minHeap.offer(num); // 38
            if (minHeap.size() > k) { // 39
                minHeap.poll(); // 40
            }
        }
        return minHeap.poll();
    }

   public int findKthLargest9(int[] nums, int k) {
     PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 41

     for (int num : nums) { // 42
       minHeap.add(num); // 43

       if (minHeap.size() > k) { // 44
         minHeap.poll(); // 45
       }
     }

     return minHeap.peek();
   }

    public int findKthLargest10(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(); // 46

        for (int num : nums) { // 47
            queue.offer(num); // 48
            if (queue.size() > k) { // 49
                queue.poll(); // 50
            }
        }

        return queue.peek();
    }

    public static int findKthLargest11(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 51

        for (int num : nums) { // 52
            pq.offer(num); // 53

            if (pq.size() > k) { // 54
                pq.poll(); // 55
            }
        }

        return pq.peek();
    }


    public int findKthLargest12(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 56

        for (int num : nums) { // 57
            pq.offer(num); // 58
            if (pq.size() > k) { // 59
                pq.poll(); // 60
            }
        }

        return pq.peek();
    }

  public int findKthLargest13(int[] nums, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(); // 61
    for (int num : nums) { // 62
      pq.offer(num); // 63
      if (pq.size() > k) { // 64
        pq.poll(); // 65
      }
    }
    return pq.peek();
  }


   public static int findKthLargest14(int[] nums, int k) {
      PriorityQueue<Integer> pq = new PriorityQueue<>(); // 66
      for (int num : nums) { // 67
         pq.offer(num); // 68
         if (pq.size() > k) { // 69
            pq.poll(); // 70
         }
      }
      return pq.peek();
   }


    public static int findKthLargest15(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 71

        for (int num : nums) { // 72
            pq.offer(num); // 73

            if (pq.size() > k) { // 74
                pq.poll(); // 75
            }
        }

        return pq.peek();
    }


    public int findKthLargest16(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 76

        for (int num : nums) { // 77
            pq.offer(num); // 78

            if (pq.size() > k) { // 79
                pq.poll(); // 80
            }
        }

        return pq.peek();
    }

    public int findKthLargest17(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 81

        for (int num : nums) { // 82
            pq.offer(num); // 83
            if (pq.size() > k) { // 84
                pq.poll(); // 85
            }
        }

        return pq.peek();
    }
}


