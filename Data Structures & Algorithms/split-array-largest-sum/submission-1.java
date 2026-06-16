class Solution {

    int n;
    int nums[];
     int k;
     int dp[][];
    int solve(int start , int k){

   if(k==1){
    int sum = 0;
      for(int i=start;i<n;i++){
         sum+= nums[i];
      }
      return sum;
   }
   if(dp[start][k]!=0){
      return dp[start][k];
   }
        int cur = 0;
        int min = Integer.MAX_VALUE;
        for(int i=start;i<=n-k;i++){
            cur = cur + nums[i];
            int right = solve(i+1,k-1);
            int maxx = Math.max(cur,right);

            min = Math.min(min,maxx);
        }
        return dp[start][k]=min;
    }
    public int splitArray(int[] nums, int k) {
        this.nums = nums;
        this.n = nums.length;
         this.k = k;
         dp = new int[n][k+1];
        return solve(0,k);
    }
}