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
    int sumRootToLeaf(TreeNode* root) {
        
        int ans = 0;
        return traverse(root, ans);
    }
    
    
    int traverse(TreeNode* root, int ans){
        
        if(root == NULL) return 0;
        ans = (ans*2) + root->val;
        
        if(root->left == NULL && root->right == NULL) return ans;
        
        return traverse(root->left, ans) + traverse(root->right, ans);
    }
};