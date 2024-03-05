class Solution {
    public int minimumLength(String s) {
        int r=s.length()-1,n=0;
       while(n<r && s.charAt(n)==s.charAt(r)){
           char ch=s.charAt(n);
       while(n<=r && s.charAt(n)==ch)
       n++;
       while(n<=r && s.charAt(r)==ch)
       r--;
       }
       return (n>r)?0:r-n+1;
    }
}
