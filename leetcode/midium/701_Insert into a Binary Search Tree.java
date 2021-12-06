class Solution {
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
     
        TreeNode target = new TreeNode(val);
        root = insert(root, target);
        return root;
        
    }
    
    public TreeNode insert(TreeNode root, TreeNode target){
        
        
        if(root == null) return target;
        
        if(root.val > target.val){
            root.left = insert(root.left, target);
        }
        else {
            root.right = insert(root.right, target);
        }
        
        return root;
    }
    
}