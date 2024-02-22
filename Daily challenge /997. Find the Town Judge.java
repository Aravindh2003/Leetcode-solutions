class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] count=new int[n+1];
        for(int[] relation:trust){
            count[relation[0]]--;
            count[relation[1]]++;
        }
        for(int i=1;i<=n;++i){
            if(count[i]==n-1){
                return i;
            }
        }
        return -1;   
    }
}
