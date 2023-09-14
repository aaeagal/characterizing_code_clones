
import java.util.Arrays;

public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        int rightmostSetBit = xor & (-xor);

        int num1 = 0;
        int num2 = 0;

        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        return new int[]{num1, num2};
    }
}


import java.util.Arrays;

public class Solution {
    public int[] findSingleElements(int[] nums) {
        int xor = 0;
        
        for (int num : nums) {
            xor ^= num;
        }
        
        int rightmostSetBit = xor & -xor;
        
        int firstNum = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) {
                firstNum ^= num;
            }
        }
        
        int[] result = new int[2];
        result[0] = firstNum;
        result[1] = xor ^ firstNum;
        
        return result;
    }
}


public int[] singleNumber(int[] nums) {
    int xor = 0;
    for (int num : nums) {
        xor ^= num;
    }
    
    int mask = 1;
    while ((mask & xor) == 0) {
        mask <<= 1;
    }
    
    int num1 = 0;
    int num2 = 0;
    for (int num : nums) {
        if ((num & mask) == 0) {
            num1 ^= num;
        } else {
            num2 ^= num;
        }
    }
    
    return new int[]{num1, num2};
}



public int[] singleNumber(int[] nums) {
    int xor = 0;
    for (int num : nums) {
        xor ^= num;
    }
    
    int mask = 1;
    while ((xor & mask) == 0) {
        mask <<= 1;
    }
    
    int num1 = 0, num2 = 0;
    for (int num : nums) {
        if ((num & mask) == 0) {
            num1 ^= num;
        } else {
            num2 ^= num;
        }
    }
    
    return new int[]{num1, num2};
}



public int[] findTwoElements(int[] nums) {
    int xor = 0;
    for (int num : nums) {
        xor ^= num;
    }
    
    int mask = 1;
    while ((mask & xor) == 0) {
        mask <<= 1;
    }
    
    int res1 = 0;
    int res2 = 0;
    for (int num : nums) {
        if ((num & mask) != 0) {
            res1 ^= num;
        } else {
            res2 ^= num;
        }
    }
    
    return new int[]{res1, res2};
}


public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        
        int diff = xor & (-xor);
        
        int num1 = 0;
        int num2 = 0;
        for (int num : nums) {
            if ((num & diff) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        
        return new int[]{num1, num2};
    }
}



import java.util.HashSet;

class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        
        return result;
    }
}



import java.util.Arrays;

public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        
        int mask = 1;
        while ((mask & xor) == 0) {
            mask <<= 1;
        }
        
        int num1 = 0;
        int num2 = 0;
        for (int num : nums) {
            if ((num & mask) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        
        result[0] = num1;
        result[1] = num2;
        
        return result;
    }
}


public int[] singleNumber(int[] nums) {
    int xor = 0;
    for (int num : nums) {
        xor ^= num;
    }
    
    int rightmostBit = xor & -xor;
    int num1 = 0;
    int num2 = 0;
    for (int num : nums) {
        if ((num & rightmostBit) != 0) {
            num1 ^= num;
        } else {
            num2 ^= num;
        }
    }
    
    return new int[]{num1, num2};
}


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int i = 0;

        for (int num : nums) {
            if (map.get(num) == 1) {
                result[i++] = num;
            }
        }

        return result;
    }
}


public class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for (int num : nums) {
            bitmask ^= num;
        }
        
        int diff = bitmask & (-bitmask);
        
        int x = 0;
        for (int num : nums) {
            if ((num & diff) != 0) {
                x ^= num;
            }
        }
        
        return new int[]{x, bitmask ^ x};
    }
}


public class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for (int num : nums) {
            bitmask ^= num;
        }
        int diff = bitmask & (-bitmask);
        int x = 0;
        for (int num : nums) {
            if ((num & diff) != 0) {
                x ^= num;
            }
        }
        return new int[]{x, bitmask ^ x};
    }
}



public int[] singleNumber(int[] nums) {
    int xor = 0;
    for (int num : nums) {
        xor ^= num;
    }
    
    int mask = xor & -xor;
    
    int num1 = 0;
    int num2 = 0;
    
    for (int num : nums) {
        if ((num & mask) == 0) {
            num1 ^= num;
        } else {
            num2 ^= num;
        }
    }
    
    return new int[]{num1, num2};
}



import java.util.*;

public class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for (int num : nums) {
            bitmask ^= num;
        }
        
        int diff = bitmask & (-bitmask);
        
        int x = 0;
        for (int num : nums) {
            if ((num & diff) != 0) {
                x ^= num;
            }
        }
        
        return new int[] {x, bitmask ^ x};
    }
}


import java.util.Arrays;

public class TwoSingleNumbers {
    public static int[] findTwoSingleNumbers(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        int bitMask = xor & (-xor);

        int[] result = new int[2];
        for (int num : nums) {
            if ((num & bitMask) != 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        int[] result = findTwoSingleNumbers(nums);
        System.out.println("Two single numbers are: " + Arrays.toString(result));
    }
}


class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for (int num : nums) {
            bitmask ^= num;
        }
        int diff = bitmask & (-bitmask);
        int x = 0;
        for (int num : nums) {
            if ((diff & num) != 0) {
                x ^= num;
            }
        }
        return new int[]{x, bitmask ^ x};
    }
}


import java.util.Arrays;

public class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for (int num : nums) {
            bitmask ^= num;
        }
        
        int diff = bitmask & (-bitmask);
        
        int x = 0;
        for (int num : nums) {
            if ((num & diff) != 0) {
                x ^= num;
            }
        }
        
        return new int[]{x, bitmask ^ x};
    }
}


public int[] singleNumber(int[] nums) {
    int xor = 0;
    for (int num : nums) {
        xor ^= num;
    }
    
    int mask = xor & (-xor);
    
    int[] result = new int[2];
    for (int num : nums) {
        if ((num & mask) == 0) {
            result[0] ^= num;
        } else {
            result[1] ^= num;
        }
    }
    
    return result;
}


import java.util.*;

public class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for (int num : nums) {
            bitmask ^= num;
        }
        
        int diff = bitmask & (-bitmask);
        
        int x = 0;
        for (int num : nums) {
            if ((num & diff) != 0) {
                x ^= num;
            }
        }
        
        int[] result = new int[]{x, bitmask ^ x};
        return result;
    }
}



import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }
}


