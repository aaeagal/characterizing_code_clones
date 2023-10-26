
public int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    
    while (left < right) {
        maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxArea;
}


public int maxArea(int[] height) {
    int maxArea = 0, left = 0, right = height.length - 1;
    while (left < right) {
        maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
        if (height[left] < height[right])
            left++;
        else
            right--;
    }
    return maxArea;
}


public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left < right) {
                int h = Math.min(height[left], height[right]);
                int l = right - left;
                int area = h * l;
                if(area > maxArea)
                    maxArea = area;        
                if(height[left] < height[right])
                    left++;
                else
                    right--;
        }
        return maxArea;
    }
}


public int maxArea(int[] height) {
    int max = 0, left = 0, right = height.length - 1;
    while (left < right) {
        max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return max;
}


public int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;

    while(left < right) {
        maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
        if(height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return maxArea;
}


public int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
        maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxArea;
}


public int maxArea(int[] height) {
    int maxarea = 0, l = 0, r = height.length - 1;
    
    while (l < r) {
        maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
        
        if (height[l] < height[r]) {
            l++;
        } else {
            r--;
        }
    }
    
    return maxarea;
}


public int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    
    while (left < right) {
        maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    
    return maxArea;
}


public int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    
    while (left < right) {
        maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
        
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxArea;
}


public int maxArea(int[] height) {
    int maxarea = 0;
    int l = 0;
    int r = height.length - 1;
    
    while (l < r) {
        maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
        if (height[l] < height[r]) {
            l++;
        } else { 
            r--; 
        }
    }
    return maxarea;
}


public int maxArea(int[] height) {
    int max = 0;
    int left = 0;
    int right = height.length - 1;
    
    while (left < right) {
        max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return max;
}


public int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    
    while(left < right) {
        maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
        
        if(height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    
    return maxArea;
}



public int maxArea(int[] height) {
    int maxArea = 0, left = 0, right = height.length - 1;
    while (left < right) {
        maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
        if (height[left] < height[right])
            left++;
        else
            right--;
    }
    return maxArea;
}



public int maxArea(int[] height) {
    int max = 0;
    int left = 0;
    int right = height.length - 1;

    while (left < right) {
        max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return max;
}



public int maxArea(int[] height) {
    int max = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
        int h = Math.min(height[left], height[right]);
        int w = right - left;
        max = Math.max(max, h * w);
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return max;
}



public int maxArea(int[] height) {
    int maxArea = 0, left = 0, right = height.length - 1;
    while (left < right) {
        maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxArea;
}


public int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    
    while(left < right) {
        maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
        if(height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    
    return maxArea;
}


public int maxArea(int[] height) {
    int max = 0;
    int left = 0;
    int right = height.length - 1;
    
    while (left < right) {
        max = Math.max(max, Math.min(height[left], height[right]) * (right - left));

        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    
    return max;
}


public int maxArea(int[] height) {
    int max = 0, left = 0, right = height.length - 1;
    while (left < right) {
        max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return max;
}


public int maxArea(int[] height) {
    int maxArea = 0, l = 0, r = height.length - 1;
    while (l < r) {
        maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - l));
        if (height[l] < height[r]) {
            l++;
        } else {
            r--;
        }
    }
    return maxArea;
}

