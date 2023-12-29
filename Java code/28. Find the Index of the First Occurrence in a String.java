class Solution {
    public int strStr(String haystack, String needle) {
    int r=-1;
    if(haystack.contains(needle)){
        int i=haystack.indexOf(needle);
        r=i;
    }
    return r;
    }
}
