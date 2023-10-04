

    public static double pow1(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / pow1(x, -n);
        } else if (n % 2 == 0) {
            double halfPow = pow1(x, n / 2);
            return halfPow * halfPow;
        } else {
            return x * pow1(x, n - 1);
        }
    }

    public static double power2(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        
        if (n % 2 == 0) {
            double half = power2(x, n/2);
            return half * half;
        } else {
            double half = power2(x, n/2);
            return x * half * half;
        }
    }




    public double myPow3(double x, int n) {
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



    public static double pow4(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return x * pow4(x, n - 1);
        } else {
            return 1 / pow4(x, -n);
        }
    }




    public static double pow5(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / pow5(x, -n);
        } else if (n % 2 == 0) {
            double result = pow5(x, n / 2);
            return result * result;
        } else {
            return x * pow5(x, n - 1);
        }
    }


    public static double pow6(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double half = pow6(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else if (n > 0) {
            return half * half * x;
        } else {
            return half * half / x;
        }
    }



    public double myPow7(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        
        double half = myPow7(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half;
        } else if (n > 0) {
            return half * half * x;
        } else {
            return half * half / x;
        }
    }

    public double pow8(double x, int n) {
        if (n == 0)
            return 1;

        double temp = pow8(x, n / 2);
        if (n % 2 == 0)
            return temp * temp;
        else {
            if (n > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }

    public static double pow9(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / pow9(x, -n);
        } else if (n % 2 == 0) {
            double half = pow9(x, n / 2);
            return half * half;
        } else {
            return x * pow9(x, n - 1);
        }
    }

    public double myPow10(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / myPow10(x, -n);
        }
        double temp = myPow10(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }



    public static double power11(double x, int n) {
        if (n == 0)
            return 1;

        double temp = power11(x, n / 2);
        if (n % 2 == 0)
            return temp * temp;
        else {
            if (n > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }


   public static double power12(double x, int n) {
      if (n == 0) {
         return 1.0;
      }
      double half = power12(x, n / 2);
      if (n % 2 == 0) {
         return half * half;
      } else if (n > 0) {
         return half * half * x;
      } else {
         return half * half / x;
      }
   }

    
    public static double pow13(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n == 1) {
            return x;
        }
        
        if (n < 0) {
            return 1 / pow13(x, -n);
        }
        
        double half = pow13(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

  
    public static double pow14(double x, int n) {
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
    

    public static double power15(double x, int n) {
        if(n == 0)
            return 1;
        else if(n < 0)
            return 1/power15(x, -n);
        else if(n%2 == 0)
            return power15(x*x, n/2);
        else
            return x * power15(x*x, n/2);
    }
    

   public static double pow16(double x, int n) {
       if (n == 0) {
           return 1.0;
       }
       if (n < 0) {
           return 1.0 / pow16(x, -n);
       }
       if (n % 2 == 0) {
           double half = pow16(x, n / 2);
           return half * half;
       } else {
           double half = pow16(x, (n - 1) / 2);
           return x * half * half;
       }
   }


    public static double power17(double x, int n) {
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
    

    public static double power18(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        
        double half = power18(x, n/2);
        if (n % 2 == 0) {
            return half * half;
        } else if (n > 0) {
            return half * half * x;
        } else {
            return half * half / x;
        }
    }


    public static double pow19(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / pow19(x, -n);
        } else if (n % 2 == 0) {
            double temp = pow19(x, n / 2);
            return temp * temp;
        } else {
            return x * pow19(x, n - 1);
        }
    }


    public static double pow20(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / pow20(x, -n);
        }
        if (n % 2 == 0) {
            double temp = pow20(x, n/2);
            return temp * temp;
        }
        else {
            return x * pow20(x, n-1);
        }
    }


