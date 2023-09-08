

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> resultList = new ArrayList<>();
        int index = 0;
        
        // Add intervals before the new interval
        while (index < intervals.length && intervals[index][1] < newInterval[0]) {
            resultList.add(intervals[index]);
            index++;
        }
        
        // Merge intervals while they overlap with the new interval
        while (index < intervals.length && intervals[index][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[index][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[index][1], newInterval[1]);
            index++;
        }
        
        // Add the merged new interval to the result
        resultList.add(newInterval);
        
        // Add remaining intervals after the new interval
        while (index < intervals.length) {
            resultList.add(intervals[index]);
            index++;
        }
        
        return resultList.toArray(new int[resultList.size()][]);
    }
}


public class IntervalInsertion {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        
        int i = 0;
        int n = intervals.length;
        
        // Add all intervals before newInterval that do not overlap
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        
        // Merge newInterval with any overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        
        // Add the merged newInterval to the result
        result.add(newInterval);
        
        // Add the remaining intervals to the result
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }
        
        return result.toArray(new int[result.size()][]);
    }
}


class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> mergedIntervals = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // Add all intervals before the newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            mergedIntervals.add(intervals[i]);
            i++;
        }

        // Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        mergedIntervals.add(newInterval);

        // Add remaining intervals
        while (i < n) {
            mergedIntervals.add(intervals[i]);
            i++;
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}

public int[][] insertInterval(int[][] intervals, int[] newInterval) {
    List<int[]> result = new ArrayList<>();
    int index = 0;
    int n = intervals.length;
    
    // Add all intervals that end before newInterval starts
    while (index < n && intervals[index][1] < newInterval[0]) {
        result.add(intervals[index]);
        index++;
    }
    
    // Merge intervals that overlap with newInterval
    while (index < n && intervals[index][0] <= newInterval[1]) {
        newInterval[0] = Math.min(newInterval[0], intervals[index][0]);
        newInterval[1] = Math.max(newInterval[1], intervals[index][1]);
        index++;
    }
    
    // Add newInterval
    result.add(newInterval);
    
    // Add remaining intervals
    while (index < n) {
        result.add(intervals[index]);
        index++;
    }
    
    return result.toArray(new int[result.size()][]);
}


public class IntervalInsertion {
    public static int[][] insertInterval(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int index = 0;
        int n = intervals.length;

        // Add all intervals that end before the new interval starts
        while (index < n && intervals[index][1] < newInterval[0]) {
            result.add(intervals[index]);
            index++;
        }

        // Merge all overlapping intervals
        while (index < n && intervals[index][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[index][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[index][1]);
            index++;
        }
        result.add(newInterval);

        // Add all remaining intervals
        while (index < n) {
            result.add(intervals[index]);
            index++;
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {4, 6}, {8, 10}};
        int[] newInterval = {3, 5};

        int[][] updatedIntervals = insertInterval(intervals, newInterval);

        for (int[] interval : updatedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}


public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        
        // Add all intervals that end before the new interval starts
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        
        // Merge intervals that overlap with the new interval
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        result.add(newInterval); // Add the merged new interval
        
        // Add remaining intervals after the new interval
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        
        return result.toArray(new int[result.size()][2]);
    }
}

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        
        // Add all intervals with end time < new start time
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        
        // Merge overlapping intervals and add to result
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        
        // Add newInterval to result
        result.add(newInterval);
        
        // Add remaining intervals to result
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        
        // Convert list to array and return
        return result.toArray(new int[result.size()][]);
    }
}

public class IntervalInsertion {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;
        
        // Add all intervals that come before the new interval
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        
        // Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        
        result.add(newInterval); // Add the merged interval
        
        // Add remaining intervals
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }
        
        return result.toArray(new int[result.size()][]);
    }
}

public static void main(String[] args) {
    IntervalInsertion intervalInsertion = new IntervalInsertion();
    
    int[][] intervals = {{1,2}, {4,5}, {7,8}};
    int[] newInterval = {3,6};
    int[][] updatedIntervals = intervalInsertion.insert(intervals, newInterval);
    
    for (int[] interval : updatedIntervals) {
        System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
    }
}


