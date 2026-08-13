import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
    private void backtrack(int[] nums, int index, 
                           List<Integer> current, 
                           List<List<Integer>> ans) {
        // Base condition
        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }
        // Choice 1: Include current element
        current.add(nums[index]);
        backtrack(nums, index + 1, current, ans);
        // Backtrack (remove element)
        current.remove(current.size() - 1);
        // Choice 2: Exclude current element
        backtrack(nums, index + 1, current, ans);
    }
}