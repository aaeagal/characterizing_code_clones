public class Solution {
    public int maxProduct1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;
    }


    public int maxProduct2(int[] nums) {
        if (nums.length == 0)
            return 0;

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = maxProduct;

        for (int i = 1; i < nums.length; i++) {
            int tempMax = Math.max(nums[i] * maxProduct, Math.max(nums[i] * minProduct, nums[i]));
            minProduct = Math.min(nums[i] * maxProduct, Math.min(nums[i] * minProduct, nums[i]));

            maxProduct = tempMax;

            result = Math.max(maxProduct, result);
        }

        return result;
    }


    public int maxProduct3(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = maxSoFar;
        
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int tmpMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr));
            minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr));
            
            maxSoFar = tmpMax;
            
            result = Math.max(maxSoFar, result);
        }

        return result;
    }



    public int maxProduct4(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = maxSoFar;

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int tempMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr));
            minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr));
            
            maxSoFar = tempMax;
            
            result = Math.max(result, maxSoFar);
        }

        return result;
    }

    public int maxProduct5(int[] nums) {
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

    public int maxProduct6(int[] nums) {
        if (nums.length == 0) return 0;
        int max_so_far = nums[0];
        int min_so_far = nums[0];
        int result = max_so_far;

        for (int i = 1; i < nums.length; i++) {
            int curr_max = Math.max(nums[i] * max_so_far, Math.max(nums[i] * min_so_far, nums[i]));
            int curr_min = Math.min(nums[i] * max_so_far, Math.min(nums[i] * min_so_far, nums[i]));

            max_so_far = curr_max;
            min_so_far = curr_min;

            result = Math.max(result, max_so_far);
        }
        
        return result;
    }

    public int maxProduct7(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int max = nums[0];
        int min = nums[0];
        int result = max;

        for (int i = 1; i < nums.length; i++) {
            int temp_max = Math.max(nums[i] * max, Math.max(nums[i] * min, nums[i]));
            min = Math.min(nums[i] * max, Math.min(nums[i] * min, nums[i]));

            max = temp_max;

            if (max > result) {
                result = max;
            }
        }

        return result;
    }


    public int maxProduct8(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int max = nums[0], min = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;
    }


    public int maxProduct9(int[] nums) {
        int max = nums[0], min = nums[0], result = nums[0];
        for(int i = 1; i < nums.length; i++){
            int temp_max = Math.max(nums[i]*max, Math.max(nums[i]*min, nums[i]));
            min = Math.min(nums[i]*max, Math.min(nums[i]*min, nums[i]));
            max = temp_max;
            result = Math.max(max, result);
        }
        return result;
    }



    public int maxProduct10(int[] nums) {
        int max_product = nums[0];
        int min_temp = nums[0];
        int max_temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = max_temp;
                max_temp = min_temp;
                min_temp = temp;
            }

            max_temp = Math.max(nums[i], max_temp * nums[i]);
            min_temp = Math.min(nums[i], min_temp * nums[i]);

            max_product = Math.max(max_product, max_temp);
        }

        return max_product;
    }


    public int maxProduct11(int[] nums) {
        if (nums.length == 0) return 0;
        int max = nums[0];
        int min = nums[0];
        int result = max;
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(nums[i], Math.max(max * nums[i], min * nums[i]));
            min = Math.min(nums[i], Math.min(temp * nums[i], min * nums[i]));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    public int maxProduct12(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = maxSoFar;

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int tempMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr));
            minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr));

            maxSoFar = tempMax;

            result = Math.max(maxSoFar, result);
        }

        return result;
    }

    public int maxProduct13(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
            
        int maxProduct = nums[0], minProduct = nums[0], result = nums[0];
            
        for (int i = 1; i < nums.length; i++) {
            int tempMax = Math.max(nums[i] * maxProduct, Math.max(nums[i] * minProduct, nums[i]));
            minProduct = Math.min(nums[i] * maxProduct, Math.min(nums[i] * minProduct, nums[i]));
                
            maxProduct = tempMax;
                
            result = Math.max(result, maxProduct);
        }
            
        return result;
    }

    public int maxProduct14(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = maxProduct;

        for (int i = 1; i < nums.length; i++) {
            int temp_max = Math.max(nums[i] * maxProduct, Math.max(nums[i] * minProduct, nums[i]));
            minProduct = Math.min(nums[i] * maxProduct, Math.min(nums[i] * minProduct, nums[i]));

            maxProduct = temp_max;

            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public int maxProduct15(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for(int i = 1; i < nums.length; i++){
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            if(max > result){
                result = max;
            }
        }
        return result;
    }

    public int maxProduct16(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
    
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = maxProduct;

        for (int i = 1; i < nums.length; i++) {
            int temp = maxProduct;
            maxProduct = Math.max(nums[i] * maxProduct, Math.max(nums[i] * minProduct, nums[i]));
            minProduct = Math.min(nums[i] * temp, Math.min(nums[i] * minProduct, nums[i]));
            if (maxProduct > result) {
                result = maxProduct;
            }
        }
        return result;
    }


    public int maxProduct17(int[] nums) {
        if (nums.length == 0) return 0;

        int max_so_far = nums[0];
        int min_so_far = nums[0]; 
        int result = max_so_far;

        for(int i=1; i<nums.length; i++){
            int curr = nums[i];
            int temp_max = Math.max(curr, Math.max(max_so_far * curr, min_so_far * curr));
            min_so_far = Math.min(curr, Math.min(max_so_far * curr, min_so_far * curr));

            max_so_far = temp_max;

            result = Math.max(max_so_far, result);
        }

        return result;
    }



    public int maxProduct18(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = maxProduct;
        
        for(int i = 1; i < nums.length; i++) {
            
            int tempMax = Math.max(nums[i]*maxProduct, Math.max(nums[i]*minProduct, nums[i]));
            minProduct = Math.min(nums[i]*maxProduct, Math.min(nums[i]*minProduct, nums[i]));
            
            maxProduct = tempMax;
            
            result = Math.max(result, maxProduct);
        }

        return result;
    }



    public int maxProduct19(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int max = nums[0];
        int min = nums[0];
        int result = max;

        for (int i = 1; i < nums.length; i++) {
            int temp_max = Math.max(nums[i] * max, Math.max(nums[i] * min, nums[i]));
            min = Math.min(nums[i] * max, Math.min(nums[i] * min, nums[i]));

            max = temp_max;

            result = Math.max(result, max);
        }

        return result;
    }


    public int maxProduct20(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = nums[0], min = nums[0], result = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int tmp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(tmp * nums[i], min * nums[i]), nums[i]);
            if (max > result) {
                result = max;
            }
        }
    
        return result;
    }
}
