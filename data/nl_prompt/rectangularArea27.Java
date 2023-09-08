public class RectangleArea {
   public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaA = (ax2 - ax1) * (ay2 - ay1);
        int areaB = (bx2 - bx1) * (by2 - by1);
        
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int overlapArea = overlapWidth * overlapHeight;
        
        return areaA + areaB - overlapArea;
    }
}
public class RectangularArea {
    public static int getTotalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
        int intersection = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)) * Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        return area1 + area2 - intersection;
    }
}

public class RectangleAreaCalculator {
    
    public static int calculateArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int overlapArea = overlapWidth * overlapHeight;
        return area1 + area2 - overlapArea;
    }
}

public static int calculateTotalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
    int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
    int overlapX = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
    int overlapY = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
    int overlapArea = overlapX * overlapY;
    return area1 + area2 - overlapArea;
}

public class RectangleArea {
    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaA = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        int areaB = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int overlapArea = overlapWidth * overlapHeight;
        
        return areaA + areaB - overlapArea;
    }
}

public class RectangleArea {
    
    public static int calculateTotalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int rect1Area = (ax2 - ax1) * (ay2 - ay1);
        int rect2Area = (bx2 - bx1) * (by2 - by1);
        
        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);
        int overlapArea = Math.max(overlapWidth, 0) * Math.max(overlapHeight, 0);
        
        return rect1Area + rect2Area - overlapArea;
    }
    
    public static void main(String[] args) {
        int ax1 = 1;
        int ay1 = 1;
        int ax2 = 5;
        int ay2 = 5;
        int bx1 = 3;
        int by1 = 3;
        int bx2 = 7;
        int by2 = 7;
        
        int totalArea = calculateTotalArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        System.out.println("Total area covered: " + totalArea);
    }
}

public class RectilinearRectangles {
    public int computeTotalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
        int overlappingArea = 0;
        
        if (ax1 <= bx1 && ax2 >= bx1 && ay1 <= by2 && ay2 >= by1) {
            int width = Math.min(ax2, bx2) - bx1;
            int height = Math.min(ay2, by2) - Math.max(ay1, by1);
            overlappingArea = width * height;
        } else if (bx1 <= ax1 && bx2 >= ax1 && by1 <= ay2 && by2 >= ay1) {
            int width = Math.min(bx2, ax2) - ax1;
            int height = Math.min(by2, ay2) - Math.max(by1, ay1);
            overlappingArea = width * height;
        }
        
        return area1 + area2 - overlappingArea;
    }
}

public class RectangleArea {

    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
        int area2 = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);

        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);
        int overlapArea = Math.max(overlapWidth, 0) * Math.max(overlapHeight, 0);

        return area1 + area2 - overlapArea;
    }

    public static void main(String[] args) {
        RectangleArea rectangleArea = new RectangleArea();
        int totalArea = rectangleArea.computeArea(-3, 0, 3, 4, 0, -1, 9, 2);
        System.out.println("Total area covered by the two rectangles: " + totalArea);
    }
}

public class RectilinearRectangleArea {
    public static int getTotalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int rect1Area = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
        int rect2Area = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);
        int intersectionWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int intersectionHeight = Math.min(ay2, by2) - Math.max(ay1, by1);
        int intersectionArea = Math.max(intersectionWidth, 0) * Math.max(intersectionHeight, 0);
        return rect1Area + rect2Area - intersectionArea;
    }
}

public class RectangleArea {
    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
        int area2 = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);
        
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int overlapArea = overlapWidth * overlapHeight;
        
        return area1 + area2 - overlapArea;
    }
}

public class RectangleAreaCalculator {

    public static int calculateTotalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaRectangle1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        int areaRectangle2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
        int intersectingArea = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)) *
                               Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        return areaRectangle1 + areaRectangle2 - intersectingArea;
    }

    public static void main(String[] args) {
        int ax1 = -5;
        int ay1 = -3;
        int ax2 = 3;
        int ay2 = 2;
        int bx1 = 1;
        int by1 = -2;
        int bx2 = 6;
        int by2 = 4;

        int totalArea = calculateTotalArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        System.out.println("Total area covered by the two rectangles is: " + totalArea);
    }
}

public class RectangleArea {
    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);
        
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int overlapArea = overlapWidth * overlapHeight;
        
        return area1 + area2 - overlapArea;
    }
}

public class RectangleArea {

    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaA = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
        int areaB = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);
        
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int overlapArea = overlapWidth * overlapHeight;
        
        return areaA + areaB - overlapArea;
    }
    
    public static void main(String[] args) {
        int ax1 = 0, ay1 = 0, ax2 = 5, ay2 = 5;
        int bx1 = 2, by1 = 2, bx2 = 7, by2 = 7;
        
        int totalArea = computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        System.out.println("Total Area: " + totalArea);
    }
}

class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int overlapArea = overlapWidth * overlapHeight;
        return area1 + area2 - overlapArea;
    }
}
public class RectangleArea {
   public static int calculateArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
      int rec1Area = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
      int rec2Area = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
      int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
      int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
      int overlapArea = overlapWidth * overlapHeight;
      return rec1Area + rec2Area - overlapArea;
   }
}


public class RectangleArea {
    public int calculateArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
        int area2 = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);
        
        int intersectionWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int intersectionHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int intersectionArea = intersectionWidth * intersectionHeight;
        
        return area1 + area2 - intersectionArea;
    }
}


public class RectangleArea {
    public static int calculateArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int rect1Area = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        int rect2Area = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
        int totalArea = rect1Area + rect2Area;
        return totalArea;
    }
}


public class RectangleAreaCalculator {
    public static int calculateTotalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaA = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        int areaB = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int overlapArea = overlapWidth * overlapHeight;
        return areaA + areaB - overlapArea;
    }
}

public class RectangleArea {
    
    public static void main(String[] args) {
        int ax1 = // bottom-left corner x-coordinate of first rectangle
        int ay1 = // bottom-left corner y-coordinate of first rectangle
        int ax2 = // top-right corner x-coordinate of first rectangle
        int ay2 = // top-right corner y-coordinate of first rectangle
        
        int bx1 = // bottom-left corner x-coordinate of second rectangle
        int by1 = // bottom-left corner y-coordinate of second rectangle
        int bx2 = // top-right corner x-coordinate of second rectangle
        int by2 = // top-right corner y-coordinate of second rectangle

        int totalArea = calculateArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        
        System.out.println("Total Area: " + totalArea);
    }
    
    public static int calculateArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
        
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        
        int overlapArea = overlapWidth * overlapHeight;
        
        return area1 + area2 - overlapArea;
    }
}
public class RectangleArea {
    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaA = (ax2 - ax1) * (ay2 - ay1);
        int areaB = (bx2 - bx1) * (by2 - by1);
        
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        
        int overlapArea = overlapWidth * overlapHeight;
        
        return areaA + areaB - overlapArea;
    }
}
