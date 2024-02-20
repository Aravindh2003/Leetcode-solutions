/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode t=new TreeNode();
    TreeNode a=t;
    public TreeNode increasingBST(TreeNode root) {
        inOrder(root);
        return a.right;
    }
    void inOrder(TreeNode node){
        if(node==null){
            return;
        }
    inOrder(node.left);
    t.right=new TreeNode(node.val);
    t=t.right;
    inOrder(node.right);
}
}
