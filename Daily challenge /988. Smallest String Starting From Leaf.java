class Solution {
    String res="";
    public void traversal(TreeNode root,StringBuilder sb){
        if(root==null){
            return;
        }
        sb.insert(0,(char)(root.val+97));
        if(root.left==null&&root.right==null){
            if(res.equals("")){
                res=sb.toString();
            }
            else{
                res=res.compareTo(sb.toString())>0?sb.toString():res;
            }
        }
        traversal(root.left,sb);
        traversal(root.right,sb);
        sb.deleteCharAt(0);
    }
    public String smallestFromLeaf(TreeNode root) {
        traversal(root,new StringBuilder());
        return res;
    }
}
