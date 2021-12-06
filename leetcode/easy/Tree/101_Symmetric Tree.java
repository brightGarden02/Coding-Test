class Solution {
    
    public boolean isSymmetric(TreeNode root) {
        
        return isSymmetric(root.left, root.right);
    }
    
    public boolean isSymmetric(TreeNode r1, TreeNode r2){
        
        if(r1 == null && r2 == null){
            return true;
        } 
        else if(r1 == null || r2 == null){
            return false;
        }
            
        
        if(r1.val != r2.val){
            return false;
        }
            
        return isSymmetric(r1.left, r2.right) && isSymmetric(r1.right, r2.left);
    }
    
}