

public class Interleave {
   public static int calculateRectangleArea1(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
      int areaA = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
      int areaB = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
      int intersectLength = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
      int intersectWidth = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
      int intersectArea = intersectLength * intersectWidth;
      return areaA + areaB - intersectArea;
   }

   public static int computeArea2(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
       int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
       int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
       
       int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
       int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
       int overlapArea = overlapWidth * overlapHeight;
       
       return area1 + area2 - overlapArea;
   }

    public static int calculateTotalArea3(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int rect1Area = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        int rect2Area = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
        
        int totalArea = rect1Area + rect2Area;

        if (ax1 > bx2 || bx1 > ax2 || ay1 > by2 || by1 > ay2) {
            return totalArea;
        }
        
        int intersectArea = (Math.min(ax2, bx2) - Math.max(ax1, bx1)) * (Math.min(ay2, by2) - Math.max(ay1, by1));
        return totalArea - intersectArea;
    }

    public static int computeArea4(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
        int area2 = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int overlapArea = overlapWidth * overlapHeight;
        return area1 + area2 - overlapArea;
    }

    public static int computeArea5(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int totalArea = (ax2 - ax1) * (ay2 - ay1) + (bx2 - bx1) * (by2 - by1);
        
        int intersectionWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int intersectionHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int intersectionArea = intersectionWidth * intersectionHeight;
        
        return totalArea - intersectionArea;
    }

    public int computeArea6(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
        
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        
        int overlapArea = overlapWidth * overlapHeight;
        
        return area1 + area2 - overlapArea;
    }

    public int computeArea7(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int overlapArea = overlapWidth * overlapHeight;
        return area1 + area2 - overlapArea;
    }

    public static int areaCoveredByRectangles8(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
        int area2 = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int overlapArea = overlapWidth * overlapHeight;
        return area1 + area2 - overlapArea;
    }

  public int calculateArea9(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    int area1 = Math.abs((ax2 - ax1) * (ay2 - ay1));
    int area2 = Math.abs((bx2 - bx1) * (by2 - by1));

    int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
    int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
    int overlapArea = overlapWidth * overlapHeight;

    return area1 + area2 - overlapArea;
  }

public static int calculateTotalArea10(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
    int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
    int totalArea = area1 + area2;
    
    int overlayWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
    int overlayHeight = Math.min(ay2, by2) - Math.max(ay1, by1);
    int overlayArea = 0;
    if (overlayWidth > 0 && overlayHeight > 0) {
        overlayArea = overlayWidth * overlayHeight;
    }
    
    return totalArea - overlayArea;
}


public static int calculateTotalArea11(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    int areaA = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
    int areaB = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
    
    int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
    int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
    
    int overlapArea = overlapWidth * overlapHeight;
    
    return areaA + areaB - overlapArea;
}

    public static int calculateTotalArea12(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
        int area2 = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);
        int intersectionX = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int intersectionY = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int intersectionArea = intersectionX * intersectionY;
        return area1 + area2 - intersectionArea;
    }

    public static int calculateArea13(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
        int intersectX1 = Math.max(ax1, bx1);
        int intersectY1 = Math.max(ay1, by1);
        int intersectX2 = Math.min(ax2, bx2);
        int intersectY2 = Math.min(ay2, by2);
        int intersectArea = Math.max(0, intersectX2 - intersectX1) * Math.max(0, intersectY2 - intersectY1);
        return area1 + area2 - intersectArea;
    }

    public static int findTotalArea14(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
        int area2 = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);
        
        int intersectionX1 = Math.max(ax1, bx1);
        int intersectionX2 = Math.min(ax2, bx2);
        int intersectionY1 = Math.max(ay1, by1);
        int intersectionY2 = Math.min(ay2, by2);
        
        int intersectionArea = 0;
        if (intersectionX1 < intersectionX2 && intersectionY1 < intersectionY2) {
            intersectionArea = Math.abs(intersectionX1 - intersectionX2) * Math.abs(intersectionY1 - intersectionY2);
        }
        
        return area1 + area2 - intersectionArea;
    }

    public static int findTotalArea15(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
        int area2 = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);
        
        int totalArea = area1 + area2;
        
        if(ax2 <= bx1 || bx2 <= ax1 || ay2 <= by1 || by2 <= ay1) {
            return totalArea;
        }
        
        int overlapArea = (Math.min(ax2, bx2) - Math.max(ax1, bx1))
            * (Math.min(ay2, by2) - Math.max(ay1, by1));
        
        return totalArea - overlapArea;
    }

   public int computeArea16(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
       int area1 = (ax2 - ax1) * (ay2 - ay1);
       int area2 = (bx2 - bx1) * (by2 - by1);
       
       int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
       int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
       int overlapArea = overlapWidth * overlapHeight;
       
       return area1 + area2 - overlapArea;
   }

    public static int calculateArea17(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int r1Width = Math.abs(ax2 - ax1);
        int r1Height = Math.abs(ay2 - ay1);
        int r2Width = Math.abs(bx2 - bx1);
        int r2Height = Math.abs(by2 - by1);
        
        int area1 = r1Width * r1Height;
        int area2 = r2Width * r2Height;
        
        return area1 + area2;
    }

    public static int calculateArea18(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
        int overlap = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)) *
                      Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        return area1 + area2 - overlap;
    }

    public static int computeArea19(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaA = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
        int areaB = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);
        int intersectWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int intersectHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int intersectArea = intersectWidth * intersectHeight;
        return areaA + areaB - intersectArea;
    }

    public static int findTotalArea20(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaA = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
        int areaB = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);
        int intersectionWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int intersectionHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int intersectionArea = intersectionWidth * intersectionHeight;
        return areaA + areaB - intersectionArea;
    }
}

