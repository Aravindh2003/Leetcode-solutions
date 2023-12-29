class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
       int n=jobDifficulty.length;
       if(n<d) return -1;
       int[][] dp=new int[d+1][n+1];
       for (int[] row : dp) {
          Arrays.fill(row,Integer.MAX_VALUE);
         }
       dp[0][0]=0;
       for(int i=1;i<=d;i++){
        for(int j=1;j<=n;j++){
            int maxDif=0;
            for(int k=j-1;k>=i-1;k--){
                maxDif=Math.max(maxDif,jobDifficulty[k]);
                if(dp[i-1][k]!=Integer.MAX_VALUE){
                    dp[i][j]=Math.min(dp[i][j],dp[i-1][k]+maxDif);
                }
            }
        }
    }
return dp[d][n]==Integer.MAX_VALUE ? -1:dp[d][n]; 
    }
}
