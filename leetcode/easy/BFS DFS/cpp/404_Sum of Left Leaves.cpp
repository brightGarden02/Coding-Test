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
    int sum;
    int sumOfLeftLeaves(TreeNode* root) {
        
        bool flag = false;
        traverse(root, flag);
        
        return sum;
    }
    
    int traverse(TreeNode* root, bool val){
    
        if(!root) return sum;
        
        traverse(root->left, true);
        traverse(root->right, false);
        
        if(!root->left && !root->right && val == true){
            
            sum += root->val;
        }
     
        return sum;
    }
};