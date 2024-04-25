class Solution {
    public int longestIdealString(String s, int k) {
      int dp[] = new int[27];
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i) - 'a';
            int left = Math.max((idx-k), 0);
            int right = Math.min((idx+k), 26);
            int max = Integer.MIN_VALUE;
            for(int j=left;j<=right;j++){
                max = Math.max(max, dp[j]);
            }
            dp[idx] = max + 1;
        }
        int max = Integer.MIN_VALUE;
        for(int ele : dp){
            max = Math.max(max, ele);
        }
        return max;  
    }
}
