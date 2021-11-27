class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
        return inOrderTraversal(root1, root2);
        
    }
    
    public TreeNode inOrderTraversal(TreeNode node1, TreeNode node2){
        
        TreeNode node = null;
        
        if(node1 != null && node2 != null){
            
            node = new TreeNode(node1.val + node2.val);
            node.left = inOrderTraversal(node1.left, node2.left);
            node.right = inOrderTraversal(node1.right, node2.right);
            
        }
        else if(node1 != null){
            
            node = node1;
            node.left = inOrderTraversal(node1.left, null);
            node.right = inOrderTraversal(node1.right, null);
            
        }
        else if(node2 != null){
            
            node = node2;
            node.left = inOrderTraversal(null, node2.left);
            node.right = inOrderTraversal(null, node2.right);
            
        }
        
        return node;
    }
}