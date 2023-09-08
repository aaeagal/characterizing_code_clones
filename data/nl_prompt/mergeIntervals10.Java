                                
public static int[][] mergeIntervals(int[][] intervals) {
    if (intervals.length <= 1) {
        return intervals;
    }

    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    List<int[]> merged = new ArrayList<>();
    int[] currentInterval = intervals[0];
    merged.add(currentInterval);

    for (int[] interval : intervals) {
        int currentEnd = currentInterval[1];
        int nextStart = interval[0];
        int nextEnd = interval[1];

        if (currentEnd >= nextStart) {
            currentInterval[1] = Math.max(currentEnd, nextEnd);
        } else {
            currentInterval = interval;
            merged.add(currentInterval);
        }
    }

    return merged.toArray(new int[merged.size()][]);
}

public static int[][] mergeIntervals(int[][] intervals) {
    // Sort the array based on the start times
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    
    List<int[]> result = new ArrayList<>();
    int[] currentInterval = intervals[0];
    
    for (int i = 1; i < intervals.length; i++) {
        int[] interval = intervals[i];
        
        // If the current interval overlaps with the next interval
        if (currentInterval[1] >= interval[0]) {
            // Merge the intervals by taking the minimum start time and maximum end time
            currentInterval[1] = Math.max(currentInterval[1], interval[1]);
        } else {
            // Add the non-overlapping interval to the result
            result.add(currentInterval);
            currentInterval = interval;
        }
    }
    
    // Add the last interval to the result
    result.add(currentInterval);
    
    // Convert the result list to a 2D array
    int[][] mergedIntervals = new int[result.size()][2];
    for (int i = 0; i < result.size(); i++) {
        mergedIntervals[i] = result.get(i);
    }
    
    return mergedIntervals;
}

public int[][] mergeIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    
    List<int[]> merged = new ArrayList<>();
    int[] currentInterval = intervals[0];
    merged.add(currentInterval);
    
    for (int i = 1; i < intervals.length; i++) {
        int[] interval = intervals[i];
        
        if (interval[0] <= currentInterval[1]) {
            currentInterval[1] = Math.max(currentInterval[1], interval[1]);
        } else {
            currentInterval = interval;
            merged.add(currentInterval);
        }
    }
    
    return merged.toArray(new int[merged.size()][]);
}

public int[][] mergeIntervals(int[][] intervals) {
    // Sort the intervals based on the start time
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

    // Create a list to store the merged intervals
    List<int[]> mergedIntervals = new ArrayList<>();

    // Iterate through the sorted intervals
    int[] currentInterval = intervals[0];
    mergedIntervals.add(currentInterval);
    for (int[] interval : intervals) {
        int currentEnd = currentInterval[1];
        int nextStart = interval[0];
        int nextEnd = interval[1];

        // If the current interval and the next interval overlap, merge them
        if (currentEnd >= nextStart) {
            currentInterval[1] = Math.max(currentEnd, nextEnd);
        }
        // If the current interval and the next interval do not overlap, add the next interval to the merged list
        else {
            currentInterval = interval;
            mergedIntervals.add(currentInterval);
        }
    }

    // Convert the list of merged intervals to an array and return it
    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
}

public static int[][] mergeIntervals(int[][] intervals) {
    // Sort the intervals based on their start time
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

    List<int[]> mergedIntervals = new ArrayList<>();
    int[] currentInterval = intervals[0];
    mergedIntervals.add(currentInterval);

    for (int i = 1; i < intervals.length; i++) {
        int currentIntervalEnd = currentInterval[1];
        int[] nextInterval = intervals[i];

        // If current interval overlaps with the next interval, merge them
        if (currentIntervalEnd >= nextInterval[0]) {
            currentInterval[1] = Math.max(currentIntervalEnd, nextInterval[1]);
        } else {
            // Otherwise, add the next interval as a new interval
            currentInterval = nextInterval;
            mergedIntervals.add(currentInterval);
        }
    }

    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
}

public static int[][] mergeIntervals(int[][] intervals) {
    if (intervals.length <= 1) {
        return intervals;
    }
    
    // Sort intervals by the start time
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    List<int[]> merged = new ArrayList<>();
    int[] currentInterval = intervals[0];
    merged.add(currentInterval);

    for (int[] interval : intervals) {
        int currentEnd = currentInterval[1];
        int nextStart = interval[0];
        int nextEnd = interval[1];

        if (currentEnd >= nextStart) {
            currentInterval[1] = Math.max(currentEnd, nextEnd);
        } else {
            currentInterval = interval;
            merged.add(currentInterval);
        }
    }

    return merged.toArray(new int[merged.size()][]);
}

public int[][] mergeIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    List<int[]> merged = new ArrayList<>();
    int[] currentInterval = intervals[0];
    merged.add(currentInterval);
    
    for (int[] interval : intervals) {
        int currentEnd = currentInterval[1];
        int nextStart = interval[0];
        int nextEnd = interval[1];
        
        if (currentEnd >= nextStart) {
            currentInterval[1] = Math.max(currentEnd, nextEnd);
        } else {
            currentInterval = interval;
            merged.add(currentInterval);
        }
    }
    
    return merged.toArray(new int[merged.size()][]);
}

