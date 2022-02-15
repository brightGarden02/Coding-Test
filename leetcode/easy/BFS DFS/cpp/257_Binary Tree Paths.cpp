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
    vector<string> ans;
    vector<string> binaryTreePaths(TreeNode* root) {
        
        traverse(root, "");
        return ans;
    }
    
    void traverse(TreeNode* root, string str){
        
        if(!root) return;
        
        if(!root->left && !root->right){
        
            str += to_string(root->val);
            ans.push_back(str);
            return;    
        } 
        
        str += to_string(root->val) + "->";
        
        traverse(root->left, str);
        traverse(root->right, str);
        
    }
};