class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        return hasSum(root, targetSum, 0);
                 
    }
    
    public boolean hasSum(TreeNode root, int targetSum, int currSum){
        
        if(root == null) return false;
        currSum += root.val;
        
        boolean left = hasSum(root.left, targetSum, currSum);
        boolean right = hasSum(root.right, targetSum, currSum);
        
        
        if(root.left == null && root.right == null &&
           currSum == targetSum){
            return true;
        }
        
        return left || right;
    }
}