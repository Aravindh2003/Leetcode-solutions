class Solution {
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder){
         return build(preorder,inorder,0,preorder.length-1);
    }
public TreeNode build(int[] preorder,int[] inorder, int l,int r){
        if(index==preorder.length || l>r){
            return null;
        }
        TreeNode root=new TreeNode(preorder[index]);
        for(int i=l;i<=r;i++){
            if(preorder[index]==inorder[i]){
                index++;
                root.left=build(preorder,inorder,l,i-1);
                root.right=build(preorder,inorder,i+1,r);
                break;
            }
        }
        return root;
    }
}
