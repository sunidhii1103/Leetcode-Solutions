class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int rd = 0; // pointer for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[rd] != nums[i]) {
                rd++;
                nums[rd] = nums[i];
            }
        }

        // Optional: print unique elements
        for (int i = 0; i <= rd; i++) {
            System.out.println("unique numbers are: " + nums[i]);
        }

        return rd + 1; // number of unique elements
    }
}