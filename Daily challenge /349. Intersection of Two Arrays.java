class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    List<Integer> a = new ArrayList<>();
    for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j] && ! a.contains(nums1[i])){
              a.add(nums1[i]);
              break;
            }
        }
    }
     int[] result = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            result[i] = a.get(i);
        }

        return result;
    }
}
