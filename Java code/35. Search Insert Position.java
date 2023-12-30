class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0;
        int a=nums.length-1;
        while(s<=a){
            int m=s+(a-s)/2;
            if(nums[m]==target)
            return m;
            else if(nums[m]>target)
            a=m-1;
            else
            s=m+1;

        }
        return s;
    }
}
