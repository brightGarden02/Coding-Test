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
    TreeNode* constructMaximumBinaryTree(vector<int>& nums) {
        
        return recursive(nums, 0, nums.size()-1);
    }
    
    TreeNode* recursive(vector<int>& nums, int start, int end){
        
        if(start > end){
            return NULL;
        }
        
        int maxi = -1;
        int maxVal = -1;
        for(int i = start; i <= end; i++){
            if(maxVal <= nums[i]){
                maxVal = nums[i];
                maxi = i;
            }
        }
        
        TreeNode* root = new TreeNode(maxVal);
        root->left = recursive(nums, start, maxi-1);
        root->right = recursive(nums, maxi + 1, end);
        return root;
    }
};