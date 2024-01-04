class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int r=0;
        int s=0;
        while(s<nums.length){
            int n=s;
            while(n<nums.length && nums[n]==nums[s]){
                n++;
            }
            int count=n-s;
            if(count==1) return -1;
            r+=count/3;
            if(count%3!=0) r++;
            s=n;
        }
        return r; 
    }
}
