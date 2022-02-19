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
    int diameter = 0;
    int diameterOfBinaryTree(TreeNode* root) {
        
        if(!root) return 0;
        height(root);
        
        return diameter;
    }
    
    int height(TreeNode* root){
        
        if(!root) return 0;

        int lHeight = height(root->left);
        int rHeight = height(root->right);

        diameter = max(diameter, lHeight + rHeight);
        
        return max(lHeight, rHeight) + 1;

    }
};