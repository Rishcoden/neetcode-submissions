class Solution {
    public boolean isSubsequence(String s, String t) {
        int a = s.length();
        int b = t.length();
        if (a == 0) {
            return true;
        }
        int i = 0;
        int j = 0;
        boolean ans = false;
        while (j < b && i < a) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        if (i == a) {
            return true;
        }

        return false;
    }
}