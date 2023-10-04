
import java.util.*;

public class GrayCodeSequence {

    public static List<Integer> grayCode1(int n) {
        List<Integer> result = new ArrayList<>(); // 1
        for (int i = 0; i < 1 << n; i++) { // 2
            result.add(i ^ i >> 1); // 3
        }
        return result;
    }


    public List<Integer> grayCode2(int n) {
        List<Integer> graycode = new ArrayList<>(); // 4
        for (int i = 0; i < (1 << n); i++) { // 5
            graycode.add(i ^ (i >> 1)); // 6
        }
        return graycode;
    }

    public static List<Integer> grayCode3(int n) {
        List<Integer> grayCodeSequence = new ArrayList<>(); // 7

        if (n == 0) { // 8
            grayCodeSequence.add(0); // 9
            return grayCodeSequence;
        }

        grayCodeSequence = grayCode3(n - 1); // 10
        int size = grayCodeSequence.size(); // 11
        int mask = 1 << (n - 1); // 12

        for (int i = size - 1; i >= 0; i--) { // 13
            grayCodeSequence.add(mask | grayCodeSequence.get(i)); // 14
        }

        return grayCodeSequence;
    }

    public static int[] grayCode4(int n) {
        int[] result = new int[(int) Math.pow(2, n)]; // 15

        for (int i = 0; i < result.length; i++) { // 16
            result[i] = i ^ (i >> 1); // 17
        }

        return result;
    }

    public static List<Integer> grayCode5(int n) {
        List<Integer> result = new ArrayList<>(); // 18
        for (int i = 0; i < Math.pow(2, n); i++) { // 19
            result.add(i ^ (i >> 1)); // 20
        }
        return result;
    }


    public static List<Integer> grayCode6(int n) {
        List<Integer> result = new ArrayList<>(); // 21
        for (int i = 0; i < 1 << n; i++) { // 22
            result.add(i ^ i >> 1); // 23
        }
        return result;
    }

    public static List<Integer> grayCode7(int n) {

        List<Integer> result = new ArrayList<>(); // 24

        if (n == 0) { // 25
            result.add(0); // 26
            return result;
        }

        List<Integer> prevGrayCode = grayCode7(n - 1); // 27
        int numToAdd = 1 << (n - 1); // 28

        result.addAll(prevGrayCode); // 29

        for (int i = prevGrayCode.size() - 1; i >= 0; i--) { // 30
            result.add(numToAdd + prevGrayCode.get(i)); // 31
        }

        return result;
    }

    public static ArrayList<Integer> grayCode8(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>(); // 32

        if (n == 0) { // 33
            result.add(0); // 34
            return result;
        }

        ArrayList<Integer> prev = grayCode8(n-1); // 35
        int numToAdd = 1 << (n-1); // 36

        result.addAll(prev); // 37

        for (int i = prev.size()-1; i >= 0; i--) { // 38
            result.add(numToAdd + prev.get(i)); // 39
        }

        return result;
    }


    public static List<Integer> grayCode9(int n) {
        List<Integer> result = new ArrayList<>(); // 40
        for (int i = 0; i < 1 << n; i++) { // 41
            result.add(i ^ i >> 1); // 42
        }
        return result;
    }



    public static List<Integer> grayCode10(int n) {
        List<Integer> result = new ArrayList<>(); // 43
        for (int i = 0; i < 1 << n; i++) { // 44
            result.add(i ^ i >> 1); // 45
        }
        return result;
    }


    public static List<Integer> grayCode11(int n) {
        List<Integer> result = new ArrayList<>(); // 46
        for (int i = 0; i < 1 << n; i++) { // 47
            result.add(i ^ i >> 1); // 48
        }
        return result;
    }


    public static List<Integer> grayCode12(int n) {
        List<Integer> result = new ArrayList<>(); // 49

        for (int i = 0; i < Math.pow(2, n); i++) { // 50
            int grayCode = i ^ (i >> 1); // 51
            result.add(grayCode); // 52
        }

        return result;
    }


    public static List<Integer> grayCode13(int n) {
        List<Integer> result = new ArrayList<>(); // 53
        for (int i = 0; i < Math.pow(2, n); i++) { // 54
            result.add(i ^ (i >> 1)); // 55
        }
        return result;
    }


    public static List<Integer> grayCode14(int n) {
        List<Integer> result = new ArrayList<>(); // 56
        for (int i = 0; i < Math.pow(2, n); i++) { // 57
            int grayCode = i ^ (i >> 1); // 58
            result.add(grayCode); // 59
        }
        return result;
    }

    public static List<Integer> grayCode15(int n) {
        List<Integer> result = new ArrayList<>(); // 60
        for (int i = 0; i < (1 << n); i++) { // 61
            result.add(i ^ (i >> 1)); // 62
        }
        return result;
    }


    public static List<Integer> grayCode16(int n) {
        List<Integer> gray = new ArrayList<>(); // 63
        gray.add(0); // 64

        for (int i = 0; i < n; i++) { // 65
            int size = gray.size(); // 66
            for (int j = size - 1; j >= 0; j--) // 67
                gray.add(gray.get(j) | 1 << i); // 68
        }
        return gray;
    }


    public static List<Integer> grayCode17(int n) {
        List<Integer> result = new ArrayList<>(); // 69
        for (int i = 0; i < Math.pow(2, n); i++) { // 70
            result.add(i ^ (i >> 1)); // 71
        }
        return result;
    }


    public static List<Integer> grayCode18(int n) {
        List<Integer> result = new ArrayList<>(); // 72
        for (int i = 0; i < (1 << n); i++) { // 73
            result.add(i ^ (i >> 1)); // 74
        }
        return result;
    }


    public static List<Integer> grayCode19(int n) {
        List<Integer> result = new ArrayList<>(); // 75
        result.add(0); // 76
        for (int i = 0; i < n; i++) { // 77
            int size = result.size(); // 78
            for (int j = size - 1; j >= 0; j--) { // 79
                result.add(result.get(j) | (1 << i)); // 80
            }
        }
        return result;
    }
}

