class Solution {
    public int change(int amount, int[] coins) {
      int a[]=new int[amount+1];
      a[0]=1;
      for(int c:coins){
          for(int i=c;i<=amount;i++){
              a[i]+=a[i-c];
          }
      }
           return a[amount];
    }
}
