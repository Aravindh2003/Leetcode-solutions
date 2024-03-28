class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int len=0;
        for(int r=0;r<nums.length;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0) + 1);
            while(map.get(nums[r]) > k){
                map.put(nums[len], map.get(nums[len]) - 1);
                len++;
            }
            ans = Math.max(ans, r-len+1);
        }
        return ans; 
    }
}
