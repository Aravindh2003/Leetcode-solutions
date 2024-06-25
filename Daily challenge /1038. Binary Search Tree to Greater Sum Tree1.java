class Solution {
    public int a=0;
    public TreeNode bstToGst(TreeNode root) {
        if(root!=null){
            bstToGst(root.right);
            a+=root.val;
            root.val=a;
            bstToGst(root.left);
        }
        return root;
    }
}
