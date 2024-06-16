class Solution {
    public int minPatches(int[] nums, int n) {
        long m=1;
        int res=0;
        int i=0;
        while(m<=n) {
            if(i<nums.length && nums[i]<=m){
                m+=nums[i];
                i++;
            }else{
                m+=m;
                res++;
            }
        }
        return res;
    }
}
