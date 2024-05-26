class Solution {
    static final int M = 1000000007;
    public int checkRecord(int n) {
      long[] Por=new long[n+1];
    long[] P=new long[n+1];
    Por[0]=P[0]=1;
    Por[1] = 2;
    P[1]=1;
    for(int i=2;i<=n;i++){
        P[i]=Por[i-1];
        Por[i]=(P[i]+P[i-1]+P[i-2])%M;
    }
    long res=Por[n];
    for(int i=0;i<n;i++){
    	long s=(Por[i] * Por[n-i-1])%M;
        res=(res+s)%M;
    }
    return (int)res;  
    }
}
