class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                 li.add(nums[i]);
            }
        }
        return li;
    }
}
