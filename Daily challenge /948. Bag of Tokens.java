class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n=tokens.length;
        Arrays.sort(tokens);
        int i=0,j=n-1;
        int ans=0;
        int s=0;
        while(i<=j){
            if(power>=tokens[i]){
                power-= tokens[i++];
                s++;
                ans=Math.max(ans,s);
            }else if(s>0){
                power+=tokens[j--];
                s--;
            }else{
                break;
            }
        }
        return ans;
    }
}
