class Solution {
    public int largestRectangleArea(int[] heights) {
        int n;
        n = heights.length;
        if(n<2){
            return heights[0];
        }
       int max = Integer.MIN_VALUE;
       
        for(int i=0;i<n;i++){

             int cur = heights[i];
             int l =i;
             int r=i;
            while(l>0 && cur<=heights[l-1] ){
                 l--;
            }
            while(r<n-1 && cur<=heights[r+1] ){
                 r++;
            }
             
            max = Math.max(max,cur*(r-l+1));
        }
        

        
        return max;
    }
}