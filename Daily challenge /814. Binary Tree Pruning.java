class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(root==null){
            return null;
        }
        root.right=pruneTree(root.right);
        root.left=pruneTree(root.left);
        if(root.left==null && root.right==null){
        if(root.val==0){
            return null;
        }
        }
        return root;
    }
}
