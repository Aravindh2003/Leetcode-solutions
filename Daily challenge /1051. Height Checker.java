class Solution {
    public int heightChecker(int[] heights) {
        int a[]=heights.clone();
        int c=0;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]!=heights[i]){
                c++;
            }
        }
        return c;
    }
}
