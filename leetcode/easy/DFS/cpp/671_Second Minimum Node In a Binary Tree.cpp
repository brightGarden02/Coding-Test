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
    int findSecondMinimumValue(TreeNode* root) {
        
        vector<int> v;
        
        traverse(root, v);
        int minValue = INT_MAX;
        int minSecondValue = INT_MAX;
        for(int i = 0; i < v.size(); i++){
            minValue = min(minValue, v[i]);
        }
        
        bool exist = false;
        for(int i = 0; i < v.size(); i++){
            
            if(v[i] <= minSecondValue && v[i] != minValue){
                minSecondValue = min(minSecondValue, v[i]);
                exist = true;
            }
        }
        
        if(exist) return minSecondValue;
        else return -1;
    }
    
    void traverse(TreeNode* root, vector<int>& v){
        
        if(root == NULL) return;
        traverse(root->left, v);
        v.push_back(root->val);
        traverse(root->right, v);
    }
};
