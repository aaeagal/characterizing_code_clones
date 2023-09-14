
public class Power {

    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / pow(x, -n);
        } else if (n % 2 == 0) {
            double halfPow = pow(x, n / 2);
            return halfPow * halfPow;
        } else {
            return x * pow(x, n - 1);
        }
    }

    public static void main(String[] args) {
        double x = 2.5;
        int n = 3;
        System.out.println(x + " raised to the power of " + n + " is: " + pow(x, n));
    }
}



public class PowerFunction {
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        
        if (n % 2 == 0) {
            double half = power(x, n/2);
            return half * half;
        } else {
            double half = power(x, n/2);
            return x * half * half;
        }
    }
}



public double myPow(double x, int n) {
   if (n == 0) {
      return 1.0;
   }
   
   if (n < 0) {
      x = 1 / x;
      n = -n;
   }
   
   double res = 1.0;
   
   while (n > 0) {
      if (n % 2 != 0) {
         res *= x;
      }
      
      x *= x;
      n /= 2;
   }
   
   return res;
}


public class Power {
    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return x * pow(x, n - 1);
        } else {
            return 1 / pow(x, -n);
        }
    }
}


public class Power {

    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / pow(x, -n);
        } else if (n % 2 == 0) {
            double result = pow(x, n / 2);
            return result * result;
        } else {
            return x * pow(x, n - 1);
        }
    }

}


public class PowerCalculator {
    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
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


public class PowerFunction {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        
        double half = myPow(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half;
        } else if (n > 0) {
            return half * half * x;
        } else {
            return half * half / x;
        }
    }
}



public class PowFunction {
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


public class PowFunction {
    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / pow(x, -n);
        } else if (n % 2 == 0) {
            double half = pow(x, n / 2);
            return half * half;
        } else {
            return x * pow(x, n - 1);
        }
    }
}


public class PowerFunction {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / myPow(x, -n);
        }
        double temp = myPow(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }
}


public class PowerFunction {
    public static double power(double x, int n) {
        if (n == 0)
            return 1;

        double temp = power(x, n / 2);
        if (n % 2 == 0)
            return temp * temp;
        else {
            if (n > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }

    public static void main(String[] args) {
        double x = 2.3;
        int n = 5;
        System.out.println("Result: " + power(x, n));
    }
}


public class Power {
   public static double power(double x, int n) {
      if (n == 0) {
         return 1.0;
      }
      double half = power(x, n / 2);
      if (n % 2 == 0) {
         return half * half;
      } else if (n > 0) {
         return half * half * x;
      } else {
         return half * half / x;
      }
   }

   public static void main(String[] args) {
      double x = 2.0;
      int n = 10;
      System.out.println(power(x, n));
   }
}


public class PowerCalculator {
    
    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n == 1) {
            return x;
        }
        
        if (n < 0) {
            return 1 / pow(x, -n);
        }
        
        double half = pow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 3)); // Output: 8.0
        System.out.println(pow(4, -2)); // Output: 0.0625
        System.out.println(pow(5, 0)); // Output: 1.0
    }
}


public class PowerFunction {
    public static double pow(double x, int n) {
        if (n == 0)
            return 1;
        
        double result = 1.0;
        
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        
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
        double x = 2;
        int n = 3;
        double result = pow(x, n);
        System.out.println(x + " raised to power " + n + " is: " + result);
    }
}


public class Power {
    public static double power(double x, int n) {
        if(n == 0)
            return 1;
        else if(n < 0)
            return 1/power(x, -n);
        else if(n%2 == 0)
            return power(x*x, n/2);
        else
            return x * power(x*x, n/2);
    }
    
    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;
        
        double result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}


public class PowerFunction {

   public static double pow(double x, int n) {
       if (n == 0) {
           return 1.0;
       }
       if (n < 0) {
           return 1.0 / pow(x, -n);
       }
       if (n % 2 == 0) {
           double half = pow(x, n / 2);
           return half * half;
       } else {
           double half = pow(x, (n - 1) / 2);
           return x * half * half;
       }
   }

   public static void main(String[] args) {
       double x = 2.0;
       int n = 10;
       double result = pow(x, n);
       System.out.println(x + " raised to the power of " + n + " is: " + result);
   }
}


public class Main {
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        double result = 1;
        long absN = Math.abs((long) n); // Take absolute value to handle negative exponents
        
        while (absN > 0) {
            if (absN % 2 != 0) {
                result *= x;
            }
            
            x *= x;
            absN /= 2;
        }
        
        return n < 0 ? 1 / result : result;
    }
    
    public static void main(String[] args) {
        double x = 2.5;
        int n = -3;
        
        System.out.println(x + " raised to the power " + n + " is: " + power(x, n));
    }
}


public class PowerFunction {

    public static double power(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        
        double half = power(x, n/2);
        if (n % 2 == 0) {
            return half * half;
        } else if (n > 0) {
            return half * half * x;
        } else {
            return half * half / x;
        }
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;
        double result = power(x, n);
        System.out.println(x + " raised to the power " + n + " is " + result);
    }
}



public class CalculatePower {
    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / pow(x, -n);
        } else if (n % 2 == 0) {
            double temp = pow(x, n / 2);
            return temp * temp;
        } else {
            return x * pow(x, n - 1);
        }
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
        if (n % 2 == 0) {
            double temp = pow(x, n/2);
            return temp * temp;
        }
        else {
            return x * pow(x, n-1);
        }
    }
}

