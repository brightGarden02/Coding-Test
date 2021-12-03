class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if(root == null) return new ArrayList<>();
        
        List<List<Integer>> answer = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            
            for(int j = 0; j < size; j++){
                
                TreeNode currNode = queue.poll();
                if(currNode.left != null) queue.add(currNode.left);
                if(currNode.right != null) queue.add(currNode.right);
                list.add(currNode.val);
                
            }
            answer.add(list);
        }
        
        return answer;
    }
}