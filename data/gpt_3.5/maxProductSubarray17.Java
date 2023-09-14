
class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }
            
            maxSoFar = Math.max(nums[i], maxSoFar * nums[i]);
            minSoFar = Math.min(nums[i], minSoFar * nums[i]);
            
            maxProduct = Math.max(maxProduct, maxSoFar);
        }
        
        return maxProduct;
    }
}


public class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], result = nums[0];
        
        for(int i=1; i<nums.length; i++){
            if(nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            
            max = Math.max(nums[i], max*nums[i]);
            min = Math.min(nums[i], min*nums[i]);
            
            result = Math.max(result, max);
        }
        
        return result;
    }
}


public class LargestProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);
            
            result = Math.max(result, maxProduct);
        }
        
        return result;
    }
}


public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int currentProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            currentProduct *= nums[i];
            maxProduct = Math.max(maxProduct, currentProduct);
            if (currentProduct == 0) {
                currentProduct = 1;
            }
        }
        currentProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            currentProduct *= nums[i];
            maxProduct = Math.max(maxProduct, currentProduct);
            if (currentProduct == 0) {
                currentProduct = 1;
            }
        }
        return maxProduct;
    }
}


public int maxProduct(int[] nums) {
    if (nums == null || nums.length == 0) {
        return 0;
    }
    
    int maxProduct = nums[0];
    int currentMax = nums[0];
    int currentMin = nums[0];
    
    for (int i = 1; i < nums.length; i++) {
        int temp = currentMax;
        currentMax = Math.max(Math.max(nums[i] * currentMax, nums[i] * currentMin), nums[i]);
        currentMin = Math.min(Math.min(nums[i] * temp, nums[i] * currentMin), nums[i]);
        maxProduct = Math.max(maxProduct, currentMax);
    }
    
    return maxProduct;
}


public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }
            
            currentMax = Math.max(nums[i], currentMax * nums[i]);
            currentMin = Math.min(nums[i], currentMin * nums[i]);
            
            maxProduct = Math.max(maxProduct, currentMax);
        }
        
        return maxProduct;
    }
}


public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd = nums[0];
        int minProd = nums[0];
        int ans = nums[0];
        
        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);
            ans = Math.max(ans, maxProd);
        }
        
        return ans;
    }
}


public static int maxProduct(int[] nums) {
    int maxProduct = nums[0];
    int currentMax = nums[0];
    int currentMin = nums[0];
    
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] < 0) {
            int temp = currentMax;
            currentMax = currentMin;
            currentMin = temp;
        }
        
        currentMax = Math.max(nums[i], nums[i] * currentMax);
        currentMin = Math.min(nums[i], nums[i] * currentMin);
        
        maxProduct = Math.max(maxProduct, currentMax);
    }
    
    return maxProduct;
}


public class LargestProduct {
   public static int findLargestProduct(int[] nums) {
      int n = nums.length;
      
      int maxProduct = Integer.MIN_VALUE;
      int currentProduct = 1;
      
      for(int i = 0; i < n; i++) {
         currentProduct = currentProduct * nums[i];
         
         if(currentProduct > maxProduct) {
            maxProduct = currentProduct;
         }
         
         if(nums[i] == 0) {
            currentProduct = 1;
         }
      }
      
      currentProduct = 1;
      
      for(int i = n-1; i >= 0; i--) {
         currentProduct = currentProduct * nums[i];
         
         if(currentProduct > maxProduct) {
            maxProduct = currentProduct;
         }
         
         if(nums[i] == 0) {
            currentProduct = 1;
         }
      }
      
      return maxProduct;
   }
}


public class SubarrayProduct {
    
    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            
            currMax = Math.max(nums[i], currMax * nums[i]);
            currMin = Math.min(nums[i], currMin * nums[i]);
            
            maxProduct = Math.max(maxProduct, currMax);
        }
        
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxProduct(nums)); // Output: 6
        
        int[] nums2 = {-2, 0, -1};
        System.out.println(maxProduct(nums2)); // Output: 0
    }
}


