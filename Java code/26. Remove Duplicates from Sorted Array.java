class Solution {
    public int removeDuplicates(int[] nums) {
    int a=1;
    if(nums.length==0){
        return 0;
    }
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]<nums[i+1]){
            nums[a]=nums[i+1];
          a++;
        }
    }
    return a;
    }
}
