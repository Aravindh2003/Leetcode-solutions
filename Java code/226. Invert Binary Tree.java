class Solution {
    public TreeNode invertTree(TreeNode root) {
       if(root==null)return null;
        TreeNode ans=new TreeNode(root.val);
       
        ans.left=invertTree(root.right);
        ans.right=invertTree(root.left);
       
        return ans; 
    }
}
