class Solution {
    public boolean increasingTriplet(int[] nums) {
        int left= Integer.MAX_VALUE, right= Integer.MAX_VALUE;
        for(int n: nums)
        {
            if(n<=left)
             left= n;
            else if(n<=right) 
            right= n;
            else
             return true;
        }
    return false;
    }
}
