class Solution {
    public int findPeakElement(int[] nums) {
     int n=0,m=nums.length-1,mid;
        while(n<m){
            mid=(n+m)/2;
            if(nums[mid]<nums[mid+1]){
                n=mid+1;
            }else{
                m=mid;
            }
        }
        return n;
    }
}
