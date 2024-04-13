class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0) return 0;
        int maxArea = 0;
        int[] dp=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                dp[j]=matrix[i][j]=='1'?dp[j]+1 :0;
            }
            maxArea=Math.max(maxArea, maxArea(dp));
        }
        return maxArea;
    }

    public int maxArea(int[] heights){
        int n=heights.length;
        if(n==0) return 0;
        int[] left=new int[n];
        int[] right=new int[n];
        int prev=0;
        int maxArea=0;
        left[0]=-1;
        right[n-1]=n;
        for(int i=1;i< n;i++){
            prev=i-1;
            while(prev>=0 && heights[prev]>=heights[i]){
                prev=left[prev];
            }
            left[i]=prev;
        }
        for(int i=n-2;i>=0;i--){
            prev=i+1;
            while(prev<n && heights[prev]>=heights[i]){
                prev=right[prev];
            }
            right[i]=prev;
        }
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            maxArea=Math.max(maxArea,width * heights[i]);
        }
        return maxArea;
    }
}
