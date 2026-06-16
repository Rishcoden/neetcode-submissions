class Solution {
    HashMap<String, Integer> map = new HashMap<>();
    public int maxCoins(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        for(int n : nums){
            arr.add(n);
        }
        arr.add(1);
        
        return solve(arr);
    }
    
    int solve(List<Integer>arr){
        String key = arr.toString();

        if(map.containsKey(key)){
            return map.get(key);
        }
        if(arr.size()==2){
            return 0;
        }
        int max = 0;
        
        for(int i=1;i<arr.size()-1;i++){
            int coins = arr.get(i-1) * arr.get(i) * arr.get(i+1);
            
            int removed = arr.remove(i);
            int remaining = solve(arr);
            max = Math.max(max,coins + remaining);
            arr.add(i,removed);
        }
        map.put(key,max);
        return max;
    }
}