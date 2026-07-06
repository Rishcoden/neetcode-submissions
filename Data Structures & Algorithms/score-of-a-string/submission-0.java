class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int sum = 0;
        for(int i=1;i<n;i++){
            sum += Math.abs((int)(s.charAt(i)) - (int)(s.charAt(i-1)));
        }

        return sum;
    }
}