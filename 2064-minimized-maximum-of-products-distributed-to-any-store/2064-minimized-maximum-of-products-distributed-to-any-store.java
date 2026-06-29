class Solution {

    public int minimizedMaximum(int n, int[] quantities) {

        int l = 1;
        int r = 0;

        for (int i = 0; i < quantities.length; i++) {
            int q = quantities[i];
            r = Math.max(r, q);
        }

        int result = 0;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (possibleToDistr(mid, quantities, n)) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return result;
    }

    boolean possibleToDistr(int x, int[] quantities, int shops) {

        for (int products : quantities) {

            shops -= (products + x - 1) / x;

            if (shops < 0)
                return false;
        }

        return true;
    }
}