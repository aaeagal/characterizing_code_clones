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

public class Main {
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
        int[] nums = {2, 3, -2, 4, -1};
        System.out.println(maxProduct(nums));

        int[] nums2 = {0, 2, -3, 4, -1};
        System.out.println(maxProduct(nums2));
    }
}

public class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int maxProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int tempMax = Math.max(current, Math.max(maxSoFar * current, minSoFar * current));
            minSoFar = Math.min(current, Math.min(maxSoFar * current, minSoFar * current));
            maxSoFar = tempMax;
            maxProduct = Math.max(maxProduct, maxSoFar);
        }

        return maxProduct;
    }
}

public class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int maxSoFar = nums[0];
        int minSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int tempMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr));
            minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr));
            maxSoFar = tempMax;
            maxProduct = Math.max(maxProduct, maxSoFar);
        }

        return maxProduct;
    }
}

public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProd = nums[0];
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
            maxProd = Math.max(maxProd, currMax);
        }

        return maxProd;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum product of a subarray: " + maxProduct(nums));
    }
}

public class MaxProductSubarray {
    public int findMaxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int maxProduct = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int temp = currMax;
            currMax = Math.max(Math.max(currMax * nums[i], currMin * nums[i]), nums[i]);
            currMin = Math.min(Math.min(temp * nums[i], currMin * nums[i]), nums[i]);
            
            maxProduct = Math.max(maxProduct, currMax);
        }
        
        return maxProduct;
    }
}

public class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int currProduct = 1;
        
        for (int i = 0; i < nums.length; i++) {
            currProduct *= nums[i];
            
            maxProduct = Math.max(maxProduct, currProduct);
            
            if (nums[i] == 0) {
                currProduct = 1;
            }
        }
        
        currProduct = 1;
        
        for (int i = nums.length - 1; i >= 0; i--) {
            currProduct *= nums[i];
            
            maxProduct = Math.max(maxProduct, currProduct);
            
            if (nums[i] == 0) {
                currProduct = 1;
            }
        }
        
        return maxProduct;
    }
}

public class MaximumSubarrayProduct {
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int temp = currentMax;
            currentMax = Math.max(Math.max(currentMax * nums[i], currentMin * nums[i]), nums[i]);
            currentMin = Math.min(Math.min(temp * nums[i], currentMin * nums[i]), nums[i]);
            
            maxProduct = Math.max(maxProduct, currentMax);
        }
        
        return maxProduct;
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum Product: " + maxProduct(nums));
        // Output: Maximum Product: 6
        
        int[] nums2 = {-2, 0, -1};
        System.out.println("Maximum Product: " + maxProduct(nums2));
        // Output: Maximum Product: 0
    }
}

public class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int temp = currMax;
            currMax = Math.max(Math.max(currMax * nums[i], currMin * nums[i]), nums[i]);
            currMin = Math.min(Math.min(temp * nums[i], currMin * nums[i]), nums[i]);
            maxProduct = Math.max(maxProduct, currMax);
        }
        
        return maxProduct;
    }
}

public class LargestProductSubarray {
    public static int findMaxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
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
}

public class MaximumProductSubarray {
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
        System.out.println(maxProduct(nums)); // Output: 6
    }
}

public int maxProduct(int[] nums) {
    if (nums.length == 0) {
        return 0;
    }
    
    int maxProduct = nums[0];
    int currentMax = nums[0];
    int currentMin = nums[0];
    
    for (int i = 1; i < nums.length; i++) {
        int temp = currentMax;
        currentMax = Math.max(Math.max(currentMax * nums[i], currentMin * nums[i]), nums[i]);
        currentMin = Math.min(Math.min(temp * nums[i], currentMin * nums[i]), nums[i]);
        maxProduct = Math.max(maxProduct, currentMax);
    }
    
    return maxProduct;
}

public class SubarrayMaxProduct {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int tempMax = Math.max(nums[i], Math.max(nums[i] * maxSoFar, nums[i] * minSoFar));
            int tempMin = Math.min(nums[i], Math.min(nums[i] * maxSoFar, nums[i] * minSoFar));
            
            maxSoFar = tempMax;
            minSoFar = tempMin;
            
            maxProduct = Math.max(maxProduct, maxSoFar);
        }
        
        return maxProduct;
    }
}

public int maxProduct(int[] nums) {
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

public static int maxProduct(int[] nums) {
    if (nums == null || nums.length == 0) {
        return 0;
    }
    
    int maxSoFar = nums[0];
    int minSoFar = nums[0];
    int maxProduct = nums[0];
    
    for (int i = 1; i < nums.length; i++) {
        int temp = maxSoFar;
        maxSoFar = Math.max(Math.max(maxSoFar * nums[i], minSoFar * nums[i]), nums[i]);
        minSoFar = Math.min(Math.min(temp * nums[i], minSoFar * nums[i]), nums[i]);
        maxProduct = Math.max(maxProduct, maxSoFar);
    }
    
    return maxProduct;
}

public class Main {
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
        int[] nums1 = {2, 3, -2, 4};
        System.out.println(maxProduct(nums1)); // Output: 6
        
        int[] nums2 = {-2, 0, -1};
        System.out.println(maxProduct(nums2)); // Output: 0
    }
}

public class Solution {
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
}

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            
            int tempMaxProduct = Math.max(Math.max(maxProduct * num, minProduct * num), num);
            int tempMinProduct = Math.min(Math.min(maxProduct * num, minProduct * num), num);
            
            maxProduct = tempMaxProduct;
            minProduct = tempMinProduct;
            
            result = Math.max(result, maxProduct);
        }
        
        return result;
    }
}

public class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int tempMax = maxSoFar;
            maxSoFar = Math.max(Math.max(nums[i], maxSoFar * nums[i]), minSoFar * nums[i]);
            minSoFar = Math.min(Math.min(nums[i], tempMax * nums[i]), minSoFar * nums[i]);
            maxProduct = Math.max(maxProduct, maxSoFar);
        }
        return maxProduct;
    }
}

public static int maxProduct(int[] nums) {
    int maxProduct = nums[0];
    int maxEndingHere = nums[0];
    int minEndingHere = nums[0];
    
    for (int i = 1; i < nums.length; i++) {
        int num = nums[i];
        
        if (num < 0) {
            int temp = maxEndingHere;
            maxEndingHere = minEndingHere;
            minEndingHere = temp;
        }
        
        maxEndingHere = Math.max(num, maxEndingHere * num);
        minEndingHere = Math.min(num, minEndingHere * num);

        maxProduct = Math.max(maxProduct, maxEndingHere);
    }

    return maxProduct;
}
