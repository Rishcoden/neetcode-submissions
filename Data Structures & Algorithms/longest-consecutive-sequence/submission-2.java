class Solution {
    public int longestConsecutive(int[] nums) {
        int unique[] = Arrays.stream(nums).distinct().toArray();
        Arrays.sort(unique);
        if(nums.length==0){
            return 0;
        }
        int l = 1;
        int max = 1;

        for(int i=0;i<unique.length-1;i++){

            if(unique[i]+1!=unique[i+1]){
                max = Math.max(max,l);
                l = 1;
            }
            else{
                l++;
            }
        }
        max = Math.max(max,l);
        return max;
    }
}
