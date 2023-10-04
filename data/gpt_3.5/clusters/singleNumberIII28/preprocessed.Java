
import java.util.Arrays;

public class Interleave {
    public int[] singleNumber1(int[] nums) {
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

    public int[] findSingleElements2(int[] nums) {
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


    public int[] singleNumber3(int[] nums) {
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



    public int[] singleNumber4(int[] nums) {
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



    public int[] findTwoElements5(int[] nums) {
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


    public int[] singleNumber6(int[] nums) {
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

    public int[] singleNumber7(int[] nums) {
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

    public int[] singleNumber8(int[] nums) {
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


    public int[] singleNumber9(int[] nums) {
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


    public int[] singleNumber10(int[] nums) {
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

    public int[] singleNumber11(int[] nums) {
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

    public int[] singleNumber12(int[] nums) {
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



    public int[] singleNumber13(int[] nums) {
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


    public int[] singleNumber14(int[] nums) {
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

    public static int[] findTwoSingleNumbers15(int[] nums) {
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


    public int[] singleNumber16(int[] nums) {
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

    public int[] singleNumber17(int[] nums) {
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

public int[] singleNumber18(int[] nums) {
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


    public int[] singleNumber19(int[] nums) {
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

    public int[] singleNumber20(int[] nums) {
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


