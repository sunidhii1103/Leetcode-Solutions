class Solution {

    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
if (s1.length() > s2.length()) {
    return false;
}
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int w_size = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            int[] wfreq = new int[26];
            int widx = 0;
            int idx = i;
            while (widx < w_size && idx < s2.length()) {
                wfreq[s2.charAt(idx) - 'a']++;
                widx++;
                idx++;
            }

            if (isSame(freq, wfreq)) {
                return true;
            }
        }

        return false;
    }

    private boolean isSame(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }
}