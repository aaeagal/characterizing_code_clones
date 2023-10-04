
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 1
        backtrack1(result, new ArrayList<>(), nums, 0); // 2
        return result;
    }

    private void backtrack1(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) { // 3
        result.add(new ArrayList<>(tempList)); // 4
        for (int i = start; i < nums.length; i++) { // 5
            tempList.add(nums[i]); // 6
            backtrack1(result, tempList, nums, i + 1); // 7
            tempList.remove(tempList.size() - 1); // 8
        }
    }



    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>(); // 9
        backtrack2(nums, 0, new ArrayList<>(), subsets); // 10
        return subsets;
    }

    private void backtrack2(int[] nums, int index, List<Integer> current, List<List<Integer>> subsets) { // 11
        subsets.add(new ArrayList<>(current)); // 12
        for (int i = index; i < nums.length; i++) { // 13
            current.add(nums[i]); // 14
            backtrack2(nums, i + 1, current, subsets); // 15
            current.remove(current.size() - 1); // 16
        }
    }




    public List<List<Integer>> subsets3(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 17
        backtrack3(result, new ArrayList<>(), nums, 0); // 18
        return result;
    }

    private void backtrack3(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){ // 19
        result.add(new ArrayList<>(tempList)); // 20
        for(int i = start; i < nums.length; i++){ // 21
            tempList.add(nums[i]); // 22
            backtrack3(result, tempList, nums, i + 1); // 23
            tempList.remove(tempList.size() - 1); // 24
        }
    }

    public List<List<Integer>> subsets4(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 25
        backtrack4(nums, 0, new ArrayList<>(), result); // 26
        return result;
    }

    private void backtrack4(int[] nums, int start, List<Integer> temp, List<List<Integer>> result){ // 27
        result.add(new ArrayList<>(temp)); // 28
        for(int i=start; i<nums.length; i++){ // 29
            temp.add(nums[i]); // 30
            backtrack4(nums, i+1, temp, result); // 31
            temp.remove(temp.size()-1); // 32
        }
    }


    public List<List<Integer>> subsets5(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 33
        backtrack5(nums, 0, new ArrayList<>(), result); // 34
        return result;
    }

    private void backtrack5(int[] nums, int index, List<Integer> current, List<List<Integer>> result) { // 35
        result.add(new ArrayList<>(current)); // 36
        for (int i = index; i < nums.length; i++) { // 37
            current.add(nums[i]); // 38
            backtrack5(nums, i + 1, current, result); // 39
            current.remove(current.size() - 1); // 40
        }
    }

    public List<List<Integer>> subsets6(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 41
        backtrack6(result, new ArrayList<>(), nums, 0); // 42
        return result;
    }

    private void backtrack6(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){ // 43
        result.add(new ArrayList<>(tempList)); // 44
        for(int i = start; i < nums.length; i++){ // 45
            tempList.add(nums[i]); // 46
            backtrack6(result, tempList, nums, i + 1); // 47
            tempList.remove(tempList.size() - 1); // 48
        }
    }

    public List<List<Integer>> subsets7(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 49
        backtrack7(result, new ArrayList<>(), nums, 0); // 50
        return result;
    }

    private void backtrack7(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) { // 51
        result.add(new ArrayList<>(temp)); // 52
        for (int i = start; i < nums.length; i++) { // 53
            temp.add(nums[i]); // 54
            backtrack7(result, temp, nums, i + 1); // 55
            temp.remove(temp.size() - 1); // 56
        }
    }

    public List<List<Integer>> subsets8(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>(); // 57
        backtrack8(nums, 0, new ArrayList<>(), subsets); // 58
        return subsets;
    }

    private void backtrack8(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> subsets) { // 59
        subsets.add(new ArrayList<>(currentSubset)); // 60

        for (int i = index; i < nums.length; i++) { // 61
            currentSubset.add(nums[i]); // 62
            backtrack8(nums, i + 1, currentSubset, subsets); // 63
            currentSubset.remove(currentSubset.size() - 1); // 64
        }
    }


    public List<List<Integer>> subsets9(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>(); // 65
        backtrack9(nums, subsets, new ArrayList<>(), 0); // 66
        return subsets;
    }

    private void backtrack9(int[] nums, List<List<Integer>> subsets, List<Integer> currentSubset, int start) { // 67
        subsets.add(new ArrayList<>(currentSubset)); // 68

        for (int i = start; i < nums.length; i++) { // 69
            currentSubset.add(nums[i]); // 70
            backtrack9(nums, subsets, currentSubset, i + 1); // 71
            currentSubset.remove(currentSubset.size() - 1); // 72
        }
    }


    public List<List<Integer>> subsets10(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 73
        backtrack10(nums, 0, new ArrayList<>(), result); // 74
        return result;
    }

    private void backtrack10(int[] nums, int start, List<Integer> current, List<List<Integer>> result) { // 75
        result.add(new ArrayList<>(current)); // 76

        for (int i = start; i < nums.length; i++) { // 77
            current.add(nums[i]); // 78
            backtrack10(nums, i + 1, current, result); // 79
            current.remove(current.size() - 1); // 80
        }
    }

    public List<List<Integer>> subsets11(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); // 81
        backtrack11(res, new ArrayList<>(), nums, 0); // 82
        return res;
    }

    private void backtrack11(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) { // 83
        res.add(new ArrayList<>(temp)); // 84
        for (int i = start; i < nums.length; i++) { // 85
            temp.add(nums[i]); // 86
            backtrack11(res, temp, nums, i + 1); // 87
            temp.remove(temp.size() - 1); // 88
        }
    }


    public List<List<Integer>> subsets12(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>(); // 89
        backtrack12(nums, 0, new ArrayList<>(), subsets); // 90
        return subsets;
    }

    private void backtrack12(int[] nums, int start, List<Integer> currentSubset, List<List<Integer>> subsets) { // 91
        subsets.add(new ArrayList<>(currentSubset)); // 92

        for (int i = start; i < nums.length; i++) { // 93
            currentSubset.add(nums[i]); // 94
            backtrack12(nums, i + 1, currentSubset, subsets); // 95
            currentSubset.remove(currentSubset.size() - 1); // 96
        }
    }


    public List<List<Integer>> subsets13(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 97
        backtrack13(nums, 0, new ArrayList<>(), result); // 98
        return result;
    }

    private void backtrack13(int[] nums, int start, List<Integer> subset, List<List<Integer>> result) { // 99
        result.add(new ArrayList<>(subset)); // 100
        for (int i = start; i < nums.length; i++) { // 101
            subset.add(nums[i]); // 102
            backtrack13(nums, i + 1, subset, result); // 103
            subset.remove(subset.size() - 1); // 104
        }
    }

    public List<List<Integer>> subsets14(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 105
        backtrack14(nums, result, new ArrayList<>(), 0); // 106
        return result;
    }

    private void backtrack14(int[] nums, List<List<Integer>> result, List<Integer> temp, int start) { // 107
        result.add(new ArrayList<>(temp)); // 108
        for (int i = start; i < nums.length; i++) { // 109
            temp.add(nums[i]); // 110
            backtrack14(nums, result, temp, i + 1); // 111
            temp.remove(temp.size() - 1); // 112
        }
    }

    public List<List<Integer>> subsets15(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>(); // 113
        generateSubsets15(nums, 0, new ArrayList<>(), subsets); // 114
        return subsets;
    }

    private void generateSubsets15(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> subsets) { // 115
        subsets.add(new ArrayList<>(currentSubset)); // 116

        for (int i = index; i < nums.length; i++) { // 117
            currentSubset.add(nums[i]); // 118
            generateSubsets15(nums, i + 1, currentSubset, subsets); // 119
            currentSubset.remove(currentSubset.size() - 1); // 120
        }
    }

    public List<List<Integer>> subsets16(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 121
        backtrack16(result, new ArrayList<>(), nums, 0); // 122
        return result;
    }

    private void backtrack16(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) { // 123
        result.add(new ArrayList<>(tempList)); // 124
        for (int i = start; i < nums.length; i++) { // 125
            tempList.add(nums[i]); // 126
            backtrack16(result, tempList, nums, i + 1); // 127
            tempList.remove(tempList.size() - 1); // 128
        }
    }

    public List<List<Integer>> subsets17(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>(); // 129
        backtrack17(nums, 0, new ArrayList<>(), subsets); // 130
        return subsets;
    }

    private void backtrack17(int[] nums, int start, List<Integer> current, List<List<Integer>> subsets) { // 131
        subsets.add(new ArrayList<>(current)); // 132
        for (int i = start; i < nums.length; i++) { // 133
            current.add(nums[i]); // 134
            backtrack17(nums, i + 1, current, subsets); // 135
            current.remove(current.size() - 1); // 136
        }
    }

    public List<List<Integer>> subsets18(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); // 137
        backtrack18(res, new ArrayList<>(), nums, 0); // 138
        return res;
    }

    private void backtrack18(List<List<Integer>> res, List<Integer> tempList, int[] nums, int start) { // 139
        res.add(new ArrayList<>(tempList)); // 140
        for (int i = start; i < nums.length; i++) { // 141
            tempList.add(nums[i]); // 142
            backtrack18(res, tempList, nums, i + 1); // 143
            tempList.remove(tempList.size() - 1); // 144
        }
    }




    public List<List<Integer>> subsets19(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); // 145
        backtrack19(nums, res, new ArrayList<>(), 0); // 146
        return res;
    }

    private void backtrack19(int[] nums, List<List<Integer>> res, List<Integer> temp, int start) { // 147
        res.add(new ArrayList<>(temp)); // 148
        for (int i = start; i < nums.length; i++) { // 149
            temp.add(nums[i]); // 150
            backtrack(nums, res, temp, i + 1); // 151
            temp.remove(temp.size() - 1); // 152
        }
    }

}