public class IntervalInsertion {
    
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>();
        
        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            merged.add(intervals[i]);
            i++;
        }
        
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        merged.add(newInterval);
        
        while (i < intervals.length) {
            merged.add(intervals[i]);
            i++;
        }
        
        int[][] mergedIntervals = new int[merged.size()][2];
        for (int j = 0; j < merged.size(); j++) {
            mergedIntervals[j] = merged.get(j);
        }
        
        return mergedIntervals;
    }
    
    public static void main(String[] args) {
        IntervalInsertion inserter = new IntervalInsertion();
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] merged = inserter.insert(intervals, newInterval);
        
        for (int[] interval : merged) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
    }
}

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        
        // Add intervals that end before the new interval starts
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        
        // Merge intervals that overlap with the new interval
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        
        // Add the merged new interval
        result.add(newInterval);
        
        // Add remaining intervals that start after the new interval ends
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        
        // Convert the list to an array
        int[][] mergedIntervals = new int[result.size()][2];
        for (int j = 0; j < result.size(); j++) {
            mergedIntervals[j] = result.get(j);
        }
        
        return mergedIntervals;
    }
}

public class IntervalInsertion {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        int i = 0;
        // Add intervals that come before newInterval
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Merge intervals that overlap with newInterval
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        // Add remaining intervals
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        IntervalInsertion intervalInsertion = new IntervalInsertion();

        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        int[][] result = intervalInsertion.insert(intervals, newInterval);

        for (int[] interval : result) {
            System.out.print(Arrays.toString(interval) + " ");
        }
    }
}

public class Main {