public static int[][] mergeIntervals(int[][] intervals) {
    // Sort intervals based on start time
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

    // Create a list to store the merged intervals
    List<int[]> mergedIntervals = new ArrayList<>();
    
    // Iterate over intervals and merge overlapping intervals
    int[] currentInterval = intervals[0];
    mergedIntervals.add(currentInterval);
    for (int i = 1; i < intervals.length; i++) {
        int[] interval = intervals[i];
        if (interval[0] <= currentInterval[1]) {
            // Overlapping intervals, so merge them
            currentInterval[1] = Math.max(currentInterval[1], interval[1]);
        } else {
            // Non-overlapping interval, add it to list
            currentInterval = interval;
            mergedIntervals.add(currentInterval);
        }
    }
    
    // Convert the list of merged intervals to an array
    return mergedIntervals.toArray(new int[0][]);
}

public static int[][] mergeIntervals(int[][] intervals) {
    // Sort the intervals based on the start time
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    
    List<int[]> merged = new ArrayList<>();
    
    int[] currentInterval = intervals[0];
    merged.add(currentInterval);
    
    for (int[] interval : intervals) {
        int currentEnd = currentInterval[1];
        int nextStart = interval[0];
        int nextEnd = interval[1];
        
        if (currentEnd >= nextStart) {
            // Merge the intervals
            currentInterval[1] = Math.max(currentEnd, nextEnd);
        } else {
            // Add a new interval
            currentInterval = interval;
            merged.add(currentInterval);
        }
    }
    
    return merged.toArray(new int[merged.size()][]);
}

public int[][] mergeIntervals(int[][] intervals) {
    // Sort the intervals based on the start time
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    
    // Create a list to store the merged intervals
    List<int[]> mergedIntervals = new ArrayList<>();
    
    // Iterate through the intervals
    for (int[] interval : intervals) {
        // If the mergedIntervals list is empty or the current interval does not overlap with the previous interval
        if (mergedIntervals.isEmpty() || interval[0] > mergedIntervals.get(mergedIntervals.size() - 1)[1]) {
            // Add the current interval to the mergedIntervals list
            mergedIntervals.add(interval);
        } else {
            // If the current interval overlaps with the previous interval, update the end time of the previous interval
            mergedIntervals.get(mergedIntervals.size() - 1)[1] = Math.max(mergedIntervals.get(mergedIntervals.size() - 1)[1], interval[1]);
        }
    }
    
    // Convert the mergedIntervals list to a 2D array of non-overlapping intervals
    int[][] merged = new int[mergedIntervals.size()][2];
    for (int i = 0; i < mergedIntervals.size(); i++) {
        merged[i] = mergedIntervals.get(i);
    }
    
    // Return the result
    return merged;
}

public static int[][] mergeIntervals(int[][] intervals) {
    if(intervals == null || intervals.length <= 1) {
        return intervals;
    }
    
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    
    List<int[]> merged = new ArrayList<>();
    int[] currentInterval = intervals[0];
    merged.add(currentInterval);
    
    for(int[] interval : intervals) {
        int currentEnd = currentInterval[1];
        int nextStart = interval[0];
        int nextEnd = interval[1];
        
        if(currentEnd >= nextStart) {
            currentInterval[1] = Math.max(currentEnd, nextEnd);
        } else {
            currentInterval = interval;
            merged.add(currentInterval);
        }
    }
    
    return merged.toArray(new int[merged.size()][]);
}

public class MergeIntervals {
    public static int[][] mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];
        mergedIntervals.add(currentInterval);
        
        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            
            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                mergedIntervals.add(currentInterval);
            }
        }
        
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}

public int[][] mergeIntervals(int[][] intervals) {
    // Sort the intervals array based on the start time
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    
    List<int[]> merged = new ArrayList<>();
    int[] currentInterval = intervals[0];
    
    for (int i = 1; i < intervals.length; i++) {
        // If the next interval overlaps with the current interval, merge them
        if (intervals[i][0] <= currentInterval[1]) {
            currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
        } else {
            // If there is no overlap, add the current interval to the merged list and update the current interval
            merged.add(currentInterval);
            currentInterval = intervals[i];
        }
    }
    
    // Add the last interval to the merged list
    merged.add(currentInterval);
    
    // Convert the merged list to an array and return it
    return merged.toArray(new int[merged.size()][]);
}

public int[][] mergeIntervals(int[][] intervals) {
    if (intervals.length <= 1) {
        return intervals;
    }

    // Sort the intervals based on start time
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    List<int[]> result = new ArrayList<>();
    int[] currentInterval = intervals[0];
    result.add(currentInterval);

    for (int[] interval : intervals) {
        int currentEnd = currentInterval[1];
        int nextStart = interval[0];
        int nextEnd = interval[1];

        if (currentEnd >= nextStart) {
            currentInterval[1] = Math.max(currentEnd, nextEnd);
        } else {
            currentInterval = interval;
            result.add(currentInterval);
        }
    }

    return result.toArray(new int[result.size()][]);
}

