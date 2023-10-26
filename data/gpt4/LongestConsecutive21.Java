
import java.util.HashSet;
import java.util.Set;

public int longestConsecutive(int[] nums) {
    Set<Integer> numSet = new HashSet<Integer>();
    for (int num : nums) {
        numSet.add(num);
    }

    int longestStreak = 0;

    for (int num : numSet) {
        if (!numSet.contains(num-1)) {
            int currentNum = num;
            int currentStreak = 1;

            while (numSet.contains(currentNum+1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }

    return longestStreak;
} 


import java.util.HashSet;
import java.util.Set;

public int longestConsecutive(int[] nums) {
    Set<Integer> num_set = new HashSet<Integer>();
    for (int num : nums) {
        num_set.add(num);
    }

    int longestStreak = 0;

    for (int num : num_set) {
        if (!num_set.contains(num-1)) {
            int currentNum = num;
            int currentStreak = 1;

            while (num_set.contains(currentNum+1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }

    return longestStreak;
}


import java.util.HashSet;

public int longestConsecutive(int[] nums) {
    
    HashSet<Integer> set = new HashSet<Integer>();

    for(int num : nums) set.add(num);
        
    int longestStreak = 0;

    for(int num : set) {
        if(!set.contains(num-1)) {
            int currentNum = num;
            int currentStreak = 1;

            while(set.contains(currentNum+1)) {
                currentNum = currentNum + 1;
                currentStreak = currentStreak + 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }

    return longestStreak;
}


import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}



import java.util.HashSet;

public class Solution {
    public int longestConsecutiveSequence(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        } 

        int longestStreak = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}




public int longestConsecutive(int[] nums) {
    if (nums.length == 0) {
        return 0;
    }
  
    Set<Integer> numSet = new HashSet<Integer>();
    for (int num : nums) {
        numSet.add(num);
    }

    int longestStreak = 0;

    for (int num : numSet) {
        if (!numSet.contains(num-1)) {
            int currentNum = num;
            int currentStreak = 1;

            while (numSet.contains(currentNum+1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }

    return longestStreak;
}


import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}



import java.util.HashSet;
import java.util.Set;

public int longestConsecutive(int[] nums) {
    Set<Integer> num_set = new HashSet<Integer>();
    for (int num : nums) {
        num_set.add(num);
    }

    int longestStreak = 0;

    for (int num : num_set) {
        if (!num_set.contains(num-1)) {
            int currentNum = num;
            int currentStreak = 1;

            while (num_set.contains(currentNum+1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }

    return longestStreak;
}



import java.util.HashSet;

public int longestConsecutive(int[] nums) {
    if(nums==null || nums.length==0)
        return 0;
 
    HashSet<Integer> set = new HashSet<Integer>();
    int max = 1;
 
    for(int num: nums)
        set.add(num);
 
    for(int num: nums){
        int left = num - 1;
        int right = num + 1;
        int count = 1;
 
        while(set.contains(left)){
            set.remove(left);
            left--;
            count++;
        }
 
        while(set.contains(right)){
            set.remove(right);
            right++;
            count++;
        }
        max = Math.max(count, max);
    }
 
    return max;
}


import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}



public int longestConsecutive(int[] nums) {
    if(nums.length == 0) return 0;
    
    Set<Integer> numSet = new HashSet<>();
    for (int num : nums) {
      numSet.add(num);
    }

    int longestStreak = 0;
  
    for (int num : numSet) {
      if (!numSet.contains(num - 1)) {
        int currentNum = num;
        int currentStreak = 1;
   
        while (numSet.contains(currentNum + 1)) {
          currentNum += 1;
          currentStreak += 1;
        }

        longestStreak = Math.max(longestStreak, currentStreak);
      }
    }

    return longestStreak;
}



public int longestConsecutive(int[] nums) {
    Set<Integer> num_set = new HashSet<Integer>();
    for (int num : nums) {
        num_set.add(num);
    }

    int longestStreak = 0;

    for (int num : num_set) {
        if (!num_set.contains(num-1)) {
            int currentNum = num;
            int currentStreak = 1;

            while (num_set.contains(currentNum+1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }

    return longestStreak;
}


import java.util.HashSet;
import java.util.Set;

public int longestConsecutive(int[] nums) {
    Set<Integer> num_set = new HashSet<Integer>();
    for (int num : nums) {
        num_set.add(num);
    }
    
    int longestStreak = 0;

    for (int num : num_set) {
        if (!num_set.contains(num-1)) {
            int currentNum = num;
            int currentStreak = 1;

            while (num_set.contains(currentNum+1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }
    return longestStreak;
}


import java.util.HashSet;
import java.util.Set;

public int longestConsecutive(int[] nums) {        
    Set<Integer> num_set = new HashSet<>();
    for (int num : nums) {
        num_set.add(num);
    }

    int longestStreak = 0;

    for (int num : num_set) {
        if (!num_set.contains(num-1)) {
            int currentNum = num;
            int currentStreak = 1;

            while (num_set.contains(currentNum+1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }

    return longestStreak;
}


import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] num) {
        HashSet<Integer> set = new HashSet<Integer>();
        int max = 0;

        for(int n : num) set.add(n);

        for(int n : num) {
            if(!set.contains(n-1)) {
                int m = n + 1;

                while(set.contains(m)) {
                    m++; 
                }

                max = Math.max(max, m - n);
            }
        }

        return max;
    }
}


import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : set) {
            if (!set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}



public int longestConsecutive(int[] nums) {
    if(nums.length==0) return 0;
        
    Set<Integer> num_set = new HashSet<Integer>();
    for (int num : nums) {
        num_set.add(num);
    }

    int longestLength = 0;
        
    for (int num : num_set) {
        if (!num_set.contains(num-1)) {
            int currentNum = num;
            int currentLength = 1;

            while (num_set.contains(currentNum+1)) {
                currentNum += 1;
                currentLength += 1;
            }

            longestLength = Math.max(longestLength, currentLength);
        }
    }

    return longestLength;
}



import java.util.HashSet;
import java.util.Set;

public class Main {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}


import java.util.HashSet;
import java.util.Set;

public int longestConsecutive(int[] nums) {
    Set<Integer> numSet = new HashSet<Integer>();
    for (int num : nums) {
        numSet.add(num);
    }

    int longestStreak = 0;

    for (int num : numSet) {
        if (!numSet.contains(num-1)) {
            int currentNum = num;
            int currentStreak = 1;

            while (numSet.contains(currentNum+1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }

    return longestStreak;
}



import java.util.HashSet;
import java.util.Set;

public int longestConsecutive(int[] nums) {
    Set<Integer> num_set = new HashSet<Integer>();
    for (int num : nums) {
        num_set.add(num);
    }

    int longestStreak = 0;

    for (int num : num_set) {
        if (!num_set.contains(num-1)) {
            int currentNum = num;
            int currentStreak = 1;

            while (num_set.contains(currentNum+1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }

    return longestStreak;
}

