class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
  if (root == null) return levels;

  Queue<TreeNode> queue = new LinkedList<>();
  queue.add(root);
  int floor = 0;
  while (!queue.isEmpty() ) {

   levels.add(new ArrayList<>());

   int level_length = queue.size();
   for(int i = 0; i < level_length; i++) {
    TreeNode node = queue.remove();
    levels.get(floor).add(node.val);

    if (node.left != null) queue.add(node.left);
    if (node.right != null) queue.add(node.right);
   }
   floor++;
  }
  return levels;
    }
}
