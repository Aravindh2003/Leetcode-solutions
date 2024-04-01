class Solution {
    public int lengthOfLastWord(String s) {
    //   int l=0;
    //   String x=s.trim();
    //   for(int i=0;i<x.length();i++){
    //       if(x.charAt(i)== ' '){
    //           l=0;
    //       }else{
    //           l++;
    //       }
    //   }  
    //   return l;
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
            len++;
            }
            else if (len != 0) break;
        }
        return len;
    }
}
