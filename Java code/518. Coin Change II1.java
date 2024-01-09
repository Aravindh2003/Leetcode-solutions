class Solution {
    public int change(int amount, int[] coins) {
       int a[][]=new int[coins.length][amount+1];
       int i,j=0;
       for(i=0;i<coins.length;i++){
           for(j=0;j<amount+1;j++){
               if(j==0){
                   a[i][j]=1;
               }
               if(i==0 && j>0){
                   if(j%coins[i]==0)
                     a[i][j]=1;
                     else
                     a[i][j]=0;
               }
               if(i>0 && j>0){
                   if(j<coins[i]){
                     a[i][j]=a[i-1][j];
                   }
                     else
                     a[i][j]=a[i][j-coins[i]]+a[i-1][j];
               }
           }
       }
           return a[i-1][j-1];
    }
}
