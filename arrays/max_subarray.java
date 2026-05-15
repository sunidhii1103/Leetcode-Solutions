class Solution {
    public int maxSubArray(int[] nums) {

        int sum = nums[0];
        int max_sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            sum = Math.max(nums[i], sum + nums[i]);

            max_sum = Math.max(max_sum, sum);
        }

        return max_sum;
    }
}