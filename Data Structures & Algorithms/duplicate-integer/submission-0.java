class Solution {
    public boolean hasDuplicate(int[] nums) {
        int arr[] = Arrays.stream(nums).distinct().toArray();
      
       
        return nums.length != arr.length;
    }
}