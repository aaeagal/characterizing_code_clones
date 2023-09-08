public class PowerFunction {
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        double temp = power(x, n / 2);
        
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            if (n > 0) {
                return x * temp * temp;
            } else {
                return (temp * temp) / x;
            }
        }
    }
    
    public static void main(String[] args) {
        double x = 2;
        int n = 3;
        
        double result = power(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);
    }
}
public class Power {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                return 1 / (myPow(x, Integer.MAX_VALUE) * x);
            } else {
                return 1 / myPow(x, -n);
            }
        }

        double half = myPow(x, n / 2);
        double result = half * half;

        if (n % 2 == 1) {
            result *= x;
        }

        return result;
    }
}

public class PowerFunction {
    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / pow(x, -n);
        }
        double result = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                result *= x;
            }
            x *= x;
            n >>= 1;
        }
        return result;
    }
}

public class PowerFunction {
    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double result = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= x;
            }
            x *= x;
            n /= 2;
        }
        return result;
    }
}

public class PowerFunction {
    public static double pow(double x, int n) {
        if (n == 0)
            return 1;
        
        double result = 1;
        for (int i = 0; i < Math.abs(n); i++) {
            result *= x;
        }
        
        return (n < 0) ? 1/result : result;
    }
}

public class PowFunction {
    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n == 1) {
            return x;
        }
        
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        
        double res = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                res *= x;
            }
            
            x *= x;
            n /= 2;
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        double x = 2;
        int n = 10;
        System.out.println(pow(x, n));
    }
}

public class PowerFunction {

    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double result = pow(x, n / 2);
        if (n % 2 == 0) {
            return result * result;
        } else {
            return result * result * x;
        }
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;
        double result = pow(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);
    }
}

public class PowerFunction {
    public double pow(double x, int n) {
        if (n == 0)
            return 1;
        
        double temp = pow(x, n / 2);
        
        if (n % 2 == 0)
            return temp * temp;
        else {
            if (n > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }
}

public class PowerFunction {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 1 / power(x, -n);
        }

        return power(x, n);
    }

    private static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;
        double result = myPow(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        double x = 2; // input value for x
        int n = 3; // input value for n
        double result = pow(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);
    }

    public static double pow(double x, int n) {
        if (n == 0)
            return 1;
        
        double temp = pow(x, n / 2);
        
        if (n % 2 == 0)
            return temp * temp;
        else {
            if (n > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }
}

public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        
        double res = myPow(x, n / 2);
        if (n % 2 == 0) {
            return res * res;
        } else {
            return res * res * x;
        }
    }
}

public class Main {
  public static double myPow(double x, int n) {
    if (n == 0) {
      return 1;
    }
    if (n < 0) {
      x = 1 / x;
      n = -n;
    }
    double pow = 1;
    while (n > 0) {
      if (n % 2 == 1) {
        pow *= x;
      }
      x *= x;
      n /= 2;
    }
    return pow;
  }
  
  public static void main(String[] args) {
    double x = 2;
    int n = 3;
    System.out.println(myPow(x, n));
  }
}

public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n / 2;
        }
        
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}

public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / myPow(x, -n);
        }
        if (n % 2 == 0) {
            double y = myPow(x, n / 2);
            return y * y;
        } else {
            return x * myPow(x, n - 1);
        }
    }
}

public class Solution {
    public double myPow(double x, int n) {
        long N = n;
        
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double ans = 1;
        double currProduct = x;
        
        for (long i = N; i > 0; i /= 2) {
            if ((i % 2) == 1) {
                ans *= currProduct;
            }
            currProduct *= currProduct;
        }
        
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;
        double result = pow(x, n);
        System.out.println(x + " raised to the power of " + n + " is " + result);
    }
    
    public static double pow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        
        double half = pow(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half;
        } else if (n > 0) {
            return half * half * x;
        } else {
            return half * half / x;
        }
    }
}

public class Main {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        if (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n / 2;
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double result = 1.0;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= x;
            }
            x *= x;
            n /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;
        System.out.println(myPow(x, n)); // Output: 1024.0
    }
}

public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n == 1) {
            return x;
        }
        
        if (n < 0) {
            x = 1/x;
            n = -n;
        }
        
        double halfPow = myPow(x, n/2);
        if (n % 2 == 0) {
            return halfPow * halfPow;
        } else {
            return x * halfPow * halfPow;
        }
    }
}

public class Solution {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1.0;
        
        if (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n / 2;
        }
        
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        
        double result = 1.0;
        while (n > 0) {
            if (n % 2 == 1)
                result *= x;
            x *= x;
            n /= 2;
        }
        
        return result;
    }
}

public class PowFunction {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n / 2;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}
