class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] sums = new int[k]; 
        sums[0]++;
        int cnt = 0;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum=(currSum + nums[i] % k + k) % k;
            cnt += sums[currSum]; 
            sums[currSum]++; 
        }
        return cnt;  
    }
}
