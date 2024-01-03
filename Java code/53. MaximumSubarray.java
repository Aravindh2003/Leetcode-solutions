class Solution {
    public int maxSubArray(int[] nums) {
        int a=nums.length,sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a;i++){
            sum=sum+nums[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
return max;
    }
}
