class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        int count=0;
        HashMap<Integer,Integer>[] dp=new HashMap[n];
        for(int i=0;i<n;++i){
            dp[i]=new HashMap<>();
        }
        for(int i=1;i<n;++i){
            for(int j=0;j<i;++j){
                long diff=(long)nums[i]-nums[j]; 
                if(diff>Integer.MAX_VALUE || diff<Integer.MIN_VALUE){
                    continue; 
                }
                int diff1=(int)diff;
                dp[i].put(diff1,dp[i].getOrDefault(diff1,0)+1);  
                if (dp[j].containsKey(diff1)){
                    dp[i].put(diff1,dp[i].get(diff1)+dp[j].get(diff1));
                    count+=dp[j].get(diff1);
                }
            }
        }
        return count;   
    }
}
