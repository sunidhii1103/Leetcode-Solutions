class Solution {
    public double myPow(double x, int n) {
        long bin_form = n;

        if (bin_form < 0) {
            x = 1 / x;
            bin_form = -bin_form;
        }

        double ans = 1;
        while (bin_form > 0) {
            if (bin_form % 2 == 1) {
                ans *= x;
            }

            x = x * x;
            bin_form /= 2;
        }

        return ans;
    }
}