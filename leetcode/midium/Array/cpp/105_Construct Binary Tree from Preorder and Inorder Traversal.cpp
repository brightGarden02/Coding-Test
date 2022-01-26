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
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        
        int n = inorder.size();
        int preIndex = 0;
        return createTree(preorder, inorder, preIndex, 0, n-1);
    }
    
    TreeNode* createTree(vector<int>& preorder, vector<int>& inorder, int& preIndex, int start, int end){
        
        if(start > end){
            return NULL;
        }
        
        int preorderVal = preorder[preIndex];
        TreeNode* node = new TreeNode(preorderVal);
        int mid;
        
        for(int i = start; i <= end; i++){
            if(preorderVal == inorder[i]){
                mid = i;
                break;
            }
        }
        preIndex++;
        
        node->left = createTree(preorder, inorder, preIndex, start, mid-1);
        node->right = createTree(preorder, inorder, preIndex, mid+1, end);
        
        return node;
    }
};
