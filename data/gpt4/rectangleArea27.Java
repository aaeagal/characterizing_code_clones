
public long totalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    long area1 = (long) (ax2 - ax1) * (ay2 - ay1);
    long area2 = (long) (bx2 - bx1) * (by2 - by1);

    int ix1 = Math.max(ax1, bx1);
    int iy1 = Math.max(ay1, by1);
    int ix2 = Math.min(ax2, bx2);
    int iy2 = Math.min(ay2, by2);

    long intersectArea = 0;

    if (ix2 > ix1 && iy2 > iy1) {
        intersectArea = (long) (ix2 - ix1) * (iy2 - iy1);
    }

    return area1 + area2 - intersectArea;
}



public class Main {
    public static void main(String[] args) {
        double result = totalArea(-1, 0, 3, 5, 0, -1, 5, 3);
        System.out.println(result);
    }

    public static double totalArea(double ax1, double ay1, double ax2, double ay2, double bx1, double by1, double bx2, double by2) {
        double areaA = Math.abs((ax2-ax1) * (ay2-ay1));
        double areaB = Math.abs((bx2-bx1) * (by2-by1));

        double left = Math.max(ax1, bx1);
        double right = Math.min(ax2, bx2);
        double bottom = Math.max(ay1, by1);
        double top = Math.min(ay2, by2);

        double overlap = 0;
        if (right > left && top > bottom)
        {
            overlap = (right - left) * (top - bottom);
        }

        return areaA + areaB - overlap;
    }
}


public class Main {
    public static int totalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        // Calculate the area of both rectangles.
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);

        // Calculate the overlap area.
        int left = Math.max(ax1, bx1);
        int right = Math.min(ax2, bx2);
        int top = Math.min(ay2, by2);
        int bottom = Math.max(ay1, by1);

        int overlap = 0;
        if(right > left && top > bottom)
            overlap = (right - left) * (top - bottom);

        // Return the sum of the areas of the rectangles, minus the overlapping area.
        return area1 + area2 - overlap;
    }

    public static void main(String[] args) {
        System.out.println(totalArea(-1, -1, 1, 1, -2, -2, 2, 2)); // Output: 16
    }
}



public int rectangleArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
	// Calculate the area of both rectangles
	int rect1 = (ax2 - ax1) * (ay2 - ay1);
	int rect2 = (bx2 - bx1) * (by2 - by1);

	// Calculate the area of overlap
	int x_overlap = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
	int y_overlap = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
	int overlapArea = x_overlap * y_overlap;

	// The total area covered by the two rectangles is the sum of the areas of the rectangles minus the area of overlap
	return rect1 + rect2 - overlapArea;
}




public int calculateArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    int area1 = (ax2 - ax1) * (ay2 - ay1);
    int area2 = (bx2 - bx1) * (by2 - by1);
    
    int overlapX = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
    int overlapY = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));

    int overlapArea = overlapX * overlapY;
    return area1 + area2 - overlapArea;
}


public class Main {

    public static void main(String[] args) {
        System.out.println(computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
    }

    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaA = (ax2 - ax1) * (ay2 - ay1);
        int areaB = (bx2 - bx1) * (by2 - by1);

        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);

        int overlapArea = 0;
        if (overlapWidth > 0 && overlapHeight > 0)
            overlapArea = overlapWidth * overlapHeight; 

        return areaA + areaB - overlapArea;
    }
}



public long areaCoveredByRectangles(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    long totalArea = (long)(ax2 - ax1) * (ay2 - ay1) + (long)(bx2 - bx1) * (by2 - by1);
    
    int overlapx = Math.min(ax2, bx2) - Math.max(ax1, bx1);
    int overlapy = Math.min(ay2, by2) - Math.max(ay1, by1);

    if (overlapx > 0 && overlapy > 0) {
        totalArea -= (long)overlapx * overlapy;
    }

    return totalArea;
}



public class RectilinearArea {
    public static int totalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);

        int overlapArea = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)) *
                          Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));

        return area1 + area2 - overlapArea;
    }
}



public static int totalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    int area1 = (ax2 - ax1) * (ay2 - ay1);
    int area2 = (bx2 - bx1) * (by2 - by1);

    int intersectArea = 0;
    
    int x_overlap = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
    int y_overlap = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));

    if (x_overlap > 0 && y_overlap > 0) {
      intersectArea = x_overlap * y_overlap;
    }

    return area1 + area2 - intersectArea;
}



