class Solution {
    public String longestCommonPrefix(String[] s) {
      Arrays.sort(s);
      int i=0;
      String a=s[0];
      String b=s[s.length-1];
      while(i<a.length()&& i<b.length()){
         if(a.charAt(i)== b.charAt(i)){
             i++;
         }else{
             break;
         } 
      }
    return a.substring(0,i);
    }
}
