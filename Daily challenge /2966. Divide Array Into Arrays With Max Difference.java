class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<int[]> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i+=3){
            if(Math.abs(nums[i] - nums[i+2]) > k) {
                return new int[0][];
            } else {
                ans.add(new int[]{nums[i], nums[i+1], nums[i+2]});
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
