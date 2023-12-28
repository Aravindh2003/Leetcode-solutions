class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lg=0;
        int n[]=new int[128];
        for(int i=0,l=0;i<s.length();i++){
            l=Math.max(n[s.charAt(i)],l);
            lg=Math.max(lg,i-l+1);
            n[s.charAt(i)]=i+1;
        }
        return lg;
    }
}
