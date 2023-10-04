
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack1(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack1(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        result.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack1(result, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }



    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack2(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    private void backtrack2(int[] nums, int index, List<Integer> current, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack2(nums, i + 1, current, subsets);
            current.remove(current.size() - 1);
        }
    }




    public List<List<Integer>> subsets3(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack3(result, new ArrayList<>(), nums, 0);
        return result;
    }
    
    private void backtrack3(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){
        result.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack3(result, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public List<List<Integer>> subsets4(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack4(nums, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack4(int[] nums, int start, List<Integer> temp, List<List<Integer>> result){
        result.add(new ArrayList<>(temp));
        for(int i=start; i<nums.length; i++){
            temp.add(nums[i]);
            backtrack4(nums, i+1, temp, result);
            temp.remove(temp.size()-1);
        }
    }


    public List<List<Integer>> subsets5(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack5(nums, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack5(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack5(nums, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> subsets6(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack6(result, new ArrayList<>(), nums, 0);
        return result;
    }
    
    private void backtrack6(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){
        result.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack6(result, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public List<List<Integer>> subsets7(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack7(result, new ArrayList<>(), nums, 0);
        return result;
    }
    
    private void backtrack7(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
        result.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack7(result, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> subsets8(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack8(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }
    
    private void backtrack8(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(currentSubset));
        
        for (int i = index; i < nums.length; i++) {
            currentSubset.add(nums[i]);
            backtrack8(nums, i + 1, currentSubset, subsets);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }


    public List<List<Integer>> subsets9(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack9(nums, subsets, new ArrayList<>(), 0);
        return subsets;
    }
    
    private void backtrack9(int[] nums, List<List<Integer>> subsets, List<Integer> currentSubset, int start) {
        subsets.add(new ArrayList<>(currentSubset));
        
        for (int i = start; i < nums.length; i++) {
            currentSubset.add(nums[i]);
            backtrack9(nums, subsets, currentSubset, i + 1);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }


    public List<List<Integer>> subsets10(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack10(nums, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack10(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack10(nums, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> subsets11(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack11(res, new ArrayList<>(), nums, 0);
        return res;
    }
    
    private void backtrack11(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack11(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }


    public List<List<Integer>> subsets12(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack12(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }
    
    private void backtrack12(int[] nums, int start, List<Integer> currentSubset, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(currentSubset));
        
        for (int i = start; i < nums.length; i++) {
            currentSubset.add(nums[i]);
            backtrack12(nums, i + 1, currentSubset, subsets);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }


    public List<List<Integer>> subsets13(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack13(nums, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack13(int[] nums, int start, List<Integer> subset, List<List<Integer>> result) {
        result.add(new ArrayList<>(subset));
        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            backtrack13(nums, i + 1, subset, result);
            subset.remove(subset.size() - 1);
        }
    }

    public List<List<Integer>> subsets14(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack14(nums, result, new ArrayList<>(), 0);
        return result;
    }
    
    private void backtrack14(int[] nums, List<List<Integer>> result, List<Integer> temp, int start) {
        result.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack14(nums, result, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> subsets15(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets15(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }
    
    private void generateSubsets15(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(currentSubset));
        
        for (int i = index; i < nums.length; i++) {
            currentSubset.add(nums[i]);
            generateSubsets15(nums, i + 1, currentSubset, subsets);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }

    public List<List<Integer>> subsets16(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack16(result, new ArrayList<>(), nums, 0);
        return result;
    }
    
    private void backtrack16(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        result.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack16(result, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public List<List<Integer>> subsets17(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack17(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }
    
    private void backtrack17(int[] nums, int start, List<Integer> current, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(current));
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack17(nums, i + 1, current, subsets);
            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> subsets18(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack18(res, new ArrayList<>(), nums, 0);
        return res;
    }
    
    private void backtrack18(List<List<Integer>> res, List<Integer> tempList, int[] nums, int start) {
        res.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack18(res, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }




    public List<List<Integer>> subsets19(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack19(nums, res, new ArrayList<>(), 0);
        return res;
    }
    
    private void backtrack19(int[] nums, List<List<Integer>> res, List<Integer> temp, int start) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(nums, res, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

}
