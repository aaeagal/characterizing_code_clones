

    public static double pow1(double x, int n) {
        if (n == 0) { // 1
            return 1;
        } else if (n < 0) { // 2
            return 1 / pow1(x, -n);
        } else if (n % 2 == 0) { // 3
            double halfPow = pow1(x, n / 2); // 4
            return halfPow * halfPow;
        } else { // 5
            return x * pow1(x, n - 1);
        }
    }

    public static double power2(double x, int n) {
        if (n == 0) { // 6
            return 1;
        }

        if (n < 0) { // 7
            x = 1 / x; // 8
            n = -n; // 9
        }

        if (n % 2 == 0) { // 10
            double half = power2(x, n/2); // 11
            return half * half;
        } else { // 12
            double half = power2(x, n/2); // 13
            return x * half * half;
        }
    }




    public double myPow3(double x, int n) {
    if (n == 0) { // 14
        return 1.0;
    }

    if (n < 0) { // 15
        x = 1 / x; // 16
        n = -n; // 17
    }

    double res = 1.0; // 18

    while (n > 0) { // 19
        if (n % 2 != 0) { // 20
            res *= x; // 21
        }

        x *= x; // 22
        n /= 2; // 23
    }

    return res;
    }



    public static double pow4(double x, int n) {
        if (n == 0) { // 24
            return 1;
        } else if (n > 0) { // 25
            return x * pow4(x, n - 1);
        } else { // 26
            return 1 / pow4(x, -n);
        }
    }




    public static double pow5(double x, int n) {
        if (n == 0) { // 27
            return 1;
        } else if (n < 0) { // 28
            return 1 / pow5(x, -n);
        } else if (n % 2 == 0) { // 29
            double result = pow5(x, n / 2); // 30
            return result * result;
        } else { // 31
            return x * pow5(x, n - 1);
        }
    }


    public static double pow6(double x, int n) {
        if (n == 0) { // 32
            return 1;
        }
        double half = pow6(x, n / 2); // 33
        if (n % 2 == 0) { // 34
            return half * half;
        } else if (n > 0) { // 35
            return half * half * x;
        } else { // 36
            return half * half / x;
        }
    }



    public double myPow7(double x, int n) {
        if (n == 0) { // 37
            return 1.0;
        }

        double half = myPow7(x, n / 2); // 38

        if (n % 2 == 0) { // 39
            return half * half;
        } else if (n > 0) { // 40
            return half * half * x;
        } else { // 41
            return half * half / x;
        }
    }

    public double pow8(double x, int n) {
        if (n == 0) // 42
            return 1;

        double temp = pow8(x, n / 2); // 43
        if (n % 2 == 0) // 44
            return temp * temp;
        else { // 45
            if (n > 0) // 46
                return x * temp * temp;
            else // 47
                return (temp * temp) / x;
        }
    }

    public static double pow9(double x, int n) {
        if (n == 0) { // 48
            return 1;
        } else if (n < 0) { // 49
            return 1 / pow9(x, -n);
        } else if (n % 2 == 0) { // 50
            double half = pow9(x, n / 2); // 51
            return half * half;
        } else { // 52
            return x * pow9(x, n - 1);
        }
    }

    public double myPow10(double x, int n) {
        if (n == 0) { // 53
            return 1;
        }
        if (n < 0) { // 54
            return 1 / myPow10(x, -n);
        }
        double temp = myPow10(x, n / 2); // 55
        if (n % 2 == 0) { // 56
            return temp * temp;
        } else { // 57
            return x * temp * temp;
        }
    }



    public static double power11(double x, int n) {
        if (n == 0) // 58
            return 1;

        double temp = power11(x, n / 2); // 59
        if (n % 2 == 0) // 60
            return temp * temp;
        else { // 61
            if (n > 0) // 62
                return x * temp * temp;
            else // 63
                return (temp * temp) / x;
        }
    }


   public static double power12(double x, int n) {
      if (n == 0) { // 64
         return 1.0;
      }
      double half = power12(x, n / 2); // 65
      if (n % 2 == 0) { // 66
         return half * half;
      } else if (n > 0) { // 67
         return half * half * x;
      } else { // 68
         return half * half / x;
      }
   }


    public static double pow13(double x, int n) {
        if (n == 0) { // 69
            return 1;
        }

        if (n == 1) { // 70
            return x;
        }

        if (n < 0) { // 71
            return 1 / pow13(x, -n);
        }

        double half = pow13(x, n / 2); // 72
        if (n % 2 == 0) { // 73
            return half * half;
        } else { // 74
            return half * half * x;
        }
    }


    public static double pow14(double x, int n) {
        if (n == 0) // 75
            return 1;

        double result = 1.0; // 76

        if (n < 0) { // 77
            x = 1 / x; // 78
            n = -n; // 79
        }

        while (n > 0) { // 80
            if (n % 2 == 1) { // 81
                result *= x; // 82
            }
            x *= x; // 83
            n /= 2; // 84
        }

        return result;
    }


    public static double power15(double x, int n) {
        if(n == 0) // 85
            return 1;
        else if(n < 0) // 86
            return 1/power15(x, -n);
        else if(n%2 == 0) // 87
            return power15(x*x, n/2);
        else // 88
            return x * power15(x*x, n/2);
    }


   public static double pow16(double x, int n) {
       if (n == 0) { // 89
           return 1.0;
       }
       if (n < 0) { // 90
           return 1.0 / pow16(x, -n);
       }
       if (n % 2 == 0) { // 91
           double half = pow16(x, n / 2); // 92
           return half * half;
       } else { // 93
           double half = pow16(x, (n - 1) / 2); // 94
           return x * half * half;
       }
   }


    public static double power17(double x, int n) {
        if (n == 0) { // 95
            return 1;
        }

        double result = 1; // 96
        long absN = Math.abs((long) n); // 97

        while (absN > 0) { // 98
            if (absN % 2 != 0) { // 99
                result *= x; // 100
            }

            x *= x; // 101
            absN /= 2; // 102
        }

        return n < 0 ? 1 / result : result;
    }


    public static double power18(double x, int n) {
        if (n == 0) { // 103
            return 1.0;
        }

        double half = power18(x, n/2); // 104
        if (n % 2 == 0) { // 105
            return half * half;
        } else if (n > 0) { // 106
            return half * half * x;
        } else { // 107
            return half * half / x;
        }
    }


    public static double pow19(double x, int n) {
        if (n == 0) { // 108
            return 1;
        } else if (n < 0) { // 109
            return 1 / pow19(x, -n);
        } else if (n % 2 == 0) { // 110
            double temp = pow19(x, n / 2); // 111
            return temp * temp;
        } else { // 112
            return x * pow19(x, n - 1);
        }
    }


    public static double pow20(double x, int n) {
        if (n == 0) { // 113
            return 1;
        }
        if (n < 0) { // 114
            return 1 / pow20(x, -n);
        }
        if (n % 2 == 0) { // 115
            double temp = pow20(x, n/2); // 116
            return temp * temp;
        }
        else { // 117
            return x * pow20(x, n-1);
        }
    }


