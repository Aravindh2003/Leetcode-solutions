class Solution {
    public boolean canCross(int[] stones) {
        int n=stones.length;
        boolean[][] d=new boolean[n][n + 1];
        d[0][1]=true;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                int jump=stones[i]-stones[j];
                if(jump<=j+1){
      d[i][jump]=d[j][jump-1]||d[j][jump] || d[j][jump+1];
                    if (i==n-1 && d[i][jump]) 
                    return true;
                }
            }
        }
        return false;
    }
}
