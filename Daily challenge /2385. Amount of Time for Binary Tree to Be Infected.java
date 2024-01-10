class Solution {
     private int maxi = Integer.MIN_VALUE;
    public int amountOfTime(TreeNode root, int start) {
         calculateInfectionTime(root, start, true);
         return maxi;
    }
    private int calculateInfectionTime(TreeNode root,int start,boolean isStartNode) {
        if (root == null) return 0;
        if (root.val == start && isStartNode){
          maxi=Math.max(maxi,calculateInfectionTime(root,start,false)-1);
            return -1;
        }
        int left=calculateInfectionTime(root.left, start, isStartNode);
        int right=calculateInfectionTime(root.right, start, isStartNode);
        if (left<0 || right<0){
            maxi=Math.max(maxi,Math.abs(left)+Math.abs(right));
            return Math.min(left,right)-1;
        }
        return Math.max(left,right)+1;
    }
}
