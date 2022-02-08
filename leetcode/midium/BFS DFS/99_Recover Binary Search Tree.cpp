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
    vector<pair<TreeNode*, TreeNode*>> ans;
    TreeNode* prev = NULL;
    
    void recoverTree(TreeNode* root) {
        
        inorder(root);
        if(ans.size() == 1)
            swap(ans[0].first->val, ans[0].second->val);
        if(ans.size() == 2)
            swap(ans[0].first->val, ans[1].second->val);
    }
    
    void inorder(TreeNode* root){
        
        if(!root) return;
        inorder(root->left);
        
        if(prev && prev->val > root->val) ans.push_back({prev, root});
        prev = root;
        
        inorder(root->right);
    }
};