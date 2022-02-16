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
    vector<int> ans;
    int p = INT_MIN, cur, maxVal = INT_MIN;
    
    vector<int> findMode(TreeNode* root) {
        
        inorder(root);
        return ans;
    }
    
    
    void inorder(TreeNode* root) {
        
        if(!root) return;
        
        if(root->left) inorder(root->left);
        
        if(p == root->val) cur++;
        else cur = 1;
        
        if(cur == maxVal) {
            ans.push_back(root->val);
        }
        
        if(cur > maxVal) {
            maxVal = cur;
            ans.clear();
            ans.push_back(root->val);
        }
        
        p = root->val;
        
        if(root->right) inorder(root->right);
    }
};
