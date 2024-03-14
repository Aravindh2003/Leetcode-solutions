class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
         int totalCount = 0;
        int sum = 0;
        int prefixSum[] = new int[nums.length + 1];
        prefixSum[0] = 1;
        
        for (int num : nums) {
            sum += num;
            if (sum >= goal) {
                totalCount += prefixSum[sum - goal];
            }
            prefixSum[sum]++;
        }
        
        return totalCount;
        /*int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==goal){
                    count++;
                }
                else if(sum>goal){
                    break;
                }
            }
        }
        return count;*/
    }
}
