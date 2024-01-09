class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
  List<Integer> li1=new ArrayList<>();
  List<Integer> li2=new ArrayList<>();
  getLeafs(root1,li1);
  getLeafs(root2,li2);
  return li1.equals(li2);
 }
 public void getLeafs(TreeNode node, List<Integer> list) {
  if (node!=null){
   if (node.left==null && node.right==null) {
    list.add(node.val);
   }
   getLeafs(node.left, list);
   getLeafs(node.right, list);
    }
 }
}