public class Main {
    public static int[][] mergeIntervals(int[][] intervals) {
        // Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();
        
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);
        
        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            
            if (currentEnd >= nextStart) {
                // Merge the intervals
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // Add the next interval to the merged list
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }
        
        return merged.toArray(new int[merged.size()][2]);
    }
    
    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] mergedIntervals = mergeIntervals(intervals);
        
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

public int[][] mergeIntervals(int[][] intervals) {
    if (intervals == null || intervals.length <= 1) {
        return intervals;
    }

    // Sort the intervals by their start time in ascending order
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

    List<int[]> mergedIntervals = new ArrayList<>();
    int[] currentInterval = intervals[0];
    
    for (int i = 1; i < intervals.length; i++) {
        if (currentInterval[1] >= intervals[i][0]) {
            // Merge the overlapping intervals by updating the end time
            currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
        } else {
            // Add the merged interval to the result and update the current interval
            mergedIntervals.add(currentInterval);
            currentInterval = intervals[i];
        }
    }

    // Add the last merged interval to the result
    mergedIntervals.add(currentInterval);

    // Convert the List to a 2D array
    int[][] result = new int[mergedIntervals.size()][2];
    for (int i = 0; i < mergedIntervals.size(); i++) {
        result[i] = mergedIntervals.get(i);
    }

    return result;
}

public static int[][] mergeIntervals(int[][] intervals) {
    // Sort the intervals based on their start time
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    // Create a list to store the merged intervals
    List<int[]> mergedIntervals = new ArrayList<>();
    
    // Loop through all intervals
    for (int[] interval : intervals) {
        // If the mergedIntervals list is empty or the current interval does not overlap with the last interval in the list
        if (mergedIntervals.isEmpty() || interval[0] > mergedIntervals.get(mergedIntervals.size() - 1)[1]) {
            mergedIntervals.add(interval); // Add the current interval to the mergedIntervals list
        } else {
            int[] lastInterval = mergedIntervals.get(mergedIntervals.size() - 1);
            // Merge the current interval with the last interval in the list
            lastInterval[1] = Math.max(lastInterval[1], interval[1]);
        }
    }
    
    // Convert the List of intervals to a 2D array and return it
    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
}

public int[][] mergeIntervals(int[][] intervals) {
    // Sort the intervals based on the start time
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    // Create a list to store the merged intervals
    List<int[]> merged = new ArrayList<>();

    // Loop through each interval
    for (int[] interval : intervals) {
        // If the merged list is empty or the current interval does not overlap with the previous interval, add it to the merged list
        if (merged.isEmpty() || interval[0] > merged.get(merged.size() - 1)[1]) {
            merged.add(interval);
        }
        // If the current interval overlaps with the previous interval, merge them by updating the end time of the previous interval
        else {
            merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
        }
    }

    // Convert the merged list to a 2D array and return it
    return merged.toArray(new int[merged.size()][]);
}


public static int[][] mergeIntervals(int[][] intervals) {
    // Sort the intervals based on their start time
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    
    // Create a list to store the merged intervals
    List<int[]> mergedIntervals = new ArrayList<>();
    
    // Loop through the input intervals
    for (int i = 0; i < intervals.length; i++) {
        int start = intervals[i][0];
        int end = intervals[i][1];
        
        // Check if the current interval overlaps with the previous merged interval
        if (mergedIntervals.isEmpty() || mergedIntervals.get(mergedIntervals.size() - 1)[1] < start) {
            mergedIntervals.add(new int[]{start, end});
        } else {
            // Merge the current interval with the previous merged interval
            mergedIntervals.get(mergedIntervals.size() - 1)[1] = Math.max(mergedIntervals.get(mergedIntervals.size() - 1)[1], end);
        }
    }
    
    // Convert the list of merged intervals to an array and return it
    return mergedIntervals.toArray(new int[0][]);
}

public static int[][] mergeIntervals(int[][] intervals) {
    // Sort the intervals based on the start time
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    
    List<int[]> mergedIntervals = new ArrayList<>();
    int[] currentInterval = intervals[0];
    mergedIntervals.add(currentInterval);
    
    for (int i = 1; i < intervals.length; i++) {
        int currentEnd = currentInterval[1];
        int nextStart = intervals[i][0];
        int nextEnd = intervals[i][1];
        
        // If the current interval overlaps with the next interval
        if (currentEnd >= nextStart) {
            // Merge the intervals by updating the end time of the current interval
            currentInterval[1] = Math.max(currentEnd, nextEnd);
        } else {
            // Add the next interval to the list of merged intervals
            currentInterval = intervals[i];
            mergedIntervals.add(currentInterval);
        }
    }
    
    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
}
