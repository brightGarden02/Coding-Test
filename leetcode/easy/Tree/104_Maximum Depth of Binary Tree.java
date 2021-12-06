class Solution {
    int max;
    
    public int maxDepth(TreeNode root) {
        
        max = 0;
        depth(root, 1);
        return max;
        
    }
    
    public void depth(TreeNode node, int depth){
        
        if(node == null) return;
        if(depth > max) max = depth;
        
        depth(node.left, depth + 1);
        depth(node.right, depth + 1);
    }
}