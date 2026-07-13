class Solution {
    int ans = 1000000;
    int  minimum(int idx,int steps,int arr[],int visited[]){
        if(idx==arr.length-1){
            return Math.min(ans,steps);
        }
        
        if(visited[idx]!=0 && visited[idx]<=steps){
            return ans;
        }
        int val = arr[idx];

        visited[idx] = steps;
        for(int i=idx+1;i<=idx+val && i<arr.length;i++){
            
           ans = Math.min(ans,minimum(i,steps+1,arr,visited));

        }
        return ans;
    }
    public int jump(int[] nums) {
        int visited[] = new int[nums.length];
       return minimum(0,0,nums,visited);
        
    }
}