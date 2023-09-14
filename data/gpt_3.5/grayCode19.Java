
import java.util.*;

public class GrayCodeSequence {

    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            result.add(i ^ i >> 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<Integer> grayCodeSequence = grayCode(n);
        System.out.println(grayCodeSequence);
    }
}


    public static void main(String[] args) {
        int n = 3;
        List<String> grayCodeSequence = grayCode(n);
        System.out.println("Gray Code Sequence (" + n + "-bit):");
        for (String code : grayCodeSequence) {
            System.out.println(code);
        }
    }
    

public List<Integer> grayCode(int n) {
    List<Integer> graycode = new ArrayList<>();
    for (int i = 0; i < (1 << n); i++) {
        graycode.add(i ^ (i >> 1));
    }
    return graycode;
}


import java.util.*;

public class GrayCodeSequence {
    public static List<Integer> grayCode(int n) {
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

    public static void main(String[] args) {
        int n = 3;
        
        List<Integer> grayCodeSequence = grayCode(n);
        
        System.out.println("Gray Code Sequence for " + n + " bits:");
        for (int code : grayCodeSequence) {
            System.out.println(Integer.toBinaryString(code));
        }
    }
}


public class GrayCode {
    public static int[] grayCode(int n) {
        int[] result = new int[(int) Math.pow(2, n)];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = i ^ (i >> 1);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int n = 3;
        int[] graySequence = grayCode(n);
        
        for (int i = 0; i < graySequence.length; i++) {
            System.out.print(graySequence[i] + " ");
        }
    }
}


import java.util.ArrayList;
import java.util.List;

public class GrayCodeSequence {
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<Integer> grayCodeSeq = grayCode(n);
        System.out.println(grayCodeSeq);
    }
}


import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            result.add(i ^ i >> 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        List<Integer> grayCodes = grayCode(n);
        System.out.println(grayCodes);
    }
}



import java.util.ArrayList;
import java.util.List;

public class GrayCodeSequence {
    public static List<Integer> grayCode(int n) {
        
        List<Integer> result = new ArrayList<>();
        
        if (n == 0) {
            result.add(0);
            return result;
        }
        
        List<Integer> prevGrayCode = grayCode(n - 1);
        int numToAdd = 1 << (n - 1);
        
        result.addAll(prevGrayCode);
        
        for (int i = prevGrayCode.size() - 1; i >= 0; i--) {
            result.add(numToAdd + prevGrayCode.get(i));
        }
        
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<Integer> grayCodeSeq = grayCode(n);
        System.out.println("Gray code sequence of " + n + " bits:");
        for (int num : grayCodeSeq) {
            System.out.println(num);
        }
    }
}



import java.util.ArrayList;

public class GrayCode {
    public static ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        if (n == 0) {
            result.add(0);
            return result;
        }
        
        ArrayList<Integer> prev = grayCode(n-1);
        int numToAdd = 1 << (n-1);
        
        result.addAll(prev);
        
        for (int i = prev.size()-1; i >= 0; i--) {
            result.add(numToAdd + prev.get(i));
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> grayCodeSeq = grayCode(n);
        System.out.println(grayCodeSeq);
    }
}


import java.util.*;

public class GrayCode {
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            result.add(i ^ i >> 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<Integer> grayCodeSeq = grayCode(n);
        System.out.println(grayCodeSeq);
    }
}



import java.util.*;

public class GrayCodeSequence {
    
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            result.add(i ^ i >> 1);
        }
        return result;
    }
    
    public static void main(String[] args) {
        int n = 4;
        List<Integer> sequence = grayCode(n);
        System.out.println("Gray Code Sequence for " + n + " bits:");
        System.out.println(sequence);
    }
}




import java.util.*;

public class GrayCodeSequence {
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            result.add(i ^ i >> 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<Integer> grayCodeSequence = grayCode(n);
        System.out.println(grayCodeSequence);
    }
}



public static List<Integer> grayCode(int n) {
    List<Integer> result = new ArrayList<>();
    
    for (int i = 0; i < Math.pow(2, n); i++) {
        int grayCode = i ^ (i >> 1);
        result.add(grayCode);
    }
    
    return result;
}


import java.util.*;

public class GrayCodeGenerator {
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<Integer> grayCodeSequence = grayCode(n);
        System.out.println(grayCodeSequence);
    }
}


import java.util.*;

public class GrayCodeSequence {
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            int grayCode = i ^ (i >> 1);
            result.add(grayCode);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<Integer> sequence = grayCode(n);
        System.out.println(sequence);
    }
}


import java.util.*;

public class GrayCode {
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<Integer> grayCodeSeq = grayCode(n);
        System.out.println("Gray Code Sequence: " + grayCodeSeq);
    }
}


import java.util.ArrayList;
import java.util.List;

public class GrayCodeSequence {
    public static List<Integer> grayCode(int n) {
        List<Integer> gray = new ArrayList<>();
        gray.add(0);

        for (int i = 0; i < n; i++) {
            int size = gray.size();
            for (int j = size - 1; j >= 0; j--)
                gray.add(gray.get(j) | 1 << i);
        }
        return gray;
    }

    public static void main(String[] args) {
        List<Integer> grayCode = grayCode(3);
        System.out.println(grayCode);
    }
}


import java.util.ArrayList;
import java.util.List;

public class GrayCodeSequence {
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<Integer> grayCodeSeq = grayCode(n);
        System.out.println("Gray Code sequence for " + n + " bits:");
        for (int grayCode : grayCodeSeq) {
            System.out.println(grayCode);
        }
    }
}


import java.util.*;

public class GrayCode {
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        List<Integer> grayCodeSequence = grayCode(n);
        System.out.println(grayCodeSequence);
    }
}


import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public static List<Integer> grayCode(int n) {
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

    public static void main(String[] args) {
        int n = 3;
        List<Integer> grayCode = grayCode(n);
        System.out.println("Gray Code sequence for " + n + " bits:");
        System.out.println(grayCode);
    }
}

