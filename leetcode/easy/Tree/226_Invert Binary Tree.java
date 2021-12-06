class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        invert(root, 1);
        return root;
    }
    
    
    public void invert(TreeNode root, int depth){
        
        if(root == null) return;
        
        TreeNode tmp = null;
        
        tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        
        invert(root.left, depth+1);   
        invert(root.right, depth+1);   
        
    }
}