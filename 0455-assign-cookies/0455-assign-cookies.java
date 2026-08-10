import java.util.Arrays;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0; // child
        int j = 0; // cookie
        int count = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                // Cookie can satisfy this child
                count++;
                i++;
            }
            // Move to the next cookie
            j++;
        }
        return count;
    }
}