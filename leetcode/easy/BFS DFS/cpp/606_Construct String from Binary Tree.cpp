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
    string tree2str(TreeNode* root) {
        
        string ans = "";
        ans += to_string(root->val);
        
        traverse(root, ans);
        
        return ans;
    }
    
    void traverse(TreeNode* root, string &ans){
        
        if(root == NULL || (root->left == NULL && root->right == NULL))
            return;
        
        if(root->left == NULL && root->right != NULL){
            ans += "()";
        }
            
        if(root->left){
            ans += "(" + to_string(root->left->val);
            traverse(root->left, ans);
            ans += ")";
        }    
            
        if(root->right){
            ans += "(" + to_string(root->right->val);
            traverse(root->right, ans);
            ans += ")";
        }      
        
        return;
    }
};