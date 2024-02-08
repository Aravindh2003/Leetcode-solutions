class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int k=0;
        for(int i=0;k<g.length && i<s.length;i++){
            if(g[k]<=s[i])
            k++;
        }
        return k;
    }
}
