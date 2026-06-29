class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int n = intervals.length;
        int m = intervals[0].length;
        int ans[][] = new int[n][m];

        ans[0] = intervals[0];

        int k = 0;
        for (int i = 1; i < n; i++) {
            if (ans[k][1] >= intervals[i][0]) {
                ans[k][1] = Math.max(ans[k][1], intervals[i][1]);
            } else {
                k++;
                ans[k] = intervals[i];
            }
        }

        return Arrays.copyOf(ans, k + 1);
    }
}
