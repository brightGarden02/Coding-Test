class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> inorder = new ArrayList<>();
        
        inorderTraversal(root, inorder);
        return inorder;
        
    }
    
    
    public void inorderTraversal(TreeNode root, List<Integer> inorder){
    
        if(root == null){
            return;
        }
        
        inorderTraversal(root.left, inorder);
        inorder.add(root.val);
        inorderTraversal(root.right, inorder);
    }
}