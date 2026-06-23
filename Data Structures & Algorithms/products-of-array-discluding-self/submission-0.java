class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;

        int prefix[] = new int[n];
        prefix[0] = nums[0];

        int suffix[] = new int[n];
        suffix[n-1] = nums[n-1];
        int output[] = new int[n];
        for(int i=1;i<n;i++){
                  prefix[i] = prefix[i-1]*nums[i];     
        }

        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1] * nums[i];
        }
      

      for(int i=0;i<n;i++){
        if(i==0){
            output[i] = suffix[i+1];
        }
        else if(i==n-1){
            output[i] = prefix[i-1];
        }
        else
         output[i] = prefix[i-1]* suffix[i+1];

      }
    System.out.print(Arrays.toString(suffix));

        return output;

        
    }
}  