public class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tempMax = Math.max(nums[i], Math.max(maxProduct * nums[i], minProduct * nums[i]));
            minProduct = Math.min(nums[i], Math.min(maxProduct * nums[i], minProduct * nums[i]));
            maxProduct = tempMax;
            result = Math.max(result, maxProduct);
        }
        return result;
    }
}


public class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int currentMaxProduct = 1;
        int currentMinProduct = 1;
        
        for(int num : nums) {
            if(num < 0) {
                int temp = currentMaxProduct;
                currentMaxProduct = currentMinProduct;
                currentMinProduct = temp;
            }
            
            currentMaxProduct = Math.max(currentMaxProduct * num, num);
            currentMinProduct = Math.min(currentMinProduct * num, num);
            
            maxProduct = Math.max(currentMaxProduct, maxProduct);
        }
        
        return maxProduct;
    }
}


public class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        int maxProduct = nums[0];
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int tempMax = Math.max(nums[i], Math.max(nums[i] * maxEndingHere, nums[i] * minEndingHere));
            int tempMin = Math.min(nums[i], Math.min(nums[i] * maxEndingHere, nums[i] * minEndingHere));
            
            maxEndingHere = tempMax;
            minEndingHere = tempMin;
            
            maxProduct = Math.max(maxProduct, maxEndingHere);
        }
        
        return maxProduct;
    }
}


public class LargestProductSubarray {

    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            currentMax = Math.max(nums[i], currentMax * nums[i]);
            currentMin = Math.min(nums[i], currentMin * nums[i]);

            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int result = maxProduct(nums);
        System.out.println("Largest product of subarray: " + result);
    }
}


public int maxProduct(int[] nums) {
    int maxProd = Integer.MIN_VALUE;
    int currProd = 1;
    for(int i=0;i<nums.length;i++) {
        currProd *= nums[i];
        maxProd = Math.max(maxProd, currProd);
        if(currProd == 0) {
            currProd = 1;
        }
    }
    currProd = 1;
    for(int i=nums.length-1;i>=0;i--) {
        currProd *= nums[i];
        maxProd = Math.max(maxProd, currProd);
        if(currProd == 0) {
            currProd = 1;
        }
    }
    return maxProd;
}


public class Solution {
    public static int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            result = Math.max(result, max);
        }

        return result;
    }
}


public int maxProduct(int[] nums) {
    int maxProduct = nums[0];
    int currentMax = nums[0];
    int currentMin = nums[0];
    
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] < 0) {
            int temp = currentMax;
            currentMax = currentMin;
            currentMin = temp;
        }
        
        currentMax = Math.max(nums[i], currentMax * nums[i]);
        currentMin = Math.min(nums[i], currentMin * nums[i]);
        
        maxProduct = Math.max(maxProduct, currentMax);
    }
    
    return maxProduct;
}


public static int maxProduct(int[] nums) {
    int maxProduct = nums[0];
    int currentMax = nums[0];
    int currentMin = nums[0];
    
    for (int i = 1; i < nums.length; i++) {
        int temp = currentMax;
        currentMax = Math.max(Math.max(nums[i], currentMax * nums[i]), currentMin * nums[i]);
        currentMin = Math.min(Math.min(nums[i], temp * nums[i]), currentMin * nums[i]);
        maxProduct = Math.max(maxProduct, currentMax);
    }
    
    return maxProduct;
}


public class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];
        
        for(int i=1; i<nums.length; i++) {
            int temp = currMax;
            currMax = Math.max(Math.max(nums[i], currMax*nums[i]), currMin*nums[i]);
            currMin = Math.min(Math.min(nums[i], currMin*nums[i]), temp*nums[i]);
            maxProduct = Math.max(currMax, maxProduct);
        }
        
        return maxProduct;
    }
}


public class LargestSubarrayProduct {
   public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }
            
            currentMax = Math.max(nums[i], currentMax * nums[i]);
            currentMin = Math.min(nums[i], currentMin * nums[i]);
            
            maxProduct = Math.max(maxProduct, currentMax);
        }
        
        return maxProduct;
    }
}

