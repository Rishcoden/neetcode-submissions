class Solution {
    boolean check(int idx, int arr[], int visited[]) {
        if (idx == arr.length - 1) {
            return true;
        }
        int val = arr[idx];
        if (val == 0) {
            return false;
        }
        for (int i = idx + 1; i <= idx + val; i++) {
            if (visited[i] == 1) {
                return true;
            }
            boolean ans = check(i, arr, visited);
            if (ans) {
                visited[i] = 1;
                return true;
            }
        }

        return false;
    }

    public boolean canJump(int[] nums) {
        int visited[] = new int[nums.length];
        return check(0, nums, visited);
    }
}