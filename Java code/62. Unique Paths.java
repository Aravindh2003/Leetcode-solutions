class Solution {
    public int uniquePaths(int m, int n) {
        int a=n+m-2;
        int b=m-1;
        double r=1;
        for(int i=1;i<=b;i++){
            r=r*(a-b+i)/i;
        }

        return (int)r;
    }
}
