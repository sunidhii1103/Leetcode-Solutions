class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] hash = new int[256];

        Arrays.fill(hash, -1);

        int len = 0;
        int left = 0, right = 0, max_len = 0;

        int n = s.length();

        while (right < n) {

            char ch = s.charAt(right);

            // character already seen
            if (hash[ch] != -1) {

                // duplicate inside current window
                if (hash[ch] >= left) {
                    left = hash[ch] + 1;
                }
            }

            len = right - left + 1;

            max_len = Math.max(len, max_len);

            hash[ch] = right;

            right++;
        }

        return max_len;
    }
}