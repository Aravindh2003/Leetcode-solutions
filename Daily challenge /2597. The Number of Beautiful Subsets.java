class Solution {
    int[] freqMap;
    int count = 0;
    public int beautifulSubsets(int[] nums, int k) {
         Arrays.sort(nums);
        freqMap = new int[1001];
        backtracking(0, nums, k, freqMap);
        return count;
    }

    private void backtracking(int i, int[] nums, int k, int[] freqMap) {
      for(int j = i; j < nums.length; j++) {
        if(nums[j] > k && freqMap[nums[j] - k] > 0) {
          continue;
        }
        freqMap[nums[j]]++;
        count++;
        backtracking(j + 1, nums, k, freqMap);
        freqMap[nums[j]]--;
      }  
    }
}
