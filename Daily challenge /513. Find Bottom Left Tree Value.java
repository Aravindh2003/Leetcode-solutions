class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            root=q.remove();
            if(root.right!=null)
               q.add(root.right);
            if(root.left!=null)
               q.add(root.left);
        }
        return root.val;
    }
}
