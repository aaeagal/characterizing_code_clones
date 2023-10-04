

public class Interleave {
   public static int calculateRectangleArea1(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
      int areaA = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1); // 1
      int areaB = Math.abs(bx2 - bx1) * Math.abs(by2 - by1); // 2
      int intersectLength = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 3
      int intersectWidth = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 4
      int intersectArea = intersectLength * intersectWidth; // 5
      return areaA + areaB - intersectArea;
   }

   public static int computeArea2(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
       int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1); // 6
       int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1); // 7

       int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 8
       int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 9
       int overlapArea = overlapWidth * overlapHeight; // 10

       return area1 + area2 - overlapArea;
   }

    public static int calculateTotalArea3(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int rect1Area = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1); // 11
        int rect2Area = Math.abs(bx2 - bx1) * Math.abs(by2 - by1); // 12

        int totalArea = rect1Area + rect2Area; // 13

        if (ax1 > bx2 || bx1 > ax2 || ay1 > by2 || by1 > ay2) { // 14
            return totalArea;
        }

        int intersectArea = (Math.min(ax2, bx2) - Math.max(ax1, bx1)) * (Math.min(ay2, by2) - Math.max(ay1, by1)); // 15
        return totalArea - intersectArea;
    }

    public static int computeArea4(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2); // 16
        int area2 = Math.abs(bx1 - bx2) * Math.abs(by1 - by2); // 17
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 18
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 19
        int overlapArea = overlapWidth * overlapHeight; // 20
        return area1 + area2 - overlapArea;
    }

    public static int computeArea5(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int totalArea = (ax2 - ax1) * (ay2 - ay1) + (bx2 - bx1) * (by2 - by1); // 21

        int intersectionWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 22
        int intersectionHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 23
        int intersectionArea = intersectionWidth * intersectionHeight; // 24

        return totalArea - intersectionArea;
    }

    public int computeArea6(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1); // 25
        int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1); // 26

        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 27
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 28

        int overlapArea = overlapWidth * overlapHeight; // 29

        return area1 + area2 - overlapArea;
    }

    public int computeArea7(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1); // 30
        int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1); // 31
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 32
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 33
        int overlapArea = overlapWidth * overlapHeight; // 34
        return area1 + area2 - overlapArea;
    }

    public static int areaCoveredByRectangles8(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2); // 35
        int area2 = Math.abs(bx1 - bx2) * Math.abs(by1 - by2); // 36
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 37
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 38
        int overlapArea = overlapWidth * overlapHeight; // 39
        return area1 + area2 - overlapArea;
    }

  public int calculateArea9(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    int area1 = Math.abs((ax2 - ax1) * (ay2 - ay1)); // 40
    int area2 = Math.abs((bx2 - bx1) * (by2 - by1)); // 41

    int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 42
    int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 43
    int overlapArea = overlapWidth * overlapHeight; // 44

    return area1 + area2 - overlapArea;
  }

public static int calculateTotalArea10(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1); // 45
    int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1); // 46
    int totalArea = area1 + area2; // 47

    int overlayWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1); // 48
    int overlayHeight = Math.min(ay2, by2) - Math.max(ay1, by1); // 49
    int overlayArea = 0; // 50
    if (overlayWidth > 0 && overlayHeight > 0) { // 51
        overlayArea = overlayWidth * overlayHeight; // 52
    }

    return totalArea - overlayArea;
}


public static int calculateTotalArea11(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    int areaA = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1); // 53
    int areaB = Math.abs(bx2 - bx1) * Math.abs(by2 - by1); // 54

    int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 55
    int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 56

    int overlapArea = overlapWidth * overlapHeight; // 57

    return areaA + areaB - overlapArea;
}

    public static int calculateTotalArea12(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2); // 58
        int area2 = Math.abs(bx1 - bx2) * Math.abs(by1 - by2); // 59
        int intersectionX = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 60
        int intersectionY = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 61
        int intersectionArea = intersectionX * intersectionY; // 62
        return area1 + area2 - intersectionArea;
    }

    public static int calculateArea13(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1); // 63
        int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1); // 64
        int intersectX1 = Math.max(ax1, bx1); // 65
        int intersectY1 = Math.max(ay1, by1); // 66
        int intersectX2 = Math.min(ax2, bx2); // 67
        int intersectY2 = Math.min(ay2, by2); // 68
        int intersectArea = Math.max(0, intersectX2 - intersectX1) * Math.max(0, intersectY2 - intersectY1); // 69
        return area1 + area2 - intersectArea;
    }

    public static int findTotalArea14(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2); // 70
        int area2 = Math.abs(bx1 - bx2) * Math.abs(by1 - by2); // 71

        int intersectionX1 = Math.max(ax1, bx1); // 72
        int intersectionX2 = Math.min(ax2, bx2); // 73
        int intersectionY1 = Math.max(ay1, by1); // 74
        int intersectionY2 = Math.min(ay2, by2); // 75

        int intersectionArea = 0; // 76
        if (intersectionX1 < intersectionX2 && intersectionY1 < intersectionY2) { // 77
            intersectionArea = Math.abs(intersectionX1 - intersectionX2) * Math.abs(intersectionY1 - intersectionY2); // 78
        }

        return area1 + area2 - intersectionArea;
    }

    public static int findTotalArea15(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2); // 79
        int area2 = Math.abs(bx1 - bx2) * Math.abs(by1 - by2); // 80

        int totalArea = area1 + area2; // 81

        if(ax2 <= bx1 || bx2 <= ax1 || ay2 <= by1 || by2 <= ay1) { // 82
            return totalArea;
        }

        int overlapArea = (Math.min(ax2, bx2) - Math.max(ax1, bx1)) // 83
            * (Math.min(ay2, by2) - Math.max(ay1, by1)); // 84

        return totalArea - overlapArea;
    }

   public int computeArea16(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
       int area1 = (ax2 - ax1) * (ay2 - ay1); // 85
       int area2 = (bx2 - bx1) * (by2 - by1); // 86

       int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 87
       int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 88
       int overlapArea = overlapWidth * overlapHeight; // 89

       return area1 + area2 - overlapArea;
   }

    public static int calculateArea17(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int r1Width = Math.abs(ax2 - ax1); // 90
        int r1Height = Math.abs(ay2 - ay1); // 91
        int r2Width = Math.abs(bx2 - bx1); // 92
        int r2Height = Math.abs(by2 - by1); // 93

        int area1 = r1Width * r1Height; // 94
        int area2 = r2Width * r2Height; // 95

        return area1 + area2;
    }

    public static int calculateArea18(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1); // 96
        int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1); // 97
        int overlap = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)) * // 98
                      Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 99
        return area1 + area2 - overlap;
    }

    public static int computeArea19(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaA = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2); // 100
        int areaB = Math.abs(bx1 - bx2) * Math.abs(by1 - by2); // 101
        int intersectWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 102
        int intersectHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 103
        int intersectArea = intersectWidth * intersectHeight; // 104
        return areaA + areaB - intersectArea;
    }

    public static int findTotalArea20(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaA = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2); // 105
        int areaB = Math.abs(bx1 - bx2) * Math.abs(by1 - by2); // 106
        int intersectionWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 107
        int intersectionHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 108
        int intersectionArea = intersectionWidth * intersectionHeight; // 109
        return areaA + areaB - intersectionArea;
    }
}

