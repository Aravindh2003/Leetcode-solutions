class Solution {
    public int countPrimes(int n) {
        int count=0;
       boolean[] ans=new boolean[n];
       for (int i=2;i<n;i++){
           if(!ans[i]){
               count++;
               for(int j=2;j*i<n;j++){
                   ans[i*j]=true;
               }
           }
       } 
       return count; 
    }
}
