class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> preorder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        if(root == null) return preorder;
        stack.add(root);
        
        while(!stack.isEmpty()){
            
            TreeNode curr = stack.pop();
            
            preorder.add(curr.val);
            if(curr.right != null) stack.add(curr.right);
            if(curr.left != null) stack.add(curr.left);
            
        }
        
        return preorder;
    }
}