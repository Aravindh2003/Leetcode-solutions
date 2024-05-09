class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long max=0;
        int c=0,value=0;
        Arrays.sort(happiness);
        for(int i=happiness.length-1;i>=happiness.length-k;i--)
        {
            value = happiness[i]-c++;
            if(value>0)
            {
                max+=value;
            }
        }
        return max;
    }
}
