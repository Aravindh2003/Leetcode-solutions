class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
      /*  long res = 0;
        boolean min = false, max = false;
        int start = 0, minStart = 0, maxStart = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num < minK || num > maxK) {
                min = false;
                max= false;
                start = i+1;
            }
            if (num == minK) {
                min= true;
                minStart = i;
            }
            if (num == maxK) {
                max= true;
                maxStart = i;
            }
            if (min&& max) {
                res += (Math.min(minStart, maxStart) - start + 1);
            }
        }
        return res;*/
        int min=-1,max=-1,left=-1,right=0;
        long count=0;
        while(right<nums.length){
            if(nums[right]<minK || nums[right]>maxK){
                min=right;
                max=right;
                left=right;
            }
            min=nums[right] == minK ? right : min;
            max=nums[right] == maxK ?  right : max;
            count+=Math.min(min,max) - left;
            right++;
        }
        return count;
    }
}
