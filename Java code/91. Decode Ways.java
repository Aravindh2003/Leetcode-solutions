class Solution {
    public int numDecodings(String s) {
      int n=s.length();
      int[] a=new int[n+1];
      a[n]=1;
      for(int i=n-1;i>=0;i--){
          if(s.charAt(i)!='0'){
              a[i]=a[i+1];
               if(i<n-1 && (s.charAt(i)=='1' || s.charAt(i)=='2'&& s.charAt(i+1)<'7')){
                  a[i]+=a[i+2];
              }
          }
      }  
      return a[0];
    }
}
