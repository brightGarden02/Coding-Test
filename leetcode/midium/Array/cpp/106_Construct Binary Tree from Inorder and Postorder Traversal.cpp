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
    TreeNode* buildTree(vector<int>& inorder, vector<int>& postorder) {
        
        int n = inorder.size();
        int i = n-1;
        
        return solve(inorder, postorder, i, 0, n-1);
    }
    
    
    TreeNode* solve(vector<int>& inorder, vector<int>& postorder, int& i, int start, int end){
        
        if(start > end) return NULL;
        
        int index = -1;
        TreeNode* node = new TreeNode(postorder[i]); 
        for(int j = start; j <= end; j++){
            
            if(postorder[i] == inorder[j]){
                index = j;
                break;
            }
        }
        
        i--;
        
        node->right = solve(inorder, postorder, i, index + 1, end);
        node->left = solve(inorder , postorder, i, start, index-1);
        
        return node;
    }
};