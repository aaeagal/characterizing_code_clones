
public class Main {
    public int reverse1(int x) {
        long reversed = 0;

        while (x != 0) {
            reversed = (reversed * 10) + (x % 10);
            x = x / 10;

            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) reversed;
    }


    public int reverse2(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int)res;
    }


    public int reverse3(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        }
        return (int) res;
    }


    public int reverse4(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
    }


    public int reverse5(int x) {
        long reverse = 0;
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) reverse;
        }
    }



    public int reverse6(int x) {
        long res = 0;
        while(x != 0) {
            res = res*10 + x%10;
            x = x/10;
            
            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) 
                return 0;
        }
        return (int)res;
    }



    public int reverse7(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) res;
    }



    public int reverse8(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) res;
    }



    public int reverse9(int x) {
        long reversed = 0;
        while(x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int)reversed;
    }


    public int reverse10(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
                return 0;
        }
        return (int) res;
    }


    public int reverse11(int x) {
        long rev = 0;
        while(x != 0){
            rev = rev*10 + x%10;
            x = x/10;
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int) rev;
    }


    public int reverse12(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) reversed;
    }


    public int reverse13(int x) {
        long res = 0;
        while(x != 0) {
            res = (res * 10) + (x % 10);
            x = x / 10;
            
            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int)res;
    }



    public int reverse14(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
            x = x / 10;
        }
        return (int) reversed;
    }



    public int reverse15(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) reversed;
    }


    public int reverse16(int x) {
        long reversed = 0;
        while(x != 0){
            reversed = reversed * 10 + x % 10;
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
                return 0;
            }
            x /= 10;
        }
        return (int)reversed;
    }


    public int reverse17(int x) {
        long reversed = 0;
        while(x != 0) {
            int remainder = x % 10;
            x /= 10;
            reversed = reversed * 10 + remainder;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                    return 0;
            }
        }
        return (int) reversed;
    }



    public static int reverse18(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
                return 0;
        }
        return (int)res;
    }



    public int reverse19(int x) {
        long reverse = 0;
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int)reverse;
    }


    public int reverse20(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
                return 0;
        }
        return (int) res;
    }
}