    public static int[][] insertInterval(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        int i = 0;
        // Add all intervals that end before newInterval starts
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i++]);
        }

        // Merge overlapping intervals
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        // Add remaining intervals
        while (i < intervals.length) {
            result.add(intervals[i++]);
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        int[][] result = insertInterval(intervals, newInterval);

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

public class InsertInterval {
  
  public static int[][] insertInterval(int[][] intervals, int[] newInterval) {
    List<int[]> result = new ArrayList<>();
    int[] toInsert = newInterval;
    int n = intervals.length;
    int i = 0;
    
    // Add intervals before newInterval
    while (i < n && intervals[i][1] < toInsert[0]) {
      result.add(intervals[i]);
      i++;
    }
    
    // Merge overlapping intervals
    while (i < n && intervals[i][0] <= toInsert[1]) {
      toInsert[0] = Math.min(intervals[i][0], toInsert[0]);
      toInsert[1] = Math.max(intervals[i][1], toInsert[1]);
      i++;
    }
    result.add(toInsert);
    
    // Add remaining intervals
    while (i < n) {
      result.add(intervals[i]);
      i++;
    }
    
    // Convert list to array
    int[][] mergedIntervals = new int[result.size()][2];
    for (int j = 0; j < result.size(); j++) {
      mergedIntervals[j] = result.get(j);
    }
    
    return mergedIntervals;
  }
  
  public static void main(String[] args) {
    int[][] intervals = {{1, 3}, {6, 9}};
    int[] newInterval = {2, 5};
    
    int[][] result = insertInterval(intervals, newInterval);
    
    for (int i = 0; i < result.length; i++) {
      System.out.print("[" + result[i][0] + ", " + result[i][1] + "] ");
    }
  }
}

public int[][] insertInterval(int[][] intervals, int[] newInterval) {
    List<int[]> result = new ArrayList<>();
    int i = 0;
    int n = intervals.length;
    
    // Add all the intervals that come before the newInterval
    while (i < n && intervals[i][1] < newInterval[0]) {
        result.add(intervals[i]);
        i++;
    }
    
    // Merge the overlapping intervals
    while (i < n && intervals[i][0] <= newInterval[1]) {
        newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
        newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
        i++;
    }
    
    // Add the merged/newInterval
    result.add(newInterval);
    
    // Add the remaining intervals
    while (i < n) {
        result.add(intervals[i]);
        i++;
    }
    
    return result.toArray(new int[result.size()][]);
}

public class Solution {
    public int[][] insertInterval(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        
        // Check if the intervals array is empty
        if (intervals.length == 0) {
            result.add(newInterval);
            return result.toArray(new int[0][]);
        }
        
        // Variables to keep track of the new interval's position in the array
        int startIndex = 0;
        int endIndex = intervals.length - 1;
        
        // Find the correct position to insert the new interval
        while (startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            
            if (intervals[midIndex][0] == newInterval[0]) {
                startIndex = midIndex;
                break;
            } else if (intervals[midIndex][0] < newInterval[0]) {
                startIndex = midIndex + 1;
            } else {
                endIndex = midIndex - 1;
            }
        }
        
        // Copy intervals before the new interval into the result array
        for (int i = 0; i < startIndex; i++) {
            result.add(intervals[i]);
        }
        
        // Merge overlapping intervals if necessary
        int[] mergedInterval = newInterval;
        for (int i = startIndex; i < intervals.length; i++) {
            if (intervals[i][0] > mergedInterval[1]) {
                // No more overlapping intervals, add the merged interval to result
                result.add(mergedInterval);
                mergedInterval = intervals[i];
            } else {
                // Update the merged interval with the overlapping intervals
                mergedInterval[0] = Math.min(mergedInterval[0], intervals[i][0]);
                mergedInterval[1] = Math.max(mergedInterval[1], intervals[i][1]);
            }
        }
        
        // Add the last merged interval to the result
        result.add(mergedInterval);
        
        // Copy remaining intervals after the new interval into the result array
        for (int i = startIndex; i < intervals.length; i++) {
            result.add(intervals[i]);
        }
        
        return result.toArray(new int[0][]);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        
        int[][] result = solution.insertInterval(intervals, newInterval);
        
        for (int[] interval : result) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
    }
}

public int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> result = new ArrayList<>();
    int n = intervals.length;
    int i = 0;

    // Add intervals before newInterval that do not overlap
    while (i < n && intervals[i][1] < newInterval[0]) {
        result.add(intervals[i]);
        i++;
    }

    // Merge overlapping intervals
    while (i < n && intervals[i][0] <= newInterval[1]) {
        newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
        newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
        i++;
    }
    result.add(newInterval);

    // Add remaining intervals after newInterval that do not overlap
    while (i < n) {
        result.add(intervals[i]);
        i++;
    }

    return result.toArray(new int[result.size()][2]);
}

public class IntervalInsertion {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        
        // Add intervals before newInterval
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        
        // Merge overlapping intervals
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        // Add intervals after newInterval
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        
        return result.toArray(new int[result.size()][]);
    }
}

public class IntervalUtils {
    public static int[][] insertInterval(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // Adding all intervals before the new interval
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Merging overlapping intervals and adding to the result
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        result.add(newInterval);

        // Adding remaining intervals after the new interval
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        // Converting the list to an array and returning
        int[][] mergedIntervals = new int[result.size()][2];
        for (i = 0; i < result.size(); i++) {
            mergedIntervals[i] = result.get(i);
        }
        return mergedIntervals;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] result = insertInterval(intervals, newInterval);
        
        // Printing the result
        for (int i = 0; i < result.length; i++) {
            System.out.println("[" + result[i][0] + ", " + result[i][1] + "]");
        }
    }
}

public class IntervalInsertion {

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        
        // Add all intervals that come before the new interval
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        
        // Merge intervals that overlap with the new interval
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        
        // Add the merged interval to the result
        result.add(newInterval);
        
        // Add remaining intervals after the new interval
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        
        return result.toArray(new int[result.size()][]);
    }
    
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        
        int[][] result = insert(intervals, newInterval);
        
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        
        int i = 0;
        int n = intervals.length;
        
        // Add all intervals that end before newInterval starts
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        
        // Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        
        result.add(newInterval);
        
        // Add all remaining intervals
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }
        
        return result.toArray(new int[result.size()][]);
    }
}

