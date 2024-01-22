class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) 
        return 0;
        return help(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }
    private int help(TreeNode root,long s){
        if(root==null)
         return 0;
        return(s-root.val==0?1:0)+help(root.left,s-root.val)+help(root.right,s-root.val);
    }
}
