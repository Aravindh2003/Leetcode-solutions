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
    public static void bst(TreeNode root,int k, List<Integer> li){
        if(root==null){
            return;
        }
        bst(root.left,k,li);
        li.add(root.val);
        bst(root.right,k,li);
    }
    public int kthSmallest(TreeNode root, int k) {
       List<Integer> li=new ArrayList<>();
       bst(root,k,li);
       return li.get(k-1);
    }
}