public long totalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    long totalArea = (long) (ax2 - ax1) * (ay2 - ay1) + (long) (bx2 - bx1) * (by2 - by1);

    long overlapX = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
    long overlapY = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));

    long overlapArea = overlapX * overlapY;

    return totalArea - overlapArea;
}


public class Main {

    public static void main(String[] args) {
        System.out.println(area(-3, 0, 3, 4, 0, -1, 9, 2));
    }

    public static int area(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        //Calculating areas of the two rectangles
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);

        //Calculating overlapping area
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));

        int overlappingArea = overlapWidth * overlapHeight;

        //Adding the areas of the two rectangles and removing the overlapping area (if any)
        return area1 + area2 - overlappingArea;
    }
}


public class AreaCovered {
    public int totalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);

        int left = Math.max(ax1, bx1);
        int right = Math.min(ax2, bx2);
        int bottom = Math.max(ay1, by1);
        int top = Math.min(ay2, by2);

        int overlap = 0;
        if (right > left && top > bottom)
            overlap = (right - left) * (top - bottom);

        return area1 + area2 - overlap;
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println(rectangleArea(-3, -2, 5, 1, 0, -3, 9, 2)); // should output 38
    }

    public static int rectangleArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2){
        // Calculate area of both rectangles
        int areaA = (ax2 - ax1) * (ay2 - ay1);
        int areaB = (bx2 - bx1) * (by2 - by1);
        
        // Calculate overlap area
        int overlapX = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapY = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int overlapArea = overlapX * overlapY;
        
        // Total area covered by both rectangles is sum of their areas minus overlap area
        return areaA + areaB - overlapArea;
    }
}



public class Main {
    public static int calculateTotalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);

        int overlapX = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapY = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));

        int overlapArea = overlapX * overlapY;

        return area1 + area2 - overlapArea;
    }
}


public class RectangleAreaCalculator {

    public int calculateTotalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        // Calculate the area of both rectangles
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);

        // Calculate the overlapping area
        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);
        int overlapArea = 0;

        // If there's an overlap, calculate its area
        if (overlapWidth > 0 && overlapHeight > 0) {
            overlapArea = overlapWidth * overlapHeight;
        }

        // Return the total area
        return area1 + area2 - overlapArea;
    }
}


public class TotalArea {
    public static int totalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        int areaA = (ax2 - ax1) * (ay2 - ay1);
        int areaB = (bx2 - bx1) * (by2 - by1);

        int overlapX = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapY = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int overlapArea = overlapX * overlapY;

        return areaA + areaB - overlapArea;
    }
}



public static int totalCoveredArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    // calculate total area of both rectangles
    int totalArea = (ax2 - ax1) * (ay2 - ay1) + (bx2 - bx1) * (by2 - by1);

    // calculate overlap area
    int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
    int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);

    // if no intersection occurs
    if (overlapWidth <= 0 || overlapHeight <= 0) {
        return totalArea;
    }

    // subtracting overlapped area
    totalArea -= overlapWidth * overlapHeight;

    return totalArea;
}



public class RectangleArea {
    public int totalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);
        
        int left = Math.max(ax1, bx1);
        int right = Math.min(ax2, bx2);
        int bottom = Math.max(ay1, by1);
        int top = Math.min(ay2, by2);
        
        int overlappingArea = 0;
        if (right > left && top > bottom) {
            overlappingArea = (right - left) * (top - bottom);
        }
        
        return area1 + area2 - overlappingArea;
    }
}



public class Area {
    static int getArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2){
        int rect_1_area = (ax2-ax1)*(ay2-ay1);
        int rect_2_area = (bx2-bx1)*(by2-by1);
        int overlap_area = 0;

        int X_overlap = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int Y_overlap = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));

        if(X_overlap > 0 && Y_overlap > 0){
            overlap_area = X_overlap * Y_overlap;
        }
        return rect_1_area + rect_2_area - overlap_area;
    }   
}



    
    public int totalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);

        int intersectX = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int intersectY = Math.min(ay2, by2) - Math.max(ay1, by1);

        int intersection = 0;

        if (intersectX > 0 && intersectY > 0) {
            intersection = intersectX * intersectY;
        }

        return area1 + area2 - intersection;
    }
    

