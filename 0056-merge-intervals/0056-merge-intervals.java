class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();
        int[] current = intervals[0];
        ans.add(current);
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            if (next[0] <= current[1]) {
                current[1] = Math.max(current[1], next[1]);
            }
            else {
                current = next;
                ans.add(current);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
