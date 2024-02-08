class Solution {
    public boolean repeatedSubstringPattern(String s) {
     String str=s+s;
     String v=str.substring(1,str.length()-1);
     return v.contains(s);
        
    }
}
