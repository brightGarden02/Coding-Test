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
    bool leafSimilar(TreeNode* r1, TreeNode* r2) {
        
        if(r1 == NULL && r2 == NULL) return true;
        if(!r1 || !r2) return false;
        
        vector<int> v1;
        vector<int> v2;
        
        traverse(r1, v1);
        traverse(r2, v2);
        
        return v1 == v2;
    }
    
    void traverse(TreeNode* r, vector<int>& v){
        
        if(r == NULL) return;
        
        if(r->left == NULL && r->right == NULL)
            v.push_back(r->val);
        
        traverse(r->left, v);
        traverse(r->right, v);
    }
};