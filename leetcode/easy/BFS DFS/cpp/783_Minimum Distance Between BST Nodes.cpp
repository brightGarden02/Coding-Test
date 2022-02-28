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
    int minDiffInBST(TreeNode* root) {
        
        vector<int> v;
        inorderTraverse(root, v);
        
        int answer = INT_MAX;
        for(int i = 1; i < v.size(); i++){
            answer = min(answer, v[i] - v[i-1]);
        }
        
        return answer;
    }
    
    void inorderTraverse(TreeNode* root, vector<int>& v){
        
        if(root == NULL) return;
        
        inorderTraverse(root->left, v);
        v.push_back(root->val);
        inorderTraverse(root->right, v);
        
    }
};