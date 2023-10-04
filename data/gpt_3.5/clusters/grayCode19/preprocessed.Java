
import java.util.*;

public class GrayCodeSequence {

    public static List<Integer> grayCode1(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            result.add(i ^ i >> 1);
        }
        return result;
    }


    public List<Integer> grayCode2(int n) {
        List<Integer> graycode = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            graycode.add(i ^ (i >> 1));
        }
        return graycode;
    }

    public static List<Integer> grayCode3(int n) {
        List<Integer> grayCodeSequence = new ArrayList<>();
        
        if (n == 0) {
            grayCodeSequence.add(0);
            return grayCodeSequence;
        }
        
        grayCodeSequence = grayCode(n - 1);
        int size = grayCodeSequence.size();
        int mask = 1 << (n - 1);
        
        for (int i = size - 1; i >= 0; i--) {
            grayCodeSequence.add(mask | grayCodeSequence.get(i));
        }
        
        return grayCodeSequence;
    }

    public static int[] grayCode4(int n) {
        int[] result = new int[(int) Math.pow(2, n)];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = i ^ (i >> 1);
        }
        
        return result;
    }

    public static List<Integer> grayCode5(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }


    public static List<Integer> grayCode6(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            result.add(i ^ i >> 1);
        }
        return result;
    }

    public static List<Integer> grayCode7(int n) {
        
        List<Integer> result = new ArrayList<>();
        
        if (n == 0) {
            result.add(0);
            return result;
        }
        
        List<Integer> prevGrayCode = grayCode7(n - 1);
        int numToAdd = 1 << (n - 1);
        
        result.addAll(prevGrayCode);
        
        for (int i = prevGrayCode.size() - 1; i >= 0; i--) {
            result.add(numToAdd + prevGrayCode.get(i));
        }
        
        return result;
    }

    public static ArrayList<Integer> grayCode8(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        if (n == 0) {
            result.add(0);
            return result;
        }
        
        ArrayList<Integer> prev = grayCode8(n-1);
        int numToAdd = 1 << (n-1);
        
        result.addAll(prev);
        
        for (int i = prev.size()-1; i >= 0; i--) {
            result.add(numToAdd + prev.get(i));
        }
        
        return result;
    }


    public static List<Integer> grayCode9(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            result.add(i ^ i >> 1);
        }
        return result;
    }


    
    public static List<Integer> grayCode10(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            result.add(i ^ i >> 1);
        }
        return result;
    }
    

    public static List<Integer> grayCode11(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            result.add(i ^ i >> 1);
        }
        return result;
    }


    public static List<Integer> grayCode12(int n) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < Math.pow(2, n); i++) {
            int grayCode = i ^ (i >> 1);
            result.add(grayCode);
        }
        
        return result;
    }


    public static List<Integer> grayCode13(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }

 
    public static List<Integer> grayCode14(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            int grayCode = i ^ (i >> 1);
            result.add(grayCode);
        }
        return result;
    }

    public static List<Integer> grayCode15(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }


    public static List<Integer> grayCode16(int n) {
        List<Integer> gray = new ArrayList<>();
        gray.add(0);

        for (int i = 0; i < n; i++) {
            int size = gray.size();
            for (int j = size - 1; j >= 0; j--)
                gray.add(gray.get(j) | 1 << i);
        }
        return gray;
    }


    public static List<Integer> grayCode17(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }


    public static List<Integer> grayCode18(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }


    public static List<Integer> grayCode19(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        for (int i = 0; i < n; i++) {
            int size = result.size();
            for (int j = size - 1; j >= 0; j--) {
                result.add(result.get(j) | (1 << i));
            }
        }
        return result;
    }
}

