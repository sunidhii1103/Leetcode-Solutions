import java.util.*;
class Solution {
    public int[] sortArray(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int i = 0;
        for (int num = min; num <= max; num++) {
            while (mp.getOrDefault(num, 0) > 0) {
                nums[i] = num;
                i++;
                mp.put(num, mp.get(num) - 1);
            }
        }
        return nums;
    }
}