class Solution {
    
    List<Integer> temp = new ArrayList<>();
    
    public TreeNode increasingBST(TreeNode root) {
    
        inorder(root);
        
        TreeNode tn = new TreeNode(0);
        TreeNode curr = tn;
        
        for(Integer x : temp){
            curr.right = new TreeNode(x);
            curr = curr.right;
        }
        
        return tn.right;        
    }
    
    public void inorder(TreeNode root){
        
        if(root != null){
        
            inorder(root.left);
            temp.add(root.val);
            inorder(root.right);
        
        }
    }
}