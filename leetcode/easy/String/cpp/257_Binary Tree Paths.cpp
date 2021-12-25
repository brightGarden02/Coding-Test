class Solution {
public:
    vector<string> binaryTreePaths(TreeNode* root) {
        
        vector<string> ans;
        
        dfs(root, "", ans);
        
        return ans;
    }
    
    
    void dfs(TreeNode* node, string s, vector<string> &ans){
        
        s += to_string(node->val);
        
        if(node->left == NULL && node->right == NULL){
            ans.push_back(s);
            return;
        }
        
        if(node->left)
            dfs(node->left, s + "->", ans);
        if(node->right)
            dfs(node->right, s + "->", ans);
        
    }
};