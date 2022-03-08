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
    bool ans = true;
    bool isUnivalTree(TreeNode* root) {
        
        int val = root->val;    
        inorderTraverse(root, val);
        
        return ans;
    }
    
    void inorderTraverse(TreeNode* root, int val){
    
        if(!root) return;
        if(root->val != val){
            ans = false;
            return;
        } 
        inorderTraverse(root->left, val);
        
        inorderTraverse(root->right, val);
        
    }
};