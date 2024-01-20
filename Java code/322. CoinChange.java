class Solution {
    public int coinChange(int[] coins, int amount) {
        int a[]=new int[amount+1];
        int i=0,j=0,min;
        a[0]=0;
        for(i=1;i<amount+1;i++){
           a[i]=amount+1;
        }
        for(i=1;i<amount+1;i++){
            for(j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    min=Math.min(a[i],a[i-coins[j]]+1);
                    a[i]=min;
                }
            }
        }
        if(a[i-1]==amount+1)
         return -1;
         else
         return a[i-1];
    }
}
