class Solution {
    TreeNode tn = new TreeNode();
    
    public TreeNode searchBST(TreeNode root, int val) {
    
        if(root == null) return null;
        if(root.val == val) return root;
        
        if(root.val < val){
            tn = searchBST(root.right, val);
        }
        else{
            tn = searchBST(root.left, val);
        }
        
        return tn;
    }
    
}