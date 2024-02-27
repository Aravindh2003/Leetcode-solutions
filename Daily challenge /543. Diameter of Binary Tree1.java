class Solution {
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
      dia(root);
      return ans;
    }
    public int dia(TreeNode root){
      if(root==null){
           return 0;
       } 
       int left=dia(root.left);
       int right=dia(root.right);
       ans=Math.max(ans,left+right);
       return Math.max(left,right)+1;
    }
}
