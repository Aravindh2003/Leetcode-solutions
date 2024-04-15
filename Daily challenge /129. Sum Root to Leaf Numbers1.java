class Solution {
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
       return Sum(root,0);
    }
        public static int Sum(TreeNode root,int s){
            if(root==null){
                return 0;
            }
            s=s*10+root.val;
            if(root.left==null && root.right==null){
                return s;
            }
        return Sum(root.left,s)+Sum(root.right,s);
    }
}
