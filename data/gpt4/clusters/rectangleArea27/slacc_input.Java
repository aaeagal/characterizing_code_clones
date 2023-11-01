public class Main {
    public long totalArea1(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        long area1 = (long) (ax2 - ax1) * (ay2 - ay1); // 1
        long area2 = (long) (bx2 - bx1) * (by2 - by1); // 2

        int ix1 = Math.max(ax1, bx1); // 3
        int iy1 = Math.max(ay1, by1); // 4
        int ix2 = Math.min(ax2, bx2); // 5
        int iy2 = Math.min(ay2, by2); // 6

        long intersectArea = 0; // 7

        if (ix2 > ix1 && iy2 > iy1) { // 8
            intersectArea = (long) (ix2 - ix1) * (iy2 - iy1); // 9
        }

        return area1 + area2 - intersectArea;
    }

    public static double totalArea2(double ax1, double ay1, double ax2, double ay2, double bx1, double by1, double bx2, double by2) {
        double areaA = Math.abs((ax2-ax1) * (ay2-ay1)); // 10
        double areaB = Math.abs((bx2-bx1) * (by2-by1)); // 11

        double left = Math.max(ax1, bx1); // 12
        double right = Math.min(ax2, bx2); // 13
        double bottom = Math.max(ay1, by1); // 14
        double top = Math.min(ay2, by2); // 15

        double overlap = 0; // 16
        if (right > left && top > bottom) // 17
        {
            overlap = (right - left) * (top - bottom); // 18
        }

        return areaA + areaB - overlap;
    }

    public static int totalArea3(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        int area1 = (ax2 - ax1) * (ay2 - ay1); // 20
        int area2 = (bx2 - bx1) * (by2 - by1); // 21


        int left = Math.max(ax1, bx1); // 23
        int right = Math.min(ax2, bx2); // 24
        int top = Math.min(ay2, by2); // 25
        int bottom = Math.max(ay1, by1); // 26

        int overlap = 0; // 27
        if(right > left && top > bottom) // 28
            overlap = (right - left) * (top - bottom); // 29

        return area1 + area2 - overlap;
    }



    public int rectangleArea4(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        int rect1 = (ax2 - ax1) * (ay2 - ay1); // 32
        int rect2 = (bx2 - bx1) * (by2 - by1); // 33

        int x_overlap = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 35
        int y_overlap = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 36
        int overlapArea = x_overlap * y_overlap; // 37

        return rect1 + rect2 - overlapArea;
    }

    public int calculateArea5(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1); // 39
        int area2 = (bx2 - bx1) * (by2 - by1); // 40

        int overlapX = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 41
        int overlapY = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 42

        int overlapArea = overlapX * overlapY; // 43
        return area1 + area2 - overlapArea;
    }

    public static int computeArea6(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaA = (ax2 - ax1) * (ay2 - ay1); // 44
        int areaB = (bx2 - bx1) * (by2 - by1); // 45

        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1); // 46
        int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1); // 47

        int overlapArea = 0; // 48
        if (overlapWidth > 0 && overlapHeight > 0) // 49
            overlapArea = overlapWidth * overlapHeight; // 50

        return areaA + areaB - overlapArea;
    }



    public long areaCoveredByRectangles7(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        long totalArea = (long)(ax2 - ax1) * (ay2 - ay1) + (long)(bx2 - bx1) * (by2 - by1); // 51

        int overlapx = Math.min(ax2, bx2) - Math.max(ax1, bx1); // 52
        int overlapy = Math.min(ay2, by2) - Math.max(ay1, by1); // 53

        if (overlapx > 0 && overlapy > 0) { // 54
            totalArea -= (long)overlapx * overlapy; // 55
        }

        return totalArea;
    }

    public static int totalArea8(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1); // 56
        int area2 = (bx2 - bx1) * (by2 - by1); // 57

        int overlapArea = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)) * // 58
                          Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 59

        return area1 + area2 - overlapArea;
    }

    public static int totalArea9(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1); // 60
        int area2 = (bx2 - bx1) * (by2 - by1); // 61

        int intersectArea = 0; // 62

        int x_overlap = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 63
        int y_overlap = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 64

        if (x_overlap > 0 && y_overlap > 0) { // 65
        intersectArea = x_overlap * y_overlap; // 66
        }

        return area1 + area2 - intersectArea;
    }

    public long totalArea10(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        long totalArea = (long) (ax2 - ax1) * (ay2 - ay1) + (long) (bx2 - bx1) * (by2 - by1); // 67

        long overlapX = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 68
        long overlapY = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 69

        long overlapArea = overlapX * overlapY; // 70

        return totalArea - overlapArea;
    }

    public static int area11(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1); // 72
        int area2 = (bx2 - bx1) * (by2 - by1); // 73

        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 75
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 76

        int overlappingArea = overlapWidth * overlapHeight; // 77

        return area1 + area2 - overlappingArea;
    }

    public int totalArea12(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1); // 79
        int area2 = (bx2 - bx1) * (by2 - by1); // 80

        int left = Math.max(ax1, bx1); // 81
        int right = Math.min(ax2, bx2); // 82
        int bottom = Math.max(ay1, by1); // 83
        int top = Math.min(ay2, by2); // 84

        int overlap = 0; // 85
        if (right > left && top > bottom) // 86
            overlap = (right - left) * (top - bottom); // 87

        return area1 + area2 - overlap;
    }

    public static int rectangleArea13(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2){

        int areaA = (ax2 - ax1) * (ay2 - ay1); // 89
        int areaB = (bx2 - bx1) * (by2 - by1); // 90

        int overlapX = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 92
        int overlapY = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 93
        int overlapArea = overlapX * overlapY; // 94

        return areaA + areaB - overlapArea;
    }

    public static int calculateTotalArea14(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1); // 96
        int area2 = (bx2 - bx1) * (by2 - by1); // 97

        int overlapX = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 98
        int overlapY = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 99

        int overlapArea = overlapX * overlapY; // 100

        return area1 + area2 - overlapArea;
    }

    public int calculateTotalArea15(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        int area1 = (ax2 - ax1) * (ay2 - ay1); // 102
        int area2 = (bx2 - bx1) * (by2 - by1); // 103

        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1); // 105
        int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1); // 106
        int overlapArea = 0; // 107

        if (overlapWidth > 0 && overlapHeight > 0) { // 109
            overlapArea = overlapWidth * overlapHeight; // 110
        }

        return area1 + area2 - overlapArea;
    }

    public static int totalArea16(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        int areaA = (ax2 - ax1) * (ay2 - ay1); // 112
        int areaB = (bx2 - bx1) * (by2 - by1); // 113

        int overlapX = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 114
        int overlapY = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 115
        int overlapArea = overlapX * overlapY; // 116

        return areaA + areaB - overlapArea;
    }

    public static int totalCoveredArea17(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        int totalArea = (ax2 - ax1) * (ay2 - ay1) + (bx2 - bx1) * (by2 - by1); // 118

        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1); // 120
        int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1); // 121


        if (overlapWidth <= 0 || overlapHeight <= 0) { // 123
            return totalArea;
        }

        totalArea -= overlapWidth * overlapHeight; // 125

        return totalArea;
    }

    public int totalArea18(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1); // 126
        int area2 = (bx2 - bx1) * (by2 - by1); // 127

        int left = Math.max(ax1, bx1); // 128
        int right = Math.min(ax2, bx2); // 129
        int bottom = Math.max(ay1, by1); // 130
        int top = Math.min(ay2, by2); // 131

        int overlappingArea = 0; // 132
        if (right > left && top > bottom) { // 133
            overlappingArea = (right - left) * (top - bottom); // 134
        }

        return area1 + area2 - overlappingArea;
    }

    static int getArea19(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2){ // 135
        int rect_1_area = (ax2-ax1)*(ay2-ay1); // 136
        int rect_2_area = (bx2-bx1)*(by2-by1); // 137
        int overlap_area = 0; // 138

        int X_overlap = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)); // 139
        int Y_overlap = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1)); // 140

        if(X_overlap > 0 && Y_overlap > 0){ // 141
            overlap_area = X_overlap * Y_overlap; // 142
        }
        return rect_1_area + rect_2_area - overlap_area;
    }

    public int totalArea20(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1); // 143
        int area2 = (bx2 - bx1) * (by2 - by1); // 144

        int intersectX = Math.min(ax2, bx2) - Math.max(ax1, bx1); // 145
        int intersectY = Math.min(ay2, by2) - Math.max(ay1, by1); // 146

        int intersection = 0; // 147

        if (intersectX > 0 && intersectY > 0) { // 148
            intersection = intersectX * intersectY; // 149
        }

        return area1 + area2 - intersection;
    }
}

