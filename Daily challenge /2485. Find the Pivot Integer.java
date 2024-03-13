class Solution {
    public int pivotInteger(int n) {
        int y = n*(n+1)/2;
        int x = (int)Math.sqrt(y);
        if(x*x==y)
            return x;   
        else
            return -1;

            
      /*  int sum1=0;
        for(int i=1;i<=n;i++){
            sum1+=i;
            int sum2=0;
            for(int j=i;j<=n;j++){
                sum2+=j; 
            }
            if(sum1==sum2){
                return i;
            }
        }
        return -1;*/
    }
}
