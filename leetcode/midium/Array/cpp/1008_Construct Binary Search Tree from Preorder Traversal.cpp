/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* bstFromPreorder(vector<int>& preorder) {
        
        if(preorder.size() == 1)
            return new TreeNode(preorder[0]);
        
        TreeNode* root = new TreeNode(preorder[0]);
        
        for(int i = 1; i < preorder.size(); i++)
            traverse(root, preorder[i]);
        
        return root;
    }
    
    void traverse(TreeNode* root, int x){
        
        if(!root) return;
        
        if(root->left == NULL && x < root->val)
            root->left = new TreeNode(x);
        if(root->right == NULL && x > root->val)
            root->right = new TreeNode(x);
        if(x < root->val)
            traverse(root->left, x);
        if(x > root->val)
            traverse(root->right, x);
    }
};