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
    bool ans;
    bool isBalanced(TreeNode* root) {
        
        ans = true;
        int depth = checkBalance(root);
        
        return ans;
    }
    
    int checkBalance(TreeNode* root){
        
        if(!root) return 0;
        if(!ans) return 0;
        
        int leftDepth = checkBalance(root->left);
        int rightDepth = checkBalance(root->right);
        
        if(abs(leftDepth - rightDepth) > 1) ans = false;
        
        return 1 + max(leftDepth, rightDepth);
    }
};
