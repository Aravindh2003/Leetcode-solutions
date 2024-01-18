class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
          if(root==null||root.val==p.val||root.val==q.val){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(right==null){
            return left;
        }
        if(left==null){
            return right;
        }
        return root;
    }
}
