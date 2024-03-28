class Solution {
    int ans=0;
    public int longestUnivaluePath(TreeNode root) {
        count(root);
        return ans;
    }
    public int count(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=count(root.left);
        int r=count(root.right);
        int left=0;
        int right=0;
        if(root.left!=null && root.left.val==root.val){
            left=l+1;
        }
        if(root.right!=null && root.right.val==root.val){
            right=r+1;
        }
        ans=Math.max(ans,left + right);
        return Math.max(left,right);
    }
}
