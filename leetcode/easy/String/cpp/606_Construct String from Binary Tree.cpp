class Solution {
public:
    string ans = "";
    string tree2str(TreeNode* root) {
        
        if(root == NULL) return ans;
        
        ans += to_string(root->val);
        if(root->left == NULL && root->right == NULL) return ans;
        ans += "(";
        tree2str(root->left);
        ans += ")";
        
        if(root->right){
            ans += "(";
            tree2str(root->right);
            ans += ")";
        }
        
        return ans;        
    }
};