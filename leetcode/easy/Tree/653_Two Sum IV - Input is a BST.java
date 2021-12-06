class Solution {
    
    Set<Integer> set = new HashSet<>();
    
    public boolean findTarget(TreeNode root, int k) {
        
        return find(root, k);
    }

    public boolean find(TreeNode root, int k){
        
        if(root == null) return false;
        
        if(set.contains(k - root.val)) return true;
        set.add(root.val);
        
        return find(root.left, k) || find(root.right, k);
    }
    
}