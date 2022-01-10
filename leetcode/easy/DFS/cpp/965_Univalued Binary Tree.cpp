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
    bool isUnivalTree(TreeNode* root) {
        
        int curr = root->val;
        return traverse(root, curr);
    }
    
    bool traverse(TreeNode* root, int curr){
        
        if(root == NULL) return true;
        
        if(curr != root->val) return false;
        
        return traverse(root->left, curr) && traverse(root->right, curr);
    }
};