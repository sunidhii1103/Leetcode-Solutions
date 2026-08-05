import java.util.*;
class Solution {
    private void findCombinations(int ind, int[] arr, int target,
                                  List<List<Integer>> ans,
                                  List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) { //skip duplicate elements
                continue;
            }
            // Since array is sorted, no need to proceed further
            if (arr[i] > target) {
                break;
            }
            ds.add(arr[i]);
            // Move to next index because each element can be used only once
            findCombinations(i + 1, arr, target - arr[i], ans, ds);
            // Backtrack
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}