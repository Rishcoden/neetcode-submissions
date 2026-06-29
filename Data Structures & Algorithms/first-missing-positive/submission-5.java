class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int arr[] = new int[nums.length];
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] <= 0 || nums[i - 1] == nums[i]) {
                continue;
            } else {
                arr[j++] = nums[i - 1];
            }
        }
        if (nums[nums.length - 1] > 0) {
            arr[j++] = nums[nums.length - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]) {
                return i + 1;
            }
        }
        return j + 1;
    }
}