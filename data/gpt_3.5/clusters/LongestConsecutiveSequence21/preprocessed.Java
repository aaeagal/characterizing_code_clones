public class Interleave {
    public int longestConsecutive1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int longestStreak = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        return longestStreak;
    }
    
    public int longestConsecutive2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int maxLen = 1;
        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int currNum = num;
                int currLen = 1;
                while (numSet.contains(currNum + 1)) {
                    currNum += 1;
                    currLen += 1;
                }
                maxLen = Math.max(maxLen, currLen);
            }
        }
        return maxLen;
    }

    public static int longestConsecutive3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        int longestSeqLength = 0;
        
        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentSeqLength = 1;
                
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSeqLength++;
                }
                
                longestSeqLength = Math.max(longestSeqLength, currentSeqLength);
            }
        }
        
        return longestSeqLength;
    }
    
    public static int longestConsecutive4(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        int maxLength = 1;
        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;
                
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        
        return maxLength;
    }
    
 
    public int longestConsecutive5(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int maxLen = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                int currLen = 1;
                
                while (set.contains(currNum + 1)) {
                    currNum += 1;
                    currLen += 1;
                }
                
                maxLen = Math.max(maxLen, currLen);
            }
        }
        
        return maxLen;
    }

   public int longestConsecutive6(int[] nums) {
      HashSet<Integer> set = new HashSet<Integer>();
      for (int num : nums) {
         set.add(num);
      }
      
      int longestStreak = 0;
      
      for (int num : nums) {
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

    public int longestConsecutive7(int[] nums) {
        Set<Integer> num_set = new HashSet<>();
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

    public int longestConsecutive8(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
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
                    currentNum++;
                    currentStreak++;
                }
                
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        return longestStreak;
    }


    public int longestConsecutive9(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : nums) {
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

    public int longestConsecutive10(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<Integer>();
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

    public static int longestConsecutive11(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : nums) {
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


    public static int longestConsecutive12(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentLength += 1;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }


    public int longestConsecutive13(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        
        int maxLength = 1;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                int currLength = 1;
                
                while (set.contains(currNum + 1)) {
                    currNum += 1;
                    currLength += 1;
                }
                
                maxLength = Math.max(maxLength, currLength);
            }
        }
        
        return maxLength;
    }

  public int longestConsecutive14(int[] nums) {
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

    public static int longestConsecutive15(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);

        int maxLen = 1;
        for(int num : nums) {
            if(!set.contains(num-1)) {
                int currNum = num;
                int currLen = 1;
                while(set.contains(currNum+1)) {
                    currNum++;
                    currLen++;
                }
                maxLen = Math.max(maxLen, currLen);
            }
        }

        return maxLen;
    }


    public static int longestConsecutive16(int[] nums) {
        HashSet<Integer> num_set = new HashSet<Integer>();
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


    public int longestConsecutive17(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        
        int longestStreak = 0;
        
        for(int num: nums){
            if(!set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        return longestStreak;
    }

    public static int longestConsecutive18(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        
        int longestStreak = 0;
        for (int num : nums) {
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
    

    public static int longestConsecutive19(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);

        int longest = 0;
        for (int num : nums) {
            int streak = 1;
            int current = num - 1;

            while (set.contains(current)) {
                set.remove(current);
                streak++;
                current--;
            }

            current = num + 1;
            while (set.contains(current)) {
                set.remove(current);
                streak++;
                current++;
            }

            longest = Math.max(longest, streak);
        }

        return longest;
    }

}


