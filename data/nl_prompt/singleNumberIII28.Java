
public int[] findTwoElements(int[] nums) {
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
    return new int[] { x, bitmask ^ x };
}

public int[] singleNumber(int[] nums) {
    int xor = 0;
    for (int num : nums) {
        xor ^= num;
    }
    
    int rightmostSetBit = xor & -xor;
    
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

public class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for (int num : nums) {
            bitmask ^= num;
        }
        
        int diff = bitmask & (-bitmask);
        
        int[] result = new int[2];
        for (int num : nums) {
            if ((num & diff) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }
        
        return result;
    }
}

public int[] singleNumber(int[] nums) {
    int xor = 0;
    for (int num : nums) {
        xor ^= num;
    }
    
    int diff = xor & (-xor);
    
    int[] result = new int[2];
    for (int num : nums) {
        if ((num & diff) == 0) {
            result[0] ^= num;
        } else {
            result[1] ^= num;
        }
    }
    
    return result;
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
    int bitmask = 0;
    for (int num : nums) {
        bitmask ^= num;
    }
    int diff = bitmask & (-bitmask);
    int num1 = 0;
    for (int num : nums) {
        if ((num & diff) != 0) {
            num1 ^= num;
        }
    }
    return new int[]{num1, bitmask ^ num1};
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

public int[] findSingleNumbers(int[] nums) {
    int xor = 0;
    for (int num : nums) {
        xor ^= num;
    }
    
    int bitmask = xor & (-xor);
    
    int num1 = 0;
    for (int num : nums) {
        if ((num & bitmask) != 0) {
            num1 ^= num;
        }
    }
    
    int num2 = xor ^ num1;
    
    return new int[] { num1, num2 };
}

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
        
        return new int[] { x, bitmask ^ x };
    }
}

public class Solution {
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

public class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for (int num : nums) {
            bitmask ^= num;
        }
        
        int diff = bitmask & (-bitmask);
        
        int[] ans = new int[2];
        for (int num : nums) {
            if ((num & diff) != 0) {
                ans[0] ^= num;
            } else {
                ans[1] ^= num;
            }
        }
        
        return ans;
    }
}

public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        
        int mask = 1;
        while ((mask & xor) == 0) {
            mask <<= 1;
        }
        
        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & mask) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        
        return new int[] {a, b};
    }
}

