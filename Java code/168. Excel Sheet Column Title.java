class Solution {
    public String convertToTitle(int c) {
        String a="";
        while(c>0){
c--;
a=(char)('A'+(c%26))+a;
c=c/26;
        }
        return a;
    }
}
