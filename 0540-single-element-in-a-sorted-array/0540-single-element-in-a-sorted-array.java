class Solution {
public int singleNonDuplicate(int[] nums) {
    int l = 0;
    int r = nums.length - 1;
    while (l <= r) {
        int mid = l + (r - l) / 2;
        if ((mid == 0 || nums[mid] != nums[mid - 1]) &&
            (mid == nums.length - 1 || nums[mid] != nums[mid + 1])) {
            return nums[mid];
        }
        int leftSize;
        if (mid > 0 && nums[mid] == nums[mid - 1]) {
            leftSize = mid - 1;
        }
        else {
            leftSize = mid;
        }
        if (leftSize % 2 == 1) {
            r = mid - 1;
        } else {
            l = mid + 1;
        }
    }
    return -1;
}
}