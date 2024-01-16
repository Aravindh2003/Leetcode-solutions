class Solution {
    public List<String> summaryRanges(int[] nums) {
       ArrayList<String> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int s=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1])
                i++;
            if(s!=nums[i]){
                a.add(""+s+"->"+nums[i]);
            }
            else{
                a.add(""+s);
            }
        }
        return a;  
    }
}
