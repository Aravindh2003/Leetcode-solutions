class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr,1);
        int s=0;
        int l=nums.length-1;
        for(int i=0; i< nums.length; i++)
        {
            if(nums[i]==0)
            {
                arr[s]=0;                
                s++;

            }
            else if(nums[i]==2)
            {
                arr[l]=2;
                l--;
            }
        }
        for(int j=0; j<arr.length; j++)
        {
            nums[j]=arr[j];
        }
    }
}
