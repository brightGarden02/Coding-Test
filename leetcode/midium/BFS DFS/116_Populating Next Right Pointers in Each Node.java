class Solution {
    public Node connect(Node root) {
        
        preorderTraverse(root);
        return root;
        
    }
    
    public void preorderTraverse(Node root){
        if(root == null) return;

        if(root.left != null && root.right != null){
            root.left.next = root.right;
        }

        if(root.next != null && root.right != null){
            root.right.next = root.next.left;
        }

        preorderTraverse(root.left);
        preorderTraverse(root.right);

    }
    
}
