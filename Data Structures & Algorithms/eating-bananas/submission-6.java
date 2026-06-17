class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        ArrayList<Integer> lst = new ArrayList<>();
        
        int n = piles.length;

int max  = Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
            max = Math.max(max,piles[i]);
       }

       int l = 1;
       int hi = max;
       int ans = max;
        while(l<=hi){
              int k = l+(hi-l)/2;
              long count = 0;
              for(int j=0;j<n;j++){
                 int val = piles[j];
                 count += (piles[j] + k - 1) / k;
                 
              }
              if(count<=h){
                ans = k;
                hi = k-1;
              }
              else{
                l = k+1;
              }
        }

       
        return ans;
    }
}
