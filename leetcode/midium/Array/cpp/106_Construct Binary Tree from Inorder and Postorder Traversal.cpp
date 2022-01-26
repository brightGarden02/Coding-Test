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
        int postIndex = n-1;
        
        return solve(inorder, postorder, postIndex, 0, n-1);
    }

    
    TreeNode* solve(vector<int>& inorder, vector<int>& postorder, int& postIndex, int start, int end){
        
        if(start > end) return NULL;
        
        int index = -1;
        int postorderVal = postorder[postIndex];
        TreeNode* node = new TreeNode(postorderVal); 
        
        for(int i = start; i <= end; i++){
            
            if(postorderVal == inorder[i]){
                index = i;
                break;
            }
        }
        
        postIndex--;
        
        node->right = solve(inorder, postorder, postIndex, index+1, end);
        node->left = solve(inorder , postorder, postIndex, start, index-1);
        
        return node;
    }
};
