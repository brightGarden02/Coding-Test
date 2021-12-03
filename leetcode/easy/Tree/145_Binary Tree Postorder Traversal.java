class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> postorder = new ArrayList<>();
        postorderTraversal(root, postorder);
        return postorder;
    }
    
    public void postorderTraversal(TreeNode root, List<Integer> postorder){
        
        if(root == null){
            return;
        }
        
        postorderTraversal(root.left, postorder);
        postorderTraversal(root.right, postorder);
        
        postorder.add(root.val);
    }
    
}