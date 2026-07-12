class Solution {

   boolean check(int idx,int arr[]){
    if(idx==arr.length-1){
        return true;
    }
    int val = arr[idx];
     if(val==0){
        return false;
     }
    for(int i=idx+1;i<=idx+val;i++){
       boolean ans = check(i,arr);
       if(ans){
        return true;
       }
    }

    return false;
   }

    public boolean canJump(int[] nums) {
        return check(0,nums);
    }
}