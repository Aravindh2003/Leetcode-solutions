class Solution {
    public int countSubstrings(String s) {
       boolean[][] dp = new boolean[s.length()][s.length()];
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 1) {
                        dp[i][j] = true;
                        result = result + 1;
                    } else if (dp[i + 1][j - 1] == true) {
                        dp[i][j] = true;
                        result = result + 1;
                    }
                }
            }
        }
        return result; 
    }
}
